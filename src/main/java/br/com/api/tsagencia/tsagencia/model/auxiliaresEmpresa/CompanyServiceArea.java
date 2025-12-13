package br.com.api.tsagencia.tsagencia.model.auxiliaresEmpresa;

import br.com.api.tsagencia.tsagencia.model.comercial.Company;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;

@Entity
@Table(name = "t_area_servico")
public class CompanyServiceArea {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id_area_servico")
    @JsonProperty("id_area_servico")
    private String id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_empresa")
    @JsonProperty("id_empresa")
    private Company company;

    @Column(name = "nome_area")
    @JsonProperty("nome_area")
    private String name;

    @Column(name = "descricao")
    @JsonProperty("nome_area")
    private String description;

    public String getId() {
        return id;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public String getName() {
        return name;
    }

    public void setName() {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}