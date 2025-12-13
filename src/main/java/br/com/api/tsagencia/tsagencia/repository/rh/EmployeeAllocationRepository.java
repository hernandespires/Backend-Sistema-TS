package br.com.api.tsagencia.tsagencia.repository.rh;

import br.com.api.tsagencia.tsagencia.model.rh.EmployeeAllocation;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface EmployeeAllocationRepository extends JpaRepository<EmployeeAllocation, UUID> {}