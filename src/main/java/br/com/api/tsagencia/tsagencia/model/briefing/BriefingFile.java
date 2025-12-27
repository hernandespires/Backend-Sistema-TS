package br.com.api.tsagencia.tsagencia.model.briefing;

import br.com.api.tsagencia.tsagencia.model.rh.Employee;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "t_briefing_arquivo")
public class BriefingFile {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id_arquivo")
    @JsonProperty("id_arquivo")
    private String id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_briefing")
    @JsonProperty("id_briefing")
    private Briefing briefing;

    @Column(name = "nome_arquivo")
    @JsonProperty("nome_arquivo")
    private String name;

    @Column(name = "url_arquivo")
    @JsonProperty("url_arquivo")
    private String url;

    @Column(name = "tipo_arquivo")
    @JsonProperty("tipo_arquivo")
    private String type;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "enviado_por")
    @JsonProperty("enviado_por")
    private Employee employee;

    @Column(name = "data_upload", nullable = false)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    @JsonProperty("data_upload")
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public LocalDate getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(LocalDate updateDate) {
        this.updateDate = updateDate;
    }
}