package com.example.demoValueit.repos;

import com.example.demoValueit.entities.Reclamation;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ReclamationRepo extends JpaRepository<Reclamation,Integer> {
    List<Reclamation> findByOrderByCreatedAtDesc();
    List<Reclamation> findByClientId(int id);
}
