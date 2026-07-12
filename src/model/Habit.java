package model;

import java.time.LocalDate;

public class Habit{
    private long id;
    private String name;
    private String description;
    private LocalDate createdAt = LocalDate.now();
    /*как реализовать поле HabitRecords*/



    public String getName() {
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setId(long id) {
        this.id = id;
    }


    public void setDescription(String description) {
        this.description = description;
    }
}