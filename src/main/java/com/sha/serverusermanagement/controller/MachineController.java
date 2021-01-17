package com.sha.serverusermanagement.controller;


import com.sha.serverusermanagement.model.Machine;
import com.sha.serverusermanagement.model.RendezVous;
import com.sha.serverusermanagement.repository.MachineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("Machines")
@CrossOrigin(origins = "http://localhost:4200")
public class MachineController {

    @Autowired
    private MachineRepository machineRepository;
    @PostMapping("/AjouterMachine")
    public void save(@RequestBody Machine machine){

        machineRepository.save(machine);  }
    @DeleteMapping("/deleteMachine/{id_machine}")
    public void delete(@PathVariable(required = true)
                               String id_machine){
        Machine m = machineRepository.findById(Integer.parseInt(id_machine));
        machineRepository.delete(m);  }
    @GetMapping("/listerMachines")
    public List<Machine> findAll(){
        return machineRepository.findAll();
    }
    @PutMapping(value = "/updateMachine/{id}")
    public void updateMachine(@PathVariable int id ,@RequestBody Machine machine) {
        Machine machineUp=  machineRepository.findById(id);
        machineRepository.save(machine);
    }

    @GetMapping("/findById/{id_machine}")
    public Machine findMachineById(@PathVariable(required = true) int id_machine) {
        return machineRepository.findById(id_machine);
    }
}
