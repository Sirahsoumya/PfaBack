package com.sha.serverusermanagement.controller;


import com.sha.serverusermanagement.model.Patient;
import com.sha.serverusermanagement.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("Patients")
public class PatientController {
    @Autowired
    private PatientRepository patientRepository;
    @PostMapping("/AjouterPatient")
    public void save(@RequestBody Patient patient){

        patientRepository.save(patient);  }
    @DeleteMapping("/deletePatient/{id_patient}")
    public void delete(@PathVariable (required = true)
                               String id_patient){
        Patient p = patientRepository.findById(Integer.parseInt(id_patient));
        patientRepository.delete(p);  }
    @GetMapping("/listerPatients")
    public List<Patient> findAll(){
        return patientRepository.findAll();
    }
    @PutMapping(value = "/updatePatients/{id}")
    public void updatePatient(@PathVariable int id ,@RequestBody Patient patient) {
        Patient  patientUp=  patientRepository.findById(id);
        patientRepository.save(patient);
    }
}
