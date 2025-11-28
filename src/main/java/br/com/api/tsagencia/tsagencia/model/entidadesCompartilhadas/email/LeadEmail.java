package br.com.api.tsagencia.tsagencia.model.entidadesCompartilhadas.email;

import br.com.api.tsagencia.tsagencia.model.comercial.Client;
import jakarta.persistence.*;

@Entity
@Table(name = "t_lead_email")
public class LeadEmail {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id")
    private String id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_email", nullable = false)
    private Email email;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_client", nullable = false)
    private Client client;
}