package com.sha.serverusermanagement.controller;

import ch.qos.logback.core.CoreConstants;
import com.sha.serverusermanagement.model.RendezVous;
import com.sha.serverusermanagement.model.Service;
import com.sha.serverusermanagement.repository.RendezVousRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("RendezVous")
@CrossOrigin(origins = "http://localhost:4200")
public class RendezVousConttroler {
    @Autowired
    private RendezVousRepository rendezVousRepository;
    @PostMapping("/AjouterRdv")
    public void save(@RequestBody RendezVous rendezVous){

        rendezVousRepository.save(rendezVous);  }

    @DeleteMapping("/deleteRdv/{idRdv}")
    public void delete(@PathVariable (required = true) int idRdv){
        RendezVous rdv = rendezVousRepository.findById(idRdv);
        rendezVousRepository.delete(rdv);  }

    @GetMapping("/listerRdv")
    public List<RendezVous> findAll(){
        System.out.println("list back");
        return rendezVousRepository.findAll();
    }
    @PutMapping(value = "/update/{id}")
    public void updateRendezVous(@PathVariable int id ,@RequestBody RendezVous rendezVous) {
        RendezVous RendezVousUp=  rendezVousRepository.findById(id);
        rendezVousRepository.save(rendezVous);
    }

    @GetMapping("/findById/{idRdv}")
    public RendezVous findRDById(@PathVariable(required = true) int idRdv) {
        return rendezVousRepository.findById(idRdv);
    }
    }
