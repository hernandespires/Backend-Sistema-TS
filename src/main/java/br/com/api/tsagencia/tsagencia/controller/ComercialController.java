package br.com.api.tsagencia.tsagencia.controller;

import br.com.api.tsagencia.tsagencia.model.comercial.*;
import br.com.api.tsagencia.tsagencia.service.ComercialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/comercial")
public class ComercialController {
    @Autowired
    private ComercialService service;

    @GetMapping(value = "/allClient", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Client> getAllClients() {
        return service.getAllClient();
    }

    @GetMapping(value = "/getClient/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Client getClientById(UUID id) {
        return service.getClientById(id);
    }

    @PostMapping(
            value = "/saveClient",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public Client saveClient(@RequestBody Client client) {
        return service.saveClient(client);
    }

    @PutMapping(
            value = "/editClient/{id}",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public Client editClient(@PathVariable UUID id, @RequestBody Client client) {
        return service.editClient(id, client);
    }

    @DeleteMapping(value = "/deleteClient/{id}")
    public String deleteClient(@PathVariable UUID id) {
        return service.deleteClient(id);
    }

    @GetMapping(value = "/allLead", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Lead> getAllLeads() {
        return service.getAllLead();
    }

    @GetMapping(value = "/getLead/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Lead getLeadById(@PathVariable UUID id) {
        return service.getLeadById(id);
    }

    @PostMapping(
            value = "/saveLead",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public Lead saveLead(@RequestBody Lead lead) {
        return service.saveLead(lead);
    }

    @PutMapping(
            value = "/editLead/{id}",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public Lead editLead(@PathVariable UUID id, @RequestBody Lead lead) {
        return service.editLead(id, lead);
    }

    @DeleteMapping(value = "/deleteLead/{id}")
    public String deleteLead(@PathVariable UUID id) {
        return service.deleteLead(id);
    }

    @GetMapping(value = "/allOrigin", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Origin> getAllOrigin() {
        return service.getAllOrigin();
    }

    @GetMapping(value = "/getAOrigin/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Origin getOriginById(@PathVariable UUID id) {
        return service.getOriginById(id);
    }

    @PostMapping(
            value = "/saveOrigin",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public Origin saveOrigin(@RequestBody Origin origin) {
        return service.saveOrigin(origin);
    }

    @PutMapping(
            value = "/editOrigin/{id}",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public Origin editOrigin(@PathVariable UUID id, @RequestBody Origin origin) {
        return service.editOrigin(id, origin);
    }

    @DeleteMapping(value = "/deleteOrigin/{id}")
    public String deleteOrigin(@PathVariable UUID id) {
        return service.deleteOrigin(id);
    }

    @GetMapping(value = "/allProgram", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Program> getAllPrograms() {
        return service.getAllProgram();
    }

    @GetMapping(value = "/getProgram/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Program getProgramById(@PathVariable UUID id) {
        return service.getProgramById(id);
    }

    @PostMapping(
            value = "/saveProgram",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public Program saveProgram(@RequestBody Program program) {
        return service.saveProgram(program);
    }

    @PutMapping(
            value = "/editProgram/{id}",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public Program editProgram(@PathVariable UUID id, @RequestBody Program program) {
        return service.editProgram(id, program);
    }

    @DeleteMapping(value = "/deleteProgram/{id}")
    public String deleteProgram(@PathVariable UUID id) {
        return service.deleteProgram(id);
    }

    @GetMapping(value = "/allServices", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Services> getAllServices() {
        return service.getAllServices();
    }

    @GetMapping(value = "/getServices/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Services getServicesById(@PathVariable UUID id) {
        return service.getServicesById(id);
    }

    @PostMapping(
            value = "/saveServices",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public Services saveServices(@RequestBody Services services) {
        return service.saveServices(services);
    }

    @PutMapping(
            value = "/editServices/{id}",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public Services editServices(@PathVariable UUID id, @RequestBody Services services) {
        return service.editServices(id, services);
    }

    @DeleteMapping(value = "/deleteServices/{id}")
    public String deleteServices(@PathVariable UUID id) {
        return service.deleteServices(id);
    }
}