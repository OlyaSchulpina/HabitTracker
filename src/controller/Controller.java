package controller;

import model.Habit;
import service.HabitService;
import repository.HabitRepository;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Controller {
    public static void main(String[] args) {

        while (true){
            System.out.println("===Habit Tracker Menu===");
            System.out.println("1. Show all habits");
            System.out.println("2. Tick a habit ");
            System.out.println("3. Create new habit");
            System.out.println("4. End session");
            Scanner scanner = new Scanner(System.in);
            int switcher = scanner.nextInt();
            switch (switcher){
                case 1:
                    for (int i = 0; i<habits.toArray().length; i++){
                        System.out.println(i+1+". "+habits.get(i).getName());
                    }
                    break;
                case 2:
                    System.out.println("Choose a habit");
                    for (int i = 0; i<habits.toArray().length; i++){
                        System.out.println(i+1+". "+habits.get(i).getName());
                    }
                    break;
                case 3:

            }
        }
    }
}
