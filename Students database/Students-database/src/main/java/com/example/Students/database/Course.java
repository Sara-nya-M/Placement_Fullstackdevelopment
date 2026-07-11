package com.example.Students.database;

public class Course {
    private int cid;
    private String coursename ;
    private int sid;
    public Course(int cid,String coursename,int sid){
        this.cid=cid;
        this.coursename=coursename;
        this.sid=sid;
    }
    public int getCid(){
        return cid;
    }
    public void setCid(int cid) {
        this.cid = cid;
    }
    public String getCoursename() {
        return coursename;
    }
    public void setCoursename(String coursename) {
        this.coursename = coursename;
    }
    public int getSid() {
        return sid;
    }
    public void setSid(int sid) {
        this.sid = sid;
    }

}
