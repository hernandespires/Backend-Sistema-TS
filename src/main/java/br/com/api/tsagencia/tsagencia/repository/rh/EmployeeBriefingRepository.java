package br.com.api.tsagencia.tsagencia.repository.rh;

import br.com.api.tsagencia.tsagencia.model.rh.EmployeeBriefing;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface EmployeeBriefingRepository extends JpaRepository<EmployeeBriefing, UUID> {}