package com.university.ui;

import com.university.service.UniversityService;
import com.university.model.Student;
import java.util.List;
import java.util.Scanner;

public class ConsoleUI {
    private UniversityService universityService;
    private Scanner scanner;
    
    public ConsoleUI(UniversityService universityService) {
        this.universityService = universityService;
        this.scanner = new Scanner(System.in);
    }
    
    public void start() {
        System.out.println("=== University System ===");
        System.out.println("1. Find students by course");
        System.out.println("2. Filter courses by student count");
        System.out.println("3. Exit");
    }
    
    private void findStudentsByCourse() {
        System.out.print("Enter course name: ");
        String courseName = scanner.nextLine();
        List<Student> students = universityService.findStudentsByCourse(courseName);
        System.out.println("Students: " + students);
    }
}