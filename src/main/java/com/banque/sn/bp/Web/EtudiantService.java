package com.banque.sn.bp.Web;

import com.banque.sn.bp.Entities.Etudiant;
import com.banque.sn.bp.Repository.EtudiantRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/etudiant/api")
public class EtudiantService {
    private EtudiantRepository etudiantRepository;

    public EtudiantService(EtudiantRepository etudiantRepository) {
        this.etudiantRepository = etudiantRepository;
    }

    @GetMapping(path = "/getAll")
    public List<Etudiant> findAllEtudiant(){
        List<Etudiant> mes_etudiant = new ArrayList<Etudiant>();
        mes_etudiant.add(new Etudiant(1, "pouye", "Moustapha", 1));
        mes_etudiant.add(new Etudiant(2, "Gueye", "Fatou", 1));
        mes_etudiant.add(new Etudiant(1, "Fall", "Moustapha", 1));
        mes_etudiant.add(new Etudiant(1, "Dieng", "Kine", 1));
        mes_etudiant.add(new Etudiant(1, "Diop", "Mbacke", 1));
        mes_etudiant.add(new Etudiant(3, "Diagne", "Mouhamadou", 2));
        return mes_etudiant;

        //return etudiantRepository.findAll();
    }
}
