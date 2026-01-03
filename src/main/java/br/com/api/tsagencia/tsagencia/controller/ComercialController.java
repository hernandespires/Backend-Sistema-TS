package br.com.api.tsagencia.tsagencia.controller;

import br.com.api.tsagencia.tsagencia.controller.tag.ComercialTag;
import br.com.api.tsagencia.tsagencia.controller.tag.GeneralTag;
import br.com.api.tsagencia.tsagencia.model.comercial.*;
import br.com.api.tsagencia.tsagencia.service.ComercialService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/comercial")
@Tag(name = "Comercial", description = "Rotas para administrar o comercial")
public class ComercialController {
    @Autowired
    private ComercialService service;

    private final String successfullyDeletedMessage = "Registro deletado com sucesso";

    @GetMapping(value = "/allClient", produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(
            summary = "Encontra todos os clientes",
            tags = {ComercialTag.COMERCIAL, ComercialTag.CLIENT, GeneralTag.GET},
            responses = {
                    @ApiResponse(
                            description = "Sucesso",
                            responseCode = "200",
                            content = {
                                    @Content(
                                            mediaType = MediaType.APPLICATION_JSON_VALUE,
                                            array = @ArraySchema(schema = @Schema(implementation = Client.class))
                                    )
                            }
                    ),
                    @ApiResponse(description = "Sem conteúdo", responseCode = "204", content = @Content),
                    @ApiResponse(description = "Requisição inválida", responseCode = "400", content = @Content),
                    @ApiResponse(description = "Não autorizado", responseCode = "401", content = @Content),
                    @ApiResponse(description = "Não encontrado", responseCode = "404", content = @Content),
                    @ApiResponse(description = "Erro interno do servidor", responseCode = "500", content = @Content)
            }
    )
    public List<Client> getAllClients() {
        return service.getAllClient();
    }

    @GetMapping(value = "/getClient/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(
            summary = "Encontra um cliente pelo ID",
            tags = {ComercialTag.COMERCIAL, ComercialTag.CLIENT, GeneralTag.GET},
            responses = {
                    @ApiResponse(
                            description = "Successo",
                            responseCode = "200",
                            content = {
                                    @Content(
                                            mediaType = MediaType.APPLICATION_JSON_VALUE,
                                            array = @ArraySchema(schema = @Schema(implementation = Client.class))
                                    )
                            }
                    ),
                    @ApiResponse(description = "Sem conteúdo", responseCode = "204", content = @Content),
                    @ApiResponse(description = "Requisição inválida", responseCode = "400", content = @Content),
                    @ApiResponse(description = "Não autorizado", responseCode = "401", content = @Content),
                    @ApiResponse(description = "Não encontrado", responseCode = "404", content = @Content),
                    @ApiResponse(description = "Erro interno do servidor", responseCode = "500", content = @Content)
            }
    )
    public Client getClientById(@PathVariable String id) {
        return service.getClientById(id);
    }

    @PostMapping(
            value = "/saveClient",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    @Operation(
            summary = "Salve um novo cliente",
            tags = {ComercialTag.COMERCIAL, ComercialTag.CLIENT, GeneralTag.SAVE},
            responses = {
                    @ApiResponse(
                            description = "Sucesso",
                            responseCode = "200",
                            content = {
                                    @Content(
                                            mediaType = MediaType.APPLICATION_JSON_VALUE,
                                            array = @ArraySchema(schema = @Schema(implementation = Client.class))
                                    )
                            }
                    ),
                    @ApiResponse(description = "Sem conteúdo", responseCode = "204", content = @Content),
                    @ApiResponse(description = "Requisição inválida", responseCode = "400", content = @Content),
                    @ApiResponse(description = "Não autorizado", responseCode = "401", content = @Content),
                    @ApiResponse(description = "Não encontrado", responseCode = "404", content = @Content),
                    @ApiResponse(description = "Erro interno do servidor", responseCode = "500", content = @Content)
            }
    )
    public Client saveClient(@RequestBody Client client) {
        return service.saveClient(client);
    }

    @PutMapping(
            value = "/editClient/{id}",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    @Operation(
            summary = "Edite um cliente pelo ID",
            tags = {ComercialTag.COMERCIAL, ComercialTag.CLIENT, GeneralTag.EDIT},
            responses = {
                    @ApiResponse(
                            description = "Sucesso",
                            responseCode = "200",
                            content = {
                                    @Content(
                                            mediaType = MediaType.APPLICATION_JSON_VALUE,
                                            array = @ArraySchema(schema = @Schema(implementation = Client.class))
                                    )
                            }
                    ),
                    @ApiResponse(description = "Sem conteúdo", responseCode = "204", content = @Content),
                    @ApiResponse(description = "Requisição inválida", responseCode = "400", content = @Content),
                    @ApiResponse(description = "Não autorizado", responseCode = "401", content = @Content),
                    @ApiResponse(description = "Não encontrado", responseCode = "404", content = @Content),
                    @ApiResponse(description = "Erro interno do servidor", responseCode = "500", content = @Content)
            }
    )
    public Client editClient(@PathVariable String id, @RequestBody Client client) {
        return service.editClient(id, client);
    }

    @DeleteMapping(value = "/deleteClient/{id}")
    @Operation(
            summary = "Delete um cliente pelo ID",
            tags = {ComercialTag.COMERCIAL, ComercialTag.CLIENT, GeneralTag.DELETE},
            responses = {
                    @ApiResponse(
                            description = "Sucesso",
                            responseCode = "200",
                            content = {
                                    @Content(
                                            mediaType = MediaType.TEXT_PLAIN_VALUE,
                                            schema = @Schema(type = "string", example = successfullyDeletedMessage)
                                    )
                            }
                    ),
                    @ApiResponse(description = "Sem conteúdo", responseCode = "204", content = @Content),
                    @ApiResponse(description = "Requisição inválida", responseCode = "400", content = @Content),
                    @ApiResponse(description = "Não autorizado", responseCode = "401", content = @Content),
                    @ApiResponse(description = "Não encontrado", responseCode = "404", content = @Content),
                    @ApiResponse(description = "Erro interno do servidor", responseCode = "500", content = @Content)
            }
    )
    public String deleteClient(@PathVariable String id) {
        return service.deleteClient(id);
    }

    @GetMapping(value = "/allLead", produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(
            summary = "Encontra todos os Leads",
            tags = {ComercialTag.COMERCIAL, ComercialTag.LEAD, GeneralTag.GET},
            responses = {
                    @ApiResponse(
                            description = "Sucesso",
                            responseCode = "200",
                            content = {
                                    @Content(
                                            mediaType = MediaType.APPLICATION_JSON_VALUE,
                                            array = @ArraySchema(schema = @Schema(implementation = Lead.class))
                                    )
                            }
                    ),
                    @ApiResponse(description = "Sem conteúdo", responseCode = "204", content = @Content),
                    @ApiResponse(description = "Requisição inválida", responseCode = "400", content = @Content),
                    @ApiResponse(description = "Não autorizado", responseCode = "401", content = @Content),
                    @ApiResponse(description = "Não encontrado", responseCode = "404", content = @Content),
                    @ApiResponse(description = "Erro interno do servidor", responseCode = "500", content = @Content)
            }
    )
    public List<Lead> getAllLeads() {
        return service.getAllLead();
    }

    @GetMapping(value = "/getLead/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(
            summary = "Encontra um lead pelo ID",
            tags = {ComercialTag.COMERCIAL, ComercialTag.LEAD, GeneralTag.GET},
            responses = {
                    @ApiResponse(
                            description = "Successo",
                            responseCode = "200",
                            content = {
                                    @Content(
                                            mediaType = MediaType.APPLICATION_JSON_VALUE,
                                            array = @ArraySchema(schema = @Schema(implementation = Lead.class))
                                    )
                            }
                    ),
                    @ApiResponse(description = "Sem conteúdo", responseCode = "204", content = @Content),
                    @ApiResponse(description = "Requisição inválida", responseCode = "400", content = @Content),
                    @ApiResponse(description = "Não autorizado", responseCode = "401", content = @Content),
                    @ApiResponse(description = "Não encontrado", responseCode = "404", content = @Content),
                    @ApiResponse(description = "Erro interno do servidor", responseCode = "500", content = @Content)
            }
    )
    public Lead getLeadById(@PathVariable String id) {
        return service.getLeadById(id);
    }

    @PostMapping(
            value = "/saveLead",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    @Operation(
            summary = "Salve um novo lead",
            tags = {ComercialTag.COMERCIAL, ComercialTag.LEAD, GeneralTag.SAVE},
            responses = {
                    @ApiResponse(
                            description = "Sucesso",
                            responseCode = "200",
                            content = {
                                    @Content(
                                            mediaType = MediaType.APPLICATION_JSON_VALUE,
                                            array = @ArraySchema(schema = @Schema(implementation = Lead.class))
                                    )
                            }
                    ),
                    @ApiResponse(description = "Sem conteúdo", responseCode = "204", content = @Content),
                    @ApiResponse(description = "Requisição inválida", responseCode = "400", content = @Content),
                    @ApiResponse(description = "Não autorizado", responseCode = "401", content = @Content),
                    @ApiResponse(description = "Não encontrado", responseCode = "404", content = @Content),
                    @ApiResponse(description = "Erro interno do servidor", responseCode = "500", content = @Content)
            }
    )
    public Lead saveLead(@RequestBody Lead lead) {
        return service.saveLead(lead);
    }

    @PutMapping(
            value = "/editLead/{id}",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    @Operation(
            summary = "Edite um lead pelo ID",
            tags = {ComercialTag.COMERCIAL, ComercialTag.LEAD, GeneralTag.EDIT},
            responses = {
                    @ApiResponse(
                            description = "Sucesso",
                            responseCode = "200",
                            content = {
                                    @Content(
                                            mediaType = MediaType.APPLICATION_JSON_VALUE,
                                            array = @ArraySchema(schema = @Schema(implementation = Lead.class))
                                    )
                            }
                    ),
                    @ApiResponse(description = "Sem conteúdo", responseCode = "204", content = @Content),
                    @ApiResponse(description = "Requisição inválida", responseCode = "400", content = @Content),
                    @ApiResponse(description = "Não autorizado", responseCode = "401", content = @Content),
                    @ApiResponse(description = "Não encontrado", responseCode = "404", content = @Content),
                    @ApiResponse(description = "Erro interno do servidor", responseCode = "500", content = @Content)
            }
    )
    public Lead editLead(@PathVariable String id, @RequestBody Lead lead) {
        return service.editLead(id, lead);
    }

    @DeleteMapping(value = "/deleteLead/{id}")
    @Operation(
            summary = "Delete um lead pelo ID",
            tags = {ComercialTag.COMERCIAL, ComercialTag.LEAD, GeneralTag.DELETE},
            responses = {
                    @ApiResponse(
                            description = "Sucesso",
                            responseCode = "200",
                            content = {
                                    @Content(
                                            mediaType = MediaType.TEXT_PLAIN_VALUE,
                                            schema = @Schema(type = "string", example = successfullyDeletedMessage)
                                    )
                            }
                    ),
                    @ApiResponse(description = "Sem conteúdo", responseCode = "204", content = @Content),
                    @ApiResponse(description = "Requisição inválida", responseCode = "400", content = @Content),
                    @ApiResponse(description = "Não autorizado", responseCode = "401", content = @Content),
                    @ApiResponse(description = "Não encontrado", responseCode = "404", content = @Content),
                    @ApiResponse(description = "Erro interno do servidor", responseCode = "500", content = @Content)
            }
    )
    public String deleteLead(@PathVariable String id) {
        return service.deleteLead(id);
    }

    @GetMapping(value = "/allOrigin", produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(
            summary = "Encontra todas as origens",
            tags = {ComercialTag.COMERCIAL, ComercialTag.ORIGIN, GeneralTag.GET},
            responses = {
                    @ApiResponse(
                            description = "Sucesso",
                            responseCode = "200",
                            content = {
                                    @Content(
                                            mediaType = MediaType.APPLICATION_JSON_VALUE,
                                            array = @ArraySchema(schema = @Schema(implementation = Origin.class))
                                    )
                            }
                    ),
                    @ApiResponse(description = "Sem conteúdo", responseCode = "204", content = @Content),
                    @ApiResponse(description = "Requisição inválida", responseCode = "400", content = @Content),
                    @ApiResponse(description = "Não autorizado", responseCode = "401", content = @Content),
                    @ApiResponse(description = "Não encontrado", responseCode = "404", content = @Content),
                    @ApiResponse(description = "Erro interno do servidor", responseCode = "500", content = @Content)
            }
    )
    public List<Origin> getAllOrigin() {
        return service.getAllOrigin();
    }

    @GetMapping(value = "/getOrigin/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(
            summary = "Encontra uma origem pelo ID",
            tags = {ComercialTag.COMERCIAL, ComercialTag.ORIGIN, GeneralTag.GET},
            responses = {
                    @ApiResponse(
                            description = "Successo",
                            responseCode = "200",
                            content = {
                                    @Content(
                                            mediaType = MediaType.APPLICATION_JSON_VALUE,
                                            array = @ArraySchema(schema = @Schema(implementation = Origin.class))
                                    )
                            }
                    ),
                    @ApiResponse(description = "Sem conteúdo", responseCode = "204", content = @Content),
                    @ApiResponse(description = "Requisição inválida", responseCode = "400", content = @Content),
                    @ApiResponse(description = "Não autorizado", responseCode = "401", content = @Content),
                    @ApiResponse(description = "Não encontrado", responseCode = "404", content = @Content),
                    @ApiResponse(description = "Erro interno do servidor", responseCode = "500", content = @Content)
            }
    )
    public Origin getOriginById(@PathVariable String id) {
        return service.getOriginById(id);
    }

    @PostMapping(
            value = "/saveOrigin",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    @Operation(
            summary = "Salve uma nova origem",
            tags = {ComercialTag.COMERCIAL, ComercialTag.ORIGIN, GeneralTag.SAVE},
            responses = {
                    @ApiResponse(
                            description = "Sucesso",
                            responseCode = "200",
                            content = {
                                    @Content(
                                            mediaType = MediaType.APPLICATION_JSON_VALUE,
                                            array = @ArraySchema(schema = @Schema(implementation = Origin.class))
                                    )
                            }
                    ),
                    @ApiResponse(description = "Sem conteúdo", responseCode = "204", content = @Content),
                    @ApiResponse(description = "Requisição inválida", responseCode = "400", content = @Content),
                    @ApiResponse(description = "Não autorizado", responseCode = "401", content = @Content),
                    @ApiResponse(description = "Não encontrado", responseCode = "404", content = @Content),
                    @ApiResponse(description = "Erro interno do servidor", responseCode = "500", content = @Content)
            }
    )
    public Origin saveOrigin(@RequestBody Origin origin) {
        return service.saveOrigin(origin);
    }

    @PutMapping(
            value = "/editOrigin/{id}",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    @Operation(
            summary = "Edite um X pelo ID",
            tags = {ComercialTag.COMERCIAL, ComercialTag.ORIGIN, GeneralTag.EDIT},
            responses = {
                    @ApiResponse(
                            description = "Sucesso",
                            responseCode = "200",
                            content = {
                                    @Content(
                                            mediaType = MediaType.APPLICATION_JSON_VALUE,
                                            array = @ArraySchema(schema = @Schema(implementation = Origin.class))
                                    )
                            }
                    ),
                    @ApiResponse(description = "Sem conteúdo", responseCode = "204", content = @Content),
                    @ApiResponse(description = "Requisição inválida", responseCode = "400", content = @Content),
                    @ApiResponse(description = "Não autorizado", responseCode = "401", content = @Content),
                    @ApiResponse(description = "Não encontrado", responseCode = "404", content = @Content),
                    @ApiResponse(description = "Erro interno do servidor", responseCode = "500", content = @Content)
            }
    )
    public Origin editOrigin(@PathVariable String id, @RequestBody Origin origin) {
        return service.editOrigin(id, origin);
    }

    @DeleteMapping(value = "/deleteOrigin/{id}")
    @Operation(
            summary = "Delete uma origem pelo ID",
            tags = {ComercialTag.COMERCIAL, ComercialTag.ORIGIN, GeneralTag.DELETE},
            responses = {
                    @ApiResponse(
                            description = "Sucesso",
                            responseCode = "200",
                            content = {
                                    @Content(
                                            mediaType = MediaType.TEXT_PLAIN_VALUE,
                                            schema = @Schema(type = "string", example = successfullyDeletedMessage)
                                    )
                            }
                    ),
                    @ApiResponse(description = "Sem conteúdo", responseCode = "204", content = @Content),
                    @ApiResponse(description = "Requisição inválida", responseCode = "400", content = @Content),
                    @ApiResponse(description = "Não autorizado", responseCode = "401", content = @Content),
                    @ApiResponse(description = "Não encontrado", responseCode = "404", content = @Content),
                    @ApiResponse(description = "Erro interno do servidor", responseCode = "500", content = @Content)
            }
    )
    public String deleteOrigin(@PathVariable String id) {
        return service.deleteOrigin(id);
    }

    @GetMapping(value = "/allProgram", produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(
            summary = "Encontra todos os programas",
            tags = {ComercialTag.COMERCIAL, ComercialTag.PROGRAM, GeneralTag.GET},
            responses = {
                    @ApiResponse(
                            description = "Sucesso",
                            responseCode = "200",
                            content = {
                                    @Content(
                                            mediaType = MediaType.APPLICATION_JSON_VALUE,
                                            array = @ArraySchema(schema = @Schema(implementation = Program.class))
                                    )
                            }
                    ),
                    @ApiResponse(description = "Sem conteúdo", responseCode = "204", content = @Content),
                    @ApiResponse(description = "Requisição inválida", responseCode = "400", content = @Content),
                    @ApiResponse(description = "Não autorizado", responseCode = "401", content = @Content),
                    @ApiResponse(description = "Não encontrado", responseCode = "404", content = @Content),
                    @ApiResponse(description = "Erro interno do servidor", responseCode = "500", content = @Content)
            }
    )
    public List<Program> getAllPrograms() {
        return service.getAllProgram();
    }

    @GetMapping(value = "/getProgram/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Program getProgramById(@PathVariable String id) {
        return service.getProgramById(id);
    }

    @PostMapping(
            value = "/saveProgram",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    @Operation(
            summary = "Salve um novo programa",
            tags = {ComercialTag.COMERCIAL, ComercialTag.PROGRAM, GeneralTag.SAVE},
            responses = {
                    @ApiResponse(
                            description = "Sucesso",
                            responseCode = "200",
                            content = {
                                    @Content(
                                            mediaType = MediaType.APPLICATION_JSON_VALUE,
                                            array = @ArraySchema(schema = @Schema(implementation = Program.class))
                                    )
                            }
                    ),
                    @ApiResponse(description = "Sem conteúdo", responseCode = "204", content = @Content),
                    @ApiResponse(description = "Requisição inválida", responseCode = "400", content = @Content),
                    @ApiResponse(description = "Não autorizado", responseCode = "401", content = @Content),
                    @ApiResponse(description = "Não encontrado", responseCode = "404", content = @Content),
                    @ApiResponse(description = "Erro interno do servidor", responseCode = "500", content = @Content)
            }
    )
    public Program saveProgram(@RequestBody Program program) {
        return service.saveProgram(program);
    }

    @PutMapping(
            value = "/editProgram/{id}",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    @Operation(
            summary = "Edite um programa pelo ID",
            tags = {ComercialTag.COMERCIAL, ComercialTag.PROGRAM, GeneralTag.EDIT},
            responses = {
                    @ApiResponse(
                            description = "Sucesso",
                            responseCode = "200",
                            content = {
                                    @Content(
                                            mediaType = MediaType.APPLICATION_JSON_VALUE,
                                            array = @ArraySchema(schema = @Schema(implementation = Program.class))
                                    )
                            }
                    ),
                    @ApiResponse(description = "Sem conteúdo", responseCode = "204", content = @Content),
                    @ApiResponse(description = "Requisição inválida", responseCode = "400", content = @Content),
                    @ApiResponse(description = "Não autorizado", responseCode = "401", content = @Content),
                    @ApiResponse(description = "Não encontrado", responseCode = "404", content = @Content),
                    @ApiResponse(description = "Erro interno do servidor", responseCode = "500", content = @Content)
            }
    )
    public Program editProgram(@PathVariable String id, @RequestBody Program program) {
        return service.editProgram(id, program);
    }

    @DeleteMapping(value = "/deleteProgram/{id}")
    @Operation(
            summary = "Delete um programa pelo ID",
            tags = {ComercialTag.COMERCIAL, ComercialTag.PROGRAM, GeneralTag.DELETE},
            responses = {
                    @ApiResponse(
                            description = "Sucesso",
                            responseCode = "200",
                            content = {
                                    @Content(
                                            mediaType = MediaType.TEXT_PLAIN_VALUE,
                                            schema = @Schema(type = "string", example = successfullyDeletedMessage)
                                    )
                            }
                    ),
                    @ApiResponse(description = "Sem conteúdo", responseCode = "204", content = @Content),
                    @ApiResponse(description = "Requisição inválida", responseCode = "400", content = @Content),
                    @ApiResponse(description = "Não autorizado", responseCode = "401", content = @Content),
                    @ApiResponse(description = "Não encontrado", responseCode = "404", content = @Content),
                    @ApiResponse(description = "Erro interno do servidor", responseCode = "500", content = @Content)
            }
    )
    public String deleteProgram(@PathVariable String id) {
        return service.deleteProgram(id);
    }

    @GetMapping(value = "/allServices", produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(
            summary = "Encontra todos os serviços",
            tags = {ComercialTag.COMERCIAL, ComercialTag.SERVICES, GeneralTag.GET},
            responses = {
                    @ApiResponse(
                            description = "Sucesso",
                            responseCode = "200",
                            content = {
                                    @Content(
                                            mediaType = MediaType.APPLICATION_JSON_VALUE,
                                            array = @ArraySchema(schema = @Schema(implementation = Services.class))
                                    )
                            }
                    ),
                    @ApiResponse(description = "Sem conteúdo", responseCode = "204", content = @Content),
                    @ApiResponse(description = "Requisição inválida", responseCode = "400", content = @Content),
                    @ApiResponse(description = "Não autorizado", responseCode = "401", content = @Content),
                    @ApiResponse(description = "Não encontrado", responseCode = "404", content = @Content),
                    @ApiResponse(description = "Erro interno do servidor", responseCode = "500", content = @Content)
            }
    )
    public List<Services> getAllServices() {
        return service.getAllServices();
    }

    @GetMapping(value = "/getServices/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(
            summary = "Encontra um serviço pelo ID",
            tags = {ComercialTag.COMERCIAL, ComercialTag.SERVICES, GeneralTag.GET},
            responses = {
                    @ApiResponse(
                            description = "Successo",
                            responseCode = "200",
                            content = {
                                    @Content(
                                            mediaType = MediaType.APPLICATION_JSON_VALUE,
                                            array = @ArraySchema(schema = @Schema(implementation = Services.class))
                                    )
                            }
                    ),
                    @ApiResponse(description = "Sem conteúdo", responseCode = "204", content = @Content),
                    @ApiResponse(description = "Requisição inválida", responseCode = "400", content = @Content),
                    @ApiResponse(description = "Não autorizado", responseCode = "401", content = @Content),
                    @ApiResponse(description = "Não encontrado", responseCode = "404", content = @Content),
                    @ApiResponse(description = "Erro interno do servidor", responseCode = "500", content = @Content)
            }
    )
    public Services getServicesById(@PathVariable String id) {
        return service.getServicesById(id);
    }

    @PostMapping(
            value = "/saveServices",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    @Operation(
            summary = "Salve um novo serviço",
            tags = {ComercialTag.COMERCIAL, ComercialTag.SERVICES, GeneralTag.SAVE},
            responses = {
                    @ApiResponse(
                            description = "Sucesso",
                            responseCode = "200",
                            content = {
                                    @Content(
                                            mediaType = MediaType.APPLICATION_JSON_VALUE,
                                            array = @ArraySchema(schema = @Schema(implementation = Services.class))
                                    )
                            }
                    ),
                    @ApiResponse(description = "Sem conteúdo", responseCode = "204", content = @Content),
                    @ApiResponse(description = "Requisição inválida", responseCode = "400", content = @Content),
                    @ApiResponse(description = "Não autorizado", responseCode = "401", content = @Content),
                    @ApiResponse(description = "Não encontrado", responseCode = "404", content = @Content),
                    @ApiResponse(description = "Erro interno do servidor", responseCode = "500", content = @Content)
            }
    )
    public Services saveServices(@RequestBody Services services) {
        return service.saveServices(services);
    }

    @PutMapping(
            value = "/editServices/{id}",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    @Operation(
            summary = "Edite um serviço pelo ID",
            tags = {ComercialTag.COMERCIAL, ComercialTag.SERVICES, GeneralTag.EDIT},
            responses = {
                    @ApiResponse(
                            description = "Sucesso",
                            responseCode = "200",
                            content = {
                                    @Content(
                                            mediaType = MediaType.APPLICATION_JSON_VALUE,
                                            array = @ArraySchema(schema = @Schema(implementation = Services.class))
                                    )
                            }
                    ),
                    @ApiResponse(description = "Sem conteúdo", responseCode = "204", content = @Content),
                    @ApiResponse(description = "Requisição inválida", responseCode = "400", content = @Content),
                    @ApiResponse(description = "Não autorizado", responseCode = "401", content = @Content),
                    @ApiResponse(description = "Não encontrado", responseCode = "404", content = @Content),
                    @ApiResponse(description = "Erro interno do servidor", responseCode = "500", content = @Content)
            }
    )
    public Services editServices(@PathVariable String id, @RequestBody Services services) {
        return service.editServices(id, services);
    }

    @DeleteMapping(value = "/deleteServices/{id}")
    @Operation(
            summary = "Delete um X pelo ID",
            tags = {ComercialTag.COMERCIAL, ComercialTag.SERVICES, GeneralTag.DELETE},
            responses = {
                    @ApiResponse(
                            description = "Sucesso",
                            responseCode = "200",
                            content = {
                                    @Content(
                                            mediaType = MediaType.TEXT_PLAIN_VALUE,
                                            schema = @Schema(type = "string", example = successfullyDeletedMessage)
                                    )
                            }
                    ),
                    @ApiResponse(description = "Sem conteúdo", responseCode = "204", content = @Content),
                    @ApiResponse(description = "Requisição inválida", responseCode = "400", content = @Content),
                    @ApiResponse(description = "Não autorizado", responseCode = "401", content = @Content),
                    @ApiResponse(description = "Não encontrado", responseCode = "404", content = @Content),
                    @ApiResponse(description = "Erro interno do servidor", responseCode = "500", content = @Content)
            }
    )
    public String deleteServices(@PathVariable String id) {
        return service.deleteServices(id);
    }
}