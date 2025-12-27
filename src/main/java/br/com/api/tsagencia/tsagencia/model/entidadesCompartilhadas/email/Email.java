package br.com.api.tsagencia.tsagencia.model.entidadesCompartilhadas.email;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;

@Entity
@Table(name = "t_email")
public class Email {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id_email")
    @JsonProperty("id_email")
    private String id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "endereco_email")
    @JsonProperty("endereco_email")
    private String email;

    public String getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}