package DesafioNEXT2023.Seguro.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import DesafioNEXT2023.Seguro.entities.Client;


@RepositoryRestResource(collectionResourceRel = "client", path = "client")
public interface ClientRepository extends JpaRepository<Client, Long> {
    
}
