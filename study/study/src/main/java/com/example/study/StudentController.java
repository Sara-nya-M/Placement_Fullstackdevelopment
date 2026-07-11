package com.example.study;
import org.springframework.web.bind.annotation.*;
import java.security.PublicKey;
import java.util.ArrayList;
import java.util.List;
@RestController
@RequestMapping("/exam")
public class StudentController {
    private List<Student> students = new ArrayList<>();
    @GetMapping
    public List<Student> getStudents(){
        return students;
    }
    @PostMapping
    public Student addStudent(@RequestBody Student s){
        students.add(s);
        return s;
    }
}