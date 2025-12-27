package br.com.api.tsagencia.tsagencia.controller;

import br.com.api.tsagencia.tsagencia.model.briefing.*;
import br.com.api.tsagencia.tsagencia.service.BriefingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("/briefing")
public class BriefingController {
    @Autowired
    BriefingService service;

    @GetMapping(value = "/allBriefing", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Briefing> getAllBriefing() {
        return service.getAllBriefing();
    }

    @PostMapping(
            value = "/saveBriefing",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public Briefing saveBriefing(@RequestBody Briefing briefing) {
        return service.saveBriefing(briefing);
    }

    @GetMapping(value = "/allBriefingAccesses", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<BriefingAccesses> getAllBriefingAccesses() {
        return service.getAllBriefingAccesses();
    }

    @PostMapping(
            value = "/saveBriefingAccesses",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public BriefingAccesses saveBriefingAccesses(@RequestBody BriefingAccesses briefingAccesses) {
        return service.saveBriefingAccesses(briefingAccesses);
    }

    @GetMapping(value = "/allBriefingEmployee", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<BriefingEmployee> getAllBriefingEmployee() {
        return service.getAllBriefingEmployee();
    }

    @PostMapping(
            value = "/saveBriefingEmployee",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public BriefingEmployee saveBriefingEmployee(@RequestBody BriefingEmployee briefingEmployee) {
        return service.saveBriefingEmployee(briefingEmployee);
    }

    @GetMapping(value = "/allBriefingField", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<BriefingField> getAllBriefingField() {
        return service.getAllBriefingField();
    }

    @PostMapping(
            value = "/saveBriefingField",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public BriefingField saveBriefingField(@RequestBody BriefingField briefingField) {
        return service.saveBriefingField(briefingField);
    }

    @GetMapping(value = "/allBriefingFile", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<BriefingFile> getAllBriefingFile() {
        return service.getAllBriefingFile();
    }

    @PostMapping(
            value = "/saveBriefingFile",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public BriefingFile saveBriefingFile(@RequestBody BriefingFile briefingFile) {
        return service.saveBriefingFile(briefingFile);
    }

    @GetMapping(value = "/allBriefingResponse", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<BriefingResponse> getAllBriefingResponse() {
        return service.getAllBriefingResponse();
    }

    @PostMapping(
            value = "/saveBriefingResponse",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public BriefingResponse saveBriefingResponse(@RequestBody BriefingResponse briefingResponse) {
        return service.saveBriefingResponse(briefingResponse);
    }

    @GetMapping(value = "/allBriefingSection", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<BriefingSection> getAllBriefingSection() {
        return service.getAllBriefingSection();
    }

    @PostMapping(
            value = "/saveBriefingSection",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public BriefingSection saveBriefingSection(@RequestBody BriefingSection briefingSection) {
        return service.saveBriefingSection(briefingSection);
    }

    @GetMapping(value = "/allBriefingSynchronizationLog", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<BriefingSynchronizationLog> getAllBriefingSynchronizationLog() {
        return service.getAllBriefingSynchronizationLog();
    }

    @PostMapping(
            value = "/saveBriefingSynchronizationLog",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public BriefingSynchronizationLog saveBriefingSynchronizationLog(
            @RequestBody BriefingSynchronizationLog briefingSynchronizationLog
    ) {
        return service.saveBriefingSynchronizationLog(briefingSynchronizationLog);
    }

    @GetMapping(value = "/allBriefingVisibility", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<BriefingVisibility> getAllBriefingVisibility() {
        return service.getAllBriefingVisibility();
    }

    @PostMapping(
            value = "/saveBriefingVisibility",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public BriefingVisibility saveBriefingVisibility(@RequestBody BriefingVisibility briefingVisibility) {
        return service.saveBriefingVisibility(briefingVisibility);
    }
}