package br.com.api.tsagencia.tsagencia.repository.auxiliaresEmpresa;

import br.com.api.tsagencia.tsagencia.model.auxiliaresEmpresa.CompanyServiceArea;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CompanyServiceAreaRepository extends JpaRepository<CompanyServiceArea, UUID> {}