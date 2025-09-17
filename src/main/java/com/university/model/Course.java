package com.university.model;

import java.util.ArrayList;
import java.util.List;

public class Course {
    private String name;
    private String teacher;
    private List<Student> students;
    
    public Course(String name, String teacher) {
        this.name = name;
        this.teacher = teacher;
        this.students = new ArrayList<>();
    }
    
    public void addStudent(Student student) {
        students.add(student);
    }
    
    public String getName() { return name; }
    public String getTeacher() { return teacher; }
    public List<Student> getStudents() { return students; }
    public int getStudentCount() { return students.size(); }
}