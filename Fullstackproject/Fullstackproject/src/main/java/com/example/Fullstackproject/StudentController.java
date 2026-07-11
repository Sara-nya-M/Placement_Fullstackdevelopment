package com.example.Fullstackproject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentService service;
    @PostMapping
    public Student add(@RequestBody Student s){
        return service.save(s);
    }
    @GetMapping
    public List<Student> add(){
        return service.all();
    }
}
