package br.com.api.tsagencia.tsagencia.model.auxiliaresEmpresa;

import br.com.api.tsagencia.tsagencia.model.comercial.Company;
import jakarta.persistence.*;

@Entity
@Table(name = "t_rede_social_empresa")
public class CompanySocialNetwork {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id_gmb")
    private String id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_empresa", nullable = false)
    private Company company;

    @Column(name = "plataforma")
    private String platform;

    @Column
    private String url;
}