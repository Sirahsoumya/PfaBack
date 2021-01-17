package com.sha.serverusermanagement.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Setter
@Getter
@NoArgsConstructor
@Data
@Entity
public class RendezVous {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
     private int idRdv;
    @Temporal(TemporalType.DATE)
     private Date dateRdv;
     private String description;
    @ManyToOne
    @JsonIgnore
     private Medecin medecin;
    @ManyToOne

     private Patient patient;
    @ManyToOne
    @JsonIgnore
     private Hopital hopital;


}
