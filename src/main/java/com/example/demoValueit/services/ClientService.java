package com.example.demoValueit.services;

import com.example.demoValueit.entities.Client;
import com.example.demoValueit.repos.ClientRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ClientService {

    @Autowired
    ClientRepo clientRepo;

    public List<Client>fetchAll()
    {
        return  clientRepo.findAll();
    }
    public Client getClient(int id)
    {
        return  clientRepo.findById(id).orElse(null);
    }
    public List<Client>fetchByAdresse(String adresse)
    {
        return  clientRepo.findByAdresseContains(adresse);
    }

    public int addClient(Client client){
        clientRepo.save(client);
        return client.getId();
    }

    public void deleteClient(int id)
    {
        clientRepo.deleteById(id);
    }


}
