package repository;

import model.Habit;
import service.HabitService;

import java.util.ArrayList;
import java.util.List;

public class HabitRepository {
    List<Habit> habits = new ArrayList<>();
    private HabitRepository(List<Habit> habits){
        this.habits = habits;
    }

}
