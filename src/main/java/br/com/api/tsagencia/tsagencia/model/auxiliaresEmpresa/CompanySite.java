package br.com.api.tsagencia.tsagencia.model.auxiliaresEmpresa;

import br.com.api.tsagencia.tsagencia.model.comercial.Company;
import jakarta.persistence.*;

@Entity
@Table(name = "t_site_empresa")
public class CompanySite {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id_site")
    private String id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_empresa", nullable = false)
    private Company company;

    @Column(name = "dominio")
    private String domain;

    @Column(name = "hospedagem")
    private String host;

    @Column
    private String url;
}