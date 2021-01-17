package com.sha.serverusermanagement.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Data
@Entity
public class Ville implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)


    private int id_ville;
    private String nom;
    @OneToMany(mappedBy ="ville",fetch = FetchType.LAZY)
    @JsonIgnore
    private List<Hopital> hopital;
}
