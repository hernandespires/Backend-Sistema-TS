package br.com.api.tsagencia.tsagencia.model.comercial;

import jakarta.persistence.*;

@Entity
@Table(name = "t_programa")
public class Program {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id_programa")
    private String id;

    @Column(name = "nome_programa")
    private String name;

    @Column(name = "descricao")
    private String description;
}