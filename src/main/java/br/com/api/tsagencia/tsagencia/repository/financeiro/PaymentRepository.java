package br.com.api.tsagencia.tsagencia.repository.financeiro;

import br.com.api.tsagencia.tsagencia.model.financeiro.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface PaymentRepository extends JpaRepository<Payment, UUID> {}