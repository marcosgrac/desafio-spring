package DesafioNEXT2023.Seguro.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import DesafioNEXT2023.Seguro.entities.Insurance;

@RepositoryRestResource(collectionResourceRel = "insurance", path = "insurance")
public interface InsuranceRepository extends JpaRepository<Insurance, Long> {
    
}