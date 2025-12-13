package br.com.api.tsagencia.tsagencia.model.rh;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;

@Entity
@Table(name = "t_telefone_colaborador")
public class EmployeePhone {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id_telefone_colaborador")
    @JsonProperty("id_telefone_colaborador")
    private String id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_colaborador", nullable = false)
    @JsonProperty("id_colaborador")
    private Employee employee;

    @Column(name = "rotulo")
    @JsonProperty("rotulo")
    private String tag;

    @Column
    private String ddi;

    @Column
    private String ddd;

    @Column(name = "prefixo")
    @JsonProperty("prefixo")
    private String prefix;

    @Column(name = "sufixo")
    @JsonProperty("sufixo")
    private String suffix;

    @Column(name = "tipo")
    @JsonProperty("tipo")
    private String type;

    public String getId() {
        return id;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getDdi() {
        return ddi;
    }

    public void setDdi(String ddi) {
        this.ddi = ddi;
    }

    public String getDdd() {
        return ddd;
    }

    public void setDdd(String ddd) {
        this.ddd = ddd;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}