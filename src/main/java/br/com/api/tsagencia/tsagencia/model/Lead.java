package br.com.api.tsagencia.tsagencia.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "t_lead")
public class Lead {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id_cliente")
    private String id;

    @Column(name = "id_origem")
    private String origin;      //fk

    @Column(name = "id_programa")
    private String program_id;  //fk

    @Column(name = "nome_lead")
    private String lead_name;

    @Column(name = "empresa_lead_informada")
    private String company_lead;

    @Column(name = "estagio")
    private String internship;

    @Column(name = "interesse")
    private String interest;

    @Column(name = "data_criacao")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    private LocalDate criation_date;

    @Column(name = "data_fechamento")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    private LocalDate deal_date;
}