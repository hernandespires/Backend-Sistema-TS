package br.com.api.tsagencia.tsagencia.model.financeiro;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "aditivo")
public class ContractAddendum {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id_aditivo", nullable = false)
    private String id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_contrato", nullable = false)
    private Contract contract;

    @Column(name = "tipo_aditivo", nullable = false)
    private String type;

    @Column(name = "descricao")
    private String description;

    @Column(name = "data_inicio", nullable = false)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    private LocalDate startDate;

    @Column(name = "data_fim", nullable = false)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    private LocalDate endDate;

    @Column(name = "valor_adicional")
    private Double additionalValue;

    @Column(name = "status_aditivo", nullable = false)
    private String status;
}