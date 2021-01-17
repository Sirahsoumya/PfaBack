package com.sha.serverusermanagement.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class Service {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id_ser;
    private String description;
    @OneToMany(mappedBy ="service",fetch = FetchType.LAZY)
    @JsonIgnore
    private List<Medecin> medecins;

    @OneToMany(mappedBy ="service",fetch = FetchType.LAZY)

    private List<Machine> machine;
    @ManyToOne
    private Hopital hopital;
}
