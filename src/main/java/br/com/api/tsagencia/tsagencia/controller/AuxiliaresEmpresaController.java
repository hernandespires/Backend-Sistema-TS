package br.com.api.tsagencia.tsagencia.controller;

import br.com.api.tsagencia.tsagencia.model.auxiliaresEmpresa.*;
import br.com.api.tsagencia.tsagencia.model.auxiliaresEmpresa.data.CommemorativeDate;
import br.com.api.tsagencia.tsagencia.model.auxiliaresEmpresa.data.Date;
import br.com.api.tsagencia.tsagencia.service.AuxiliaresEmpresaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.print.attribute.standard.Media;
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

    @PostMapping(
            value = "/saveCommemorativeDate",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public CommemorativeDate saveCommemorativeDate(CommemorativeDate commemorativeDate) {
        return service.saveCommemorativeDate(commemorativeDate);
    }

    @GetMapping(value = "/allDate", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Date> getAllDate() {
        return service.getAllDate();
    }

    @PostMapping(
            value = "/saveDate",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public Date setDate(Date date) {
        return service.saveDate(date);
    }

    @GetMapping(value = "/allCompanyFinancial", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<CompanyFinancial> getAllCompanyFinancial(CompanyFinancial companyFinancial) {
        return service.getAllCompanyFinancial();
    }

    @PostMapping(
            value = "/saveCompanyFinancial",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public CompanyFinancial saveCompanyFinancial(CompanyFinancial companyFinancial) {
        return service.saveCompanyFinancial(companyFinancial);
    }

    @GetMapping(value = "/allCompanyGMB", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<CompanyGMB> getCompanyGMB() {
        return service.getAllCompanyGMB();
    }

    @PostMapping(
            value = "/saveCompanyGMB",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public CompanyGMB saveCompanyGMB(CompanyGMB companyGMB) {
        return service.saveCompanyGMB(companyGMB);
    }

    @GetMapping(value = "/allCompanyInsurance", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<CompanyInsurance> getAllCompanyInsurance() {
        return service.getAllCompanyInsurance();
    }

    @PostMapping(
            value = "/saveCompanyInsurance",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public CompanyInsurance saveCompanyInsurance(CompanyInsurance companyInsurance) {
        return service.saveCompanyInsurance(companyInsurance);
    }

    @GetMapping(value = "/allCompanyOperations", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<CompanyOperations> companyOperations() {
        return service.getAllCompanyOperations();
    }

    @PostMapping(
            value = "/saveCompanyOperations",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public CompanyOperations saveCompanyOperations(CompanyOperations companyOperations) {
        return service.saveCompanyOperations(companyOperations);
    }

    @GetMapping(value = "/allCompanyReference", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<CompanyReference> getAllCompanyReference() {
        return service.getAllCompanyReference();
    }

    @PostMapping(
            value = "/saveCompanyReference",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public CompanyReference saveCompanyReference(CompanyReference companyReference) {
        return service.saveCompanyReference(companyReference);
    }

    @GetMapping(value = "/allCompanyServiceArea", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<CompanyServiceArea> getCompanyReference() {
        return service.getAllCompanyServiceArea();
    }

    @PostMapping(
            value = "/saveCompanyServiceArea",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public CompanyServiceArea saveCompanyServiceArea(CompanyServiceArea companyServiceArea) {
        return service.saveCompanyServiceArea(companyServiceArea);
    }

    @GetMapping(value = "/allCompanySite", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<CompanySite> getAllCompanySite() {
        return service.getAllCompanySite();
    }

    @PostMapping(
            value = "/saveCompanySite",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public CompanySite saveCompanySite(CompanySite companySite) {
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
    public CompanySocialNetwork saveCompanySocialNetwork(CompanySocialNetwork companySocialNetwork) {
        return service.saveCompanySocialNetwork(companySocialNetwork);
    }
}