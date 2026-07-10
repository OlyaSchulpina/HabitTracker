package model;

import java.time.LocalDate;
import java.util.UUID;

public class Habit{
    private long id;
    private String name;
    private String description;
    private LocalDate createdAt = LocalDate.now();
    /*как реализовать поле HabitRecords*/



    public String getName() {
        return name;
    }

    public void setId(long id) {
        this.id = id;
    }
}