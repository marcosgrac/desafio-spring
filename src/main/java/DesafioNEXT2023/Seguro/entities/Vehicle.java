package DesafioNEXT2023.Seguro.entities;

import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
@RequestMapping


public class Vehicle {

    @Id
    private String brand;
    private String model;
    private int year;
    
}
