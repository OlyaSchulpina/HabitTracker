package controller;

import model.Habit;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Controller {
    public static void main(String[] args) {
        Habit habit1 = new Habit();
        habit1.setName("Doing Java Code");
        habit1.setStart(LocalDate.of(2026,7,6));
        Habit habit2 = new Habit();
        habit2.setName("Swimming session");
        habit2.setStart(LocalDate.of(2026,7,4));
        List<Habit> habits = new ArrayList<>();
        habits.add(habit1);
        habits.add(habit2);

        while (true){
            System.out.println("===Habit Tracker Menu===");
            System.out.println("1. Show all habits");
            System.out.println("2. Tick a habit ");
            System.out.println("3. End session");
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
                    int chosenhabit = scanner.nextInt();
                    habits.get(chosenhabit-1).setStatus(true);
                    System.out.println("Habit is ticked. Current track is "+habits.get(chosenhabit-1).getTrack());
                    break;
                case 3:
                    break; /* нужно подумать как прервать выполнение программы*/
            }
        }
    }
}
