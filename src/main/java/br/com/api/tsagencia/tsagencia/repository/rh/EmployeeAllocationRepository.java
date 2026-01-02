package br.com.api.tsagencia.tsagencia.repository.rh;

import br.com.api.tsagencia.tsagencia.model.rh.EmployeeAllocation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeAllocationRepository extends JpaRepository<EmployeeAllocation, String> {}