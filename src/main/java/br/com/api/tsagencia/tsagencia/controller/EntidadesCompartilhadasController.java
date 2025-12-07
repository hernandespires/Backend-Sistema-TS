package br.com.api.tsagencia.tsagencia.controller;

import br.com.api.tsagencia.tsagencia.model.entidadesCompartilhadas.email.ClientEmail;
import br.com.api.tsagencia.tsagencia.model.entidadesCompartilhadas.email.CompanyEmail;
import br.com.api.tsagencia.tsagencia.model.entidadesCompartilhadas.email.Email;
import br.com.api.tsagencia.tsagencia.model.entidadesCompartilhadas.email.LeadEmail;
import br.com.api.tsagencia.tsagencia.model.entidadesCompartilhadas.phone.ClientPhone;
import br.com.api.tsagencia.tsagencia.model.entidadesCompartilhadas.phone.CompanyPhone;
import br.com.api.tsagencia.tsagencia.model.entidadesCompartilhadas.phone.LeadPhone;
import br.com.api.tsagencia.tsagencia.model.entidadesCompartilhadas.phone.Phone;
import br.com.api.tsagencia.tsagencia.service.entidadesCompartilhadas.EmailService;
import br.com.api.tsagencia.tsagencia.service.entidadesCompartilhadas.PhoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/entidades_compartilhadas")    
public class EntidadesCompartilhadasController {
    @Autowired
    private EmailService emailService;

    @Autowired
    private PhoneService phoneService;

    @GetMapping(value = "/allClientEmail", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<ClientEmail> getAllClientEmail() {
        return emailService.getAllClientEmail();
    }

    @PostMapping(
            value = "/saveClientEmail",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public ClientEmail saveClientEmail(ClientEmail clientEmail) {
        return emailService.saveClientEmail(clientEmail);
    }

    @GetMapping(value = "/allCompanyEmail", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<CompanyEmail> getAllCompanyEmail() {
        return emailService.getAllCompanyEmail();
    }

    @PostMapping(
            value = "/saveCompanyEmail",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public CompanyEmail saveCompanyEmail(CompanyEmail companyEmail) {
        return emailService.saveCompanyEmail(companyEmail);
    }

    @GetMapping(value = "/allEmail", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Email> getAllEmail() {
        return emailService.getAllEmail();
    }

    @PostMapping(
            value = "/saveEmail",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public Email saveEmail(Email email) {
        return emailService.saveEmail(email);
    }

    @GetMapping(value = "/allLeadEmail", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<LeadEmail> getAllLeadEmail() {
        return emailService.getAllLeadEmail();
    }

    @PostMapping(
            value = "/saveLeadEmail",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public LeadEmail saveLeadEmail(LeadEmail leadEmail) {
        return emailService.saveLeadEmail(leadEmail);
    }

    @GetMapping(value = "/allClientPhone", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<ClientPhone> getAllClientPhone() {
        return phoneService.getAllClientPhone();
    }

    @PostMapping(
            value = "/saveClientPhone",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public ClientPhone saveClientPhone(ClientPhone clientPhone) {
        return phoneService.saveClientPhone(clientPhone);
    }

    @GetMapping(value = "/allCompanyPhone", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<CompanyPhone> allCompanyPhone() {
        return phoneService.getAllCompanyPhone();
    }

    @PostMapping(
            value = "/saveCompanyPhone",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public CompanyPhone saveCompanyPhone(CompanyPhone companyPhone) {
        return phoneService.saveCompanyPhone(companyPhone);
    }

    @GetMapping(value = "/allLeadPhone", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<LeadPhone> getAllLeadPhone() {
        return phoneService.getAllLeadPhone();
    }

    @PostMapping(
            value = "/saveLedPhone",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public LeadPhone saveLeadPhone(LeadPhone leadPhone) {
        return phoneService.saveLeadPhone(leadPhone);
    }

    @GetMapping(value = "/allPhone", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Phone> getAllPhone() {
        return phoneService.getAllPhone();
    }

    @PostMapping(
            value = "/savePhone",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public Phone savePhone(Phone phone) {
        return phoneService.savePhone(phone);
    }
}