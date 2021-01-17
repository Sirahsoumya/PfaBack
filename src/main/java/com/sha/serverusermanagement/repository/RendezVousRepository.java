package com.sha.serverusermanagement.repository;

import com.sha.serverusermanagement.model.RendezVous;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RendezVousRepository extends JpaRepository<RendezVous, Integer> {
    RendezVous  findById(int id_rdv);

}
