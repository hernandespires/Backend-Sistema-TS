package br.com.api.tsagencia.tsagencia.repository.entidadesCompartilhadas.email;

import br.com.api.tsagencia.tsagencia.model.entidadesCompartilhadas.email.Email;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmailRepository extends JpaRepository<Email, String> {}