package DesafioNEXT2023.Seguro.entities;

import java.time.LocalDateTime;
import java.util.List;

//import org.springframework.web.bind.annotation.RequestMapping;

//import DesafioNEXT2023.Seguro.enums.MaritalStatus;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor // construtores
@Builder
@Table(name = "client")


public class Client {
    @Id  // identificar que o atributo abaixo é chave primária
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // Gera sequencial as entidades no BD
    @Column(nullable = false, updatable = false, unique = true)
    private Long id;
    @Column(name = "name", nullable = false)  // indica que é obrigatório
    private String nome;

    @Column(name = "age", nullable = false)
    private int age;

    @Column(name = "dependents", nullable = false)
    private int dependents;

    @Column(name = "income", nullable = false)
    private double income;

    @Column(name = "marital_status", nullable = false)
    private String  maritalStatus;
       
    @Column(name = "create_at", nullable = false)
    private LocalDateTime createAt = LocalDateTime.now(); // associa a dat na hora da criação

    @Column(name = "update_at", nullable = true)
    private Data updateAt;


    @OneToMany (mappedBy = "client", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List <House> houses;

    @OneToMany(cascade = CascadeType.REMOVE, mappedBy = "client")
    private List<Vehicle> vehicles;

    @OneToMany(cascade = CascadeType.REMOVE, mappedBy = "client")
    private List<Insurance> insurances;
}