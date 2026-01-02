package br.com.api.tsagencia.tsagencia.repository.entidadesCompartilhadas.email;

import br.com.api.tsagencia.tsagencia.model.entidadesCompartilhadas.email.CompanyEmail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyEmailRepository extends JpaRepository<CompanyEmail, String> {}