package br.com.api.tsagencia.tsagencia.controller;

import br.com.api.tsagencia.tsagencia.model.briefing.*;
import br.com.api.tsagencia.tsagencia.service.BriefingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController("/briefing")
public class BriefingController {
    @Autowired
    BriefingService service;

    @GetMapping(value = "/allBriefing", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Briefing> getAllBriefing() {
        return service.getAllBriefing();
    }

    @GetMapping(value = "/getBriefing/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Briefing getBriefingById(@PathVariable String id) {
        return service.getBriefingById(id);
    }

    @PostMapping(
            value = "/saveBriefing",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public Briefing saveBriefing(@RequestBody Briefing briefing) {
        return service.saveBriefing(briefing);
    }

    @PutMapping(
            value = "/editBriefing/{id}",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public Briefing editBriefing(@PathVariable String id, @RequestBody Briefing briefing) {
        return service.editBriefing(id, briefing);
    }

    @DeleteMapping(value = "/deleteBriefing/{id}")
    public String deleteBriefing(@PathVariable String id) {
        return service.deleteBriefing(id);
    }

    @GetMapping(value = "/allBriefingAccesses", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<BriefingAccesses> getAllBriefingAccesses() {
        return service.getAllBriefingAccesses();
    }

    @GetMapping(value = "/getBriefingAccesses/{id}", consumes = MediaType.APPLICATION_JSON_VALUE)
    public BriefingAccesses getBriefingAccessesById(@PathVariable String id) {
        return service.getBriefingAccessesById(id);
    }

    @PostMapping(
            value = "/saveBriefingAccesses",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public BriefingAccesses saveBriefingAccesses(@RequestBody BriefingAccesses briefingAccesses) {
        return service.saveBriefingAccesses(briefingAccesses);
    }

    @PutMapping(
            value = "/editBriefingAccesses/{id}",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public BriefingAccesses editBriefingAccesses(
            @PathVariable String id, @PathVariable BriefingAccesses briefingAccesses
    ) {
        return service.editBriefingAccesses(id, briefingAccesses);
    }

    @DeleteMapping(value = "/deleteBriefingAccesses/{id}")
    public String deleteBriefingAccesses(@PathVariable String id) {
        return service.deleteBriefingAccesses(id);
    }

    @GetMapping(value = "/allBriefingEmployee", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<BriefingEmployee> getAllBriefingEmployee() {
        return service.getAllBriefingEmployee();
    }

    @GetMapping(value = "/getBriefingEmployee/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public BriefingEmployee getBriefingEmployeeById(@PathVariable String id) {
        return service.getBriefingEmployeeById(id);
    }

    @PostMapping(
            value = "/saveBriefingEmployee",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public BriefingEmployee saveBriefingEmployee(@RequestBody BriefingEmployee briefingEmployee) {
        return service.saveBriefingEmployee(briefingEmployee);
    }

    @PutMapping(
            value = "/editBriefingEmployee/{id}",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public BriefingEmployee editBriefingEmployee(
            @PathVariable String id, @RequestBody BriefingEmployee briefingEmployee
    ) {
        return service.editBriefingEmployee(id, briefingEmployee);
    }

    @DeleteMapping(value = "/deleteBriefingEmployee/{id}")
    public String deleteBriefingEmployee(@PathVariable String id) {
        return service.deleteBriefingEmployee(id);
    }

    @GetMapping(value = "/allBriefingField", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<BriefingField> getAllBriefingField() {
        return service.getAllBriefingField();
    }

    @GetMapping(value = "/getBriefingField/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public BriefingField getBriefingField(@PathVariable String id) {
        return service.getBriefingFieldById(id);
    }

    @PostMapping(
            value = "/saveBriefingField",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public BriefingField saveBriefingField(@RequestBody BriefingField briefingField) {
        return service.saveBriefingField(briefingField);
    }

    @PutMapping(
            value = "/editBriefingField/{id}",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public BriefingField editBriefingField(@PathVariable String id, @RequestBody BriefingField briefingField) {
        return service.editBriefingField(id, briefingField);
    }

    @DeleteMapping(value = "/deleteBriefingField/{id}")
    public String deleteBriefingField(@PathVariable String id) {
        return service.deleteBriefingField(id);
    }

    @GetMapping(value = "/allBriefingFile", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<BriefingFile> getAllBriefingFile() {
        return service.getAllBriefingFile();
    }

    @GetMapping(value = "/briefingFile/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public BriefingFile getBriefingFileById(@PathVariable String id) {
        return service.getBriefingFileById(id);
    }

    @PostMapping(
            value = "/saveBriefingFile",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public BriefingFile saveBriefingFile(@RequestBody BriefingFile briefingFile) {
        return service.saveBriefingFile(briefingFile);
    }

    @PutMapping(
            value = "/editBriefingFile/{id}",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public BriefingFile editBriefingFile(@PathVariable String id, @RequestBody BriefingFile briefingFile) {
        return service.editBriefingFile(id, briefingFile);
    }

    @DeleteMapping(value = "/deleteBriefingFile/{id}")
    public String deleteBriefingFile(@PathVariable String id) {
        return service.deleteBriefingFile(id);
    }

    @GetMapping(value = "/allBriefingResponse", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<BriefingResponse> getAllBriefingResponse() {
        return service.getAllBriefingResponse();
    }

    @GetMapping(value = "/getBriefingResponse/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public BriefingResponse getBriefingResponseById(@PathVariable String id) {
        return service.getBriefingResponseById(id);
    }

    @PostMapping(
            value = "/saveBriefingResponse",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public BriefingResponse saveBriefingResponse(@RequestBody BriefingResponse briefingResponse) {
        return service.saveBriefingResponse(briefingResponse);
    }

    @PutMapping(
            value = "/editBriefingResponse/{id}",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public BriefingResponse editBriefingResponse(
            @PathVariable String id, @RequestBody BriefingResponse briefingResponse
    ) {
        return service.editBriefingResponse(id, briefingResponse);
    }

    @DeleteMapping(value = "/deleteBriefingResponse/{id}")
    public String deleteBriefingResponse(@PathVariable String id) {
        return service.deleteBriefingResponse(id);
    }

    @GetMapping(value = "/allBriefingSection", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<BriefingSection> getAllBriefingSection() {
        return service.getAllBriefingSection();
    }

    @GetMapping(value = "/getBriefingSection/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public BriefingSection getBriefingSection(@PathVariable String id) {
        return service.getBriefingSectionById(id);
    }

    @PostMapping(
            value = "/saveBriefingSection",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public BriefingSection saveBriefingSection(@RequestBody BriefingSection briefingSection) {
        return service.saveBriefingSection(briefingSection);
    }

    @PutMapping(
            value = "/editBriefingSection/{id}",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public BriefingSection editBriefingSection(@PathVariable String id, @RequestBody BriefingSection briefingSection) {
        return service.editBriefingSection(id, briefingSection);
    }

    @DeleteMapping(value = "/deleteBriefingSection/{id}")
    public String deleteBriefingSection(@PathVariable String id) {
        return service.deleteBriefingSection(id);
    }

    @GetMapping(value = "/allBriefingSynchronizationLog", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<BriefingSynchronizationLog> getAllBriefingSynchronizationLog() {
        return service.getAllBriefingSynchronizationLog();
    }

    @GetMapping(value = "/getBriefingSynchronizationLog/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public BriefingSynchronizationLog getBriefingSynchronizationLogById(@PathVariable String id) {
        return service.getBriefingSynchronizationLogById(id);
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

    @PutMapping(
            value = "/editBriefingSynchronizationLog/{id}",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public BriefingSynchronizationLog editBriefingSynchronizationLog(
            @PathVariable String id, @RequestBody BriefingSynchronizationLog briefingSynchronizationLog
    ) {
        return service.editBriefingSynchronizationLog(id, briefingSynchronizationLog);
    }

    @DeleteMapping(value = "/deleteBriefingSynchronizationLog/{id}")
    public String deleteBriefingSynchronizationLog(@PathVariable String id) {
        return service.deleteBriefingSynchronizationLog(id);
    }

    @GetMapping(value = "/allBriefingVisibility", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<BriefingVisibility> getAllBriefingVisibility() {
        return service.getAllBriefingVisibility();
    }

    @GetMapping(value = "/getBriefingVisibility/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public BriefingVisibility getBriefingVisibilityById(@PathVariable String id) {
        return service.getBriefingVisibilityById(id);
    }

    @PostMapping(
            value = "/saveBriefingVisibility",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public BriefingVisibility saveBriefingVisibility(@RequestBody BriefingVisibility briefingVisibility) {
        return service.saveBriefingVisibility(briefingVisibility);
    }

    @PutMapping(
            value = "/editBriefingVisibility/{id}",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public BriefingVisibility editBriefingVisibility(
            @PathVariable String id, @RequestBody BriefingVisibility briefingVisibility
    ) {
        return service.editBriefingVisibility(id, briefingVisibility);
    }

    @DeleteMapping(value = "/deleteBriefingVisibility/{id}")
    public String deleteBriefingVisibility(@PathVariable String id) {
        return service.deleteBriefing(id);
    }
}