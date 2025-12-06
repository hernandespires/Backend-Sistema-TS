package br.com.api.tsagencia.tsagencia.repository.comercial;

import br.com.api.tsagencia.tsagencia.model.comercial.Client;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ClientRepository extends JpaRepository<Client, UUID> {}