package br.com.api.tsagencia.tsagencia.model.briefing;

import br.com.api.tsagencia.tsagencia.model.rh.Employee;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "t_briefing_secao")
public class BriefingEmployee {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id_secao")
    @JsonProperty("id_secao")
    private String id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_briefing")
    @JsonProperty("id_briefing")
    private Briefing briefing;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "responsavel_operacao")
    @JsonProperty("responsavel_operacao")
    private Employee employee;

    @Column(name = "nome_secao")
    @JsonProperty("nome_secao")
    private String sectionName;

    @Column(name = "fase_responsavel")
    @JsonProperty("fase_responsavel")
    private String stepResponsible;

    @Column(name = "status_secao")
    @JsonProperty("status_secao")
    private String sectionStatus;

    @Column(name = "data_atualizacao", nullable = false)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    @JsonProperty("data_atualizacao")
    private LocalDate updateDate;

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

    public String getSectionName() {
        return sectionName;
    }

    public void setSectionName(String sectionName) {
        this.sectionName = sectionName;
    }

    public String getStepResponsible() {
        return stepResponsible;
    }

    public void setStepResponsible(String stepResponsible) {
        this.stepResponsible = stepResponsible;
    }

    public String getSectionStatus() {
        return sectionStatus;
    }

    public void setSectionStatus(String sectionStatus) {
        this.sectionStatus = sectionStatus;
    }

    public LocalDate getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(LocalDate updateDate) {
        this.updateDate = updateDate;
    }
}