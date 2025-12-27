package br.com.api.tsagencia.tsagencia.repository.briefing;

import br.com.api.tsagencia.tsagencia.model.briefing.BriefingFile;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface BriefingFileRepository extends JpaRepository<BriefingFile, UUID> {}