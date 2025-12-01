package br.com.api.tsagencia.tsagencia.model.rh;

import br.com.api.tsagencia.tsagencia.model.comercial.Client;
import jakarta.persistence.*;

@Entity
@Table(name = "t_org_unidade")
public class OrganizationalUnit {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id_unidade")
    private String id;

//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "id_cliente", nullable = false)
//    private Client client;

    @Column(name = "nome_unidade")
    private String name;

    @Column(name = "tipo_unidade")
    private String type;

    @Column(name = "codigo")
    private String code;
}