package br.com.api.tsagencia.tsagencia.service.entidadesCompartilhadas;

import br.com.api.tsagencia.tsagencia.model.entidadesCompartilhadas.email.ClientEmail;
import br.com.api.tsagencia.tsagencia.model.entidadesCompartilhadas.email.CompanyEmail;
import br.com.api.tsagencia.tsagencia.model.entidadesCompartilhadas.email.Email;
import br.com.api.tsagencia.tsagencia.model.entidadesCompartilhadas.email.LeadEmail;
import br.com.api.tsagencia.tsagencia.repository.entidadesCompartilhadas.email.ClientEmailRepository;
import br.com.api.tsagencia.tsagencia.repository.entidadesCompartilhadas.email.CompanyEmailRepository;
import br.com.api.tsagencia.tsagencia.repository.entidadesCompartilhadas.email.EmailRepository;
import br.com.api.tsagencia.tsagencia.repository.entidadesCompartilhadas.email.LeadEmailRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmailService {
    private final ClientEmailRepository clientEmailRepository;
    private final CompanyEmailRepository companyEmailRepository;
    private final EmailRepository emailRepository;
    private final LeadEmailRepository leadEmailRepository;

    private final String successfullyDeletedMessage = "Registro deletado com sucesso";

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

    public ClientEmail getClientEmailById(String id) {
        return clientEmailRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Email do cliente não encontrado"));
    }

    public ClientEmail saveClientEmail(ClientEmail clientEmail) {
        return clientEmailRepository.save(clientEmail);
    }

    public ClientEmail editClientEmail(String id, ClientEmail clientEmail) {
        ClientEmail clientEmailFound = getClientEmailById(id);

        clientEmailFound.setEmail(clientEmail.getEmail());
        clientEmailFound.setClient(clientEmail.getClient());

        return clientEmailFound;
    }

    public String deleteClientEmail(String id) {
        clientEmailRepository.deleteById(id);
        return successfullyDeletedMessage;
    }

    public List<CompanyEmail> getAllCompanyEmail() {
        return companyEmailRepository.findAll();
    }

    public CompanyEmail getCompanyEmailById(String id) {
        return companyEmailRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Email da empresa não encontrado"));
    }

    public CompanyEmail saveCompanyEmail(CompanyEmail companyEmail) {
        return companyEmailRepository.save(companyEmail);
    }

    public CompanyEmail editCompanyEmail(String id, CompanyEmail companyEmail) {
        CompanyEmail companyEmailFound = getCompanyEmailById(id);

        companyEmailFound.setEmail(companyEmail.getEmail());
        companyEmailFound.setCompany(companyEmail.getCompany());
        return companyEmailFound;
    }

    public String deleteCompanyEmail(String id) {
        companyEmailRepository.deleteById(id);
        return successfullyDeletedMessage;
    }

    public List<Email> getAllEmail() {
        return emailRepository.findAll();
    }

    public Email getEmailById(String id) {
        return emailRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("Email não encontrado"));
    }

    public Email saveEmail(Email email) {
        return emailRepository.save(email);
    }

    public Email editEmail(String id, Email email) {
        Email emailFound = getEmailById(id);

        emailFound.setEmail(email.getEmail());
        return emailFound;
    }

    public String deleteEmail(String id) {
        emailRepository.deleteById(id);
        return successfullyDeletedMessage;
    }

    public List<LeadEmail> getAllLeadEmail() {
        return leadEmailRepository.findAll();
    }

    public LeadEmail getLeadEmailById(String id) {
        return leadEmailRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Email do Lead não encontrado"));
    }

    public LeadEmail saveLeadEmail(LeadEmail leadEmail) {
        return leadEmailRepository.save(leadEmail);
    }

    public LeadEmail editLeadEmail(String id, LeadEmail leadEmail) {
        LeadEmail leadEmailFound = getLeadEmailById(id);

        leadEmailFound.setEmail(leadEmail.getEmail());
        leadEmailFound.setClient(leadEmail.getClient());
        return leadEmailFound;
    }

    public String deleteLeadEmail(String id) {
        leadEmailRepository.deleteById(id);
        return successfullyDeletedMessage;
    }
}