package com.sha.serverusermanagement.controller;

import com.sha.serverusermanagement.model.Ville;
import com.sha.serverusermanagement.repository.VilleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("Villes")
public class VilleController {
    @Autowired
    private VilleRepository villeRepository;
    @PostMapping("/save")
    public void save(@RequestBody Ville ville){

        villeRepository.save(ville);  }
    @DeleteMapping("/delete/{id_ville}")
    public void delete(@PathVariable (required = true)
                               String id_ville){
        Ville v = villeRepository.findById(Integer.parseInt(id_ville));
        villeRepository.delete(v);  }
    @GetMapping("/all")
    public List<Ville> findAll(){
        return villeRepository.findAll();
    }

    @PutMapping(value = "/update/{id}")
    public void updateVille(@PathVariable int id ,@RequestBody Ville ville) {
        Ville villeUp=  villeRepository.findById(id);
        villeRepository.save(ville);
    }
}
