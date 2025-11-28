package br.com.api.tsagencia.tsagencia.model.comercial;

import jakarta.persistence.*;

@Entity
@Table(name = "t_servico")
public class Services {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id_servico")
    private String id;

    @Column(name = "nome_servico")
    private String name;

    @Column(name = "categoria")
    private String category;

    @Column(name = "descricao")
    private String description;
}