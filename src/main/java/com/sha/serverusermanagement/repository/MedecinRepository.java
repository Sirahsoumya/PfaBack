package com.sha.serverusermanagement.repository;

import com.sha.serverusermanagement.model.Medecin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MedecinRepository extends JpaRepository<Medecin, Integer> {
    Medecin findById(int id_medecin);
}

