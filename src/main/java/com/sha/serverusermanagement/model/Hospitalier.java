package com.sha.serverusermanagement.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@PrimaryKeyJoinColumn(name = "id_hospitalier")
public class Hospitalier extends User implements Serializable {

    private String nomHospitalier;
    private String prenomHospitalier;

    @ManyToOne
    private Hopital hopital;

}
