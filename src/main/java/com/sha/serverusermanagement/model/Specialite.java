package com.sha.serverusermanagement.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Data
@Entity
public class Specialite implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id_specialite;
    private String nomSpecialite;
    @OneToMany(mappedBy = "specialite",fetch = FetchType.LAZY)
    @JsonIgnore
    private List<Medecin> medecins;
}
