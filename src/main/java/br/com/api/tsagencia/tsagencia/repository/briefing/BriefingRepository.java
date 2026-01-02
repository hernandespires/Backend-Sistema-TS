package br.com.api.tsagencia.tsagencia.repository.briefing;

import br.com.api.tsagencia.tsagencia.model.briefing.Briefing;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BriefingRepository extends JpaRepository<Briefing, String> {}