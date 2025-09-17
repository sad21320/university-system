package com.university;

import com.university.service.UniversityService;
import com.university.ui.ConsoleUI;

public class Main {
    public static void main(String[] args) {
        UniversityService service = new UniversityService();
        ConsoleUI ui = new ConsoleUI(service);
        ui.start();
    }
}