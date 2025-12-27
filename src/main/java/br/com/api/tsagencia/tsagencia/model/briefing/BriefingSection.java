package br.com.api.tsagencia.tsagencia.model.briefing;

import br.com.api.tsagencia.tsagencia.model.rh.Employee;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "t_briefing_secao")
public class BriefingSection {
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
    private Employee managerEmployee;

    @Column(name = "nome_secao")
    @JsonProperty("nome_secao")
    private String section;

    @Column(name = "fase_responsavel")
    @JsonProperty("fase_responsavel")
    private String step;

    @Column(name = "status_secao")
    @JsonProperty("status_secao")
    private String Status;

    @Column(name = "data_atualizacao")
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

    public Employee getManagerEmployee() {
        return managerEmployee;
    }

    public void setManagerEmployee(Employee managerEmployee) {
        this.managerEmployee = managerEmployee;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public String getStep() {
        return step;
    }

    public void setStep(String step) {
        this.step = step;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    public LocalDate getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(LocalDate updateDate) {
        this.updateDate = updateDate;
    }
}