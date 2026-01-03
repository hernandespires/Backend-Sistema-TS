package br.com.api.tsagencia.tsagencia.model.comercial;

import br.com.api.tsagencia.tsagencia.model.comercial.type.Genre;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "t_cliente")
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id_cliente")
    @JsonProperty("id_cliente")
    private String id;

    @Column(name = "nome_cliente")
    @JsonProperty("nome_cliente")
    private String name;

    @Column(name = "data_de_nascimento")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    @JsonProperty("data_de_nascimento")
    private LocalDate birthday;

    @Enumerated(EnumType.STRING)
    @Column(name = "sexo")
    @JsonProperty("sexo")
    private Genre sex;

    @Column(name = "documento_pessoal")
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

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }
}