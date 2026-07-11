package com.example.Fullstackproject;

import jakarta.persistence.*;
import lombok.Data;
import tools.jackson.databind.deser.impl.NullsAsEmptyProvider;

@Entity
@Table(name="profiles")
@Data
public class Profile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="email", nullable = false,unique=true)
    private String email;
    @Column(name="phone")
    private String phone;

}
