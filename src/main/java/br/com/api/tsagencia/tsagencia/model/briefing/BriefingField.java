package br.com.api.tsagencia.tsagencia.model.briefing;

import jakarta.persistence.*;

@Entity
@Table(name = "t_briefing_campo")
public class BriefingField {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id_campo")
    private String id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_secao", nullable = false)
    private BriefingSection briefingSection;

    @Column(name = "nome_campo")
    private String fieldName;

    @Column(name = "tipo_campo")
    private String fieldType;

    @Column(name = "obrigatorio")
    private Boolean required;

    @Column(name = "ordem_exibicao", nullable = false)
    private Integer order;

    @Column(name = "origem_padrao")
    private String defaultOrigin;

    @Column(name = "id_tabela_destino", nullable = false)
    private String destinationTable;
}