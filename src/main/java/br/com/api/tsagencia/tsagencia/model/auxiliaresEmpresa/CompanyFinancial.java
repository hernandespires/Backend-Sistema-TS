package br.com.api.tsagencia.tsagencia.model.auxiliaresEmpresa;

import br.com.api.tsagencia.tsagencia.model.comercial.Company;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;

@Entity
@Table(name = "t_financeiro_empresa")
public class CompanyFinancial {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id_financeiro")
    @JsonProperty("id_financeiro")
    private String id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_empresa", nullable = false)
    @JsonProperty("id_empresa")
    private Company company;

    @Column(name = "faturamento_inicial")
    @JsonProperty("faturamento_inicial")
    private String initialBilling ;

    @Column(name = "ticket_medio_inicial")
    @JsonProperty("ticket_medio_inicial")
    private Double initialAverageTicket;

    @Column(name = "data_base")
    @JsonProperty("data_base")
    private String dataBase;

    public String getId() {
        return id;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public String getInitialBilling() {
        return initialBilling;
    }

    public void setInitialBilling(String initialBilling) {
        this.initialBilling = initialBilling;
    }

    public Double getInitialAverageTicket() {
        return initialAverageTicket;
    }

    public void setInitialAverageTicket(Double initialAverageTicket) {
        this.initialAverageTicket = initialAverageTicket;
    }

    public String getDataBase() {
        return dataBase;
    }

    public void setDataBase(String dataBase) {
        this.dataBase = dataBase;
    }
}