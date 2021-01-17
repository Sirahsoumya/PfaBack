package com.sha.serverusermanagement.repository;

import com.sha.serverusermanagement.model.Specialite;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpecialiteRepository extends JpaRepository<Specialite, Integer> {
    Specialite  findById(int id_spec);

}