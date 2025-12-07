package br.com.api.tsagencia.tsagencia.model.entidadesCompartilhadas.phone;

import br.com.api.tsagencia.tsagencia.model.comercial.Lead;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;

@Entity
@Table(name = "t_lead_telefone")
public class LeadPhone {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id_lead_telefone")
    @JsonProperty("id_lead_telefone")
    private String id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_telefone", nullable = false)
    @JsonProperty("id_telefone")
    private Phone phone;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_lead", nullable = false)
    @JsonProperty("id_lead")
    private Lead lead;

    public String getId() {
        return id;
    }

    public Phone getPhone() {
        return phone;
    }

    public void setPhone(Phone phone) {
        this.phone = phone;
    }

    public Lead getLead() {
        return lead;
    }

    public void setLead(Lead lead) {
        this.lead = lead;
    }
}