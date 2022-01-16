package com.banque.sn.bp.Web.Rest;

import com.banque.sn.bp.Entities.Etudiant;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EtudiantController {
    public List<Etudiant> lisEtudiant(){
        List<Etudiant> mes_etuduants = new ArrayList<Etudiant>();

        Etudiant e1 = new Etudiant(1,"Pouye", "Binta", 1);
        mes_etuduants.add(e1);
        Etudiant e2 = new Etudiant(2,"Sow", "Alioune Badara", 1);
        mes_etuduants.add(e2);
        Etudiant e3 = new Etudiant(3,"Yangua", "Exauce", 1);
        mes_etuduants.add(e3);
        Etudiant e4 = new Etudiant(4,"Sarr", "Ndeye", 1);
        mes_etuduants.add(e4);
        return mes_etuduants;
    }
}
