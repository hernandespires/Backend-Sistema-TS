package br.com.api.tsagencia.tsagencia.service;

import br.com.api.tsagencia.tsagencia.model.financeiro.Contract;
import br.com.api.tsagencia.tsagencia.model.financeiro.ContractAddendum;
import br.com.api.tsagencia.tsagencia.model.financeiro.ContractInstallment;
import br.com.api.tsagencia.tsagencia.model.financeiro.Payment;
import br.com.api.tsagencia.tsagencia.repository.financeiro.ContractAddendumRepository;
import br.com.api.tsagencia.tsagencia.repository.financeiro.ContractInstallmentRepository;
import br.com.api.tsagencia.tsagencia.repository.financeiro.ContractRepository;
import br.com.api.tsagencia.tsagencia.repository.financeiro.PaymentRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class FinanceiroService {
    private final ContractRepository contractRepository;
    private final ContractAddendumRepository contractAddendumRepository;
    private final ContractInstallmentRepository contractInstallmentRepository;
    private final PaymentRepository paymentRepository;

    private final String successfullyDeletedMessage = "Registro deletado com sucesso";

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

    public Contract getContractById(UUID id) {
        return contractRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("Contrato não encotrado"));
    }

    public Contract saveContract(Contract contract) {
        return contractRepository.save(contract);
    }

    public Contract editContract(UUID id, Contract contract) {
        Contract contractFound = getContractById(id);

        contractFound.setClient(contract.getClient());
        contractFound.setCompany(contract.getCompany());
        contractFound.setProgram(contract.getProgram());
        contractFound.setContractType(contract.getContractType());
        contractFound.setContractStatus(contract.getContractStatus());
        contractFound.setStartDate(contract.getStartDate());
        contractFound.setEndDate(contract.getEndDate());
        contractFound.setValue(contract.getValue());
        contractFound.setPaymentMethod(contract.getPaymentMethod());
        contractFound.setRenovations(contract.getRenovations());
        return contractFound;
    }

    public String deleteContract(UUID id) {
        contractRepository.deleteById(id);
        return successfullyDeletedMessage;
    }

    public List<ContractAddendum> getAllContractAddendum() {
        return contractAddendumRepository.findAll();
    }

    public ContractAddendum getContractAddendumById(UUID id) {
        return contractAddendumRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Aditivo do contrato não encotrado"));
    }

    public ContractAddendum saveContractAddendum(ContractAddendum contractAddendum) {
        return contractAddendumRepository.save(contractAddendum);
    }

    public ContractAddendum editContractAddendum(UUID id, ContractAddendum contractAddendum) {
        ContractAddendum contractAddendumFound = getContractAddendumById(id);

        contractAddendumFound.setContract(contractAddendum.getContract());
        contractAddendumFound.setType(contractAddendum.getType());
        contractAddendumFound.setDescription(contractAddendum.getDescription());
        contractAddendumFound.setStartDate(contractAddendum.getStartDate());
        contractAddendumFound.setEndDate(contractAddendum.getEndDate());
        contractAddendumFound.setAdditionalValue(contractAddendum.getAdditionalValue());
        contractAddendumFound.setStatus(contractAddendum.getStatus());
        return contractAddendumFound;
    }

    public String deleteContractAddendum(UUID id) {
        contractAddendumRepository.deleteById(id);
        return successfullyDeletedMessage;
    }

    public List<ContractInstallment> getAllContractInstallmentById() {
        return contractInstallmentRepository.findAll();
    }

    public ContractInstallment getContractInstallmentById(UUID id) {
        return contractInstallmentRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Parcela do contrato não encotrada"));
    }

    public ContractInstallment saveContractInstallment(ContractInstallment contractInstallment) {
        return contractInstallmentRepository.save(contractInstallment);
    }

    public ContractInstallment editContractInstallment(UUID id, ContractInstallment contractInstallment) {
        ContractInstallment contractInstallmentFound = getContractInstallmentById(id);

        contractInstallmentFound.setContract(contractInstallment.getContract());
        contractInstallmentFound.setContractAddendum(contractInstallment.getContractAddendum());
        contractInstallmentFound.setInstallments(contractInstallment.getInstallments());
        contractInstallmentFound.setExpirationDate(contractInstallment.getExpirationDate());
        contractInstallmentFound.setInstallmentValue(contractInstallment.getInstallmentValue());
        contractInstallmentFound.setStatus(contractInstallment.getStatus());
        return contractInstallmentFound;
    }

    public String deleteContractInstallment(UUID id) {
        contractInstallmentRepository.deleteById(id);
        return successfullyDeletedMessage;
    }

    public List<Payment> getAllPayment() {
        return paymentRepository.findAll();
    }

    public Payment getPaymentById(UUID id) {
        return paymentRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Pagamento não encontrado"));
    }

    public Payment savePayment(Payment payment) {
        return paymentRepository.save(payment);
    }

    public Payment editPayment(UUID id, Payment payment) {
        Payment paymentFound = getPaymentById(id);

        paymentFound.setContractAddendum(payment.getContractAddendum());
        paymentFound.setPaymentDate(payment.getPaymentDate());
        paymentFound.setValue(payment.getValue());
        paymentFound.setMethod(payment.getMethod());
        paymentFound.setTransitionId(payment.getTransitionId());
        paymentFound.setStatus(payment.getStatus());
        return paymentFound;
    }

    public String deletePayment(UUID id) {
        paymentRepository.deleteById(id);
        return successfullyDeletedMessage;
    }
}