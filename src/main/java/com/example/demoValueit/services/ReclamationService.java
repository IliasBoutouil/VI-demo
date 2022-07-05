package com.example.demoValueit.services;

import com.example.demoValueit.entities.Client;
import com.example.demoValueit.entities.Reclamation;
import com.example.demoValueit.repos.ClientRepo;
import com.example.demoValueit.repos.ReclamationRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Service @Transactional
public class ReclamationService {
    @Autowired
    ReclamationRepo reclamationRepo;
    @Autowired
    ClientRepo clientRepo;

    public List<Reclamation> fetchAll()
    {
        return  reclamationRepo.findByOrderByCreatedAtDesc();
    }

    public List<Reclamation> getOwnerReclamations(int ownerId){
        return reclamationRepo.findByClientId(ownerId);
    }

    public Reclamation getReclamation(int id)
    {
        return  reclamationRepo.findById(id).orElse(null);
    }

    public int addReclamation(Reclamation reclamation){

//        Client client= clientRepo.findById(reclamation.getClient().getId()).orElse(null);
//        if(client!=null)
//        {
//            reclamation.setClient(client);
           System.out.println(reclamation);
            reclamationRepo.save(reclamation);
            return reclamation.getId();
//        }
//       return -1;
    }

    public void deleteReclamation(int id)
    {
        reclamationRepo.deleteById(id);
    }
}
