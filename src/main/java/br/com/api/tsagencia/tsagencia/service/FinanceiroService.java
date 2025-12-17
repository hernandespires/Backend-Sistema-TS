package br.com.api.tsagencia.tsagencia.service;

import br.com.api.tsagencia.tsagencia.model.financeiro.Contract;
import br.com.api.tsagencia.tsagencia.model.financeiro.ContractAddendum;
import br.com.api.tsagencia.tsagencia.model.financeiro.ContractInstallment;
import br.com.api.tsagencia.tsagencia.model.financeiro.Payment;
import br.com.api.tsagencia.tsagencia.repository.financeiro.ContractAddendumRepository;
import br.com.api.tsagencia.tsagencia.repository.financeiro.ContractInstallmentRepository;
import br.com.api.tsagencia.tsagencia.repository.financeiro.ContractRepository;
import br.com.api.tsagencia.tsagencia.repository.financeiro.PaymentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FinanceiroService {
    private final ContractRepository contractRepository;
    private final ContractAddendumRepository contractAddendumRepository;
    private final ContractInstallmentRepository contractInstallmentRepository;
    private final PaymentRepository paymentRepository;

    public FinanceiroService(
            ContractRepository contractRepository,
            ContractAddendumRepository contractAddendumRepository,
            ContractInstallmentRepository contractInstallmentRepository,
            PaymentRepository paymentRepository
    ) {
        this.contractRepository = contractRepository;
        this.contractAddendumRepository = contractAddendumRepository;
        this.contractInstallmentRepository = contractInstallmentRepository;
        this.paymentRepository = paymentRepository;
    }

    public List<Contract> getAllContract() {
        return contractRepository.findAll();
    }

    public Contract saveContract(Contract contract) {
        return contractRepository.save(contract);
    }

    public List<ContractAddendum> getAllContractAddendum() {
        return contractAddendumRepository.findAll();
    }

    public ContractAddendum saveContractAddendum(ContractAddendum contractAddendum) {
        return contractAddendumRepository.save(contractAddendum);
    }

    public List<ContractInstallment> getAllContractInstallment() {
        return contractInstallmentRepository.findAll();
    }

    public ContractInstallment saveContractInstallment(ContractInstallment contractInstallment) {
        return contractInstallmentRepository.save(contractInstallment);
    }

    public List<Payment> getAllPayment() {
        return paymentRepository.findAll();
    }

    public Payment savePayment(Payment payment) {
        return paymentRepository.save(payment);
    }
}