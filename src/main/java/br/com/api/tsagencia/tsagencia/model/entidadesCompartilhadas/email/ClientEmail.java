package br.com.api.tsagencia.tsagencia.model.entidadesCompartilhadas.email;

import br.com.api.tsagencia.tsagencia.model.comercial.Client;
import jakarta.persistence.*;

@Entity
@Table(name = "t_cliente_email")
public class ClientEmail {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id")
    private String id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_email", nullable = false)
    private Email email;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_cliente", nullable = false)
    private Client client;
}