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
        CommemorativeDate commemorativeDateFound = getCommemorativeDateById(id);

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



    public List<CompanyFinancial> getAllCompanyFinancial() {
        return companyFinancialRepository.findAll();
    }

    public CompanyFinancial saveCompanyFinancial(CompanyFinancial companyFinancial) {
        return companyFinancialRepository.save(companyFinancial);
    }

    public List<CompanyGMB> getAllCompanyGMB() {
        return companyGMBRepository.findAll();
    }

    public CompanyGMB saveCompanyGMB(CompanyGMB companyGMB) {
        return companyGMBRepository.save(companyGMB);
    }

    public List<CompanyInsurance> getAllCompanyInsurance() {
        return companyInsuranceRepository.findAll();
    }

    public CompanyInsurance saveCompanyInsurance(CompanyInsurance companyInsurance) {
        return companyInsuranceRepository.save(companyInsurance);
    }

    public List<CompanyOperations> getAllCompanyOperations() {
        return companyOperationsRepository.findAll();
    }

    public CompanyOperations saveCompanyOperations(CompanyOperations companyOperations) {
        return companyOperationsRepository.save(companyOperations);
    }

    public List<CompanyReference> getAllCompanyReference() {
        return companyReferenceRepository.findAll();
    }

    public CompanyReference saveCompanyReference(CompanyReference companyReference) {
        return companyReferenceRepository.save(companyReference);
    }

    public List<CompanyServiceArea> getAllCompanyServiceArea() {
        return companyServiceAreaRepository.findAll();
    }

    public CompanyServiceArea saveCompanyServiceArea(CompanyServiceArea companyServiceArea) {
        return companyServiceAreaRepository.save(companyServiceArea);
    }

    public List<CompanySite> getAllCompanySite() {
        return companySiteRepository.findAll();
    }

    public CompanySite saveCompanySite(CompanySite companySite) {
        return companySiteRepository.save(companySite);
    }

    public List<CompanySocialNetwork> getAllCompanySocialNetwork() {
        return companySocialNetworkRepository.findAll();
    }

    public CompanySocialNetwork saveCompanySocialNetwork(CompanySocialNetwork companySocialNetwork) {
        return companySocialNetworkRepository.save(companySocialNetwork);
    }
}