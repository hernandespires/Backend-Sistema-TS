package br.com.api.tsagencia.tsagencia.repository.auxiliaresEmpresa;

import br.com.api.tsagencia.tsagencia.model.auxiliaresEmpresa.CompanyInsurance;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CompanyInsuranceRepository extends JpaRepository<CompanyInsurance, UUID> {}