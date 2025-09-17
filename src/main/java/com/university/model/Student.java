package com.university.model;

public class Student {
    private int id;
    private String fullName;
    private String courseName;
    
    public Student(int id, String fullName, String courseName) {
        this.id = id;
        this.fullName = fullName;
        this.courseName = courseName;
    }
    
    public int getId() { return id; }
    public String getFullName() { return fullName; }
    public String getCourseName() { return courseName; }
    
    @Override
    public String toString() {
        return "Student{id=" + id + ", name='" + fullName + "', course='" + courseName + "'}";
    }
}