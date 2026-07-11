package com.example.repo;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("/students")
public class StudentController {
    private final StudentRepository repo = new StudentRepository();
    @GetMapping
    public List<Student> getStudents(){
        return repo.findAll();
    }
    @PostMapping
    public Student addStudent(@RequestBody Student s){
        repo.save(s);
        return s;
    }
}
