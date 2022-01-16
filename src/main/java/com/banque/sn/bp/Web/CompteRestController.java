package com.banque.sn.bp.Web;

import com.banque.sn.bp.Entities.Compte;
import com.banque.sn.bp.Repository.CompteRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/banque/compte")
public class CompteRestController {
    private CompteRepository compteRepository;

    public CompteRestController(CompteRepository compteRepository) {
        this.compteRepository = compteRepository;
    }

    @GetMapping(path = "/getAll")
    public List<Compte> getAll(){
        return compteRepository.findAll();
    }
    @GetMapping(path = "/getCompte/id")
    public Compte getCompteByID(@PathVariable int id){
        return compteRepository.getById(id);
    }
    @PostMapping(path = "/create")
    public Compte createCompte(@RequestBody Compte compte){
        return compteRepository.save(compte);
    }
    @PostMapping(path = "/edit/code")
    public Compte editCompte(@PathVariable Long code, @RequestBody Compte compte){
        compte.setCode(code);
        return compteRepository.save(compte);
    }
    @GetMapping(path = "/delete/code")
    public void delete(@PathVariable Long code, @RequestBody Compte compte){
        compte.setCode(code);
        compteRepository.delete(compte);
    }
    @GetMapping(path = "/setStatus/code/status")
    public Compte changeStatus(@PathVariable Long code, @PathVariable int status, @RequestBody Compte compte){
        compte.setCode(code);
        compte.setEtatCompte(status);
        return compteRepository.save(compte);
    }
    @PostMapping(path = "/depot/code")
    public void save_depot(@PathVariable Long code, @PathVariable double montant, @RequestBody Compte compte){
        int id = code.intValue();
        compte = this.getCompteByID(id);
        double solde = compte.getSolde()+montant;
        compte.setSolde(solde);
        compteRepository.save(compte);

    }

    public double getSolde(@PathVariable Long code,  @RequestBody Compte compte){
        int id = code.intValue();
        compte = this.getCompteByID(id);
        return compte.getSolde();
    }

    public Compte save_retrait(@PathVariable Long code, @PathVariable double montant, @RequestBody Compte compte){
        double solde_actuel = this.getSolde(code, compte);
        if (solde_actuel >= montant){
            int id = code.intValue();
            compte = this.getCompteByID(id);
            double solde = compte.getSolde()+montant;
            compte.setSolde(solde);
            return compteRepository.save(compte);
        }
        else return null;

    }

}
