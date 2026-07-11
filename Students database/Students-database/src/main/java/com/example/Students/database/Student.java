package com.example.Students.database;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int sid;
    private String studentname ;
    private int cid;
    public Student(){};
    public Student(int sid , String studentname,int cid){
        this.sid=sid;
        this.studentname=studentname;
        this.cid=cid;
    }
    public int getSidd(){
        return sid;
    }
    public void setSid(int id){
        this.sid = id;
    }
    public String getStudentname(){
        return studentname;
    }
    public void setStudentname(String studentname){
        this.studentname=studentname;
    }
    public int getCid(){
        return cid;
    }
    public void setCid(int cid){
        this.cid = cid;
    }
}
