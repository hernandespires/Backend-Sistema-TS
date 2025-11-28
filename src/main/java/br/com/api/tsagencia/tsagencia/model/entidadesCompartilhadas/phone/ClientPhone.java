package br.com.api.tsagencia.tsagencia.model.entidadesCompartilhadas.phone;

import br.com.api.tsagencia.tsagencia.model.comercial.Client;
import jakarta.persistence.*;

@Entity
@Table(name = "t_cliente_telefone")
public class ClientPhone {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id_cliente_telefone")
    private String id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_telefone", nullable = false)
    private Phone phone;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_lead", nullable = false)
    private Client client;
}