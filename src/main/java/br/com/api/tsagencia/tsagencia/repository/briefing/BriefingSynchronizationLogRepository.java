package br.com.api.tsagencia.tsagencia.repository.briefing;

import br.com.api.tsagencia.tsagencia.model.briefing.BriefingSynchronizationLog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BriefingSynchronizationLogRepository extends JpaRepository<BriefingSynchronizationLog, String> {}