package br.com.api.tsagencia.tsagencia.model.rh;

import br.com.api.tsagencia.tsagencia.model.comercial.Client;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;

@Entity
@Table(name = "t_org_unidade")
public class OrganizationalUnit {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id_unidade")
    @JsonProperty("id_unidade")
    private String id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_cliente", nullable = false)
    @JsonProperty("id_cliente")
    private Client client;

    @Column(name = "nome_unidade")
    @JsonProperty("nome_unidade")
    private String name;

    @Column(name = "tipo_unidade")
    @JsonProperty("tipo_unidade")
    private String type;

    @Column(name = "codigo")
    @JsonProperty("codigo")
    private String code;

    public String getId() {
        return id;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}