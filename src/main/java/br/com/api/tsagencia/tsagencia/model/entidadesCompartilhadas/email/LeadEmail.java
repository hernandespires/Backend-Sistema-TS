package br.com.api.tsagencia.tsagencia.model.entidadesCompartilhadas.email;

import br.com.api.tsagencia.tsagencia.model.comercial.Client;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;

@Entity
@Table(name = "t_lead_email")
public class LeadEmail {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id_lead_email")
    @JsonProperty("id_lead_email")
    private String id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_email", nullable = false)
    @JsonProperty("id_email")
    private Email email;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_client", nullable = false)
    @JsonProperty("id_empresa")
    private Client client;
}