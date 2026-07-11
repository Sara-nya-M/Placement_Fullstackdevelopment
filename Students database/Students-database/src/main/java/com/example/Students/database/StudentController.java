package com.example.Students.database;

import jakarta.persistence.GeneratedValue;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {
    private final StudentService service;
    public StudentController( StudentService service){
        this.service=service;
    }
    @PostMapping("/{sid}/{studentname}/{cid}")
    public Student addStudent(@PathVariable int sid , @PathVariable String studentname , @PathVariable int cid){
        return service.addStudent(sid,studentname,cid);
    }
    @GetMapping
    public List<Student> getStudent(){
        return service.getStudent();
    }
}
