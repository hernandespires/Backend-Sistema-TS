package br.com.api.tsagencia.tsagencia.model.entidadesCompartilhadas.phone;

import br.com.api.tsagencia.tsagencia.model.comercial.Company;
import jakarta.persistence.*;

@Entity
@Table(name = "t_empresa_telefone")
public class CompanyPhone {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id_empresa_telefone")
    private String id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_telefone", nullable = false)
    private Phone phone;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_empresa", nullable = false)
    private Company company;
}