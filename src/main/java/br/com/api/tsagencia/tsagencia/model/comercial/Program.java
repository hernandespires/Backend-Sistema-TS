package br.com.api.tsagencia.tsagencia.model.comercial;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;

@Entity
@Table(name = "t_programa")
public class Program {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id_programa")
    @JsonProperty("id_programa")
    private String id;

    @Column(name = "nome_programa")
    @JsonProperty("nome_programa")
    private String name;

    @Column(name = "descricao")
    @JsonProperty("descricao")
    private String description;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}