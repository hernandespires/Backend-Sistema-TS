package br.com.api.tsagencia.tsagencia.model.entidadesCompartilhadas.email;

import br.com.api.tsagencia.tsagencia.model.comercial.Client;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;

@Entity
@Table(name = "t_cliente_email")
public class ClientEmail {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id_cliente_email")
    @JsonProperty("id_cliente_email")
    private String id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_email", nullable = false)
    @JsonProperty("id_email")
    private Email email;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_cliente", nullable = false)
    @JsonProperty("id_cliente")
    private Client client;

    public String getId() {
        return id;
    }

    public Email getEmail() {
        return email;
    }

    public void setEmail(Email email) {
        this.email = email;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}