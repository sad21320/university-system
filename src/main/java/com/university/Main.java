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
        
        System.out.println("=== ���������� �������� ������ ===");
        initializeTestData(service, scanner);
        
        ConsoleUI ui = new ConsoleUI(service);
        ui.start();
        scanner.close();
    }
    
    private static void initializeTestData(UniversityService service, Scanner scanner) {
        System.out.print("������� ���������� ������ ��� ����������: ");
        int courseCount = scanner.nextInt();
        scanner.nextLine(); // ������� ������
        
        for (int i = 1; i <= courseCount; i++) {
            System.out.println("\n--- ���� " + i + " ---");
            System.out.print("�������� �����: ");
            String courseName = scanner.nextLine();
            
            System.out.print("��� �������������: ");
            String teacherName = scanner.nextLine();
            
            Course course = new Course(courseName, teacherName);
            
            System.out.print("���������� ��������� �� �����: ");
            int studentCount = scanner.nextInt();
            scanner.nextLine(); // ������� ������
            
            for (int j = 1; j <= studentCount; j++) {
                System.out.println("������� " + j + ":");
                System.out.print("  ��� ��������: ");
                String studentName = scanner.nextLine();
                
                course.addStudent(new Student(j, studentName, courseName));
            }
            
            service.addCourse(course);
            System.out.println("���� '" + courseName + "' ��������!");
        }
        
        System.out.println("\n? �������� ������ ���������!");
    }
}