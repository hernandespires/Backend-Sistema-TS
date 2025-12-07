package br.com.api.tsagencia.tsagencia.repository.auxiliaresEmpresa.data;

import br.com.api.tsagencia.tsagencia.model.auxiliaresEmpresa.data.Date;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface DateRepository extends JpaRepository<Date, UUID> {}