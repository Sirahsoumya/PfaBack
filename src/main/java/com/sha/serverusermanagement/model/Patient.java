package com.sha.serverusermanagement.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
@NoArgsConstructor
@Setter
@Getter

@Data
@Entity
@PrimaryKeyJoinColumn(name = "id_patient")
public class Patient extends User implements Serializable{

    private String nomPatient;
    private String prenomPatient;
    private String cinPatient;
    private String TelephonePatient;
    private Date DateNaissance;
    private String sexe;
    private String adresse;
    @OneToMany(mappedBy = "patient", fetch = FetchType.LAZY)
    @JsonIgnore
    private List<RendezVous> rendezVous;
}
