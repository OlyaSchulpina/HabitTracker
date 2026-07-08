package model;

import java.time.LocalDate;

public class Habit{
    private int id;
    private String name;
    private boolean status = false;
    /* как-то сделать статус для каждого дня в отдельности*/
    private int track = 0;
    private LocalDate start = LocalDate.now();

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    public int getTrack(){
        return LocalDate.now().compareTo(start)+1;
    }
    public LocalDate getStart(){
        return start;
    }
    public void setStart(LocalDate start){
        this.start = start;
    }
}