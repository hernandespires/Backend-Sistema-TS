package br.com.api.tsagencia.tsagencia.model.rh;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "t_contrato_colaborador")
public class EmployeeContract {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id_contrato")
    @JsonProperty("id_contrato")
    private String id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_colaborador", nullable = false)
    @JsonProperty("id_colaborador")
    private Employee employee;

    @Column(name = "contrato")
    @JsonProperty("contrato")
    private String contract;

    @Column(name = "percentual_comissao")
    @JsonProperty("percentual_comissao")
    private String commissionPercentage;

    @Column(name = "valor_comissao")
    @JsonProperty("valor_comissao")
    private String commissionValue;

    @Column(name = "data_participacao")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    @JsonProperty("data_participacao")
    private LocalDate participationDate;

    @Column(name = "observacoes")
    @JsonProperty("observacoes")
    private String observations;

    public String getId() {
        return id;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public String getContract() {
        return contract;
    }

    public void setContract(String contract) {
        this.contract = contract;
    }

    public String getCommissionPercentage() {
        return commissionPercentage;
    }

    public void setCommissionPercentage(String commissionPercentage) {
        this.commissionPercentage = commissionPercentage;
    }

    public String getCommissionValue() {
        return commissionValue;
    }

    public void setCommissionValue(String commissionValue) {
        this.commissionValue = commissionValue;
    }

    public LocalDate getParticipationDate() {
        return participationDate;
    }

    public void setParticipationDate(LocalDate participationDate) {
        this.participationDate = participationDate;
    }

    public String getObservations() {
        return observations;
    }

    public void setObservations(String observations) {
        this.observations = observations;
    }
}