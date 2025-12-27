package br.com.api.tsagencia.tsagencia.model.briefing;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;

@Entity
@Table(name = "t_briefing_campo")
public class BriefingField {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id_campo")
    @JsonProperty("id_cmapo")
    private String id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_secao", nullable = false)
    @JsonProperty("id_secao")
    private BriefingSection briefingSection;

    @Column(name = "nome_campo")
    @JsonProperty("nome_campo")
    private String fieldName;

    @Column(name = "tipo_campo")
    @JsonProperty("tipo_campo")
    private String fieldType;

    @Column(name = "obrigatorio")
    @JsonProperty("obrigatorio")
    private Boolean required;

    @Column(name = "ordem_exibicao", nullable = false)
    @JsonProperty("ordem_exibicao")
    private Integer order;

    @Column(name = "origem_padrao")
    @JsonProperty("origem_padrao")
    private String defaultOrigin;

    @Column(name = "id_tabela_destino", nullable = false)
    @JsonProperty("id_tabela_destino")
    private String destinationTable;

    public String getId() {
        return id;
    }

    public BriefingSection getBriefingSection() {
        return briefingSection;
    }

    public void setBriefingSection(BriefingSection briefingSection) {
        this.briefingSection = briefingSection;
    }

    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    public String getFieldType() {
        return fieldType;
    }

    public void setFieldType(String fieldType) {
        this.fieldType = fieldType;
    }

    public Boolean getRequired() {
        return required;
    }

    public void setRequired(Boolean required) {
        this.required = required;
    }

    public Integer getOrder() {
        return order;
    }

    public void setOrder(Integer order) {
        this.order = order;
    }

    public String getDefaultOrigin() {
        return defaultOrigin;
    }

    public void setDefaultOrigin(String defaultOrigin) {
        this.defaultOrigin = defaultOrigin;
    }

    public String getDestinationTable() {
        return destinationTable;
    }

    public void setDestinationTable(String destinationTable) {
        this.destinationTable = destinationTable;
    }
}