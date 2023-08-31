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

public class House {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (nullable = false, updatable = false, unique = true)   
    private long id;

    @Column(name = "ownership_status", nullable = false)
    private String ownershipStatus;

    @Column(name = "location", nullable = false)
    private String location;

    @Column(name = "zipcode", nullable = false)
    private String zipcode;

    @ManyToOne
    @JoinColumn(name ="clent_id", nullable = false)
    @JsonBackReference 
    private Client client;
}
