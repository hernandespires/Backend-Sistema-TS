package br.com.api.tsagencia.tsagencia.model.auxiliaresEmpresa;

import br.com.api.tsagencia.tsagencia.model.comercial.Company;
import jakarta.persistence.*;

public class ReferencesCompany {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id_referencia")
    private String id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_empresa", nullable = false)
    private Company company;

    @Column(name = "nome_referencia")
    private String referenceName;

    @Column(name = "url_referencia")
    private String referenceUrl;

    @Column(name = "observacao")
    private String observation;
}