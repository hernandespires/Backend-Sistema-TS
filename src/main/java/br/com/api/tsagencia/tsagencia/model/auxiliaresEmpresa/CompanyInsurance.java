package br.com.api.tsagencia.tsagencia.model.auxiliaresEmpresa;

import br.com.api.tsagencia.tsagencia.model.comercial.Company;
import jakarta.persistence.*;

@Entity
@Table(name = "t_seguro_empresa")
public class CompanyInsurance {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id_seguro")
    private String id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_empresa", nullable = false)
    private Company company;

    @Column(name = "tipo_seguro")
    private String insuranceType;

    @Column(name = "apolice")
    private String policy;

    @Column(name = "validade")
    private String expiration;
}