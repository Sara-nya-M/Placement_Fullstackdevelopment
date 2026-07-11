package com.example.homebaker.Modular;


import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "baker_id")
    private User baker;

    private String name;
    private String category;
    private Double price;
    private String description;
    private String imageUrl;

    private Boolean isEggless = false;
    private Boolean isGlutenFree = false;
    private Boolean isVegan = false;
    private Boolean isNutFree = false;

    private String occasion;

    private Integer dailySlots = 5;
}