package br.com.api.tsagencia.tsagencia.service.entidadesCompartilhadas;

import br.com.api.tsagencia.tsagencia.model.entidadesCompartilhadas.phone.ClientPhone;
import br.com.api.tsagencia.tsagencia.model.entidadesCompartilhadas.phone.CompanyPhone;
import br.com.api.tsagencia.tsagencia.model.entidadesCompartilhadas.phone.LeadPhone;
import br.com.api.tsagencia.tsagencia.model.entidadesCompartilhadas.phone.Phone;
import br.com.api.tsagencia.tsagencia.repository.entidadesCompartilhadas.phone.ClientPhoneRepository;
import br.com.api.tsagencia.tsagencia.repository.entidadesCompartilhadas.phone.CompanyPhoneRepository;
import br.com.api.tsagencia.tsagencia.repository.entidadesCompartilhadas.phone.LeadPhoneRepository;
import br.com.api.tsagencia.tsagencia.repository.entidadesCompartilhadas.phone.PhoneRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class PhoneService {
    private final ClientPhoneRepository clientPhoneRepository;
    private final CompanyPhoneRepository companyPhoneRepository;
    private final LeadPhoneRepository leadPhoneRepository;
    private final PhoneRepository phoneRepository;

    private final String successfullyDeletedMessage = "Registro deletado com sucesso";

    public PhoneService(
            ClientPhoneRepository clientPhoneRepository,
            CompanyPhoneRepository companyPhoneRepository,
            LeadPhoneRepository leadPhoneRepository,
            PhoneRepository phoneRepository
    ) {
        this.clientPhoneRepository = clientPhoneRepository;
        this.companyPhoneRepository = companyPhoneRepository;
        this.leadPhoneRepository = leadPhoneRepository;
        this.phoneRepository = phoneRepository;
    }

    public List<ClientPhone> getAllClientPhone() {
        return clientPhoneRepository.findAll();
    }

    public ClientPhone getClientPhoneById(UUID id) {
        return clientPhoneRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Celular do cliente não encontrado"));
    }

    public ClientPhone saveClientPhone(ClientPhone clientPhone) {
        return clientPhoneRepository.save(clientPhone);
    }

    public ClientPhone editClientPhone(UUID id, ClientPhone clientPhone) {
        ClientPhone clientPhoneFound = getClientPhoneById(id);

        clientPhoneFound.setPhone(clientPhone.getPhone());
        clientPhoneFound.setClient(clientPhone.getClient());
        return clientPhoneFound;
    }

    public String deleteClientPhone(UUID id) {
        clientPhoneRepository.deleteById(id);
        return successfullyDeletedMessage;
    }

    public List<CompanyPhone> getAllCompanyPhone() {
        return companyPhoneRepository.findAll();
    }

    public CompanyPhone getCompanyPhoneById(UUID id) {
        return companyPhoneRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Celular da empresa não encontrado"));
    }

    public CompanyPhone saveCompanyPhone(CompanyPhone companyPhone) {
        return companyPhoneRepository.save(companyPhone);
    }

    public CompanyPhone editCompanyPhone(UUID id, CompanyPhone companyPhone) {
        CompanyPhone companyPhoneFound = getCompanyPhoneById(id);

        companyPhoneFound.setPhone(companyPhone.getPhone());
        companyPhoneFound.setCompany(companyPhoneFound.getCompany());
        return companyPhoneFound;
    }

    public String deleteCompanyPhone(UUID id) {
        companyPhoneRepository.deleteById(id);
        return successfullyDeletedMessage;
    }

    public List<LeadPhone> getAllLeadPhone() {
        return leadPhoneRepository.findAll();
    }

    public LeadPhone getLeadPhoneById(UUID id) {
        return leadPhoneRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Celular do lead não encontrado"));
    }

    public LeadPhone saveLeadPhone(LeadPhone leadPhone) {
        return leadPhoneRepository.save(leadPhone);
    }

    public LeadPhone editLeadPhone(UUID id, LeadPhone leadPhone) {
        LeadPhone leadPhoneFound = getLeadPhoneById(id);

        leadPhoneFound.setPhone(leadPhone.getPhone());
        leadPhoneFound.setLead(leadPhone.getLead());
        return leadPhoneFound;
    }

    public String deleteLeadPhone(UUID id) {
        leadPhoneRepository.deleteById(id);
        return successfullyDeletedMessage;
    }

    public List<Phone> getAllPhone() {
        return phoneRepository.findAll();
    }

    public Phone getPhoneById(UUID id) {
        return phoneRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("Celular não encontrado"));
    }

    public Phone savePhone(Phone phone) {
        return phoneRepository.save(phone);
    }

    public Phone editPhone(UUID id, Phone phone) {
        Phone phoneFound = getPhoneById(id);

        phoneFound.setDdi(phone.getDdi());
        phoneFound.setDdd(phone.getDdd());
        phoneFound.setPrefix(phoneFound.getPrefix());
        phoneFound.setSuffix(phoneFound.getSuffix());
        phoneFound.setType(phoneFound.getType());
        return phoneFound;
    }

    public String deletePhone(UUID id) {
        phoneRepository.deleteById(id);
        return successfullyDeletedMessage;
    }
}