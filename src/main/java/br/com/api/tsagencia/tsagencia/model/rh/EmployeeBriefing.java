package br.com.api.tsagencia.tsagencia.model.rh;

import br.com.api.tsagencia.tsagencia.model.briefing.Briefing;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "t_briefing_colaborador")
public class EmployeeBriefing {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id_briefing_colaborador")
    private String id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_briefing")
    private Briefing briefing;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_colaborador")
    private Employee employee;

    @Column(name = "funcao_no_briefing")
    private String function;

    @Column(name = "data_inicio_responsabilidade")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    private LocalDate startReponsibilityDate;

    @Column(name = "data_fim_responsabilidade")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    private LocalDate endReponsibilityDate;

    @Column
    private String status;
}