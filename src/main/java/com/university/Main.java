package com.university;

import com.university.service.UniversityService;
import com.university.model.Student;
import com.university.model.Course;
import com.university.ui.ConsoleUI;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        UniversityService service = new UniversityService();
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== Заполнение тестовых данных ===");
        initializeTestData(service, scanner);
        
        ConsoleUI ui = new ConsoleUI(service);
        ui.start();
        scanner.close();
    }
    
    private static void initializeTestData(UniversityService service, Scanner scanner) {
        System.out.print("Введите количество курсов для добавления: ");
        int courseCount = scanner.nextInt();
        scanner.nextLine(); // очистка буфера
        
        for (int i = 1; i <= courseCount; i++) {
            System.out.println("\n--- Курс " + i + " ---");
            System.out.print("Название курса: ");
            String courseName = scanner.nextLine();
            
            System.out.print("ФИО преподавателя: ");
            String teacherName = scanner.nextLine();
            
            Course course = new Course(courseName, teacherName);
            
            System.out.print("Количество студентов на курсе: ");
            int studentCount = scanner.nextInt();
            scanner.nextLine(); // очистка буфера
            
            for (int j = 1; j <= studentCount; j++) {
                System.out.println("Студент " + j + ":");
                System.out.print("  ФИО студента: ");
                String studentName = scanner.nextLine();
                
                course.addStudent(new Student(j, studentName, courseName));
            }
            
            service.addCourse(course);
            System.out.println("Курс '" + courseName + "' добавлен!");
        }
        
        System.out.println("\n? Тестовые данные заполнены!");
    }
}