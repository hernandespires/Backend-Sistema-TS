package br.com.api.tsagencia.tsagencia.repository.comercial;

import br.com.api.tsagencia.tsagencia.model.comercial.Lead;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LeadRepository extends JpaRepository<Lead, String> {}