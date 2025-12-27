package br.com.api.tsagencia.tsagencia.model.comercial;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;

@Entity
@Table(name = "t_servico")
public class Services {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id_servico")
    @JsonProperty("id_servico")
    private String id;

    @Column(name = "nome_servico")
    @JsonProperty("nome_servico")
    private String name;

    @Column(name = "categoria")
    @JsonProperty("categoria")
    private String category;

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

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}