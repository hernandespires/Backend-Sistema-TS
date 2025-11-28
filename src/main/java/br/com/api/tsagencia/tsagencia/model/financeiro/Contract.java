package br.com.api.tsagencia.tsagencia.model.financeiro;

import br.com.api.tsagencia.tsagencia.model.comercial.Company;
import br.com.api.tsagencia.tsagencia.model.comercial.Client;
import br.com.api.tsagencia.tsagencia.model.comercial.Program;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "t_contratos")
public class Contract {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id_contrato")
    private String id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_cliente", nullable = false)
    private Client client;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_empresa", nullable = false)
    private Company company;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_programa", nullable = false)
    private Program program;

    @Column(name = "tipo_contrato")
    private String contract_type;

    @Column(name = "status_contrato")
    private String contract_status;

    @Column(name = "data_inicio", nullable = false)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    private LocalDate start_date;

    @Column(name = "data_fim", nullable = false)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    private LocalDate end_date;

    @Column(name = "valor_total")
    private Double Value;

    @Column(name = "forma_pagamento")
    private Double payment_method;

    @Column(name = "renovacoes_totais")
    private Integer renovations;
}