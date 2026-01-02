package br.com.api.tsagencia.tsagencia.repository.rh;

import br.com.api.tsagencia.tsagencia.model.rh.EmployeeContract;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeContractRepository extends JpaRepository<EmployeeContract, String> {}