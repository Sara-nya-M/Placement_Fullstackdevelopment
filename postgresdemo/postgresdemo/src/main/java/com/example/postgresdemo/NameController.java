package com.example.postgresdemo;

import jakarta.persistence.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/names")
public class NameController {

    private final NameRepository repo;

    public NameController(NameRepository repo){
        this.repo = repo;
    }

    @GetMapping
    public List<Name> getAll(){
        return repo.findAll();
    }

    @PostMapping
    public Name add(@RequestBody Name n){
        return repo.save(n);
    }
}

// Entity
@Entity
class Name {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    public Name(){}

    public Name(String name){
        this.name = name;
    }

    public Long getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }
}

// Repository
@Repository
interface NameRepository extends JpaRepository<Name, Long> {}