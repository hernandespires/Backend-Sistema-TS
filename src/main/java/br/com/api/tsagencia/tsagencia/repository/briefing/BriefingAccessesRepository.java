package br.com.api.tsagencia.tsagencia.repository.briefing;

import br.com.api.tsagencia.tsagencia.model.briefing.BriefingAccesses;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface BriefingAccessesRepository extends JpaRepository<BriefingAccesses, UUID> {}