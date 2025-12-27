package br.com.api.tsagencia.tsagencia.model.briefing;

import br.com.api.tsagencia.tsagencia.model.rh.OrganizationalUnit;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;

@Entity
@Table(name = "t_briefing_visibilidade")
public class BriefingVisibility {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id_visibilidade")
    @JsonProperty("id_visibilidade")
    private String id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_secao")
    @JsonProperty("id_secao")
    private BriefingSection briefingSection;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_org_unidade")
    @JsonProperty("id_org_unidade")
    private OrganizationalUnit organizationalUnit;

    @Column(name = "nivel_acesso")
    @JsonProperty("nivel_acesso")
    private String acessLevel;

    public String getId() {
        return id;
    }

    public BriefingSection getBriefingSection() {
        return briefingSection;
    }

    public void setBriefingSection(BriefingSection briefingSection) {
        this.briefingSection = briefingSection;
    }

    public OrganizationalUnit getOrganizationalUnit() {
        return organizationalUnit;
    }

    public void setOrganizationalUnit(OrganizationalUnit organizationalUnit) {
        this.organizationalUnit = organizationalUnit;
    }

    public String getAcessLevel() {
        return acessLevel;
    }

    public void setAcessLevel(String acessLevel) {
        this.acessLevel = acessLevel;
    }
}