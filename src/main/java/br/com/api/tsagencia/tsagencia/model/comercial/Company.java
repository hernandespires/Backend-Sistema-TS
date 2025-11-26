package br.com.api.tsagencia.tsagencia.model.comercial;

import jakarta.persistence.*;

@Entity
@Table(name = "t_empresa")
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id_empresa")
    private String id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_cliente", nullable = false)
    private Customer customer_id;

    @Column(name = "razao_social")
    private String company_name;

    @Column(name = "nome_fantasia")
    private String trade_name;

    @Column
    private String tax_id;

    @Column
    private String tipo_tax_id;

    @Column(name = "pais")
    private String country;

    @Column(name = "segmento")
    private String segment;

    @Column(name = "data_fundacao")
    private String founding_date;

    @Column(name = "numero_funcionarios")
    private Integer employees;
}