package br.com.api.tsagencia.tsagencia.controller;

import br.com.api.tsagencia.tsagencia.model.financeiro.Contract;
import br.com.api.tsagencia.tsagencia.model.financeiro.ContractAddendum;
import br.com.api.tsagencia.tsagencia.model.financeiro.ContractInstallment;
import br.com.api.tsagencia.tsagencia.model.financeiro.Payment;
import br.com.api.tsagencia.tsagencia.service.FinanceiroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/financeiro")
public class FinanceiroController {
    @Autowired
    FinanceiroService service;

    @GetMapping(value = "/allContract", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Contract> getAllContract() {
        return service.getAllContract();
    }

    @PostMapping(
            value = "/saveContract",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public Contract saveContract(@RequestBody Contract contract) {
        return service.saveContract(contract);
    }

    @GetMapping(value = "/allContractAddendum", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<ContractAddendum> getAllContractAddendum() {
        return service.getAllContractAddendum();
    }

    @PostMapping(
            value = "/saveContractAddendum",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public ContractAddendum saveContractAddendum(@RequestBody ContractAddendum contractAddendum) {
        return service.saveContractAddendum(contractAddendum);
    }

    @GetMapping(value = "/allContractInstallment", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<ContractInstallment> getAllContractInstallment() {
        return service.getAllContractInstallmentById();
    }

    @PostMapping(
            value = "/saveContractInstallment",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public ContractInstallment saveContractInstallment(@RequestBody ContractInstallment contractInstallment) {
        return service.saveContractInstallment(contractInstallment);
    }

    @GetMapping(value = "/allPayment", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Payment> getAllPayment() {
        return service.getAllPayment();
    }

    @PostMapping(
            value = "/savePayment",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public Payment savePayment(@RequestBody Payment payment) {
        return service.savePayment(payment);
    }
}