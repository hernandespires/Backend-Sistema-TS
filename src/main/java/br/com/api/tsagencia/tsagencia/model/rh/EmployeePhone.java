package br.com.api.tsagencia.tsagencia.model.rh;

import jakarta.persistence.*;

@Entity
@Table(name = "t_telefone_colaborador")
public class EmployeePhone {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id_telefone_colaborador")
    private String id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_colaborador", nullable = false)
    private Employee employee;

    @Column(name = "rotulo")
    private String tag;

    @Column
    private String ddi;

    @Column
    private String ddd;

    @Column(name = "prefixo")
    private String prefix;

    @Column(name = "sufixo")
    private String suffix;

    @Column(name = "tipo")
    private String type;
}