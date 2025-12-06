package br.com.api.tsagencia.tsagencia.service.entidadesCompartilhadas.email;

import br.com.api.tsagencia.tsagencia.model.entidadesCompartilhadas.email.ClientEmail;
import br.com.api.tsagencia.tsagencia.repository.entidadesCompartilhadas.email.ClientEmailRepository;
import br.com.api.tsagencia.tsagencia.repository.entidadesCompartilhadas.email.CompanyEmailRepository;
import br.com.api.tsagencia.tsagencia.repository.entidadesCompartilhadas.email.EmailRepository;
import br.com.api.tsagencia.tsagencia.repository.entidadesCompartilhadas.email.LeadEmailRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientEmailService {
    private final ClientEmailRepository clientEmailRepository;
    private final CompanyEmailRepository companyEmailRepository;
    private final EmailRepository emailRepository;
    private final LeadEmailRepository leadEmailRepository;

    public ClientEmailService(
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
}