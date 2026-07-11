package com.example.Studentprofiledemo;

import org.apache.catalina.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    @PostMapping("/students")
    public UseProfile addStudent(@RequestBody UseProfile student){
        return student;
    }
}
