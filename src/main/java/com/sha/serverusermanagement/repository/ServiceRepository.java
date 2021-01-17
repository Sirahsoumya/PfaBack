package com.sha.serverusermanagement.repository;

import com.sha.serverusermanagement.model.Service;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServiceRepository extends JpaRepository<Service, Integer> {
    Service findById(int id_serv);
}
