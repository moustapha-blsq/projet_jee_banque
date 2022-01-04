package com.banque.sn.bp.Repository;

import com.banque.sn.bp.Entities.Employe;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployerRepository extends JpaRepository<Employe, Integer> {
}
