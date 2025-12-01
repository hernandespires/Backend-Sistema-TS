package br.com.api.tsagencia.tsagencia.model.financeiro;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "t_pagamento")
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id_pagamento")
    private String id;

    @ManyToOne
    @JoinColumn(name = "id_parcela")
    private ContractAddendum contractAddendum;

    @Column(name = "data_pagamento", nullable = false)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    private LocalDate paymentDate;

    @Column(name = "valor_pago")
    private Double value;

    @Column(name = "metodo_pagamento")
    private String method;

    @Column(name = "transacao_id")
    private String transitionId;

    @Column
    private String status;
}