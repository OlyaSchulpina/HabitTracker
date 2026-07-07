package controller;

import java.util.Scanner;

public class Controller {
    public static void main(String[] args) {

        while (true){
            System.out.println("===Habit Tracker Menu===");
            System.out.println("1. Show all habits");
            System.out.println("2. Tick a habit ");
            System.out.println("3. End session");
            Scanner scanner = new Scanner(System.in);
            int switcher = scanner.nextInt();
            switch (switcher){
                case 1:
                    System.out.println("There will be all habits");
                    break;
                case 2:
                    System.out.println("It will habit's page");
                    break;
                case 3:
                    break; /* нужно подумать как прервать выполнение программы*/
            }
        }
    }
}
