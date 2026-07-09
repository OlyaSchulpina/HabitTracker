package model;

import java.time.LocalDate;
import java.util.UUID;

public class Habit{
    private String id;
    private String name;
    private String description;
    private LocalDate createdAt = LocalDate.now();
    /*как реализовать поле HabitRecords*/

    public Habit(String name, String description){
        this.id = UUID.randomUUID().toString();
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }


}