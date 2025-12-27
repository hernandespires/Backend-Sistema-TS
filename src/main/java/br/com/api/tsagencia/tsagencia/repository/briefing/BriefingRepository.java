package br.com.api.tsagencia.tsagencia.repository.briefing;

import br.com.api.tsagencia.tsagencia.model.briefing.Briefing;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface BriefingRepository extends JpaRepository<Briefing, UUID> {}