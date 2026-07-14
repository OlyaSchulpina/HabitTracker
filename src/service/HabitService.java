package service;

import model.Habit;
import repository.HabitRepository;

import java.util.Map;

public class HabitService {

    private final HabitRepository repo;

    public HabitService(HabitRepository repo) {
        this.repo = repo;
    }


    public void addHabit(String name, String description){
        Habit habit = new Habit();
        habit.setName(name);
        habit.setDescription(description);
        repo.addHabit(habit);
    }

    public Map<Long, Habit> getAllHabit(){
        return repo.getHabits();
    }

    public Habit getHabitById(long id){
        return repo.searchById(id);
    }

    public Habit getHabitNyName(String name){
        return repo.searchByName(name);
    }

    public void updateHabit(long id, String name, String description){
        Habit habit = repo.searchById(id);
        habit.setName(name);
        habit.setDescription(description);
        repo.updateHabit(id,habit);
    }

    public void deleteHabit(long id){
        repo.deleteHabit(id);
    }
}
