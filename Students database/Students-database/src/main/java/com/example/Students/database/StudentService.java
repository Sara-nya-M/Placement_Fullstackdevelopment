package com.example.Students.database;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {
    private List<Student> student = new ArrayList<>();
    public Student addStudent(int sid,String studentname,int cid){
        Student s = new Student (sid,studentname,cid);
        student.add(s);
        return s;

    }
    public List<Student> getStudent(){
        return student;
    }
}
