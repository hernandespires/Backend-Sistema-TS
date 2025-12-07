package br.com.api.tsagencia.tsagencia.controller;

import br.com.api.tsagencia.tsagencia.model.comercial.*;
import br.com.api.tsagencia.tsagencia.service.ComercialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/comercial")
public class ComercialController {
    @Autowired
    private ComercialService service;

    @GetMapping(value = "/allClient", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Client> getAllClients() {
        return service.getAllClients();
    }

    @PostMapping(
            value = "/saveClient",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public Client saveClient(@RequestBody Client client) {
        return service.saveClient(client);
    }

    @GetMapping(value = "/allLeads", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Lead> getAllLeads() {
        return service.getAllLeads();
    }

    @PostMapping(
            value = "/saveLeads",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public Lead saveLead(@RequestBody Lead lead) {
        return service.saveLead(lead);
    }

    @GetMapping(value = "/allOrigins", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Origin> getAllOrigins() {
        return service.getAllOrigins();
    }

    @PostMapping(
            value = "/saveOrigin",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public Origin saveOrigin(@RequestBody Origin origin) {
        return service.saveOrigin(origin);
    }

    @GetMapping(value = "/allPrograms", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Program> getAllPrograms() {
        return service.getAllPrograms();
    }

    @PostMapping(
            value = "/saveProgram",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public Program saveProgram(@RequestBody Program program) {
        return service.saveProgram(program);
    }

    @GetMapping(value = "/allServices", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Services> getAllServices() {
        return service.getAllServices();
    }

    @PostMapping(
            value = "/saveServeices",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public Services saveService(@RequestBody Services services) {
        return service.saveServices(services);
    }
}