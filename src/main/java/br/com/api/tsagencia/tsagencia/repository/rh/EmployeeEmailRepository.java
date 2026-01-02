package br.com.api.tsagencia.tsagencia.repository.rh;

import br.com.api.tsagencia.tsagencia.model.rh.EmployeeEmail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeEmailRepository extends JpaRepository<EmployeeEmail, String> {}