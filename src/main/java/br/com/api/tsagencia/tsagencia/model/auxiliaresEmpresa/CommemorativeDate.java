package br.com.api.tsagencia.tsagencia.model.auxiliaresEmpresa;

import jakarta.persistence.*;

@Entity
@Table(name = "t_data_comemorativa")
public class CommemorativeDate {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id_data_comemorativa")
    private String id;

    @Column(name = "nome_data_comemorativa", nullable = false)
    private String name_commemorative_date;

    @Column(name = "descricao", nullable = false)
    private String description;
}