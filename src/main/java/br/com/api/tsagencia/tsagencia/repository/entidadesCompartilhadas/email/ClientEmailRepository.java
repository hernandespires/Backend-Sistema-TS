package br.com.api.tsagencia.tsagencia.repository.entidadesCompartilhadas.email;

import br.com.api.tsagencia.tsagencia.model.entidadesCompartilhadas.email.ClientEmail;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ClientEmailRepository extends JpaRepository<ClientEmail, UUID> {}