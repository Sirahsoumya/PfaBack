package com.sha.serverusermanagement.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Data
@Entity
@PrimaryKeyJoinColumn(name = "id_medecin")
public class Medecin extends User implements Serializable {


    private String nomMedecin;
    @OneToMany(mappedBy ="medecin",fetch = FetchType.LAZY)
    // @JsonIgnore
    private List<RendezVous> rendezVous;
    @ManyToOne
    private Service service;
    @ManyToOne
    private Specialite specialite;

}
