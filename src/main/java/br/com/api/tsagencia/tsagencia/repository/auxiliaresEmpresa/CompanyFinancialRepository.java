package br.com.api.tsagencia.tsagencia.repository.auxiliaresEmpresa;

import br.com.api.tsagencia.tsagencia.model.auxiliaresEmpresa.CompanyFinancial;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CompanyFinancialRepository extends JpaRepository<CompanyFinancial, UUID> {}