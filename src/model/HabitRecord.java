package model;

import java.time.LocalDate;

public class HabitRecord {
    private long id;
    private long habitId;
    private LocalDate doneDate;

    public HabitRecord(long habitId, LocalDate doneDate){
        this.habitId = habitId;
        this.doneDate = doneDate;
    }
    public HabitRecord(long id, long habitId, LocalDate doneDate){
        this.id = id;
        this.habitId = habitId;
        this.doneDate = doneDate;
    }
    public long getId(){
        return id;
    }

    public long getHabitId(){
        return habitId;
    }

    public LocalDate getDoneDate(long id){
        return doneDate;
    }
}
