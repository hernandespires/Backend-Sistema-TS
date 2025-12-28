package br.com.api.tsagencia.tsagencia.service;

import br.com.api.tsagencia.tsagencia.model.auxiliaresEmpresa.*;
import br.com.api.tsagencia.tsagencia.model.auxiliaresEmpresa.data.CommemorativeDate;
import br.com.api.tsagencia.tsagencia.model.auxiliaresEmpresa.data.Date;
import br.com.api.tsagencia.tsagencia.model.comercial.Company;
import br.com.api.tsagencia.tsagencia.repository.auxiliaresEmpresa.*;
import br.com.api.tsagencia.tsagencia.repository.auxiliaresEmpresa.data.CommemorativeDateRepository;
import br.com.api.tsagencia.tsagencia.repository.auxiliaresEmpresa.data.DateRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class AuxiliaresEmpresaService {
    private final CommemorativeDateRepository commemorativeDateRepository;
    private final DateRepository dateRepository;
    private final CompanyFinancialRepository companyFinancialRepository;
    private final CompanyGMBRepository companyGMBRepository;
    private final CompanyInsuranceRepository companyInsuranceRepository;
    private final CompanyOperationsRepository companyOperationsRepository;
    private final CompanyReferenceRepository companyReferenceRepository;
    private final CompanyServiceAreaRepository companyServiceAreaRepository;
    private final CompanySiteRepository companySiteRepository;
    private final CompanySocialNetworkRepository companySocialNetworkRepository;

    private final String successfullyDeletedMessage = "Registro deletado com sucesso";

    public AuxiliaresEmpresaService(
            CommemorativeDateRepository commemorativeDateRepository,
            DateRepository dateRepository,
            CompanyFinancialRepository companyFinancialRepository,
            CompanyGMBRepository companyGMBRepository,
            CompanyInsuranceRepository companyInsuranceRepository,
            CompanyOperationsRepository companyOperationsRepository,
            CompanyReferenceRepository companyReferenceRepository,
            CompanyServiceAreaRepository companyServiceAreaRepository,
            CompanySiteRepository companySiteRepository,
            CompanySocialNetworkRepository companySocialNetworkRepository
    ) {
        this.commemorativeDateRepository = commemorativeDateRepository;
        this.dateRepository = dateRepository;
        this.companyFinancialRepository = companyFinancialRepository;
        this.companyGMBRepository = companyGMBRepository;
        this.companyInsuranceRepository = companyInsuranceRepository;
        this.companyOperationsRepository = companyOperationsRepository;
        this.companyReferenceRepository = companyReferenceRepository;
        this.companyServiceAreaRepository = companyServiceAreaRepository;
        this.companySiteRepository = companySiteRepository;
        this.companySocialNetworkRepository = companySocialNetworkRepository;
    }

    public List<CommemorativeDate> getAllCommemorativeDate() {
        return commemorativeDateRepository.findAll();
    }

    public CommemorativeDate getCommemorativeDateById(UUID id) {
        return commemorativeDateRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Data comemorativa não encontrado"));
    }

    public CommemorativeDate saveCommemorativeDate(CommemorativeDate commemorativeDate) {
        return commemorativeDateRepository.save(commemorativeDate);
    }

    public CommemorativeDate editCommemorativeDate(UUID id, CommemorativeDate commemorativeDate) {
        CommemorativeDate commemorativeDateFound = getCommemorativeDateById(id);

        commemorativeDateFound.setNameCommemorativeDate(commemorativeDate.getNameCommemorativeDate());
        commemorativeDateFound.setDescription(commemorativeDateFound.getDescription());
        return commemorativeDateFound;
    }

    public String deleteCommemorativeDate(UUID id) {
        commemorativeDateRepository.deleteById(id);
        return successfullyDeletedMessage;
    }

    public List<Date> getAllDate() {
        return dateRepository.findAll();
    }

    public Date getDateById(UUID id) {
        return dateRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("Data não encontrada"));
    }

    public Date saveDate(Date date) {
        return dateRepository.save(date);
    }

    public Date editDate(UUID id, Date date) {
        Date dateFound = getDateById(id);

        dateFound.setCompany(date.getCompany());
        dateFound.setCommemorativeDate(date.getCommemorativeDate());
        return dateFound;
    }

    public String deleteDate(UUID id) {
        dateRepository.deleteById(id);
        return successfullyDeletedMessage;
    }

    public List<CompanyFinancial> getAllCompanyFinancial() {
        return companyFinancialRepository.findAll();
    }

    public CompanyFinancial getCompanyFinancialById(UUID id) {
        return companyFinancialRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Financeiro da empresa não encontrado"));
    }

    public CompanyFinancial saveCompanyFinancial(CompanyFinancial companyFinancial) {
        return companyFinancialRepository.save(companyFinancial);
    }

    public CompanyFinancial editCompanyFinancial(UUID id, CompanyFinancial companyFinancial) {
        CompanyFinancial companyFinancialFind = getCompanyFinancialById(id);

        companyFinancialFind.setCompany(companyFinancial.getCompany());
        companyFinancialFind.setInitialBilling(companyFinancial.getInitialBilling());
        companyFinancialFind.setInitialAverageTicket(companyFinancial.getInitialAverageTicket());
        companyFinancialFind.setDataBase(companyFinancial.getDataBase());
        return companyFinancialFind;
    }

    public String deleteCompanyFinancial(UUID id) {
        companyFinancialRepository.deleteById(id);
        return successfullyDeletedMessage;
    }

    public List<CompanyGMB> getAllCompanyGMB() {
        return companyGMBRepository.findAll();
    }

    public CompanyGMB getCompanyGMBById(UUID id) {
        return companyGMBRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Google my business da empresa não encontrado"));
    }

    public CompanyGMB saveCompanyGMB(CompanyGMB companyGMB) {
        return companyGMBRepository.save(companyGMB);
    }

    public CompanyGMB editCompanyGMB(UUID id, CompanyGMB companyGMB) {
        CompanyGMB companyGMBFound = getCompanyGMBById(id);

        companyGMBFound.setCompany(companyGMB.getCompany());
        companyGMBFound.setGMBName(companyGMB.getGMBName());
        companyGMBFound.setGMBEmail(companyGMB.getGMBEmail());
        return companyGMBFound;
    }

    public String deleteCompanyGMB(UUID id) {
        companyGMBRepository.deleteById(id);
        return successfullyDeletedMessage;
    }

    public List<CompanyInsurance> getAllCompanyInsurance() {
        return companyInsuranceRepository.findAll();
    }

    public CompanyInsurance getCompanyInsuranceById(UUID id) {
        return companyInsuranceRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Seguro da empresa não encontrado"));
    }

    public CompanyInsurance saveCompanyInsurance(CompanyInsurance companyInsurance) {
        return companyInsuranceRepository.save(companyInsurance);
    }

    public CompanyInsurance editCompanyInsurance(UUID id, CompanyInsurance companyInsurance) {
        CompanyInsurance companyInsuranceFound = getCompanyInsuranceById(id);

        companyInsuranceFound.setCompany(companyInsurance.getCompany());
        companyInsuranceFound.setInsuranceType(companyInsurance.getInsuranceType());
        companyInsuranceFound.setPolicy(companyInsurance.getPolicy());
        companyInsuranceFound.setExpiration(companyInsurance.getExpiration());
        return companyInsuranceFound;
    }

    public String deleteCompanyInsurance(UUID id) {
        companyInsuranceRepository.deleteById(id);
        return successfullyDeletedMessage;
    }

    public List<CompanyOperations> getAllCompanyOperations() {
        return companyOperationsRepository.findAll();
    }

    public CompanyOperations getCompanyOperationsById(UUID id) {
        return companyOperationsRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Funcionamento da empresa não encontrado"));
    }

    public CompanyOperations saveCompanyOperations(CompanyOperations companyOperations) {
        return companyOperationsRepository.save(companyOperations);
    }

    public CompanyOperations editCompanyOperations(UUID id, CompanyOperations companyOperations) {
        CompanyOperations companyOperationsFind = getCompanyOperationsById(id);

        companyOperationsFind.setCompany(companyOperations.getCompany());
        companyOperationsFind.setWorkDays(companyOperations.getWorkDays());
        companyOperationsFind.setWorkHours(companyOperations.getWorkHours());
        companyOperationsFind.setObservations(companyOperations.getObservations());
        return companyOperationsFind;
    }

    public String deleteCompanyOperations(UUID id) {
        companyOperationsRepository.deleteById(id);
        return successfullyDeletedMessage;
    }

    public List<CompanyReference> getAllCompanyReference() {
        return companyReferenceRepository.findAll();
    }

    public CompanyReference getCompanyReferenceById(UUID id) {
        return companyReferenceRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Referências da empresa não encontradas"));
    }

    public CompanyReference saveCompanyReference(CompanyReference companyReference) {
        return companyReferenceRepository.save(companyReference);
    }

    public CompanyReference editCompanyReference(UUID id, CompanyReference companyReference) {
        CompanyReference companyReferenceFound = getCompanyReferenceById(id);

        companyReferenceFound.setCompany(companyReference.getCompany());
        companyReferenceFound.setReferenceName(companyReference.getReferenceName());
        companyReferenceFound.setReferenceUrl(companyReference.getReferenceUrl());
        companyReferenceFound.setObservation(companyReference.getObservation());
        return companyReferenceFound;
    }

    public String deleteCompanyReference(UUID id) {
        companyReferenceRepository.deleteById(id);
        return successfullyDeletedMessage;
    }

    public List<CompanyServiceArea> getAllCompanyServiceArea() {
        return companyServiceAreaRepository.findAll();
    }

    public CompanyServiceArea getCompanyServiceAreaById(UUID id) {
        return companyServiceAreaRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Área de serviço da empresa não encotrado"));
    }

    public CompanyServiceArea saveCompanyServiceArea(CompanyServiceArea companyServiceArea) {
        return companyServiceAreaRepository.save(companyServiceArea);
    }

    public CompanyServiceArea editCompanyServiceArea(UUID id, CompanyServiceArea companyServiceArea) {
        CompanyServiceArea companyServiceAreaFound = getCompanyServiceAreaById(id);

        companyServiceAreaFound.setCompany(companyServiceArea.getCompany());
        companyServiceAreaFound.setName(companyServiceArea.getName());
        companyServiceAreaFound.setDescription(companyServiceArea.getDescription());
        return companyServiceAreaFound;
    }

    public String deleteCompanyServiceArea(UUID id) {
        companyServiceAreaRepository.deleteById(id);
        return successfullyDeletedMessage;
    }

    public List<CompanySite> getAllCompanySite() {
        return companySiteRepository.findAll();
    }

    public CompanySite getCompanySiteById(UUID id) {
        return companySiteRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Site da empresa não encotrado"));
    }

    public CompanySite saveCompanySite(CompanySite companySite) {
        return companySiteRepository.save(companySite);
    }

    public CompanySite editCompanySite(UUID id, CompanySite companySite) {
        CompanySite companySiteFound = getCompanySiteById(id);

        companySiteFound.setCompany(companySite.getCompany());
        companySiteFound.setDomain(companySite.getDomain());
        companySiteFound.setHost(companySite.getHost());
        companySiteFound.setUrl(companySite.getUrl());
        return companySiteFound;
    }

    public String deleteCompanySite(UUID id) {
        companySiteRepository.deleteById(id);
        return successfullyDeletedMessage;
    }

    public List<CompanySocialNetwork> getAllCompanySocialNetwork() {
        return companySocialNetworkRepository.findAll();
    }

    public CompanySocialNetwork getCompanySocialNetwork(UUID id) {
        return companySocialNetworkRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Redes sociais da empresa não encontradas"));
    }

    public CompanySocialNetwork saveCompanySocialNetwork(CompanySocialNetwork companySocialNetwork) {
        return companySocialNetworkRepository.save(companySocialNetwork);
    }

    public CompanySocialNetwork editCompanySocialNetwork(UUID id, CompanySocialNetwork companySocialNetwork) {
        CompanySocialNetwork companySocialNetworkFound = getCompanySocialNetwork(id);

        companySocialNetworkFound.setCompany(companySocialNetwork.getCompany());
        companySocialNetworkFound.setPlatform(companySocialNetwork.getPlatform());
        return companySocialNetworkFound;
    }

    public String deleteCompanySocialNetwork(UUID id) {
        companySocialNetworkRepository.deleteById(id);
        return successfullyDeletedMessage;
    }
}