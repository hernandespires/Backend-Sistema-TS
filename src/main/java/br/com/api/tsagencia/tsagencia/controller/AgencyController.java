package br.com.api.tsagencia.tsagencia.controller;

import br.com.api.tsagencia.tsagencia.model.comercial.*;
import br.com.api.tsagencia.tsagencia.service.ComercialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/agencia")
public class AgencyController {
    @Autowired
    private ComercialService comercialService;

    @GetMapping(value = "/allClients", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Client> getAllClients() {
        return comercialService.getAllClients();
    }

    @PostMapping(
            value = "/saveClient",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public Client saveClient(@RequestBody Client client) {
        return comercialService.saveClient(client);
    }

    @GetMapping(value = "/allLeads", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Lead> getAllLeads() {
        return comercialService.getAllLeads();
    }

    @PostMapping(
            value = "/saveLeads",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public Lead saveLead(@RequestBody Lead lead) {
        return comercialService.saveLead(lead);
    }

    @GetMapping(value = "/allOrigins", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Origin> getAllOrigins() {
        return comercialService.getAllOrigins();
    }

    @PostMapping(
            value = "/saveOrigin",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public Origin saveOrigin(@RequestBody Origin origin) {
        return comercialService.saveOrigin(origin);
    }

    @GetMapping(value = "/allPrograms", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Program> getAllPrograms() {
        return comercialService.getAllPrograms();
    }

    @PostMapping(
            value = "/saveProgram",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public Program saveProgram(@RequestBody Program program) {
        return comercialService.saveProgram(program);
    }

    @GetMapping(value = "allServices", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Services> getAllServices() {
        return comercialService.getAllServices();
    }

    @PostMapping(
            value = "/saveServeices",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public Services saveService(@RequestBody Services services) {
        return comercialService.saveServices(services);
    }
}