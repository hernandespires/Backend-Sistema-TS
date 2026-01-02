package br.com.api.tsagencia.tsagencia.repository.financeiro;

import br.com.api.tsagencia.tsagencia.model.financeiro.Contract;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContractRepository extends JpaRepository<Contract, String> {}