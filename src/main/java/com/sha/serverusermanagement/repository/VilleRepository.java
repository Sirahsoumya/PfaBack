package com.sha.serverusermanagement.repository;

import com.sha.serverusermanagement.model.Ville;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VilleRepository extends JpaRepository<Ville, Integer> {
    Ville  findById(int id_ville);
}