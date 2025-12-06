package br.com.api.tsagencia.tsagencia.repository.comercial;

import br.com.api.tsagencia.tsagencia.model.comercial.Services;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ServicesRepository extends JpaRepository<Services, UUID> {}