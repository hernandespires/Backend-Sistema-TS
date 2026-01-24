package br.com.api.tsagencia.tsagencia.exception.handler;

import br.com.api.tsagencia.tsagencia.annotation.DataValidationOrder;
import br.com.api.tsagencia.tsagencia.exception.ExceptionResponse;
import br.com.api.tsagencia.tsagencia.exception.FileNotFoundException;
import br.com.api.tsagencia.tsagencia.exception.FileUploadException;
import br.com.api.tsagencia.tsagencia.exception.IdNotFoundException;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.NoHandlerFoundException;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.lang.reflect.Field;
import java.util.Comparator;
import java.util.Date;

/*

Possíveis erros:



Genéricos:
Rota não encontrada; - feito
Erro interno do servidor - feito
405 - método não suportado



get:
id não encontrado - feito


save:
{dado} faltando - feito;
formato do {dado} enviado de maneira incorreta;
{pessoa} salva com o mesmo {dado} de outra {pessoa};
{dado} enviado é muito grande;
{dado} não existe no caminho {rota}



put:
id não encontrado - feito;
{dado} faltando - feito;
formato do {dado} enviado de maneira incorreta;
{pessoa} salva com o mesmo {dado} de outra {pessoa};
{dado} enviado é muito grande;
{dado} não existe no caminho {rota}



delete:
id não encontrado - feito

*/

@RestControllerAdvice //se funcionar apagar os dois de cima
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {
    @ExceptionHandler(Exception.class)
    public ResponseEntity<ExceptionResponse> handleGenericException(Exception exception, WebRequest request) {
        ExceptionResponse res = new ExceptionResponse(
                new Date(), "Erro interno do servidor", request.getDescription(false)
        );
        return new ResponseEntity<>(res, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @Override
    protected ResponseEntity<Object> handleNoHandlerFoundException(
            NoHandlerFoundException noHandlerFoundException,
            HttpHeaders httpHeaders,
            HttpStatusCode httpStatusCode,
            WebRequest webRequest
    ) {
        ExceptionResponse res = new ExceptionResponse(
                new Date(), "Rota não encontrada", webRequest.getDescription(false)
        );
        return new ResponseEntity<>(res, HttpStatus.NOT_FOUND);
    }

    @Override
    protected ResponseEntity<Object> handleMethodArgumentNotValid(
            MethodArgumentNotValidException methodArgumentNotValidException,
            HttpHeaders HttpHeaders,
            HttpStatusCode HttpStatusCode,
            WebRequest webRequest
    ) {
        Class<?> targetClass = methodArgumentNotValidException.getBindingResult().getTarget().getClass();

        String mensagemErro = methodArgumentNotValidException.getBindingResult()
                .getFieldErrors()
                .stream()
                .sorted(Comparator.comparingInt(err -> {
                    try {
                        Field field = targetClass.getDeclaredField(err.getField());
                        DataValidationOrder order = field.getAnnotation(DataValidationOrder.class);

                        return order != null ? order.value() : Integer.MAX_VALUE;
                    } catch (NoSuchFieldException e) {
                        return Integer.MAX_VALUE;
                    }
                }))
                .map(FieldError::getDefaultMessage)
                .findFirst()
                .orElse("Erro de validação");

        ExceptionResponse res = new ExceptionResponse(new Date(), mensagemErro, webRequest.getDescription(false));
        return new ResponseEntity<>(res, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(IdNotFoundException.class)
    public final ResponseEntity<ExceptionResponse> handleIdNotFoundException(
            IdNotFoundException idNotFoundException, WebRequest webRequest
    ) {
        ExceptionResponse exceptionResponse = new ExceptionResponse(
                new Date(), idNotFoundException.getMessage(), webRequest.getDescription(false)
        );
        return new ResponseEntity<>(exceptionResponse, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(FileNotFoundException.class)
    public final ResponseEntity<ExceptionResponse> handleFileNotFoundException(
            FileNotFoundException fileNotFoundException, WebRequest webRequest
    ) {
        ExceptionResponse exceptionResponse = new ExceptionResponse(
                new Date(), fileNotFoundException.getMessage(), webRequest.getDescription(false)
        );
        return new ResponseEntity<>(exceptionResponse, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(FileUploadException.class)
    public final ResponseEntity<ExceptionResponse> handleFileUploadException(
            FileUploadException fileUploadException, WebRequest webRequest
    ) {
        ExceptionResponse exceptionResponse = new ExceptionResponse(
                new Date(), fileUploadException.getMessage(), webRequest.getDescription(false)
        );
        return new ResponseEntity<>(exceptionResponse, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}