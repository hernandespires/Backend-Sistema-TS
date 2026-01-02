package br.com.api.tsagencia.tsagencia.service;

import br.com.api.tsagencia.tsagencia.model.briefing.*;
import br.com.api.tsagencia.tsagencia.repository.briefing.*;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BriefingService {
    private final BriefingRepository briefingRepository;
    private final BriefingAccessesRepository briefingAccessesRepository;
    private final BriefingEmployeeRepository briefingEmployeeRepository;
    private final BriefingFieldRepository briefingFieldRepository;
    private final BriefingFileRepository briefingFileRepository;
    private final BriefingResponseRepository briefingResponseRepository;
    private final BriefingSectionRepository briefingSectionRepository;
    private final BriefingSynchronizationLogRepository briefingSynchronizationLogRepository;
    private final BriefingVisibilityRepository briefingVisibilityRepository;

    private final String successfullyDeletedMessage = "Registro deletado com sucesso";

    public BriefingService(
            BriefingRepository briefingRepository,
            BriefingAccessesRepository briefingAccessesRepository,
            BriefingEmployeeRepository briefingEmployeeRepository,
            BriefingFieldRepository briefingFieldRepository,
            BriefingFileRepository briefingFileRepository,
            BriefingResponseRepository briefingResponseRepository,
            BriefingSectionRepository briefingSectionRepository,
            BriefingSynchronizationLogRepository briefingSynchronizationLogRepository,
            BriefingVisibilityRepository briefingVisibilityRepository
    ) {
        this.briefingRepository = briefingRepository;
        this.briefingAccessesRepository = briefingAccessesRepository;
        this.briefingEmployeeRepository = briefingEmployeeRepository;
        this.briefingFieldRepository = briefingFieldRepository;
        this.briefingFileRepository = briefingFileRepository;
        this.briefingResponseRepository = briefingResponseRepository;
        this.briefingSectionRepository = briefingSectionRepository;
        this.briefingSynchronizationLogRepository = briefingSynchronizationLogRepository;
        this.briefingVisibilityRepository = briefingVisibilityRepository;
    }

    public List<Briefing> getAllBriefing() {
        return briefingRepository.findAll();
    }

    public Briefing getBriefingById(String id) {
        return briefingRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Briefing não encontrado"));
    }

    public Briefing saveBriefing(Briefing briefing) {
        return briefingRepository.save(briefing);
    }

    public Briefing editBriefing(String id, Briefing briefing) {
        Briefing briefingFound = getBriefingById(id);

        briefingFound.setLead(briefing.getLead());
        briefingFound.setClient(briefing.getClient());
        briefingFound.setCompany(briefing.getCompany());
        briefingFound.setContract(briefing.getContract());
        briefingFound.setStatus(briefing.getStatus());
        briefingFound.setCriationDate(briefing.getCriationDate());
        briefingFound.setUpdateDate(briefing.getUpdateDate());
        briefingFound.setObservations(briefing.getObservations());
        briefingFound.setVersion(briefing.getVersion());
        return briefingFound;
    }

    public String deleteBriefing(String id) {
        briefingRepository.deleteById(id);
        return successfullyDeletedMessage;
    }

    public List<BriefingAccesses> getAllBriefingAccesses() {
        return briefingAccessesRepository.findAll();
    }

    public BriefingAccesses getBriefingAccessesById(String id) {
        return briefingAccessesRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Acessos do briefing não encontrados"));
    }

    public BriefingAccesses saveBriefingAccesses(BriefingAccesses briefingAccesses) {
        return briefingAccessesRepository.save(briefingAccesses);
    }

    public BriefingAccesses editBriefingAccesses(String id, BriefingAccesses briefingAccesses) {
        BriefingAccesses briefingAccessesFound = getBriefingAccessesById(id);

        briefingAccessesFound.setBriefing(briefingAccesses.getBriefing());
        briefingAccessesFound.setType(briefingAccesses.getType());
        briefingAccessesFound.setUser(briefingAccesses.getUser());
        briefingAccessesFound.setObservations(briefingAccesses.getObservations());
        briefingAccessesFound.setStatus(briefingAccesses.getStatus());
        briefingAccessesFound.setValidationDate(briefingAccesses.getValidationDate());
        briefingAccessesFound.setEmployee(briefingAccesses.getEmployee());
        return briefingAccessesFound;
    }

    public String deleteBriefingAccesses(String id) {
        briefingAccessesRepository.deleteById(id);
        return successfullyDeletedMessage;
    }

    public List<BriefingEmployee> getAllBriefingEmployee() {
        return briefingEmployeeRepository.findAll();
    }

    public BriefingEmployee getBriefingEmployeeById(String id) {
        return briefingEmployeeRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Briefing do funcionário não encontrado"));
    }

    public BriefingEmployee saveBriefingEmployee(BriefingEmployee briefingEmployee) {
        return briefingEmployeeRepository.save(briefingEmployee);
    }

    public BriefingEmployee editBriefingEmployee(String id, BriefingEmployee briefingEmployee) {
        BriefingEmployee briefingEmployeeFound = getBriefingEmployeeById(id);

        briefingEmployeeFound.setBriefing(briefingEmployee.getBriefing());
        briefingEmployeeFound.setEmployee(briefingEmployee.getEmployee());
        briefingEmployeeFound.setSectionName(briefingEmployee.getSectionName());
        briefingEmployeeFound.setStepResponsible(briefingEmployeeFound.getStepResponsible());
        briefingEmployeeFound.setSectionStatus(briefingEmployee.getSectionStatus());
        briefingEmployeeFound.setUpdateDate(briefingEmployee.getUpdateDate());
        return briefingEmployeeFound;
    }

    public String deleteBriefingEmployee(String id) {
        briefingEmployeeRepository.deleteById(id);
        return successfullyDeletedMessage;
    }

    public List<BriefingField> getAllBriefingField() {
        return briefingFieldRepository.findAll();
    }

    public BriefingField getBriefingFieldById(String id) {
        return briefingFieldRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Campo do briefing não encontrado"));
    }

    public BriefingField saveBriefingField(BriefingField briefingField) {
        return briefingFieldRepository.save(briefingField);
    }

    public BriefingField editBriefingField(String id, BriefingField briefingField) {
        BriefingField briefingFieldFound = getBriefingFieldById(id);

        briefingFieldFound.setBriefingSection(briefingField.getBriefingSection());
        briefingFieldFound.setFieldName(briefingField.getFieldName());
        briefingFieldFound.setFieldType(briefingField.getFieldType());
        briefingFieldFound.setRequired(briefingField.getRequired());
        briefingFieldFound.setOrder(briefingField.getOrder());
        briefingFieldFound.setDefaultOrigin(briefingField.getDefaultOrigin());
        briefingFieldFound.setDestinationTable(briefingField.getDestinationTable());
        return briefingFieldFound;
    }

    public String deleteBriefingField(String id) {
        briefingFieldRepository.deleteById(id);
        return successfullyDeletedMessage;
    }

    public List<BriefingFile> getAllBriefingFile() {
        return briefingFileRepository.findAll();
    }

    public BriefingFile getBriefingFileById(String id) {
        return briefingFileRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Campo do briefing não encontrado"));
    }

    public BriefingFile saveBriefingFile(BriefingFile briefingFile) {
        return briefingFileRepository.save(briefingFile);
    }

    public BriefingFile editBriefingFile(String id, BriefingFile briefingFile) {
        BriefingFile briefingFileFound = getBriefingFileById(id);

        briefingFileFound.setBriefing(briefingFile.getBriefing());
        briefingFileFound.setName(briefingFile.getName());
        briefingFileFound.setUrl(briefingFile.getUrl());
        briefingFileFound.setType(briefingFile.getType());
        briefingFileFound.setEmployee(briefingFile.getEmployee());
        briefingFileFound.setUpdateDate(briefingFile.getUpdateDate());
        return briefingFileFound;
    }

    public String deleteBriefingFile(String id) {
        briefingFileRepository.deleteById(id);
        return successfullyDeletedMessage;
    }

    public List<BriefingResponse> getAllBriefingResponse() {
        return briefingResponseRepository.findAll();
    }

    public BriefingResponse getBriefingResponseById(String id) {
        return briefingResponseRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Resposta do briefing não encontrada"));
    }

    public BriefingResponse saveBriefingResponse(BriefingResponse briefingResponse) {
        return briefingResponseRepository.save(briefingResponse);
    }

    public BriefingResponse editBriefingResponse(String id, BriefingResponse briefingResponse) {
        BriefingResponse briefingResponseFound = getBriefingResponseById(id);

        briefingResponseFound.setBriefingField(briefingResponse.getBriefingField());
        briefingResponseFound.setResponse(briefingResponse.getResponse());
        briefingResponseFound.setOrigin(briefingResponse.getOrigin());
        briefingResponseFound.setEmployee(briefingResponse.getEmployee());
        briefingResponseFound.setResponseDate(briefingResponse.getResponseDate());
        briefingResponseFound.setValidated(briefingResponse.getValidated());
        briefingResponseFound.setInSynchronized(briefingResponse.getInSynchronized());
        briefingResponseFound.setSynchronizedDate(briefingResponse.getSynchronizedDate());
        return briefingResponseFound;
    }

    public String deleteBriefingResponse(String id) {
        briefingResponseRepository.deleteById(id);
        return successfullyDeletedMessage;
    }

    public List<BriefingSection> getAllBriefingSection() {
        return briefingSectionRepository.findAll();
    }

    public BriefingSection getBriefingSectionById(String id) {
        return briefingSectionRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Seção do briefing não encontrada"));
    }

    public BriefingSection saveBriefingSection(BriefingSection briefingSection) {
        return briefingSectionRepository.save(briefingSection);
    }

    public BriefingSection editBriefingSection(String id, BriefingSection briefingSection) {
        BriefingSection briefingSectionFound = getBriefingSectionById(id);

        briefingSectionFound.setBriefing(briefingSection.getBriefing());
        briefingSectionFound.setManagerEmployee(briefingSection.getManagerEmployee());
        briefingSectionFound.setSection(briefingSection.getSection());
        briefingSectionFound.setStep(briefingSection.getStep());
        briefingSectionFound.setStatus(briefingSection.getStatus());
        briefingSectionFound.setUpdateDate(briefingSection.getUpdateDate());
        return briefingSectionFound;
    }

    public String deleteBriefingSection(String id) {
        briefingSectionRepository.deleteById(id);
        return successfullyDeletedMessage;
    }

    public List<BriefingSynchronizationLog> getAllBriefingSynchronizationLog() {
        return briefingSynchronizationLogRepository.findAll();
    }

    public BriefingSynchronizationLog getBriefingSynchronizationLogById(String id) {
        return briefingSynchronizationLogRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Log de sincronização do briefing não encontrado"));
    }

    public BriefingSynchronizationLog saveBriefingSynchronizationLog(
            BriefingSynchronizationLog briefingSynchronizationLog
    ) {
        return briefingSynchronizationLogRepository.save(briefingSynchronizationLog);
    }

    public BriefingSynchronizationLog editBriefingSynchronizationLog(
            String id, BriefingSynchronizationLog briefingSynchronizationLog
    ) {
        BriefingSynchronizationLog briefingSynchronizationLogFound = getBriefingSynchronizationLogById(id);

        briefingSynchronizationLogFound.setBriefingResponse(briefingSynchronizationLog.getBriefingResponse());
        briefingSynchronizationLogFound.setTableDestination(briefingSynchronizationLog.getTableDestination());
        briefingSynchronizationLogFound.setColumnDestination(briefingSynchronizationLog.getColumnDestination());
        briefingSynchronizationLogFound.setPrevValue(briefingSynchronizationLog.getPrevValue());
        briefingSynchronizationLogFound.setValue(briefingSynchronizationLog.getValue());
        briefingSynchronizationLogFound.setEmployee(briefingSynchronizationLog.getEmployee());
        briefingSynchronizationLogFound.setUpdateDate(briefingSynchronizationLog.getUpdateDate());
        return briefingSynchronizationLogFound;
    }

    public String deleteBriefingSynchronizationLog(String id) {
        briefingSynchronizationLogRepository.deleteById(id);
        return successfullyDeletedMessage;
    }

    public List<BriefingVisibility> getAllBriefingVisibility() {
        return briefingVisibilityRepository.findAll();
    }

    public BriefingVisibility getBriefingVisibilityById(String id) {
        return briefingVisibilityRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Visibilidade do briefing não encontrada"));
    }

    public BriefingVisibility saveBriefingVisibility(BriefingVisibility briefingVisibility) {
        return briefingVisibilityRepository.save(briefingVisibility);
    }

    public BriefingVisibility editBriefingVisibility(String id, BriefingVisibility briefingVisibility) {
        BriefingVisibility briefingVisibilityFound = getBriefingVisibilityById(id);

        briefingVisibilityFound.setBriefingSection(briefingVisibility.getBriefingSection());
        briefingVisibilityFound.setOrganizationalUnit(briefingVisibility.getOrganizationalUnit());
        briefingVisibilityFound.setAcessLevel(briefingVisibility.getAcessLevel());
        return briefingVisibilityFound;
    }

    public String deleteBriefingVisibility(String id) {
        briefingVisibilityRepository.deleteById(id);
        return successfullyDeletedMessage;
    }
}