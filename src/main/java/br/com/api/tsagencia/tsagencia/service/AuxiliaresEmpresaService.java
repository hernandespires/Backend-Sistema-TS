package br.com.api.tsagencia.tsagencia.service;

import br.com.api.tsagencia.tsagencia.model.auxiliaresEmpresa.*;
import br.com.api.tsagencia.tsagencia.model.auxiliaresEmpresa.data.CommemorativeDate;
import br.com.api.tsagencia.tsagencia.model.auxiliaresEmpresa.data.Date;
import br.com.api.tsagencia.tsagencia.repository.auxiliaresEmpresa.*;
import br.com.api.tsagencia.tsagencia.repository.auxiliaresEmpresa.data.CommemorativeDateRepository;
import br.com.api.tsagencia.tsagencia.repository.auxiliaresEmpresa.data.DateRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

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

    public CommemorativeDate getCommemorativeDateById(String id) {
        return commemorativeDateRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Data comemorativa não encontrado"));
    }

    public CommemorativeDate saveCommemorativeDate(CommemorativeDate commemorativeDate) {
        return commemorativeDateRepository.save(commemorativeDate);
    }

    public CommemorativeDate editCommemorativeDate(String id, CommemorativeDate commemorativeDate) {
        CommemorativeDate commemorativeDateFound = getCommemorativeDateById(id);

        commemorativeDateFound.setNameCommemorativeDate(commemorativeDate.getNameCommemorativeDate());
        commemorativeDateFound.setDescription(commemorativeDateFound.getDescription());
        return commemorativeDateFound;
    }

    public String deleteCommemorativeDate(String id) {
        commemorativeDateRepository.deleteById(id);
        return successfullyDeletedMessage;
    }

    public List<Date> getAllDate() {
        return dateRepository.findAll();
    }

    public Date getDateById(String id) {
        return dateRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("Data não encontrada"));
    }

    public Date saveDate(Date date) {
        return dateRepository.save(date);
    }

    public Date editDate(String id, Date date) {
        Date dateFound = getDateById(id);

        dateFound.setCompany(date.getCompany());
        dateFound.setCommemorativeDate(date.getCommemorativeDate());
        return dateFound;
    }

    public String deleteDate(String id) {
        dateRepository.deleteById(id);
        return successfullyDeletedMessage;
    }

    public List<CompanyFinancial> getAllCompanyFinancial() {
        return companyFinancialRepository.findAll();
    }

    public CompanyFinancial getCompanyFinancialById(String id) {
        return companyFinancialRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Financeiro da empresa não encontrado"));
    }

    public CompanyFinancial saveCompanyFinancial(CompanyFinancial companyFinancial) {
        return companyFinancialRepository.save(companyFinancial);
    }

    public CompanyFinancial editCompanyFinancial(String id, CompanyFinancial companyFinancial) {
        CompanyFinancial companyFinancialFind = getCompanyFinancialById(id);

        companyFinancialFind.setCompany(companyFinancial.getCompany());
        companyFinancialFind.setInitialBilling(companyFinancial.getInitialBilling());
        companyFinancialFind.setInitialAverageTicket(companyFinancial.getInitialAverageTicket());
        companyFinancialFind.setDataBase(companyFinancial.getDataBase());
        return companyFinancialFind;
    }

    public String deleteCompanyFinancial(String id) {
        companyFinancialRepository.deleteById(id);
        return successfullyDeletedMessage;
    }

    public List<CompanyGMB> getAllCompanyGMB() {
        return companyGMBRepository.findAll();
    }

    public CompanyGMB getCompanyGMBById(String id) {
        return companyGMBRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Google my business da empresa não encontrado"));
    }

    public CompanyGMB saveCompanyGMB(CompanyGMB companyGMB) {
        return companyGMBRepository.save(companyGMB);
    }

    public CompanyGMB editCompanyGMB(String id, CompanyGMB companyGMB) {
        CompanyGMB companyGMBFound = getCompanyGMBById(id);

        companyGMBFound.setCompany(companyGMB.getCompany());
        companyGMBFound.setGMBName(companyGMB.getGMBName());
        companyGMBFound.setGMBEmail(companyGMB.getGMBEmail());
        return companyGMBFound;
    }

    public String deleteCompanyGMB(String id) {
        companyGMBRepository.deleteById(id);
        return successfullyDeletedMessage;
    }

    public List<CompanyInsurance> getAllCompanyInsurance() {
        return companyInsuranceRepository.findAll();
    }

    public CompanyInsurance getCompanyInsuranceById(String id) {
        return companyInsuranceRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Seguro da empresa não encontrado"));
    }

    public CompanyInsurance saveCompanyInsurance(CompanyInsurance companyInsurance) {
        return companyInsuranceRepository.save(companyInsurance);
    }

    public CompanyInsurance editCompanyInsurance(String id, CompanyInsurance companyInsurance) {
        CompanyInsurance companyInsuranceFound = getCompanyInsuranceById(id);

        companyInsuranceFound.setCompany(companyInsurance.getCompany());
        companyInsuranceFound.setInsuranceType(companyInsurance.getInsuranceType());
        companyInsuranceFound.setPolicy(companyInsurance.getPolicy());
        companyInsuranceFound.setExpiration(companyInsurance.getExpiration());
        return companyInsuranceFound;
    }

    public String deleteCompanyInsurance(String id) {
        companyInsuranceRepository.deleteById(id);
        return successfullyDeletedMessage;
    }

    public List<CompanyOperations> getAllCompanyOperations() {
        return companyOperationsRepository.findAll();
    }

    public CompanyOperations getCompanyOperationsById(String id) {
        return companyOperationsRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Funcionamento da empresa não encontrado"));
    }

    public CompanyOperations saveCompanyOperations(CompanyOperations companyOperations) {
        return companyOperationsRepository.save(companyOperations);
    }

    public CompanyOperations editCompanyOperations(String id, CompanyOperations companyOperations) {
        CompanyOperations companyOperationsFind = getCompanyOperationsById(id);

        companyOperationsFind.setCompany(companyOperations.getCompany());
        companyOperationsFind.setWorkDays(companyOperations.getWorkDays());
        companyOperationsFind.setWorkHours(companyOperations.getWorkHours());
        companyOperationsFind.setObservations(companyOperations.getObservations());
        return companyOperationsFind;
    }

    public String deleteCompanyOperations(String id) {
        companyOperationsRepository.deleteById(id);
        return successfullyDeletedMessage;
    }

    public List<CompanyReference> getAllCompanyReference() {
        return companyReferenceRepository.findAll();
    }

    public CompanyReference getCompanyReferenceById(String id) {
        return companyReferenceRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Referências da empresa não encontradas"));
    }

    public CompanyReference saveCompanyReference(CompanyReference companyReference) {
        return companyReferenceRepository.save(companyReference);
    }

    public CompanyReference editCompanyReference(String id, CompanyReference companyReference) {
        CompanyReference companyReferenceFound = getCompanyReferenceById(id);

        companyReferenceFound.setCompany(companyReference.getCompany());
        companyReferenceFound.setReferenceName(companyReference.getReferenceName());
        companyReferenceFound.setReferenceUrl(companyReference.getReferenceUrl());
        companyReferenceFound.setObservation(companyReference.getObservation());
        return companyReferenceFound;
    }

    public String deleteCompanyReference(String id) {
        companyReferenceRepository.deleteById(id);
        return successfullyDeletedMessage;
    }

    public List<CompanyServiceArea> getAllCompanyServiceArea() {
        return companyServiceAreaRepository.findAll();
    }

    public CompanyServiceArea getCompanyServiceAreaById(String id) {
        return companyServiceAreaRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Área de serviço da empresa não encotrado"));
    }

    public CompanyServiceArea saveCompanyServiceArea(CompanyServiceArea companyServiceArea) {
        return companyServiceAreaRepository.save(companyServiceArea);
    }

    public CompanyServiceArea editCompanyServiceArea(String id, CompanyServiceArea companyServiceArea) {
        CompanyServiceArea companyServiceAreaFound = getCompanyServiceAreaById(id);

        companyServiceAreaFound.setCompany(companyServiceArea.getCompany());
        companyServiceAreaFound.setName(companyServiceArea.getName());
        companyServiceAreaFound.setDescription(companyServiceArea.getDescription());
        return companyServiceAreaFound;
    }

    public String deleteCompanyServiceArea(String id) {
        companyServiceAreaRepository.deleteById(id);
        return successfullyDeletedMessage;
    }

    public List<CompanySite> getAllCompanySite() {
        return companySiteRepository.findAll();
    }

    public CompanySite getCompanySiteById(String id) {
        return companySiteRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Site da empresa não encotrado"));
    }

    public CompanySite saveCompanySite(CompanySite companySite) {
        return companySiteRepository.save(companySite);
    }

    public CompanySite editCompanySite(String id, CompanySite companySite) {
        CompanySite companySiteFound = getCompanySiteById(id);

        companySiteFound.setCompany(companySite.getCompany());
        companySiteFound.setDomain(companySite.getDomain());
        companySiteFound.setHost(companySite.getHost());
        companySiteFound.setUrl(companySite.getUrl());
        return companySiteFound;
    }

    public String deleteCompanySite(String id) {
        companySiteRepository.deleteById(id);
        return successfullyDeletedMessage;
    }

    public List<CompanySocialNetwork> getAllCompanySocialNetwork() {
        return companySocialNetworkRepository.findAll();
    }

    public CompanySocialNetwork getCompanySocialNetwork(String id) {
        return companySocialNetworkRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Redes sociais da empresa não encontradas"));
    }

    public CompanySocialNetwork saveCompanySocialNetwork(CompanySocialNetwork companySocialNetwork) {
        return companySocialNetworkRepository.save(companySocialNetwork);
    }

    public CompanySocialNetwork editCompanySocialNetwork(String id, CompanySocialNetwork companySocialNetwork) {
        CompanySocialNetwork companySocialNetworkFound = getCompanySocialNetwork(id);

        companySocialNetworkFound.setCompany(companySocialNetwork.getCompany());
        companySocialNetworkFound.setPlatform(companySocialNetwork.getPlatform());
        return companySocialNetworkFound;
    }

    public String deleteCompanySocialNetwork(String id) {
        companySocialNetworkRepository.deleteById(id);
        return successfullyDeletedMessage;
    }
}