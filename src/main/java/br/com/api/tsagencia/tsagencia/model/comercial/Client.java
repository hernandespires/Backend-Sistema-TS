package br.com.api.tsagencia.tsagencia.model.comercial;

import br.com.api.tsagencia.tsagencia.annotation.DataValidationOrder;
import br.com.api.tsagencia.tsagencia.model.comercial.type.Document;
import br.com.api.tsagencia.tsagencia.model.comercial.type.Genre;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;

@Entity
@Table(name = "t_cliente")
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id_cliente")
    @JsonProperty("id_cliente")
    private String id;

    @Column(name = "nome_cliente", nullable = false)
    @NotNull(message = "nome_cliente é um dado obrigatório")
    @DataValidationOrder(1)
    @JsonProperty("nome_cliente")
    private String name;

    @Column(name = "data_de_nascimento", nullable = false)
    @NotNull(message = "data_nascimento é um dado obrigatório")
    @DataValidationOrder(2)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    @JsonProperty("data_de_nascimento")
    private LocalDate birthday;

    @Enumerated(EnumType.STRING)
    @Column(name = "sexo", nullable = false)
    @NotNull(message = "sexo é um dado obrigatório")
    @DataValidationOrder(3)
    @JsonProperty("sexo")
    private Genre sex;

    @Enumerated(EnumType.STRING)
    @Column(name = "tipo_documento", nullable = false)
    @NotNull(message = "tipo_documento é um dado obrigatório")
    @DataValidationOrder(4)
    @JsonProperty("tipo_documento")
    private Document type;

    @Column(name = "documento_pessoal", nullable = false)
    @NotNull(message = "documento_pessoal é um dado obrigatório")
    @DataValidationOrder(5)
    @JsonProperty("documento_pessoal")
    private String document;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public Genre getSex() {
        return sex;
    }

    public void setSex(Genre sex) {
        this.sex = sex;
    }

    public Document getType() {
        return type;
    }

    public void setType(Document type) {
        this.type = type;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }
}