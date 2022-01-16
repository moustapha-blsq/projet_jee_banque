package com.banque.sn.bp.Web;

import com.banque.sn.bp.Entities.Agence;
import com.banque.sn.bp.Entities.Client;
import com.banque.sn.bp.Repository.AgenceRepository;
import com.banque.sn.bp.Repository.ClientRepository;
import com.banque.sn.bp.Repository.CompteRepository;
import com.banque.sn.bp.Repository.EmployerRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/banque/agence")
public class AgenceRestController {
    private AgenceRepository agenceRepository;
    private ClientRepository clientRepository;
    private CompteRepository compteRepository;


    public AgenceRestController(AgenceRepository agenceRepository, ClientRepository clientRepository, CompteRepository compteRepository, EmployerRepository employerRepository) {
        this.agenceRepository = agenceRepository;
        this.clientRepository = clientRepository;
        this.compteRepository = compteRepository;
        //this.employerRepository = employerRepository;
    }

    //Methode gestion des agences

    @GetMapping(path = "/getAll_agence")
    public List<Agence> getAllAgence(){
        return agenceRepository.findAll();
    }

    @GetMapping(path = "/findAgence/{id}")
    public Agence getAgence(@PathVariable(name="id") int id){
        return agenceRepository.findById(id).get();
    }

    @PostMapping(path = "/create_agence")
    public Agence saveAgence(@RequestBody Agence agence){
        return agenceRepository.save(agence);
    }

    @PostMapping(path = "/update_agence/{id}")
    public Agence Update_agence(@PathVariable int id, @RequestBody Agence agence){
        agence.setId(id);
        return agenceRepository.save(agence);
    }

    //Fin

    //Methode gestion des client

    @PostMapping(path = "/create_client")
    public Client create_client(@RequestBody Client client){
        return clientRepository.save(client);
    }

    @GetMapping(path = "/all_client")
    public List<Client> getAllClient(){
        return clientRepository.findAll();
    }
    @GetMapping(path = "/show_client/{id}")
    public Client getClientByID(@PathVariable int id){
        return clientRepository.findById(id).get();
    }

    @PostMapping(path = "edit_client/{id}")
    public Client update_client(@PathVariable int id, @RequestBody Client cli){
        cli.setId(id);
        return clientRepository.save(cli);
    }
    @PostMapping(path = "delete_client/{id}")
    public void delete_client(@PathVariable int id, @RequestBody Client cli){
        cli.setId(id);
        clientRepository.delete(cli);
    }

}
