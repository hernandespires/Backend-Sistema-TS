package br.com.api.tsagencia.tsagencia.service;

import br.com.api.tsagencia.tsagencia.model.comercial.Client;
import br.com.api.tsagencia.tsagencia.repository.ClientRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AgencyService {
    private final ClientRepository repository;

    public AgencyService(ClientRepository repository) {
        this.repository = repository;
    }

    public List<Client> getAllClients() {
        return repository.findAll();
    }
}