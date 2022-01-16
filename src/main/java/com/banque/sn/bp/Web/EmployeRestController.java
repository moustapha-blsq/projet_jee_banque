package com.banque.sn.bp.Web;

import com.banque.sn.bp.Entities.Employe;
import com.banque.sn.bp.Repository.EmployerRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/banque/employe")
public class EmployeRestController {
    private EmployerRepository employerRepository;

    public EmployeRestController(EmployerRepository employerRepository) {
        this.employerRepository = employerRepository;
    }
    @GetMapping(path = "/getAll")
    public List<Employe> getAll_employees(){
        return employerRepository.findAll();
    }

    @GetMapping(path = "getbyid/id")
    public Employe getByID(int id){
        return employerRepository.getById(id);
    }
    @GetMapping(path = "delete/id")
    public void delete(@PathVariable int id, @RequestBody Employe emp){
        emp.setId(id);
        employerRepository.delete(emp);
    }
    @GetMapping(path = "edit/id")
    public Employe update(@PathVariable int id, @RequestBody Employe emp){
        emp.setId(id);
        return employerRepository.save(emp);
    }
    @PostMapping(path = "/create")
    public Employe createEmploye(@RequestBody Employe employe){
        return employerRepository.save(employe);
    }
}
