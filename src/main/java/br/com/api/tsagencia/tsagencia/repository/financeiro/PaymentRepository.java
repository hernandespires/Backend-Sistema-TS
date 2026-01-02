package br.com.api.tsagencia.tsagencia.repository.financeiro;

import br.com.api.tsagencia.tsagencia.model.financeiro.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment, String> {}