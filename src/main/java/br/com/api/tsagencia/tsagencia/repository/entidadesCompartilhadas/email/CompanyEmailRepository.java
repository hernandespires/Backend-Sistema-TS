package br.com.api.tsagencia.tsagencia.repository.entidadesCompartilhadas.email;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CompanyEmailRepository extends JpaRepository<CompanyEmailRepository, UUID> {}