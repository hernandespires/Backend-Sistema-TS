package br.com.api.tsagencia.tsagencia.model.auxiliaresEmpresa;

import br.com.api.tsagencia.tsagencia.model.comercial.Company;
import jakarta.persistence.*;

@Entity
@Table(name = "t_funcionamento_empresa")
public class CompanyOperations {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id_referencia")
    private String id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_empresa", nullable = false)
    private Company company;

    @Column(name = "dias_funcionamento")
    private String workDays;

    @Column(name = "horario_funcionamento")
    private String workHours;

    @Column(name = "observacoes")
    private String observations;
}