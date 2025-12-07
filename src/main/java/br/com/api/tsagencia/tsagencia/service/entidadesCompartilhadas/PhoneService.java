package br.com.api.tsagencia.tsagencia.service.entidadesCompartilhadas;

import br.com.api.tsagencia.tsagencia.model.entidadesCompartilhadas.phone.ClientPhone;
import br.com.api.tsagencia.tsagencia.model.entidadesCompartilhadas.phone.CompanyPhone;
import br.com.api.tsagencia.tsagencia.model.entidadesCompartilhadas.phone.LeadPhone;
import br.com.api.tsagencia.tsagencia.model.entidadesCompartilhadas.phone.Phone;
import br.com.api.tsagencia.tsagencia.repository.entidadesCompartilhadas.phone.ClientPhoneRepository;
import br.com.api.tsagencia.tsagencia.repository.entidadesCompartilhadas.phone.CompanyPhoneRepository;
import br.com.api.tsagencia.tsagencia.repository.entidadesCompartilhadas.phone.LeadPhoneRepository;
import br.com.api.tsagencia.tsagencia.repository.entidadesCompartilhadas.phone.PhoneRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PhoneService {
    private final ClientPhoneRepository clientPhoneRepository;
    private final CompanyPhoneRepository companyPhoneRepository;
    private final LeadPhoneRepository leadPhoneRepository;
    private final PhoneRepository phoneRepository;

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

    public ClientPhone saveClientPhone(ClientPhone clientPhone) {
        return clientPhoneRepository.save(clientPhone);
    }

    public List<CompanyPhone> getAllCompanyPhone() {
        return companyPhoneRepository.findAll();
    }

    public CompanyPhone saveCompanyPhone(CompanyPhone companyPhone) {
        return companyPhoneRepository.save(companyPhone);
    }

    public List<LeadPhone> getAllLeadPhone() {
        return leadPhoneRepository.findAll();
    }

    public LeadPhone saveLeadPhone(LeadPhone leadPhone) {
        return leadPhoneRepository.save(leadPhone);
    }

    public List<Phone> getAllPhone() {
        return phoneRepository.findAll();
    }

    public Phone savePhone(Phone phone) {
        return phoneRepository.save(phone);
    }
}