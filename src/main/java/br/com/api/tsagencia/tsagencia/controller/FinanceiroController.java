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
import java.util.UUID;

@RestController
@RequestMapping("/financeiro")
public class FinanceiroController {
    @Autowired
    FinanceiroService service;

    @GetMapping(value = "/allContract", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Contract> getAllContract() {
        return service.getAllContract();
    }

    @GetMapping(value = "/getContract/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Contract getContractById(UUID id) {
        return service.getContractById(id);
    }

    @PostMapping(
            value = "/saveContract",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public Contract saveContract(@RequestBody Contract contract) {
        return service.saveContract(contract);
    }

    @PutMapping(
            value = "/editContract/{id}",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public Contract editContract(@PathVariable UUID id, @RequestBody Contract contract) {
        return service.editContract(id, contract);
    }

    @DeleteMapping(value = "/deleteContract/{id}")
    public String deleteContract(@PathVariable UUID id) {
        return service.deleteContract(id);
    }

    @GetMapping(value = "/allContractAddendum", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<ContractAddendum> getAllContractAddendum() {
        return service.getAllContractAddendum();
    }

    @GetMapping(value = "/getContractAddendum/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ContractAddendum getContractAddendumById(@PathVariable UUID id) {
        return service.getContractAddendumById(id);
    }

    @PostMapping(
            value = "/saveContractAddendum",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public ContractAddendum saveContractAddendum(@RequestBody ContractAddendum contractAddendum) {
        return service.saveContractAddendum(contractAddendum);
    }

    @PutMapping(
            value = "/editContractAddendum/{id}",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public ContractAddendum editContractAddendum(
            @PathVariable UUID id, @RequestBody ContractAddendum contractAddendum
    ) {
        return service.editContractAddendum(id, contractAddendum);
    }

    @DeleteMapping(value = "/deleteContractAddendum/{id}")
    public String deleteContractAddendum(@PathVariable UUID id) {
        return service.deleteContractAddendum(id);
    }

    @GetMapping(value = "/allContractInstallment", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<ContractInstallment> getAllContractInstallment() {
        return service.getAllContractInstallmentById();
    }

    @GetMapping(value = "/getContractInstallment/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ContractInstallment getContractInstallmentById(@PathVariable UUID id) {
        return service.getContractInstallmentById(id);
    }

    @PostMapping(
            value = "/saveContractInstallment",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public ContractInstallment saveContractInstallment(@RequestBody ContractInstallment contractInstallment) {
        return service.saveContractInstallment(contractInstallment);
    }

    @PutMapping(
            value = "/editContractInstallment/{id}",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public ContractInstallment editContractInstallment(
            @PathVariable UUID id, @RequestBody ContractInstallment contractInstallment
    ) {
        return service.editContractInstallment(id, contractInstallment);
    }

    @DeleteMapping(value = "/deleteContractInstallment/{id}")
    public String deleteContractInstallment(@PathVariable UUID id) {
        return service.deleteContractInstallment(id);
    }

    @GetMapping(value = "/allPayment", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Payment> getAllPayment() {
        return service.getAllPayment();
    }

    @GetMapping(value = "/getPayment/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Payment getPaymentById(@PathVariable UUID id) {
        return service.getPaymentById(id);
    }

    @PostMapping(
            value = "/savePayment",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public Payment savePayment(@RequestBody Payment payment) {
        return service.savePayment(payment);
    }

    @PutMapping(
            value = "/editPayment/{id}",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public Payment editPayment(@PathVariable UUID id, @RequestBody Payment payment) {
        return service.editPayment(id, payment);
    }

    @DeleteMapping(value = "/deletePayment/{id}")
    public String deletePayment(@PathVariable UUID id) {
        return service.deletePayment(id);
    }
}