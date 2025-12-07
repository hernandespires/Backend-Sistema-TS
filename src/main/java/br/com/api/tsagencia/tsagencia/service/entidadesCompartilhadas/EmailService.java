package br.com.api.tsagencia.tsagencia.service.entidadesCompartilhadas;

import br.com.api.tsagencia.tsagencia.model.entidadesCompartilhadas.email.ClientEmail;
import br.com.api.tsagencia.tsagencia.model.entidadesCompartilhadas.email.CompanyEmail;
import br.com.api.tsagencia.tsagencia.model.entidadesCompartilhadas.email.Email;
import br.com.api.tsagencia.tsagencia.model.entidadesCompartilhadas.email.LeadEmail;
import br.com.api.tsagencia.tsagencia.repository.entidadesCompartilhadas.email.ClientEmailRepository;
import br.com.api.tsagencia.tsagencia.repository.entidadesCompartilhadas.email.CompanyEmailRepository;
import br.com.api.tsagencia.tsagencia.repository.entidadesCompartilhadas.email.EmailRepository;
import br.com.api.tsagencia.tsagencia.repository.entidadesCompartilhadas.email.LeadEmailRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmailService {
    private final ClientEmailRepository clientEmailRepository;
    private final CompanyEmailRepository companyEmailRepository;
    private final EmailRepository emailRepository;
    private final LeadEmailRepository leadEmailRepository;

    public EmailService(
            ClientEmailRepository clientEmailRepository,
            CompanyEmailRepository companyEmailRepository,
            EmailRepository emailRepository,
            LeadEmailRepository leadEmailRepository
    ) {
        this.clientEmailRepository = clientEmailRepository;
        this.companyEmailRepository = companyEmailRepository;
        this.emailRepository = emailRepository;
        this.leadEmailRepository = leadEmailRepository;
    }

    public List<ClientEmail> getAllClientEmail() {
        return clientEmailRepository.findAll();
    }

    public ClientEmail saveClientEmail(ClientEmail clientEmail) {
        return clientEmailRepository.save(clientEmail);
    }

    public List<CompanyEmail> getAllCompanyEmail() {
        return companyEmailRepository.findAll();
    }

    public CompanyEmail saveCompanyEmail(CompanyEmail companyEmail) {
        return companyEmailRepository.save(companyEmail);
    }

    public List<Email> getAllEmail() {
        return emailRepository.findAll();
    }

    public Email saveEmail(Email email) {
        return emailRepository.save(email);
    }

    public List<LeadEmail> getAllLeadEmail() {
        return leadEmailRepository.findAll();
    }

    public LeadEmail saveLeadEmail(LeadEmail leadEmail) {
        return leadEmailRepository.save(leadEmail);
    }
}