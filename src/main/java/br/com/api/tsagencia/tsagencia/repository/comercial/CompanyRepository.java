package br.com.api.tsagencia.tsagencia.repository.comercial;

import br.com.api.tsagencia.tsagencia.model.comercial.Company;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CompanyRepository extends JpaRepository<Company, UUID> {}