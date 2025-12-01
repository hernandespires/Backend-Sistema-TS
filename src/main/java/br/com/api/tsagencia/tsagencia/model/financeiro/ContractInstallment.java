package br.com.api.tsagencia.tsagencia.model.financeiro;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "t_cotrato_parcela")
public class ContractInstallment {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id_parcela")
    private String id;

    @ManyToOne
    @JoinColumn(name = "id_contrato", nullable = true)
    private Contract contract;

    @ManyToOne
    @JoinColumn(name = "id_aditivo", nullable = true)
    private ContractAddendum contractAddendum;

    @Column(name = "numero_parcela")
    private String installments;

    @Column(name = "data_vencimento", nullable = false)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    private LocalDate expirationDate;

    @Column(name = "valor_parcela")
    private Double installmentValue;

    @Column(name = "status_parcela")
    private String status;
}