package br.com.api.tsagencia.tsagencia.model.comercial;

import br.com.api.tsagencia.tsagencia.model.comercial.enums.Genre;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "t_cliente")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id_cliente")
    private String id;

    @Column(name = "nome_cliente")
    private String name;

    @Column(name = "data_de_nascimento")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    private LocalDate birthday;

    @Column(name = "sexo")
    private Genre sex;

    @Column(name = "documento_pessoal")
    private String document;
}