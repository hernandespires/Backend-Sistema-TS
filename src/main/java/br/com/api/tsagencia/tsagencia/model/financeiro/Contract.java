package br.com.api.tsagencia.tsagencia.model.financeiro;

import br.com.api.tsagencia.tsagencia.model.comercial.Company;
import br.com.api.tsagencia.tsagencia.model.comercial.Client;
import br.com.api.tsagencia.tsagencia.model.comercial.Program;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "t_contratos")
public class Contract {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id_contrato")
    @JsonProperty("id_contrato")
    private String id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_cliente", nullable = false)
    @JsonProperty("id_cliente")
    private Client client;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_empresa", nullable = false)
    @JsonProperty("id_empresa")
    private Company company;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_programa", nullable = false)
    @JsonProperty("id_programa")
    private Program program;

    @Column(name = "tipo_contrato")
    @JsonProperty("tipo_contrato")
    private String contractType;

    @Column(name = "status_contrato")
    @JsonProperty("status_contrato")
    private String contractStatus;

    @Column(name = "data_inicio", nullable = false)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    @JsonProperty("data_inicio")
    private LocalDate startDate;

    @Column(name = "data_fim", nullable = false)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    @JsonProperty("data_fim")
    private LocalDate endDate;

    @Column(name = "valor_total")
    @JsonProperty("valor_total")
    private Double Value;

    @Column(name = "forma_pagamento")
    @JsonProperty("formaPagamento")
    private Double paymentMethod;

    @Column(name = "renovacoes_totais")
    @JsonProperty("renovacoes_totais")
    private Integer renovations;

    public String getId() {
        return id;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public Program getProgram() {
        return program;
    }

    public void setProgram(Program program) {
        this.program = program;
    }

    public String getContractType() {
        return contractType;
    }

    public void setContractType(String contractType) {
        this.contractType = contractType;
    }

    public String getContractStatus() {
        return contractStatus;
    }

    public void setContractStatus(String contractStatus) {
        this.contractStatus = contractStatus;
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

    public Double getValue() {
        return Value;
    }

    public void setValue(Double value) {
        Value = value;
    }

    public Double getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(Double paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public Integer getRenovations() {
        return renovations;
    }

    public void setRenovations(Integer renovations) {
        this.renovations = renovations;
    }
}