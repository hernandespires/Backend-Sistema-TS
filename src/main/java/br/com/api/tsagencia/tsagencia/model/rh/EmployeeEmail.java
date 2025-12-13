package br.com.api.tsagencia.tsagencia.model.rh;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;

@Entity
@Table(name = "t_email_colaborador")
public class EmployeeEmail {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id_email_colaborador")
    @JsonProperty("id_email_colaborador")
    private String id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_colaborador", nullable = false)
    @JsonProperty("id_colaborador")
    private Employee employee;

    @Column(name = "endereco_email_colaborador")
    @JsonProperty("endereco_email_colaborador")
    private String email;

    @Column(name = "documento_pessoal")
    @JsonProperty("documento_pessoal")
    private String document;

    @Column(name = "rotulo")
    @JsonProperty("rotulo")
    private String tag;

    public String getId() {
        return id;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }
}