package br.com.api.tsagencia.tsagencia.repository.briefing;

import br.com.api.tsagencia.tsagencia.model.briefing.BriefingEmployee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BriefingEmployeeRepository extends JpaRepository<BriefingEmployee, String> {}