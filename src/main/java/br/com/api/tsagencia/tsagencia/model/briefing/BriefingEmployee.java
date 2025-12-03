package br.com.api.tsagencia.tsagencia.model.briefing;

import br.com.api.tsagencia.tsagencia.model.rh.Employee;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "t_briefing_secao")
public class BriefingEmployee {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id_secao")
    private String id;

    @ManyToOne
    @JoinColumn(name = "id_briefing")
    private Briefing briefing;

    @ManyToOne
    @JoinColumn(name = "responsavel_operacao")
    private Employee employee;

    @Column(name = "nome_secao")
    private String sectionName;

    @Column(name = "fase_responsavel")
    private String stepResponsible;

    @Column(name = "status_secao")
    private String sectionStatus;

    @Column(name = "data_atualizacao", nullable = false)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    private LocalDate updateDate;
}