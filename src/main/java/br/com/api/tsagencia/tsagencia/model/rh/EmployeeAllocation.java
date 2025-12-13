package br.com.api.tsagencia.tsagencia.model.rh;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "t_colaborador_alocação")
public class EmployeeAllocation {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id_colaborador_alocacao")
    @JsonProperty("id_colaborador_alocacao")
    private String id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_colaborador", nullable = false)
    @JsonProperty("id_colaborador")
    private Employee employee;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_org_unidade", nullable = false)
    @JsonProperty("id_org_unidade")
    private OrganizationalUnit organizationalUnit;

    @Column(name = "documento")
    @JsonProperty("documento")
    private String document;

    @Column(name = "data_inicio")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    @JsonProperty("data_inicio")
    private LocalDate startDate;

    @Column(name = "data_final")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    @JsonProperty("data_final")
    private LocalDate endDate;

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

    public OrganizationalUnit getOrganizationalUnit() {
        return organizationalUnit;
    }

    public void setOrganizationalUnit(OrganizationalUnit organizationalUnit) {
        this.organizationalUnit = organizationalUnit;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
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

    public String getObservations() {
        return observations;
    }

    public void setObservations(String observations) {
        this.observations = observations;
    }
}