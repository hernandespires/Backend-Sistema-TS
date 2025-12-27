package br.com.api.tsagencia.tsagencia.model.comercial;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;

@Entity
@Table(name = "t_empresa")
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id_empresa")
    @JsonProperty("id_empresa")
    private String id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_cliente", nullable = false)
    @JsonProperty("id_cliente")
    private Client client;

    @Column(name = "razao_social")
    @JsonProperty("razao_social")
    private String companyName;

    @Column(name = "nome_fantasia")
    @JsonProperty("nome_fantasia")
    private String tradeName;

    @Column(name = "tax_id")
    @JsonProperty("tax_id")
    private String taxId;

    @Column(name = "tipo_tax_id")
    @JsonProperty("tipo_tax_id")
    private String typeTaxId;

    @Column(name = "pais")
    @JsonProperty("pais")
    private String country;

    @Column(name = "segmento")
    @JsonProperty("segmento")
    private String segment;

    @Column(name = "data_fundacao")
    @JsonProperty("data_fundacao")
    private String foundingDate;

    @Column(name = "numero_funcionarios")
    @JsonProperty("numero_funcionarios")
    private Integer employees;

    public String getId() { return id; }

    public Client getClient() { return client; }

    public void setClient(Client client) { this.client = client; }

    public String getCompany() { return companyName; }

    public void setCompany(String companyName) { this.companyName = companyName; }

    public String getTradeName() { return tradeName; }

    public void setTradeName(String tradeName) { this.tradeName = tradeName; }

    public String getTaxId() {
        return taxId;
    }

    public void setTaxId(String taxId) {
        this.taxId = taxId;
    }

    public String getTypeTaxId() {
        return typeTaxId;
    }

    public void setTypeTaxId(String typeTaxId) { this.typeTaxId = typeTaxId; }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getSegment() {
        return segment;
    }

    public void setSegment(String segment) {
        this.segment = segment;
    }

    public String getFoundingDate() {
        return foundingDate;
    }

    public void setFoundingDate(String foundingDate) {
        this.foundingDate = foundingDate;
    }

    public Integer getEmployees() {
        return employees;
    }

    public void setEmployees(Integer employees) {
        this.employees = employees;
    }
}