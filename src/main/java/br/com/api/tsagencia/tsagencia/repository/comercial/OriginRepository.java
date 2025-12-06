package br.com.api.tsagencia.tsagencia.repository.comercial;

import br.com.api.tsagencia.tsagencia.model.comercial.Origin;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface OriginRepository extends JpaRepository<Origin, UUID> {}