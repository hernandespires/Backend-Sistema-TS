package br.com.api.tsagencia.tsagencia.repository.briefing;

import br.com.api.tsagencia.tsagencia.model.briefing.BriefingSection;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface BriefingSectionRepository extends JpaRepository<BriefingSection, UUID> {}