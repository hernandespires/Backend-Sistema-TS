package br.com.api.tsagencia.tsagencia.model.rh;

import br.com.api.tsagencia.tsagencia.model.briefing.Briefing;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "t_briefing_colaborador")
public class EmployeeBriefing {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id_briefing_colaborador")
    @JsonProperty("id_briefing_colaborador")
    private String id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_briefing")
    @JsonProperty("id_briefing")
    private Briefing briefing;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_colaborador")
    @JsonProperty("id_colaborador")
    private Employee employee;

    @Column(name = "funcao_no_briefing")
    @JsonProperty("funcao_no_briefing")
    private String function;

    @Column(name = "data_inicio_responsabilidade")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    @JsonProperty("data_inicio_responsabilidade")
    private LocalDate startResponsibilityDate;

    @Column(name = "data_fim_responsabilidade")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    @JsonProperty("data_fim_responsabilidade")
    private LocalDate endResponsibilityDate;

    @Column
    private String status;

    public String getId() {
        return id;
    }

    public Briefing getBriefing() {
        return briefing;
    }

    public void setBriefing(Briefing briefing) {
        this.briefing = briefing;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public String getFunction() {
        return function;
    }

    public void setFunction(String function) {
        this.function = function;
    }

    public LocalDate getStartResponsibilityDate() {
        return startResponsibilityDate;
    }

    public void setStartResponsibilityDate(LocalDate startResponsibilityDate) {
        this.startResponsibilityDate = startResponsibilityDate;
    }

    public LocalDate getEndResponsibilityDate() {
        return endResponsibilityDate;
    }

    public void setEndResponsibilityDate(LocalDate endResponsibilityDate) {
        this.endResponsibilityDate = endResponsibilityDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}