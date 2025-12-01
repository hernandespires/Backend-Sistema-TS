package br.com.api.tsagencia.tsagencia.model.rh;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "t_contrato_colaborador")
public class EmployeeContract {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id_contrato")
    private String id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_colaborador", nullable = false)
    private Employee employee;

    @Column(name = "contrato")
    private String contract;

    @Column(name = "percentual_comissao")
    private String commissionPercentage;

    @Column(name = "valor_comissao")
    private String comissionValue;

    @Column(name = "data_participacao")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    private LocalDate participationDate;

    @Column(name = "observacoes")
    private String observations;
}