package br.com.api.tsagencia.tsagencia.model.financeiro;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "t_cotrato_parcela")
public class ContractInstallment {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id_parcela")
    @JsonProperty("id_parcela")
    private String id;

    @ManyToOne
    @JoinColumn(name = "id_contrato", nullable = true)
    @JsonProperty("id_contrato")
    private Contract contract;

    @ManyToOne
    @JoinColumn(name = "id_aditivo", nullable = true)
    @JsonProperty("id_aditivo")
    private ContractAddendum contractAddendum;

    @Column(name = "numero_parcela")
    @JsonProperty("numero_parcela")
    private String installments;

    @Column(name = "data_vencimento", nullable = false)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    @JsonProperty("data_vencimento")
    private LocalDate expirationDate;

    @Column(name = "valor_parcela")
    @JsonProperty("valor_parcela")
    private Double installmentValue;

    @Column(name = "status_parcela")
    @JsonProperty("status_parcela")
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

    public ContractAddendum getContractAddendum() {
        return contractAddendum;
    }

    public void setContractAddendum(ContractAddendum contractAddendum) {
        this.contractAddendum = contractAddendum;
    }

    public String getInstallments() {
        return installments;
    }

    public void setInstallments(String installments) {
        this.installments = installments;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(LocalDate expirationDate) {
        this.expirationDate = expirationDate;
    }

    public Double getInstallmentValue() {
        return installmentValue;
    }

    public void setInstallmentValue(Double installmentValue) {
        this.installmentValue = installmentValue;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}