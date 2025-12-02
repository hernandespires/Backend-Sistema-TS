package br.com.api.tsagencia.tsagencia.model.auxiliaresEmpresa;

import br.com.api.tsagencia.tsagencia.model.comercial.Company;
import jakarta.persistence.*;

@Entity
@Table(name = "t_area_servico")
public class CompanyServiceArea {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id_area_servico")
    private String id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_empresa")
    private Company company;

    @Column(name = "nome_area")
    private String name;

    @Column(name = "descricao")
    private String description;
}