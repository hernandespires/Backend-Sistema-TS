package br.com.api.tsagencia.tsagencia.model.auxiliaresEmpresa.serviceArea;

import jakarta.persistence.*;

@Entity
@Table(name = "t_area_servico")
public class ServiceArea {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id_area_servico")
    private String id;

    @Column(name = "nome_area")
    private String name;

    @Column(name = "descricao")
    private String description;
}