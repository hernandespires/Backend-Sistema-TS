package br.com.api.tsagencia.tsagencia.repository.briefing;

import br.com.api.tsagencia.tsagencia.model.briefing.BriefingVisibility;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface BriefingVisibilityRepository extends JpaRepository<BriefingVisibility, UUID> {}