package br.com.api.tsagencia.tsagencia.model.comercial;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "t_lead")
public class Lead {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id_lead")
    @JsonProperty("id_lead")
    private String id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_programa", nullable = false)
    @JsonProperty("id_programa")
    private Program program;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_origem", nullable = false)
    @JsonProperty("id_origem")
    private Origin origin;

    @Column(name = "nome_lead")
    @JsonProperty("nome_lead")
    private String leadName;

    @Column(name = "empresa_lead_informada")
    @JsonProperty("empresa_lead_informada")
    private String companyLead;

    @Column(name = "estagio")
    @JsonProperty("estagio")
    private String internship;

    @Column(name = "interesse")
    @JsonProperty("interesse")
    private String interest;

    @Column(name = "data_criacao")
    @JsonProperty("data_criacao")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    private LocalDate criationDate;

    @Column(name = "data_fechamento")
    @JsonProperty("data_fechamento")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    private LocalDate dealDate;

    public String getId() {
        return id;
    }

    public Program getProgram() {
        return program;
    }

    public void setProgram(Program program) {
        this.program = program;
    }

    public Origin getOrigin() {
        return origin;
    }

    public void setOrigin(Origin origin) {
        this.origin = origin;
    }

    public String getLeadName() {
        return leadName;
    }

    public void setLeadName(String leadName) {
        this.leadName = leadName;
    }

    public String getCompanyLead() {
        return companyLead;
    }

    public void setCompanyLead(String companyLead) {
        this.companyLead = companyLead;
    }

    public String getInternship() {
        return internship;
    }

    public void setInternship(String internship) {
        this.internship = internship;
    }

    public String getInterest() {
        return interest;
    }

    public void setInterest(String interest) {
        this.interest = interest;
    }

    public LocalDate getCriationDate() {
        return criationDate;
    }

    public void setCriationDate(LocalDate criationDate) {
        this.criationDate = criationDate;
    }

    public LocalDate getDealDate() {
        return dealDate;
    }

    public void setDealDate(LocalDate dealDate) {
        this.dealDate = dealDate;
    }
}