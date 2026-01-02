package br.com.api.tsagencia.tsagencia.repository.financeiro;

import br.com.api.tsagencia.tsagencia.model.financeiro.ContractInstallment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContractInstallmentRepository extends JpaRepository<ContractInstallment, String> {}