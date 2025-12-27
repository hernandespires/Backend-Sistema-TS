package br.com.api.tsagencia.tsagencia.model.briefing;

import br.com.api.tsagencia.tsagencia.model.rh.Employee;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "t_briefing_resposta")
public class BriefingResponse {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id_resposta")
    @JsonProperty("id_resposta")
    private String id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_campo")
    @JsonProperty("id_campo")
    private BriefingField briefingField;

    @Column(name = "valor_resposta", nullable = false)
    @JsonProperty("valor_resposta")
    private String response;

    @Column(name = "origem_resposta")
    @JsonProperty("origem_resposta")
    private String origin;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "atualizado_por")
    @JsonProperty("atualizado_por")
    private Employee employee;

    @Column(name = "data_resposta", nullable = false)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    @JsonProperty("data_resposta")
    private LocalDate responseDate;

    @Column(name = "validado")
    @JsonProperty("validado")
    private Boolean validated;

    @Column(name = "sincronizado")
    @JsonProperty("sincronizado")
    private Boolean inSynchronized;

    @Column(name = "data_sincronizacao", nullable = false)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    @JsonProperty("data_sincronizacao")
    private LocalDate synchronizedDate;

    public String getId() {
        return id;
    }

    public BriefingField getBriefingField() {
        return briefingField;
    }

    public void setBriefingField(BriefingField briefingField) {
        this.briefingField = briefingField;
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public LocalDate getResponseDate() {
        return responseDate;
    }

    public void setResponseDate(LocalDate responseDate) {
        this.responseDate = responseDate;
    }

    public Boolean getValidated() {
        return validated;
    }

    public void setValidated(Boolean validated) {
        this.validated = validated;
    }

    public Boolean getInSynchronized() {
        return inSynchronized;
    }

    public void setInSynchronized(Boolean inSynchronized) {
        this.inSynchronized = inSynchronized;
    }

    public LocalDate getSynchronizedDate() {
        return synchronizedDate;
    }

    public void setSynchronizedDate(LocalDate synchronizedDate) {
        this.synchronizedDate = synchronizedDate;
    }
}