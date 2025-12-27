package br.com.api.tsagencia.tsagencia.service;

import br.com.api.tsagencia.tsagencia.model.briefing.*;
import br.com.api.tsagencia.tsagencia.repository.briefing.*;
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

    public Briefing saveBriefing(Briefing briefing) {
        return briefingRepository.save(briefing);
    }

    public List<BriefingAccesses> getAllBriefingAccesses() {
        return briefingAccessesRepository.findAll();
    }

    public BriefingAccesses saveBriefingAccesses(BriefingAccesses briefingAccesses) {
        return briefingAccessesRepository.save(briefingAccesses);
    }

    public List<BriefingEmployee> getAllBriefingEmployee() {
        return briefingEmployeeRepository.findAll();
    }

    public BriefingEmployee saveBriefingEmployee(BriefingEmployee briefingEmployee) {
        return briefingEmployeeRepository.save(briefingEmployee);
    }

    public List<BriefingField> getAllBriefingField() {
        return briefingFieldRepository.findAll();
    }

    public BriefingField saveBriefingField(BriefingField briefingField) {
        return briefingFieldRepository.save(briefingField);
    }

    public List<BriefingFile> getAllBriefingFile() {
        return briefingFileRepository.findAll();
    }

    public BriefingFile saveBriefingFile(BriefingFile briefingFile) {
        return briefingFileRepository.save(briefingFile);
    }

    public List<BriefingResponse> getAllBriefingResponse() {
        return briefingResponseRepository.findAll();
    }

    public BriefingResponse saveBriefingResponse(BriefingResponse briefingResponse) {
        return briefingResponseRepository.save(briefingResponse);
    }

    public List<BriefingSection> getAllBriefingSection() {
        return briefingSectionRepository.findAll();
    }

    public BriefingSection saveBriefingSection(BriefingSection briefingSection) {
        return briefingSectionRepository.save(briefingSection);
    }

    public List<BriefingSynchronizationLog> getAllBriefingSynchronizationLog() {
        return briefingSynchronizationLogRepository.findAll();
    }

    public BriefingSynchronizationLog saveBriefingSynchronizationLog(
            BriefingSynchronizationLog briefingSynchronizationLog
    ) {
        return briefingSynchronizationLogRepository.save(briefingSynchronizationLog);
    }

    public List<BriefingVisibility> getAllBriefingVisibility() {
        return briefingVisibilityRepository.findAll();
    }

    public BriefingVisibility saveBriefingVisibility(BriefingVisibility briefingVisibility) {
        return briefingVisibilityRepository.save(briefingVisibility);
    }
}