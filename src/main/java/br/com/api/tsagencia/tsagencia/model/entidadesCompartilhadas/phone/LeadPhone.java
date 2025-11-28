package br.com.api.tsagencia.tsagencia.model.entidadesCompartilhadas.phone;

import br.com.api.tsagencia.tsagencia.model.comercial.Lead;
import jakarta.persistence.*;

@Entity
@Table(name = "t_lead_telefone")
public class LeadPhone {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id_lead_telefone")
    private String id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_telefone", nullable = false)
    private Phone phone;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_lead", nullable = false)
    private Lead lead;
}