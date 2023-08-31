package DesafioNEXT2023.Seguro.entities;

import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor // construtores
@Builder


public class Vehicle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)  
    private long id;
    @Column(nullable = false)
    private String brand;
    @Column(nullable = false)
    private String model;
    @Column(nullable = false)
    private int year;

     @ManyToOne
    @JoinColumn(name="client_id")
    private Client client;
    
}
