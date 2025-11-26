package br.com.api.tsagencia.tsagencia.model.comercial;

import jakarta.persistence.*;

@Entity
@Table(name = "t_lead_origem")
public class Origin {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id_origem")
    private String id;
}