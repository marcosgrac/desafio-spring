package DesafioNEXT2023.Seguro.entities;

import org.springframework.web.bind.annotation.RequestMapping;

import com.fasterxml.jackson.annotation.JsonBackReference;

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

public class Insurance {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)  
    private long id;
    @Column(nullable = false)
    private String type;
    @Column(nullable = false)
    private int risk;
    @Column(nullable = false)
    private String analysis;
    @Column(nullable = true)
    private String observation;
    @Column(nullable = false)
    private Data createdAt;
    @Column(nullable = false)
    private Data validatedAt;

    @ManyToOne
    @JoinColumn(name ="clent_id", nullable = false)
    @JsonBackReference 
    private Client client;
}
