package br.com.api.tsagencia.tsagencia.model.briefing;

import br.com.api.tsagencia.tsagencia.model.briefing.enums.Status;
import br.com.api.tsagencia.tsagencia.model.comercial.Company;
import br.com.api.tsagencia.tsagencia.model.comercial.Client;
import br.com.api.tsagencia.tsagencia.model.comercial.Lead;
import br.com.api.tsagencia.tsagencia.model.financeiro.Contract;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "t_briefing")
public class Briefing {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id_briefing", nullable = false)
    @JsonProperty("id_briefing")
    private String id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_lead", nullable = false)
    @JsonProperty("id_lead")
    private Lead lead;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_cliente", nullable = false)
    @JsonProperty("id_cliente")
    private Client client;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_empresa", nullable = false)
    @JsonProperty("id_empresa")
    private Company company;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_contrato")
    @JsonProperty("id_contrato")
    private Contract contract;

    @Column(name = "status_briefing", nullable = false)
    @JsonProperty("status_briefing")
    private Status status;

    @Column(name = "data_criacao", nullable = false)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    @JsonProperty("data_criacao")
    private LocalDate criationDate;

    @Column(name = "data_atualizacao", nullable = false)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    @JsonProperty("data_atualizacao")
    private LocalDate updateDate;

    @Column(name = "observacoes_gerais")
    @JsonProperty("observacoes_gerais")
    private String observations;

    @Column(name = "versao", nullable = false)
    @JsonProperty("versao")
    private Integer version;

    public String getId() {
        return id;
    }

    public Lead getLead() {
        return lead;
    }

    public void setLead(Lead lead) {
        this.lead = lead;
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

    public Contract getContract() {
        return contract;
    }

    public void setContract(Contract contract) {
        this.contract = contract;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public LocalDate getCriationDate() {
        return criationDate;
    }

    public void setCriationDate(LocalDate criationDate) {
        this.criationDate = criationDate;
    }

    public LocalDate getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(LocalDate updateDate) {
        this.updateDate = updateDate;
    }

    public String getObservations() {
        return observations;
    }

    public void setObservations(String observations) {
        this.observations = observations;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }
}