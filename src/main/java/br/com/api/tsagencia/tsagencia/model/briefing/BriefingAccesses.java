package br.com.api.tsagencia.tsagencia.model.briefing;

import br.com.api.tsagencia.tsagencia.model.rh.Employee;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "t_briefing_acesso")
public class BriefingAccesses {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id_acesso")
    @JsonProperty("id_acesso")
    private String id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_briefing")
    @JsonProperty("id_briefing")
    private Briefing briefing;

    @Column(name = "tipo_acesso")
    @JsonProperty("tipo_acesso")
    private String type;

    @Column(name = "usuario_login")
    @JsonProperty("usuario_login")
    private String user;

    @Column(name = "observacoes")
    @JsonProperty("observacoes")
    private String observations;

    @Column(name = "status_acesso")
    @JsonProperty("status_acesso")
    private String status;

    @Column(name = "data_validacao", nullable = false)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    @JsonProperty("data_validacao")
    private LocalDate validationDate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "validado_por")
    @JsonProperty("validado_por")
    private Employee employee;

    public String getId() {
        return id;
    }

    public Briefing getBriefing() {
        return briefing;
    }

    public void setBriefing(Briefing briefing) {
        this.briefing = briefing;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getObservations() {
        return observations;
    }

    public void setObservations(String observations) {
        this.observations = observations;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDate getValidationDate() {
        return validationDate;
    }

    public void setValidationDate(LocalDate validationDate) {
        this.validationDate = validationDate;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
}