package com.sha.serverusermanagement.controller;

import com.sha.serverusermanagement.model.Medecin;
import com.sha.serverusermanagement.repository.MedecinRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("Medecins")
public class MedecinController {
    @Autowired
    private MedecinRepository medecinRepository;
    @PostMapping("/AjouterMedecin")
    public void save(@RequestBody Medecin medecin){

        medecinRepository.save(medecin);  }
    @DeleteMapping("/deleteMedecin/{id_medecin}")
    public void delete(@PathVariable (required = true)
                               String id_medecin){
        Medecin m = medecinRepository.findById(Integer.parseInt(id_medecin));
        medecinRepository.delete(m);  }
    @GetMapping("/listeMedecins")
    public List<Medecin> findAll(){
        return medecinRepository.findAll();
    }
    @PutMapping(value = "/updateMedecin/{id}")
    public void updateMedecin(@PathVariable int id ,@RequestBody Medecin medecin) {
        Medecin medecinUp=  medecinRepository.findById(id);
        medecinRepository.save(medecin);
    }

}
