package com.banque.sn.bp.Entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class Compte {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long code;
    private double solde;
    private String numeroCompte;
    private String rib;
    private String siwft;
    private Date datecreation;
    @Enumerated(EnumType.STRING)
    private TypeCompte type;
    private int etatCompte;
    private int agence;
    private int client;
}
