package com.example.demoValueit.controllers;

import com.example.demoValueit.entities.Reclamation;
import com.example.demoValueit.services.ReclamationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/reclamations")
public class ReclamationController {
    @Autowired
    ReclamationService reclamationService;

    @GetMapping()
    public List<Reclamation> AllReclamations(){
        return reclamationService.fetchAll();
    }
    @GetMapping("/{id}")
    public Reclamation getById(@PathVariable int id){
        return reclamationService.getReclamation(id);
    }
    @GetMapping("/owner/{id}")
    public List<Reclamation> getByOwnerId(@PathVariable int id){
        return reclamationService.getOwnerReclamations(id);
    }
    @PostMapping("/add")
    public int add(@Valid @RequestBody Reclamation Reclamation){

        return reclamationService.addReclamation(Reclamation);
    }
    @PostMapping("/update")
    public int update(@Valid @RequestBody Reclamation Reclamation){

        return reclamationService.addReclamation(Reclamation);
    }


    @GetMapping("/delete/{id}")
    public void delete(@PathVariable int id){
        reclamationService.deleteReclamation(id);
    }

}
