package br.com.api.tsagencia.tsagencia.model.entidadesCompartilhadas.email;

import br.com.api.tsagencia.tsagencia.model.comercial.Company;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;

@Entity
@Table(name = "t_empresa_email")
public class CompanyEmail {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id_empresa_email")
    @JsonProperty("id_empresa_email")
    private String id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_email", nullable = false)
    @JsonProperty("id_email")
    private Email email;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_empresa", nullable = false)
    @JsonProperty("id_empresa")
    private Company company;

    public String getId() {
        return id;
    }

    public Email getEmail() {
        return email;
    }

    public void setEmail(Email email) {
        this.email = email;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }
}