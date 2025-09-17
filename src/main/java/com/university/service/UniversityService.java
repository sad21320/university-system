package com.university.service;

import com.university.model.Student;
import com.university.model.Course;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class UniversityService {
    private List<Course> courses;
    
    public UniversityService() {
        this.courses = new ArrayList<>();
    }
    
    public void addCourse(Course course) {
        courses.add(course);
    }
    
    public List<Student> findStudentsByCourse(String courseName) {
        return courses.stream()
                .filter(course -> course.getName().equalsIgnoreCase(courseName))
                .flatMap(course -> course.getStudents().stream())
                .collect(Collectors.toList());
    }
    
    public List<Course> filterCoursesByStudentCount(int minStudents) {
        return courses.stream()
                .filter(course -> course.getStudentCount() >= minStudents)
                .collect(Collectors.toList());
    }
}