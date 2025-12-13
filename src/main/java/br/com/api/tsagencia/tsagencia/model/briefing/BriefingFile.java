package br.com.api.tsagencia.tsagencia.model.briefing;

import br.com.api.tsagencia.tsagencia.model.rh.Employee;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "t_briefing_arquivo")
public class BriefingFile {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id_arquivo")
    private String id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_briefing")
    private Briefing briefing;

    @Column(name = "nome_arquivo")
    private String name;

    @Column(name = "url_arquivo")
    private String url;

    @Column(name = "tipo_arquivo")
    private String type;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "enviado_por")
    private Employee employee;

    @Column(name = "data_upload", nullable = false)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    private LocalDate updateDate;
}