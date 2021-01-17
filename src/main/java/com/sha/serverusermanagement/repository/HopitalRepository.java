package com.sha.serverusermanagement.repository;

import com.sha.serverusermanagement.model.Hopital;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HopitalRepository extends JpaRepository<Hopital, Integer> {
    Hopital findById(int id_hop);

}
