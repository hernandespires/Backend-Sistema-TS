package br.com.api.tsagencia.tsagencia.repository.rh;

import br.com.api.tsagencia.tsagencia.model.rh.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface EmployeeRepository extends JpaRepository<Employee, UUID> {}