package br.com.api.tsagencia.tsagencia.repository.comercial;

import br.com.api.tsagencia.tsagencia.model.comercial.Program;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ProgramRepository extends JpaRepository<Program, UUID> {}