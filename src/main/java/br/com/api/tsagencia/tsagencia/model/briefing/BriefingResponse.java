package br.com.api.tsagencia.tsagencia.model.briefing;

import br.com.api.tsagencia.tsagencia.model.rh.Employee;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "t_briefing_resposta")
public class BriefingResponse {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id_resposta")
    private String id;

    @ManyToOne
    @JoinColumn(name = "id_campo")
    private BriefingField briefingField;

    @Column(name = "valor_resposta", nullable = false)
    private String response;

    @Column(name = "origem_resposta")
    private String origin;

    @ManyToOne
    @JoinColumn(name = "atualizado_por")
    private Employee employee;

    @Column(name = "data_resposta", nullable = false)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    private LocalDate responseDate;

    @Column(name = "validado")
    private Boolean validated;

    @Column(name = "sincronizado")
    private Boolean inSynchronized;

    @Column(name = "data_sincronizacao", nullable = false)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    private LocalDate synchronizedDate;
}