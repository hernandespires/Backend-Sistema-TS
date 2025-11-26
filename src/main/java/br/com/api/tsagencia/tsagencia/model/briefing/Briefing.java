package br.com.api.tsagencia.tsagencia.model.briefing;

import br.com.api.tsagencia.tsagencia.model.briefing.enums.Status;
import br.com.api.tsagencia.tsagencia.model.comercial.Company;
import br.com.api.tsagencia.tsagencia.model.comercial.Customer;
import br.com.api.tsagencia.tsagencia.model.financeiro.Contract;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table(name = "t_briefing")
public class Briefing {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id_briefing")
    private String id;

    @Column(name = "id_lead")
    private UUID lead_id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_cliente", nullable = false)
    private Customer customer_id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_empresa", nullable = false)
    private Company company_id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_contrato", nullable = false)
    private Contract contract_id;

    @Column(name = "status_briefing", nullable = false)
    private Status status;

    @Column(name = "data_criacao", nullable = false)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    private LocalDate criation_date;

    @Column(name = "data_atualizacao", nullable = false)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    private LocalDate update_date;

    @Column(name = "observacoes_gerais")
    private String observations;

    @Column(name = "versao")
    private Integer versao;
}