package br.com.api.tsagencia.tsagencia.model.entidadesCompartilhadas.phone;

import jakarta.persistence.*;

@Entity
@Table(name = "t_telefone")
public class Phone {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id_telefone")
    private String id;

    @Column
    private Integer ddi;

    @Column
    private Integer ddd;

    @Column(name = "prefixo")
    private Integer prefix;

    @Column(name = "sufixo")
    private Integer suffix;

    @Column(name = "tipo")
    private String type;
}