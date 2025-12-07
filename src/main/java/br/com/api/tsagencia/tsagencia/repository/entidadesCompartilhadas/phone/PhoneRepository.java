package br.com.api.tsagencia.tsagencia.repository.entidadesCompartilhadas.phone;

import br.com.api.tsagencia.tsagencia.model.entidadesCompartilhadas.phone.Phone;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface PhoneRepository extends JpaRepository<Phone, UUID> {}
