package br.com.api.tsagencia.tsagencia.model.rh;

import jakarta.persistence.*;

@Entity
@Table(name = "t_email_colaborador")
public class EmployeeEmail {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id_email_colaborador")
    private String id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_colaborador", nullable = false)
    private Employee employee;

    @Column(name = "endereco_email_colaborador")
    private String email;

    @Column(name = "documento_pessoal")
    private String document;

    @Column(name = "rotulo")
    private String tag;
}