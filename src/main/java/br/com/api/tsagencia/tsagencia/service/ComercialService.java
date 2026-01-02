package br.com.api.tsagencia.tsagencia.service;

import br.com.api.tsagencia.tsagencia.model.comercial.*;
import br.com.api.tsagencia.tsagencia.repository.comercial.*;
import jakarta.persistence.EntityNotFoundException;
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

    private final String successfullyDeletedMessage = "Registro deletado com sucesso";

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

    public List<Client> getAllClient() {
        return clientRepository.findAll();
    }

    public Client getClientById(String id) {
        return clientRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("Cliente não encontrado"));
    }

    public Client saveClient(Client client) {
        return clientRepository.save(client);
    }

    public Client editClient(String id, Client client) {
        Client clientFound = getClientById(id);

        clientFound.setName(client.getName());
        clientFound.setBirthday(client.getBirthday());
        clientFound.setSex(client.getSex());
        clientFound.setDocument(client.getDocument());

        clientRepository.save(clientFound);
        return clientFound;
    }

    public String deleteClient(String id) {
        clientRepository.deleteById(id);
        return successfullyDeletedMessage;
    }

    public List<Company> getAllCompany() {
        return companyRepository.findAll();
    }

    public Company getCompanyById(String id) {
        return companyRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("Empresa não encotrada"));
    }

    public Company saveCompany(Company company) {
        return companyRepository.save(company);
    }

    public Company editCompany(String id, Company company) {
        Company companyFound = getCompanyById(id);

        companyFound.setClient(companyFound.getClient());
        companyFound.setCompany(companyFound.getCompany());
        companyFound.setTradeName(companyFound.getTradeName());
        companyFound.setTaxId(companyFound.getTaxId());
        companyFound.setTypeTaxId(companyFound.getTypeTaxId());
        companyFound.setCountry(companyFound.getCountry());
        companyFound.setSegment(companyFound.getSegment());
        companyFound.setFoundingDate(companyFound.getFoundingDate());
        companyFound.setEmployees(companyFound.getEmployees());
        return companyFound;
    }

    public String deleteCompany(String id) {
        companyRepository.deleteById(id);
        return successfullyDeletedMessage;
    }

    public List<Lead> getAllLead() {
        return leadRepository.findAll();
    }

    public Lead getLeadById(String id) {
        return leadRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("Lead não encontrado"));
    }

    public Lead saveLead(Lead lead) {
        return leadRepository.save(lead);
    }

    public Lead editLead(String id, Lead lead) {
        Lead leadFound = getLeadById(id);

        leadFound.setProgram(lead.getProgram());
        leadFound.setOrigin(lead.getOrigin());
        leadFound.setLeadName(lead.getLeadName());
        leadFound.setCompanyLead(lead.getCompanyLead());
        leadFound.setInternship(lead.getInternship());
        leadFound.setInterest(lead.getInterest());
        leadFound.setCriationDate(lead.getCriationDate());
        leadFound.setDealDate(lead.getDealDate());
        return leadFound;
    }

    public String deleteLead(String id) {
        leadRepository.deleteById(id);
        return successfullyDeletedMessage;
    }

    public List<Origin> getAllOrigin() {
        return originRepository.findAll();
    }

    public Origin getOriginById(String id) {
        return originRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("Origem não encontrado"));
    }

    public Origin saveOrigin(Origin origin) {
        return originRepository.save(origin);
    }

    public Origin editOrigin(String id, Origin origin) {
        Origin originFound = getOriginById(id);

        originFound.setName(origin.getName());
        originFound.setDescription(origin.getDescription());
        return originFound;
    }

    public String deleteOrigin(String id) {
        originRepository.deleteById(id);
        return successfullyDeletedMessage;
    }

    public List<Program> getAllProgram() {
        return programRepository.findAll();
    }

    public Program getProgramById(String id) {
        return programRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("Programa não encontrado"));
    }

    public Program saveProgram(Program program) {
        return programRepository.save(program);
    }

    public Program editProgram(String id, Program program) {
        Program programFound = getProgramById(id);

        programFound.setName(programFound.getName());
        programFound.setDescription(programFound.getDescription());
        return programFound;
    }

    public String deleteProgram(String id) {
        programRepository.deleteById(id);
        return successfullyDeletedMessage;
    }

    public List<Services> getAllServices() {
        return servicesRepository.findAll();
    }

    public Services getServicesById(String id) {
        return servicesRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Serviços não encontrados"));
    }

    public Services saveServices(Services services) {
        return servicesRepository.save(services);
    }

    public Services editServices(String id, Services services) {
        Services servicesFound = getServicesById(id);

        servicesFound.setName(services.getName());
        services.setCategory(services.getCategory());
        services.setDescription(services.getDescription());
        return servicesFound;
    }

    public String deleteServices(String id) {
        servicesRepository.deleteById(id);
        return successfullyDeletedMessage;
    }
}