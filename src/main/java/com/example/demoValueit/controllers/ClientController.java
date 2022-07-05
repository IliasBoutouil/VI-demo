package com.example.demoValueit.controllers;

import com.example.demoValueit.entities.Client;
import com.example.demoValueit.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;


@RestController
@RequestMapping("/api/clients")
public class ClientController {

    @Autowired
    ClientService clientService;

    @GetMapping()
    public List<Client> AllClients(){
        return clientService.fetchAll();
    }
    @GetMapping("/{id}")
    public Client getById(@PathVariable int id){
        return clientService.getClient(id);
    }

    @PostMapping("/add")
    public int add(@Valid @RequestBody Client client){
        return clientService.addClient(client);
    }
    @PostMapping("/update")
    public int update(@Valid @RequestBody Client client){
        return clientService.addClient(client);
    }


    @GetMapping("/delete/{id}")
    public void delete(@PathVariable int id){
        clientService.deleteClient(id);
    }

}
