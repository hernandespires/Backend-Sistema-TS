package br.com.api.tsagencia.tsagencia.model.auxiliaresEmpresa;

import br.com.api.tsagencia.tsagencia.model.comercial.Company;
import jakarta.persistence.*;

@Entity
@Table(name = "t_financeiro_empresa")
public class CompanyFinancial {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id_financeiro")
    private String id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_empresa", nullable = false)
    private Company company;

    @Column(name = "faturamento_inicial")
    private String initialBilling ;

    @Column(name = "ticket_medio_inicial")
    private Double initialAverageTicket;

//    @Column(name = "data_base")
//    private String dataBase;
}