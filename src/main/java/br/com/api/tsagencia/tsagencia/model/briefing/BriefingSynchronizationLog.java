package br.com.api.tsagencia.tsagencia.model.briefing;

import br.com.api.tsagencia.tsagencia.model.rh.Employee;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "t_briefing_log_sincronizacao")
public class BriefingSynchronizationLog {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id_log")
    private String id;

    @ManyToOne
    @JoinColumn(name = "id_resposta")
    private BriefingResponse briefingResponse;

    @Column(name = "tabela_destino")
    private String tableDestination;

    @Column(name = "campo_destino")
    private String columnDestination;

    @Column(name = "valor_antigo")
    private String prevValue;

    @Column(name = "valor_novo")
    private String value;

    @ManyToOne
    @JoinColumn(name = "atulizado_por")
    private Employee employee;

    @Column(name = "data_execucao", nullable = false)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    private LocalDate updateDate;
}