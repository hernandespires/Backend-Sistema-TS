package br.com.api.tsagencia.tsagencia.repository.rh;

import br.com.api.tsagencia.tsagencia.model.rh.OrganizationalUnit;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface OrganizationalUnitRepository extends JpaRepository<OrganizationalUnit, UUID> {}