package br.com.api.tsagencia.tsagencia.model.auxiliaresEmpresa.data;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;

@Entity
@Table(name = "t_data_comemorativa")
public class CommemorativeDate {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id_data_comemorativa")
    @JsonProperty("id_data_comemorativa")
    private String id;

    @Column(name = "nome_data_comemorativa", nullable = false)
    @JsonProperty("nome_data_comemorativa")
    private String nameCommemorativeDate;

    @Column(name = "descricao", nullable = false)
    @JsonProperty("descricao")
    private String description;

    public String getId() {
        return id;
    }

    public String getNameCommemorativeDate() {
        return nameCommemorativeDate;
    }

    public void setNameCommemorativeDate(String nameCommemorativeDate) {
        this.nameCommemorativeDate = nameCommemorativeDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}