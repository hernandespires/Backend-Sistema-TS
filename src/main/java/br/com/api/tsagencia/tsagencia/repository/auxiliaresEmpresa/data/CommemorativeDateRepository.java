package br.com.api.tsagencia.tsagencia.repository.auxiliaresEmpresa.data;

import br.com.api.tsagencia.tsagencia.model.auxiliaresEmpresa.data.CommemorativeDate;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CommemorativeDateRepository extends JpaRepository<CommemorativeDate, UUID> {}