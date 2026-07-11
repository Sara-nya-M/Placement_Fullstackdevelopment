package com.example.repo;
import java.util.ArrayList;
import java.util.List;
public class StudentRepository {
    private final List<Student>  students = new ArrayList<>();
    public List<Student>findAll(){
        return students;
    }
    public void save(Student s){
        students.add(s);
    }
}
