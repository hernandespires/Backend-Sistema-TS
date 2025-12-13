package br.com.api.tsagencia.tsagencia.model.auxiliaresEmpresa;

import br.com.api.tsagencia.tsagencia.model.comercial.Company;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;

@Entity
@Table(name = "t_seguro_empresa")
public class CompanyInsurance {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id_seguro")
    @JsonProperty("id_seguro")
    private String id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_empresa", nullable = false)
    @JsonProperty("id_empresa")
    private Company company;

    @Column(name = "tipo_seguro")
    @JsonProperty("tipo_seguro")
    private String insuranceType;

    @Column(name = "apolice")
    @JsonProperty("apolice")
    private String policy;

    @Column(name = "validade")
    @JsonProperty("validade")
    private String expiration;

    private String getId() {
        return id;
    }

    private Company getCompany() {
        return company;
    }

    private void setCompany(Company company) {
        this.company = company;
    }

    private String getInsuranceType() {
        return insuranceType;
    }

    private void setInsuranceType(String insuranceType) {
        this.insuranceType = insuranceType;
    }

    private String getPolicy() {
        return policy;
    }

    private void setPolicy(String policy) {
        this.policy = policy;
    }

    private String getExpiration() {
        return expiration;
    }

    private void setExpiration(String expiration) {
        this.expiration = expiration;
    }
}