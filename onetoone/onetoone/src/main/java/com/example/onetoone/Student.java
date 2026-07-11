package com.example.onetoone;

import jakarta.persistence.*;

@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToOne(cascade = CascadeType.ALL)
    private StudentProfile profile;

    public Student() {}

    public Long getId() { return id; }

    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public StudentProfile getProfile() { return profile; }

    public void setProfile(StudentProfile profile) { this.profile = profile; }
}