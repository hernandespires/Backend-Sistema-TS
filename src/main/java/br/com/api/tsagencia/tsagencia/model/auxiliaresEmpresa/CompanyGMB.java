package br.com.api.tsagencia.tsagencia.model.auxiliaresEmpresa;

import br.com.api.tsagencia.tsagencia.model.comercial.Company;
import jakarta.persistence.*;

@Entity
@Table(name = "t_gmb_empresa")
public class CompanyGMB {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id_gmb")
    private String id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_empresa", nullable = false)
    private Company company;

    @Column(name = "nome_conta_gmb")
    private String gmb_name;

    @Column(name = "email_vinculado_gmb")
    private String gmb_email;
}