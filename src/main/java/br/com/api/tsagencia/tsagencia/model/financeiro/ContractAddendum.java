package br.com.api.tsagencia.tsagencia.model.financeiro;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "aditivo")
public class ContractAddendum {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id_aditivo", nullable = false)
    @JsonProperty("id_aditivo")
    private String id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_contrato", nullable = false)
    @JsonProperty("id_contrato")
    private Contract contract;

    @Column(name = "tipo_aditivo", nullable = false)
    @JsonProperty("tipo_aditivo")
    private String type;

    @Column(name = "descricao")
    @JsonProperty("descricao")
    private String description;

    @Column(name = "data_inicio", nullable = false)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    @JsonProperty("data_inicio")
    private LocalDate startDate;

    @Column(name = "data_fim", nullable = false)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    @JsonProperty("data_fim")
    private LocalDate endDate;

    @Column(name = "valor_adicional")
    @JsonProperty("valor_adicional")
    private Double additionalValue;

    @Column(name = "status_aditivo", nullable = false)
    @JsonProperty("status_aditivo")
    private String status;

    public String getId() {
        return id;
    }

    public Contract getContract() {
        return contract;
    }

    public void setContract(Contract contract) {
        this.contract = contract;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public Double getAdditionalValue() {
        return additionalValue;
    }

    public void setAdditionalValue(Double additionalValue) {
        this.additionalValue = additionalValue;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}