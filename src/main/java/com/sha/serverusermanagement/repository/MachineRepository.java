package com.sha.serverusermanagement.repository;

import com.sha.serverusermanagement.model.Machine;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MachineRepository extends JpaRepository<Machine, Integer> {
    Machine  findById(int id_machine);

}
