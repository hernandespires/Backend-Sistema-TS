package br.com.api.tsagencia.tsagencia.model.auxiliaresEmpresa;

import br.com.api.tsagencia.tsagencia.model.comercial.Company;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;

@Entity
@Table(name = "t_funcionamento_empresa")
public class CompanyOperations {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id_referencia")
    @JsonProperty("id_referencia")
    private String id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_empresa", nullable = false)
    @JsonProperty("id_empresa")
    private Company company;

    @Column(name = "dias_funcionamento")
    @JsonProperty("dias_funcionamento")
    private String workDays;

    @Column(name = "horario_funcionamento")
    @JsonProperty("horario_funcionamento")
    private String workHours;

    @Column(name = "observacoes")
    @JsonProperty("observacoes")
    private String observations;

    private String getId() {
        return id;
    }

    private Company getCompany() {
        return company;
    }

    private void setCompany(Company company) {
        this.company = company;
    }

    private String getWorkDays() {
        return workDays;
    }

    private void setWorkDays(String workDays) {
        this.workDays = workDays;
    }

    private String getWorkHours() {
        return workHours;
    }

    private void setWorkHours(String workHours) {
        this.workHours = workHours;
    }

    private String getObservations() {
        return observations;
    }

    private void setObservations(String observations) {
        this.observations = observations;
    }
}