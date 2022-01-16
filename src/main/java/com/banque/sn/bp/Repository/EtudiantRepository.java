package com.banque.sn.bp.Repository;

import com.banque.sn.bp.Entities.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EtudiantRepository extends JpaRepository<Etudiant, Integer> {

}
