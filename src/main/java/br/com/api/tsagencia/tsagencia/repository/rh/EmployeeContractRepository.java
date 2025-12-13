package br.com.api.tsagencia.tsagencia.repository.rh;

import br.com.api.tsagencia.tsagencia.model.rh.EmployeeContract;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface EmployeeContractRepository extends JpaRepository<EmployeeContract, UUID> {}