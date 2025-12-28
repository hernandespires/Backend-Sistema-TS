package br.com.api.tsagencia.tsagencia.controller;

import br.com.api.tsagencia.tsagencia.model.auxiliaresEmpresa.*;
import br.com.api.tsagencia.tsagencia.model.auxiliaresEmpresa.data.CommemorativeDate;
import br.com.api.tsagencia.tsagencia.model.auxiliaresEmpresa.data.Date;
import br.com.api.tsagencia.tsagencia.model.comercial.Company;
import br.com.api.tsagencia.tsagencia.service.AuxiliaresEmpresaService;
import org.hibernate.sql.Delete;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.print.attribute.standard.Media;
import java.util.List;
import java.util.UUID;

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
    public CommemorativeDate getCommemorativeDateById(@PathVariable UUID id) {
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
            @PathVariable UUID id, @RequestBody CommemorativeDate commemorativeDate
    ) {
        return service.editCommemorativeDate(id, commemorativeDate);
    }

    @DeleteMapping(value = "/deleteCommemorativeDate/{id}")
    public String deleteCommemorativeDate(@PathVariable UUID id) {
        return service.deleteCommemorativeDate(id);
    }

    @GetMapping(value = "/allDate", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Date> getAllDate() {
        return service.getAllDate();
    }

    @GetMapping(value = "/getDate/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Date getDateById(@PathVariable UUID id) {
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
    public Date editDate(@PathVariable UUID id, @RequestBody Date date) {
        return service.editDate(id, date);
    }

    @DeleteMapping(value = "/deleteDate/{id}")
    public String deleteDate(@PathVariable UUID id) {
        return service.deleteDate(id);
    }

    @GetMapping(value = "/allCompanyFinancial", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<CompanyFinancial> getAllCompanyFinancial(@RequestBody CompanyFinancial companyFinancial) {
        return service.getAllCompanyFinancial();
    }

    @GetMapping(value = "/getCompanyFinancial/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public CompanyFinancial getCompanyFinancialById(@PathVariable UUID id) {
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
            @PathVariable UUID id, @RequestBody CompanyFinancial companyFinancial
    ) {
        return service.editCompanyFinancial(id, companyFinancial);
    }

    @DeleteMapping(value = "/deleteCompanyFinancial/{id}")
    public String deleteCompanyFinancial(@PathVariable UUID id) {
        return service.deleteCompanyFinancial(id);
    }

    @GetMapping(value = "/allCompanyGMB", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<CompanyGMB> getCompanyGMB() {
        return service.getAllCompanyGMB();
    }

    @GetMapping(value = "/getCompanyGMBById/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public CompanyGMB getCompanyGMBById(@PathVariable UUID id) {
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
    public CompanyGMB editCompanyGMB(@PathVariable UUID id, @RequestBody CompanyGMB companyGMB) {
        return service.editCompanyGMB(id, companyGMB);
    }

    @DeleteMapping(value = "/deleteCompanyGMB/{id}")
    public String deleteCompanyGMB(@PathVariable UUID id) {
        return service.deleteCompanyGMB(id);
    }

    @GetMapping(value = "/allCompanyInsurance", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<CompanyInsurance> getAllCompanyInsurance() {
        return service.getAllCompanyInsurance();
    }

    @GetMapping(value = "/getCompanyInsurance/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public CompanyInsurance getCompanyInsuranceById(@PathVariable UUID id) {
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
            @PathVariable UUID id, @RequestBody CompanyInsurance companyInsurance
    ) {
        return service.editCompanyInsurance(id, companyInsurance);
    }

    @DeleteMapping(value = "/deleteCompanyInsurance/{id}")
    public String deleteCompanyInsurance(@PathVariable UUID id) {
        return service.deleteCompanyGMB(id);
    }

    @GetMapping(value = "/allCompanyOperations", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<CompanyOperations> companyOperations() {
        return service.getAllCompanyOperations();
    }

    @GetMapping(value = "/getCompanyOperations/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public CompanyOperations getCompanyOperationsById(@PathVariable UUID id) {
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
            @PathVariable UUID id, @RequestBody CompanyOperations companyOperations
    ) {
        return service.editCompanyOperations(id, companyOperations);
    }

    @DeleteMapping(value = "/deleteCompanyOperations/{id}")
    public String deleteCompanyOperations(@PathVariable UUID id) {
        return service.deleteCompanyOperations(id);
    }

    @GetMapping(value = "/allCompanyReference", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<CompanyReference> getAllCompanyReference() {
        return service.getAllCompanyReference();
    }

    @GetMapping(value = "/getCompanyReference/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public CompanyReference getCompanyReferenceById(@PathVariable UUID id) {
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
    public CompanyReference editCompanyReference(@PathVariable UUID id, @RequestBody CompanyReference companyReference) {
        return service.editCompanyReference(id, companyReference);
    }

    @DeleteMapping(value = "/deleteCompanyReference/{id}")
    public String deleteCompanyReference(@PathVariable UUID id) {
        return service.deleteCompanyReference(id);
    }

    @GetMapping(value = "/allCompanyServiceArea", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<CompanyServiceArea> getCompanyReference() {
        return service.getAllCompanyServiceArea();
    }

    @GetMapping(value = "/getCompanyServiceArea/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public CompanyServiceArea getCompanyServiceAreaId(@PathVariable UUID id) {
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

    @PutMapping(value = "//{id}")

    @GetMapping(value = "/allCompanySite", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<CompanySite> getAllCompanySite() {
        return service.getAllCompanySite();
    }

    @PostMapping(
            value = "/saveCompanySite",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public CompanySite saveCompanySite(@RequestBody CompanySite companySite) {
        return service.saveCompanySite(companySite);
    }

    @GetMapping(value = "/allCompanySocialNetwork", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<CompanySocialNetwork> getAllCompanySocialNetwork() {
        return service.getAllCompanySocialNetwork();
    }

    @PostMapping(
            value = "/saveCompanySocialNetwork",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public CompanySocialNetwork saveCompanySocialNetwork(@RequestBody CompanySocialNetwork companySocialNetwork) {
        return service.saveCompanySocialNetwork(companySocialNetwork);
    }
}