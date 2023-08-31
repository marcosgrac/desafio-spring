package DesafioNEXT2023.Seguro.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import DesafioNEXT2023.Seguro.entities.House;

@RepositoryRestResource(collectionResourceRel = "house", path = "house")
public interface HouseRepository extends JpaRepository<House, Long> {
    
}
