package com.banque.sn.bp.Entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor
public class Employe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String marticule;
    private String prenom;
    private String nom;
    private String adresse;
    private String email;
    private String telephone;
    @Enumerated(EnumType.STRING)
    private ProfilEmploye profile;
    private int agence;
}
