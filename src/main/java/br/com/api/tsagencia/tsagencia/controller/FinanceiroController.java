package br.com.api.tsagencia.tsagencia.controller;

import br.com.api.tsagencia.tsagencia.model.financeiro.Contract;
import br.com.api.tsagencia.tsagencia.model.financeiro.ContractAddendum;
import br.com.api.tsagencia.tsagencia.model.financeiro.ContractInstallment;
import br.com.api.tsagencia.tsagencia.model.financeiro.Payment;
import br.com.api.tsagencia.tsagencia.service.FinanceiroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FinanceiroController {
    @Autowired
    FinanceiroService service;

    @GetMapping(name = "allContract", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Contract> getAllContract() {
        return service.getAllContract();
    }

    @PostMapping(
            name = "saveContract",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public Contract saveContract(Contract contract) {
        return service.saveContract(contract);
    }

    @GetMapping(name = "allContractAddendum", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<ContractAddendum> getAllContractAddendum() {
        return service.getAllContractAddendum();
    }

    @PostMapping(
            name = "saveContractAddendum",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public ContractAddendum saveContractAddendum(ContractAddendum contractAddendum) {
        return service.saveContractAddendum(contractAddendum);
    }

    @GetMapping(name = "allContractInstallment", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<ContractInstallment> getAllContractInstallment() {
        return service.getAllContractInstallment();
    }

    @PostMapping(
            name = "saveContractInstallment",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public ContractInstallment getAllContractInstallment(ContractInstallment contractInstallment) {
        return service.saveContractInstallment(contractInstallment);
    }

    @GetMapping(name = "allPayment", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Payment> getAllPayment() {
        return service.getAllPayment();
    }

    @PostMapping(
            name = "savePayment",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public Payment savePayment(Payment payment) {
        return service.savePayment(payment);
    }
}