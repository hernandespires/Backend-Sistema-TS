package br.com.api.tsagencia.tsagencia.repository.briefing;

import br.com.api.tsagencia.tsagencia.model.briefing.BriefingField;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface BriefingFieldRepository extends JpaRepository<BriefingField, UUID> {}