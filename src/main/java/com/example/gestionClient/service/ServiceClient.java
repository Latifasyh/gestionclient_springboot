package com.example.gestionClient.service;

import com.example.gestionClient.entity.Client;
import com.example.gestionClient.repos.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServiceClient {

    @Autowired
    private ClientRepository clientRepository;

    public List <Client> getAllClients(){
        return clientRepository.findAll();
    }
    public Optional<Client> getClientById(Long id){
        return clientRepository.findById(id);
    }
    public Client createPerson(Client client){
        return clientRepository.save(client);
    }
}
