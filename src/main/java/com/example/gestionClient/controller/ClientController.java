package com.example.gestionClient.controller;

import com.example.gestionClient.entity.Client;
import com.example.gestionClient.service.ServiceClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/clients")
public class ClientController {

    @Autowired
    private ServiceClient clientService ;

    @GetMapping("/")
    public List <Client> getAllPersons(){
        return clientService.getAllClients();
    }

    @GetMapping("/{id}")
    public Optional<Client> getClientById(@PathVariable Long id){
        return  clientService.getClientById(id);
    }

    @PostMapping ({ "", "/" })
    public Client createPerson(@RequestBody Client client){
        return clientService.createPerson(client);

    }


}
