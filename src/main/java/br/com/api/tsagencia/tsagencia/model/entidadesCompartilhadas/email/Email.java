package br.com.api.tsagencia.tsagencia.model.entidadesCompartilhadas.email;

import jakarta.persistence.*;

@Entity
@Table(name = "t_email")
public class Email {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id_email")
    private String id;
}