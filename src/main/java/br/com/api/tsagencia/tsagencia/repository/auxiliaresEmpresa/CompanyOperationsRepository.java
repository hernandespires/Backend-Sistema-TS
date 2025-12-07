package br.com.api.tsagencia.tsagencia.repository.auxiliaresEmpresa;

import br.com.api.tsagencia.tsagencia.model.auxiliaresEmpresa.CompanyOperations;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CompanyOperationsRepository extends JpaRepository<CompanyOperations, UUID> {}