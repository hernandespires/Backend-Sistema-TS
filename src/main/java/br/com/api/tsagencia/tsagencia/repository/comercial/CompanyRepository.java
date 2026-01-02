package br.com.api.tsagencia.tsagencia.repository.comercial;

import br.com.api.tsagencia.tsagencia.model.comercial.Company;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepository extends JpaRepository<Company, String> {}