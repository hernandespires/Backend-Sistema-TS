package br.com.api.tsagencia.tsagencia.model.financeiro;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "t_pagamento")
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id_pagamento")
    @JsonProperty("id_pagamento")
    private String id;

    @ManyToOne
    @JoinColumn(name = "id_parcela")
    @JsonProperty("id_parcela")
    private ContractAddendum contractAddendum;

    @Column(name = "data_pagamento", nullable = false)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    @JsonProperty("data_pagamento")
    private LocalDate paymentDate;

    @Column(name = "valor_pago")
    @JsonProperty("valor_pago")
    private Double value;

    @Column(name = "metodo_pagamento")
    @JsonProperty("metodo_pagamento")
    private String method;

    @Column(name = "transacao_id")
    @JsonProperty("transacao_id")
    private String transitionId;

    @Column
    private String status;

    public String getId() {
        return id;
    }

    public ContractAddendum getContractAddendum() {
        return contractAddendum;
    }

    public void setContractAddendum(ContractAddendum contractAddendum) {
        this.contractAddendum = contractAddendum;
    }

    public LocalDate getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(LocalDate paymentDate) {
        this.paymentDate = paymentDate;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getTransitionId() {
        return transitionId;
    }

    public void setTransitionId(String transitionId) {
        this.transitionId = transitionId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}