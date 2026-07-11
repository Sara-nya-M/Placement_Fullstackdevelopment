package com.example.Fullstackproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentRepository repo;
    public Student save(Student s){
        return repo.save(s);
    }
    public List<Student> all(){
        return repo.findAll();
    }
}
