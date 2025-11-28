package br.com.api.tsagencia.tsagencia.model.rh;

import jakarta.persistence.*;

@Entity
@Table(name = "t_colaborador")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id_colaborador")
    private String id;

    @Column(name = "nome_colaborador")
    private String name;

    @Column(name = "documento_pessoal")
    private String document;

    @Column
    private String status;

    @Column(name = "data_admissao")
    private String admission_date;

    @Column(name = "data_desligamento")
    private String quit_date;
}