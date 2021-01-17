package com.sha.serverusermanagement.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Data
@Entity
public class Hopital implements Serializable {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id_hop;
    private String nomHopital;
    private String adresseHop;
    @OneToMany(mappedBy ="hopital",fetch = FetchType.LAZY)
// @JsonIgnore
    private List<RendezVous> rendezVous;
    @OneToMany(mappedBy ="hopital",fetch = FetchType.LAZY)
    @JsonIgnore
    private List<Hospitalier> hospitalier;
    @ManyToOne
    private Ville ville;
    @OneToMany(mappedBy = "hopital", fetch = FetchType.LAZY)

    private List<Service> service;
}
