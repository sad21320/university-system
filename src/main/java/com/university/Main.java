package com.university;

import com.university.service.UniversityService;
import com.university.model.Student;
import com.university.model.Course;
import com.university.ui.ConsoleUI;

public class Main {
    public static void main(String[] args) {
        UniversityService service = new UniversityService();
        
        System.out.println("=== Заполнение тестовых данных ===");
        initializeTestData(service);
        
        ConsoleUI ui = new ConsoleUI(service);
        ui.start();
    }
    
    private static void initializeTestData(UniversityService service) {
    Course mathCourse = new Course("Mathematics", "Ivanov I.I.");
    mathCourse.addStudent(new Student(1, "Petrov A.A.", "Mathematics"));
    mathCourse.addStudent(new Student(2, "Sidorova B.B.", "Mathematics"));
    
    Course physicsCourse = new Course("Physics", "Petrov P.P.");
    physicsCourse.addStudent(new Student(3, "Ivanov V.V.", "Physics"));
    physicsCourse.addStudent(new Student(4, "Kuznetsova G.G.", "Physics"));
    physicsCourse.addStudent(new Student(5, "Nikolaev D.D.", "Physics"));
    
    Course programmingCourse = new Course("Programming", "Sidorov S.S.");
    programmingCourse.addStudent(new Student(6, "Alekseev E.E.", "Programming"));
    
    service.addCourse(mathCourse);
    service.addCourse(physicsCourse);
    service.addCourse(programmingCourse);
    
    System.out.println("✅ Test data loaded automatically!");
}
}