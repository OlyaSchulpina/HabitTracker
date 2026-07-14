package controller;

import model.Habit;
import service.HabitService;
import repository.HabitRepository;
import service.TrackerService;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Controller {
    private final HabitService service;
    Scanner scanner = new Scanner(System.in);
    private final TrackerService tservice;
    public Controller(HabitService habitService, TrackerService tservice){
        this.service = habitService;
        this.tservice = tservice;
    }
    public void printMenu(){
        System.out.println("==HabitTracker Menu==");
        System.out.println("1. Mark Habit As Done");
        System.out.println("2. Get Habit Streak");
        System.out.println("3. Delete Habit");
        System.out.println("4. Add New Habit");
        System.out.println("5. Exit");
    }
    public void go(){
        printMenu();
        while(true){
            int choice = scanner.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Enter Habit ID");
                    int id = scanner.nextInt();
                    tservice.markHabitDone(id);
                    break;
                case 2:
                    int id1 = scanner.nextInt();
                    System.out.println("Current Streak: "+service.getHabitById(id1).getStreak());
                    break;
                case 3:
                    int id2 = scanner.nextInt();
                    service.deleteHabit(id2);
                    break;
                case 4:
                    String name = scanner.nextLine();
                    String description = scanner.nextLine();
                    service.addHabit(name,description);
                    System.out.println(service.getAllHabit());
                    break;
                case 5:
                    System.out.println("Good luck!");
                    return;
            }
            printMenu();
        }
    }
}
