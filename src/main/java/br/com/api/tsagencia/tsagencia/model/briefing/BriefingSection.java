package br.com.api.tsagencia.tsagencia.model.briefing;

import br.com.api.tsagencia.tsagencia.model.rh.Employee;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "t_briefing_secao")
public class BriefingSection {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id_secao")
    private String id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_briefing")
    private Briefing briefing;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "responsavel_operacao")
    private Employee managerEmployee;

    @Column(name = "nome_secao")
    private String section;

    @Column(name = "fase_responsavel")
    private String step;

    @Column(name = "status_secao")
    private String Status;

    @Column(name = "data_atualizacao")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    private LocalDate updateDate;
}