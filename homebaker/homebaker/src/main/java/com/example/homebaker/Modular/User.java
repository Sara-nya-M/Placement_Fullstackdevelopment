package com.example.homebaker.Modular;


import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Column(unique = true)
    private String email;

    private String password;

    private String role; // BAKER or CUSTOMER

    private String village;
    private String city;
    private String pincode;
    private String phone;

    private Double latitude;
    private Double longitude;
}