package br.com.api.tsagencia.tsagencia.controller;

import br.com.api.tsagencia.tsagencia.model.comercial.Client;
import br.com.api.tsagencia.tsagencia.service.AgencyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/agencia")
public class AgencyController {
    @Autowired
    private AgencyService service;

    @GetMapping(value = "/allClients", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Client> test(@RequestParam(value = "name", defaultValue = "Word") String name) {
        return service.getAllClients();
    }
}