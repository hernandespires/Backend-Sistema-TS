package br.com.api.tsagencia.tsagencia.repository.entidadesCompartilhadas.phone;

import br.com.api.tsagencia.tsagencia.model.entidadesCompartilhadas.phone.LeadPhone;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface LeadPhoneRepository extends JpaRepository<LeadPhone, UUID> {}