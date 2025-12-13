package br.com.api.tsagencia.tsagencia.model.rh;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "t_colaborador")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id_colaborador")
    @JsonProperty("id_colaborador")
    private String id;

    @Column(name = "nome_colaborador")
    @JsonProperty("nome_colaborador")
    private String name;

    @Column(name = "documento_pessoal")
    @JsonProperty("documento_pessoal")
    private String document;

    @Column
    private String status;

    @Column(name = "data_admissao", nullable = false)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    @JsonProperty("data_admissao")
    private LocalDate admissionDate;

    @Column(name = "data_desligamento", nullable = false)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    @JsonProperty("data_desligamento")
    private LocalDate quitDate;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDate getAdmission_date() {
        return admissionDate;
    }

    public void setAdmission_date(LocalDate admissionDate) {
        this.admissionDate = admissionDate;
    }

    public LocalDate getQuitDate() {
        return quitDate;
    }

    public void setQuit_date(LocalDate quitDate) {
        this.quitDate = quitDate;
    }
}