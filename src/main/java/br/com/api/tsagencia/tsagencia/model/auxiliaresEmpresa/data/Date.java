package br.com.api.tsagencia.tsagencia.model.auxiliaresEmpresa.data;

import br.com.api.tsagencia.tsagencia.model.comercial.Company;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;

@Entity
@Table(name = "t_data")
public class Date {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id_data")
    @JsonProperty("id_data")
    private String id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_empresa", nullable = false)
    @JsonProperty("id_empresa")
    private Company company;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_data_comemorativa", nullable = false)
    @JsonProperty("id_data_comemorativa")
    private CommemorativeDate commemorativeDate;

    public String getId() {
        return id;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public CommemorativeDate getCommemorativeDate() {
        return commemorativeDate;
    }

    public void setCommemorativeDate(CommemorativeDate commemorativeDate) {
        this.commemorativeDate = commemorativeDate;
    }
}