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
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/entidadesCompartilhadas")
public class EntidadesCompartilhadasController {
    @Autowired
    private EmailService emailService;

    @Autowired
    private PhoneService phoneService;

    @GetMapping(value = "/allClientEmail", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<ClientEmail> getAllClientEmail() {
        return emailService.getAllClientEmail();
    }

    @GetMapping(value = "/getClientEmail/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ClientEmail getClientEmailById(@PathVariable String id) {
        return emailService.getClientEmailById(id);
    }

    @PostMapping(
            value = "/saveClientEmail",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public ClientEmail saveClientEmail(@RequestBody ClientEmail clientEmail) {
        return emailService.saveClientEmail(clientEmail);
    }

    @PutMapping(
            value = "/editClientEmail/{id}",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public ClientEmail editClientEmail(@PathVariable String id, @RequestBody ClientEmail clientEmail) {
        return emailService.editClientEmail(id, clientEmail);
    }

    @DeleteMapping(value = "/deleteClientEmail/{id}")
    public String deleteClientEmail(@PathVariable String id) {
        return emailService.deleteClientEmail(id);
    }

    @GetMapping(value = "/allCompanyEmail", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<CompanyEmail> getAllCompanyEmail() {
        return emailService.getAllCompanyEmail();
    }

    @GetMapping(value = "/getCompanyEmail/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public CompanyEmail getCompanyEmailById(@PathVariable String id) {
        return emailService.getCompanyEmailById(id);
    }

    @PostMapping(
            value = "/saveCompanyEmail",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public CompanyEmail saveCompanyEmail(@RequestBody CompanyEmail companyEmail) {
        return emailService.saveCompanyEmail(companyEmail);
    }

    @PutMapping(
            value = "/editCompanyEmail/{id}",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public CompanyEmail editCompanyEmail(@PathVariable String id, @RequestBody CompanyEmail companyEmail) {
        return emailService.editCompanyEmail(id, companyEmail);
    }

    @DeleteMapping(value = "/deleteCompanyPhone/{id}")
    public String deleteCompanyEmail(@PathVariable String id) {
        return deleteCompanyEmail(id);
    }

    @GetMapping(value = "/allEmail", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Email> getAllEmail() {
        return emailService.getAllEmail();
    }

    @GetMapping(value = "/getEmail/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Email getEmailById(@PathVariable String id) {
        return emailService.getEmailById(id);
    }

    @PostMapping(
            value = "/saveEmail",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public Email saveEmail(@RequestBody Email email) {
        return emailService.saveEmail(email);
    }

    @PutMapping(
            value = "editEmail/{id}",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public Email editEmail(@PathVariable String id, @RequestBody Email email) {
        return emailService.editEmail(id, email);
    }

    @DeleteMapping(value = "/deleteEmail/{id}")
    public String deleteEmail(@PathVariable String id) {
        return deleteEmail(id);
    }

    @GetMapping(value = "/allLeadEmail", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<LeadEmail> getAllLeadEmail() {
        return emailService.getAllLeadEmail();
    }

    @GetMapping(value = "/getLeadEmail/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public LeadEmail getLeadEmailById(@PathVariable String id) {
        return emailService.getLeadEmailById(id);
    }

    @PostMapping(
            value = "/saveLeadEmail",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public LeadEmail saveLeadEmail(@RequestBody LeadEmail leadEmail) {
        return emailService.saveLeadEmail(leadEmail);
    }

    @PutMapping(
            value = "/editLeadEmail/{id}",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public LeadEmail editLeadEmailById(@PathVariable String id, @RequestBody LeadEmail leadEmail) {
        return emailService.editLeadEmail(id, leadEmail);
    }

    @DeleteMapping(value = "/deleteLeadEmail/{id}")
    public String deleteLeadEmail(@PathVariable String id) {
        return emailService.deleteLeadEmail(id);
    }

    @GetMapping(value = "/allClientPhone", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<ClientPhone> getAllClientPhone() {
        return phoneService.getAllClientPhone();
    }

    @GetMapping(value = "/getClientPhone", produces = MediaType.APPLICATION_JSON_VALUE)
    public ClientPhone getClientPhone(@PathVariable String id) {
        return phoneService.getClientPhoneById(id);
    }

    @PostMapping(
            value = "/saveClientPhone",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public ClientPhone saveClientPhone(@RequestBody ClientPhone clientPhone) {
        return phoneService.saveClientPhone(clientPhone);
    }

    @PutMapping(
            value = "/editClientPhone/{id}",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public ClientPhone editClientPhone(@PathVariable String id, @RequestBody ClientPhone clientPhone) {
        return phoneService.editClientPhone(id, clientPhone);
    }

    @DeleteMapping(value = "/deleteClientPhone/{id}")
    public String deleteClientPhone(@PathVariable String id) {
        return phoneService.deleteClientPhone(id);
    }

    @GetMapping(value = "/allCompanyPhone", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<CompanyPhone> allCompanyPhone() {
        return phoneService.getAllCompanyPhone();
    }

    @GetMapping(value = "/getCompanPhone/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public CompanyPhone getCompanyPhoneById(@PathVariable String id) {
        return phoneService.getCompanyPhoneById(id);
    }

    @PostMapping(
            value = "/saveCompanyPhone",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public CompanyPhone saveCompanyPhone(@RequestBody CompanyPhone companyPhone) {
        return phoneService.saveCompanyPhone(companyPhone);
    }

    @PutMapping(
            value = "/editCompanyPhone/{id}",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public CompanyPhone editCompanyPhoneById(@PathVariable String id, @RequestBody CompanyPhone companyPhone) {
        return phoneService.editCompanyPhone(id, companyPhone);
    }

    @DeleteMapping(value = "/deleteCompanyPhone")
    public String deleteCompanyPhone(@PathVariable String id) {
        return phoneService.deleteCompanyPhone(id);
    }

    @GetMapping(value = "/allLeadPhone", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<LeadPhone> getAllLeadPhone() {
        return phoneService.getAllLeadPhone();
    }

    @GetMapping(value = "/getLeadPhone/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public LeadPhone getLeadPhone(@PathVariable String id) {
        return phoneService.getLeadPhoneById(id);
    }

    @PostMapping(
            value = "/saveLedPhone",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public LeadPhone saveLeadPhone(@RequestBody LeadPhone leadPhone) {
        return phoneService.saveLeadPhone(leadPhone);
    }

    @PutMapping(
            value = "/editLeadPhone/{id}",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public LeadPhone editLeadPhoneById(@PathVariable String id, @RequestBody LeadPhone leadPhone) {
        return phoneService.editLeadPhone(id, leadPhone);
    }

    @DeleteMapping(value = "/deleteLeadPhone/{id}")
    public String deleteLeadPhone(@PathVariable String id) {
        return phoneService.deleteLeadPhone(id);
    }

    @GetMapping(value = "/allPhone", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Phone> getAllPhone() {
        return phoneService.getAllPhone();
    }

    @GetMapping(value = "/getPhone/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Phone getPhoneById(@PathVariable String id) {
        return phoneService.getPhoneById(id);
    }

    @PostMapping(
            value = "/savePhone",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public Phone savePhone(@RequestBody Phone phone) {
        return phoneService.savePhone(phone);
    }

    @PutMapping(
            value = "/editPhone/{id}",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public Phone editPhone(String id, Phone phone) {
        return editPhone(id, phone);
    }

    @DeleteMapping(value = "/deletePhone/{id}")
    public String deletePhone(String id) {
        return phoneService.deletePhone(id);
    }
}