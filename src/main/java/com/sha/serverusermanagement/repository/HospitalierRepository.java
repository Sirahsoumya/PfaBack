package com.sha.serverusermanagement.repository;

import com.sha.serverusermanagement.model.Hospitalier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HospitalierRepository extends JpaRepository<Hospitalier, Integer> {
    Hospitalier findById(int id_hospitalier);

}
