package br.com.api.tsagencia.tsagencia.repository.briefing;

import br.com.api.tsagencia.tsagencia.model.briefing.BriefingFile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BriefingFileRepository extends JpaRepository<BriefingFile, String> {}