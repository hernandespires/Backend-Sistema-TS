package br.com.api.tsagencia.tsagencia.controller;

import br.com.api.tsagencia.tsagencia.model.auxiliaresEmpresa.*;
import br.com.api.tsagencia.tsagencia.model.auxiliaresEmpresa.data.CommemorativeDate;
import br.com.api.tsagencia.tsagencia.model.auxiliaresEmpresa.data.Date;
import br.com.api.tsagencia.tsagencia.service.AuxiliaresEmpresaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/auxiliaresEmpresa")
public class AuxiliaresEmpresaController {
    @Autowired
    private AuxiliaresEmpresaService service;

    @GetMapping(value = "/allCommemorativeDate", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<CommemorativeDate> getAllCommemorativeDate() {
        return service.getAllCommemorativeDate();
    }

    @GetMapping(value = "/getCommemorativeDate/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public CommemorativeDate getCommemorativeDateById(@PathVariable String id) {
        return service.getCommemorativeDateById(id);
    }

    @PostMapping(
            value = "/saveCommemorativeDate",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public CommemorativeDate saveCommemorativeDate(@RequestBody CommemorativeDate commemorativeDate) {
        return service.saveCommemorativeDate(commemorativeDate);
    }

    @PutMapping(
            value = "/editCommemorativeDate/{id}",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public CommemorativeDate editCommemorativeDate(
            @PathVariable String id, @RequestBody CommemorativeDate commemorativeDate
    ) {
        return service.editCommemorativeDate(id, commemorativeDate);
    }

    @DeleteMapping(value = "/deleteCommemorativeDate/{id}")
    public String deleteCommemorativeDate(@PathVariable String id) {
        return service.deleteCommemorativeDate(id);
    }

    @GetMapping(value = "/allDate", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Date> getAllDate() {
        return service.getAllDate();
    }

    @GetMapping(value = "/getDate/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Date getDateById(@PathVariable String id) {
        return service.getDateById(id);
    }

    @PostMapping(
            value = "/saveDate",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public Date saveDate(@RequestBody Date date) {
        return service.saveDate(date);
    }

    @PutMapping(
            value = "/editDate/{id}",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public Date editDate(@PathVariable String id, @RequestBody Date date) {
        return service.editDate(id, date);
    }

    @DeleteMapping(value = "/deleteDate/{id}")
    public String deleteDate(@PathVariable String id) {
        return service.deleteDate(id);
    }

    @GetMapping(value = "/allCompanyFinancial", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<CompanyFinancial> getAllCompanyFinancial(@RequestBody CompanyFinancial companyFinancial) {
        return service.getAllCompanyFinancial();
    }

    @GetMapping(value = "/getCompanyFinancial/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public CompanyFinancial getCompanyFinancialById(@PathVariable String id) {
        return service.getCompanyFinancialById(id);
    }

    @PostMapping(
            value = "/saveCompanyFinancial",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public CompanyFinancial saveCompanyFinancial(@RequestBody CompanyFinancial companyFinancial) {
        return service.saveCompanyFinancial(companyFinancial);
    }

    @PutMapping(
            value = "/editCompanyFinancial/{id}",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public CompanyFinancial editCompanyFinancial(
            @PathVariable String id, @RequestBody CompanyFinancial companyFinancial
    ) {
        return service.editCompanyFinancial(id, companyFinancial);
    }

    @DeleteMapping(value = "/deleteCompanyFinancial/{id}")
    public String deleteCompanyFinancial(@PathVariable String id) {
        return service.deleteCompanyFinancial(id);
    }

    @GetMapping(value = "/allCompanyGMB", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<CompanyGMB> getCompanyGMB() {
        return service.getAllCompanyGMB();
    }

    @GetMapping(value = "/getCompanyGMBById/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public CompanyGMB getCompanyGMBById(@PathVariable String id) {
        return service.getCompanyGMBById(id);
    }

    @PostMapping(
            value = "/saveCompanyGMB",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public CompanyGMB saveCompanyGMB(@RequestBody CompanyGMB companyGMB) {
        return service.saveCompanyGMB(companyGMB);
    }

    @PutMapping(
            value = "/editCompanyGMB/{id}",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public CompanyGMB editCompanyGMB(@PathVariable String id, @RequestBody CompanyGMB companyGMB) {
        return service.editCompanyGMB(id, companyGMB);
    }

    @DeleteMapping(value = "/deleteCompanyGMB/{id}")
    public String deleteCompanyGMB(@PathVariable String id) {
        return service.deleteCompanyGMB(id);
    }

    @GetMapping(value = "/allCompanyInsurance", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<CompanyInsurance> getAllCompanyInsurance() {
        return service.getAllCompanyInsurance();
    }

    @GetMapping(value = "/getCompanyInsurance/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public CompanyInsurance getCompanyInsuranceById(@PathVariable String id) {
        return service.getCompanyInsuranceById(id);
    }

    @PostMapping(
            value = "/saveCompanyInsurance",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public CompanyInsurance saveCompanyInsurance(@RequestBody CompanyInsurance companyInsurance) {
        return service.saveCompanyInsurance(companyInsurance);
    }

    @PutMapping(
            value = "/editCompanyInsurance/{id}",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public CompanyInsurance editCompanyInsurance(
            @PathVariable String id, @RequestBody CompanyInsurance companyInsurance
    ) {
        return service.editCompanyInsurance(id, companyInsurance);
    }

    @DeleteMapping(value = "/deleteCompanyInsurance/{id}")
    public String deleteCompanyInsurance(@PathVariable String id) {
        return service.deleteCompanyGMB(id);
    }

    @GetMapping(value = "/allCompanyOperations", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<CompanyOperations> companyOperations() {
        return service.getAllCompanyOperations();
    }

    @GetMapping(value = "/getCompanyOperations/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public CompanyOperations getCompanyOperationsById(@PathVariable String id) {
        return service.getCompanyOperationsById(id);
    }

    @PostMapping(
            value = "/saveCompanyOperations",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public CompanyOperations saveCompanyOperations(@RequestBody CompanyOperations companyOperations) {
        return service.saveCompanyOperations(companyOperations);
    }

    @PutMapping(
            value = "/editCompanyOperations/{id}",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public CompanyOperations editCompanyOperations(
            @PathVariable String id, @RequestBody CompanyOperations companyOperations
    ) {
        return service.editCompanyOperations(id, companyOperations);
    }

    @DeleteMapping(value = "/deleteCompanyOperations/{id}")
    public String deleteCompanyOperations(@PathVariable String id) {
        return service.deleteCompanyOperations(id);
    }

    @GetMapping(value = "/allCompanyReference", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<CompanyReference> getAllCompanyReference() {
        return service.getAllCompanyReference();
    }

    @GetMapping(value = "/getCompanyReference/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public CompanyReference getCompanyReferenceById(@PathVariable String id) {
        return service.getCompanyReferenceById(id);
    }

    @PostMapping(
            value = "/saveCompanyReference",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public CompanyReference saveCompanyReference(@RequestBody CompanyReference companyReference) {
        return service.saveCompanyReference(companyReference);
    }

    @PutMapping(
            value = "/editCompanyReference/{id}",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public CompanyReference editCompanyReference(@PathVariable String id, @RequestBody CompanyReference companyReference) {
        return service.editCompanyReference(id, companyReference);
    }

    @DeleteMapping(value = "/deleteCompanyReference/{id}")
    public String deleteCompanyReference(@PathVariable String id) {
        return service.deleteCompanyReference(id);
    }

    @GetMapping(value = "/allCompanyServiceArea", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<CompanyServiceArea> getCompanyReference() {
        return service.getAllCompanyServiceArea();
    }

    @GetMapping(value = "/getCompanyServiceArea/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public CompanyServiceArea getCompanyServiceAreaId(@PathVariable String id) {
        return service.getCompanyServiceAreaById(id);
    }

    @PostMapping(
            value = "/saveCompanyServiceArea",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public CompanyServiceArea saveCompanyServiceArea(@RequestBody CompanyServiceArea companyServiceArea) {
        return service.saveCompanyServiceArea(companyServiceArea);
    }

    @PutMapping(
            value = "/editCompanyServiceArea/{id}",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public CompanyServiceArea editCompanyServiceArea(
            @PathVariable String id, @RequestBody CompanyServiceArea companyServiceArea
    ) {
        return service.editCompanyServiceArea(id, companyServiceArea);
    }

    @DeleteMapping(value = "/deleteCompanyServiceArea/{id}")
    public String deleteCompanyServiceArea(String id) {
        return service.deleteCompanyServiceArea(id);
    }

    @GetMapping(value = "/allCompanySite", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<CompanySite> getAllCompanySite() {
        return service.getAllCompanySite();
    }

    @GetMapping(value = "/getCompanySiteById/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public CompanySite getCompanySiteById(@PathVariable String id) {
        return service.getCompanySiteById(id);
    }

    @PostMapping(
            value = "/saveCompanySite",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public CompanySite saveCompanySite(@RequestBody CompanySite companySite) {
        return service.saveCompanySite(companySite);
    }

    @PutMapping(
            value = "/editCompanySite/{id}",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public CompanySite editCompanySite(@PathVariable String id, @RequestBody CompanySite companySite) {
        return service.editCompanySite(id, companySite);
    }

    @DeleteMapping(value = "/deleteCompanySite/{id}")
    public String deleteCompanySite(@PathVariable String id) {
        return service.deleteCompanyReference(id);
    }

    @GetMapping(value = "/allCompanySocialNetwork", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<CompanySocialNetwork> getAllCompanySocialNetwork() {
        return service.getAllCompanySocialNetwork();
    }

    @GetMapping(value = "/getCompanySocialNetwork/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public CompanySocialNetwork getCompanySocialNetworkById(@PathVariable String id) {
        return service.getCompanySocialNetwork(id);
    }

    @PostMapping(
            value = "/saveCompanySocialNetwork",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public CompanySocialNetwork saveCompanySocialNetwork(@RequestBody CompanySocialNetwork companySocialNetwork) {
        return service.saveCompanySocialNetwork(companySocialNetwork);
    }

    @PutMapping(
            value = "/editCompanySocialNetwork/{id}",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public CompanySocialNetwork editCompanySocialNetwork(
            @PathVariable String id, @RequestBody CompanySocialNetwork companySocialNetwork
    ) {
        return service.editCompanySocialNetwork(id, companySocialNetwork);
    }

    @DeleteMapping(value = "/deleteCompanySocialNetwork/{id}")
    public String deleteCompanySocialNetwork(@PathVariable String id) {
        return service.deleteCompanySocialNetwork(id);
    }
}