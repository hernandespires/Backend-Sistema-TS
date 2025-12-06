package br.com.api.tsagencia.tsagencia.service;

import br.com.api.tsagencia.tsagencia.model.comercial.*;
import br.com.api.tsagencia.tsagencia.repository.comercial.*;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ComercialService {
    private final ClientRepository clientRepository;
    private final CompanyRepository companyRepository;
    private final LeadRepository leadRepository;
    private final OriginRepository originRepository;
    private final ProgramRepository programRepository;
    private final ServicesRepository servicesRepository;

    public ComercialService(
            ClientRepository clientRepository,
            CompanyRepository companyRepository,
            LeadRepository leadRepository,
            OriginRepository originRepository,
            ProgramRepository programRepository,
            ServicesRepository servicesRepository
    ) {
        this.clientRepository = clientRepository;
        this.companyRepository = companyRepository;
        this.leadRepository = leadRepository;
        this.originRepository = originRepository;
        this.programRepository = programRepository;
        this.servicesRepository = servicesRepository;
    }

    public List<Client> getAllClients() {
        return clientRepository.findAll();
    }

    public Client saveClient(Client client) {
        return clientRepository.save(client);
    }

    public List<Company> getAllCompanies() {
        return companyRepository.findAll();
    }

    public Company saveCompany(Company company) {
        return companyRepository.save(company);
    }

    public List<Lead> getAllLeads() {
        return leadRepository.findAll();
    }

    public Lead saveLead(Lead lead) {
        return leadRepository.save(lead);
    }

    public List<Origin> getAllOrigins() {
        return originRepository.findAll();
    }

    public Origin saveOrigin(Origin origin) {
        return originRepository.save(origin);
    }

    public List<Program> getAllPrograms() {
        return programRepository.findAll();
    }

    public Program saveProgram(Program program) {
        return programRepository.save(program);
    }

    public List<Services> getAllServices() {
        return servicesRepository.findAll();
    }

    public Services saveServices(Services services) {
        return servicesRepository.save(services);
    }
}