package br.com.api.tsagencia.tsagencia.model.auxiliaresEmpresa;

import br.com.api.tsagencia.tsagencia.model.comercial.Company;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;

@Entity
@Table(name = "t_gmb_empresa")
public class CompanyGMB {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id_gmb")
    @JsonProperty("id_gmb")
    private String id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_empresa", nullable = false)
    @JsonProperty("id_empresa")
    private Company company;

    @Column(name = "nome_conta_gmb")
    @JsonProperty("nome_conta_gmb")
    private String gmbName;

    @Column(name = "email_vinculado_gmb")
    @JsonProperty("email_vinculado_gmb")
    private String gmbEmail;

    public String getId() {
        return id;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public String getGmbName() {
        return gmbName;
    }

    public void setGmbName(String gmbName) {
        this.gmbName = gmbName;
    }

    public String getGmbEmail() {
        return gmbEmail;
    }

    public void setGmbEmail(String gmbEmail) {
        this.gmbEmail = gmbEmail;
    }
}