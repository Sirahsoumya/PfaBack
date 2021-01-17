package com.sha.serverusermanagement.controller;

import com.sha.serverusermanagement.model.Hopital;
import com.sha.serverusermanagement.repository.HopitalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("Hopitaux")
public class HopitalController {
    @Autowired
    private HopitalRepository hopitalRepository;
    @PostMapping("/save")
    public void save(@RequestBody Hopital hopital){

        hopitalRepository.save(hopital);  }
    @DeleteMapping("/delete/{id_hop}")
    public void delete(@PathVariable (required = true) String id_hop){
        Hopital h = hopitalRepository.findById(Integer.parseInt(id_hop));
        hopitalRepository.delete(h);  }
    @GetMapping("/all")
    public List<Hopital> findAll(){
        return hopitalRepository.findAll();
    }
}
