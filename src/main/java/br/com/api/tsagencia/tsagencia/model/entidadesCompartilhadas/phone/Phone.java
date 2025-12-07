package br.com.api.tsagencia.tsagencia.model.entidadesCompartilhadas.phone;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;

@Entity
@Table(name = "t_telefone")
public class Phone {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id_telefone")
    @JsonProperty("id_telefone")
    private String id;

    @Column
    private Integer ddi;

    @Column
    private Integer ddd;

    @Column(name = "prefixo")
    @JsonProperty("prefixo")
    private Integer prefix;

    @Column(name = "sufixo")
    @JsonProperty("sufixo")
    private Integer suffix;

    @Column(name = "tipo")
    @JsonProperty("tipo")
    private String type;

    public String getId() {
        return id;
    }

    public Integer getDdi() {
        return ddi;
    }

    public void setDdi(Integer ddi) {
        this.ddi = ddi;
    }

    public Integer getDdd() {
        return ddd;
    }

    public void setDdd(Integer ddd) {
        this.ddd = ddd;
    }

    public Integer getPrefix() {
        return prefix;
    }

    public void setPrefix(Integer prefix) {
        this.prefix = prefix;
    }

    public Integer getSuffix() {
        return suffix;
    }

    public void setSuffix(Integer suffix) {
        this.suffix = suffix;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}