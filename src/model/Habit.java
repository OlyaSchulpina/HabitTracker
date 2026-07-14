package model;

import java.time.LocalDate;

public class Habit{
    private long id;
    private String name;
    private String description;
    private LocalDate createdAt = LocalDate.now();
    private int streak;



    public String getName() {
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setId(long id) {
        this.id = id;
    }
    public void incrementStreak(){
        streak++;
    }
    public int getStreak(){
        return streak;
    }
    public void setStreak(int streak){
        this.streak = streak;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}