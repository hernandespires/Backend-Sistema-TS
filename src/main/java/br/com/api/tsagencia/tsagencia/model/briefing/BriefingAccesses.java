package br.com.api.tsagencia.tsagencia.model.briefing;

import br.com.api.tsagencia.tsagencia.model.rh.Employee;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "t_briefing_acesso")
public class BriefingAccesses {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id_acesso")
    private String id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_briefing")
    private Briefing briefing;

    @Column(name = "tipo_acesso")
    private String type;

    @Column(name = "usuario_login")
    private String user;

    @Column(name = "observacoes")
    private String observations;

    @Column(name = "status_acesso")
    private String status;

    @Column(name = "data_validacao", nullable = false)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    private LocalDate validationDate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "validado_por")
    private Employee employee;
}