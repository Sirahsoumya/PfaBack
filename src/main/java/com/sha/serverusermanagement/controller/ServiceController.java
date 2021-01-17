package com.sha.serverusermanagement.controller;

import com.sha.serverusermanagement.model.Service;
import com.sha.serverusermanagement.repository.ServiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("Services")
public class ServiceController {
    @Autowired
    private ServiceRepository serviceRepository;
    @PostMapping("/AjouterService")
    public void save(@RequestBody Service service){

        serviceRepository.save(service);  }
    @DeleteMapping("/deleteService/{id_serv}")
    public void delete(@PathVariable(required = true) String id_serv){
        Service s = serviceRepository.findById(Integer.parseInt(id_serv));
        serviceRepository.delete(s);  }
    @GetMapping("/listService")
    public List<Service> findAll(){
        return serviceRepository.findAll();
    }
    @PutMapping(value = "/updateService/{id}")
    public void updateService(@PathVariable int id ,@RequestBody Service service) {
        Service serviceUp=  serviceRepository.findById(id);
        serviceRepository.save(service);
    }

    @GetMapping("/findById/{id_serv}")
    public Service findService(@PathVariable(required = true) int id_serv) {
        return serviceRepository.findById(id_serv);
    }

}
