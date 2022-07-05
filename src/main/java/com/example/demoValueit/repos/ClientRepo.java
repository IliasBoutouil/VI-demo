package com.example.demoValueit.repos;

import com.example.demoValueit.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ClientRepo extends JpaRepository<Client,Integer> {

   List<Client> findByAdresseContains(String adresse);
}
