package model;

import java.time.LocalDate;
import java.util.UUID;

public class HabitRecord {
    private String id;
    private String habitId;
    private LocalDate doneDate;

    public HabitRecord(){
        this.id = UUID.randomUUID().toString();
    }
}
