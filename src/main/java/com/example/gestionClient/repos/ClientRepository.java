package com.example.gestionClient.repos;

import com.example.gestionClient.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long > {
    //

}
