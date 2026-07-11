package com.example.Fullstackproject;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name="student_details")
public class Student {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    @Column(name="name", length = 100, nullable = false)
    private String name;

    @Column(name="department", length = 100, nullable = false)
    private String department;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="profile_id", referencedColumnName = "id")
    private Profile profile;
}