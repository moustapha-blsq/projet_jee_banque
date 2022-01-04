package com.banque.sn.bp.Repository;

import com.banque.sn.bp.Entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Integer> {
}
