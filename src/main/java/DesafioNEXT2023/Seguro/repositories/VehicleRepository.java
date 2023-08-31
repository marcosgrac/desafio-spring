package DesafioNEXT2023.Seguro.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import DesafioNEXT2023.Seguro.entities.Vehicle;

@RepositoryRestResource (collectionResourceRel = "vehicle", path = "vehicle")
public interface VehicleRepository extends JpaRepository<Vehicle, Long> {
    
}
