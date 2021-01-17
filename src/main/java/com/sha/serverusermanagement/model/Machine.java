package com.sha.serverusermanagement.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
@Data
@Entity
public class Machine {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int idMachine;
    private Boolean disponibilite;
    private int nbrMachine;
    private String nomMachine;
    @ManyToOne
    @JsonIgnore
    private Service service;

}
