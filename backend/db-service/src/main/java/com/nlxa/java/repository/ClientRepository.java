package com.nlxa.java.repository;

import com.nlxa.java.domain.Client;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ClientRepository extends JpaRepository<Client, String> {
    List<Client> findByDescription(String description);
}
