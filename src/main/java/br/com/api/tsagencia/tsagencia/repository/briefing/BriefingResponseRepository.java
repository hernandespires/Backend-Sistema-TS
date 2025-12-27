package br.com.api.tsagencia.tsagencia.repository.briefing;

import br.com.api.tsagencia.tsagencia.model.briefing.BriefingResponse;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface BriefingResponseRepository extends JpaRepository<BriefingResponse, UUID> {}
