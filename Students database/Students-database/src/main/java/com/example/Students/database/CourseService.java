package com.example.Students.database;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseService {
    private List<Course> course = new ArrayList<>();

    public Course addCourse(int cid,String coursename,int sid){
        Course c = new Course(cid,coursename,sid);
        course.add(c);
        return c;
    }
    public List<Course> getCourse(){
        return course;
    }
}
