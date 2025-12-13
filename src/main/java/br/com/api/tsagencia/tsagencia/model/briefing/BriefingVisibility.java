package br.com.api.tsagencia.tsagencia.model.briefing;

import br.com.api.tsagencia.tsagencia.model.rh.OrganizationalUnit;
import jakarta.persistence.*;

@Entity
@Table(name = "t_briefing_visibilidade")
public class BriefingVisibility {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id_visibilidade")
    private String id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_secao ")
    private BriefingSection briefingSection;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_org_unidade")
    private OrganizationalUnit organizationalUnit;

    @Column(name = "nivel_acesso")
    private String acessLevel;
}