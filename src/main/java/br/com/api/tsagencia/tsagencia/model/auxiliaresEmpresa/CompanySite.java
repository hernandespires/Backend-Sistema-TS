package br.com.api.tsagencia.tsagencia.model.auxiliaresEmpresa;

import br.com.api.tsagencia.tsagencia.model.comercial.Company;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;

@Entity
@Table(name = "t_site_empresa")
public class CompanySite {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id_site")
    @JsonProperty("id_site")
    private String id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_empresa", nullable = false)
    @JsonProperty("id_empresa")
    private Company company;

    @Column(name = "dominio")
    @JsonProperty("dominio")
    private String domain;

    @Column(name = "hospedagem")
    @JsonProperty("hospedagem")
    private String host;

    @Column
    private String url;

    public String getId() {
        return id;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}