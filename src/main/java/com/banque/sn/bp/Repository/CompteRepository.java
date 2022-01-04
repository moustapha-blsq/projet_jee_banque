package com.banque.sn.bp.Repository;

import com.banque.sn.bp.Entities.Compte;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompteRepository extends JpaRepository<Compte, Integer> {
}
