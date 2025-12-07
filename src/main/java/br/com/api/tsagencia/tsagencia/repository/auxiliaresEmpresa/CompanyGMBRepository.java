package br.com.api.tsagencia.tsagencia.repository.auxiliaresEmpresa;

import br.com.api.tsagencia.tsagencia.model.auxiliaresEmpresa.CompanyGMB;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CompanyGMBRepository extends JpaRepository<CompanyGMB, UUID> {}