package com.example.Students.database;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/course")
public class CourseController {
    private final CourseService service;
    public CourseController(CourseService service){
        this.service=service;
    }
    @PostMapping("/{cid}/{coursename}/{sid}")
    public Course addCourse(@PathVariable int cid , @PathVariable String coursename , @PathVariable int sid){
        return service.addCourse(cid,coursename,sid);
    }
    @GetMapping
    public List<Course> getCourse(){
        return service.getCourse();
    }

}
