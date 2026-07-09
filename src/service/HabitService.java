package service;

import model.Habit;

import java.util.List;

public class HabitService {

    public void addHabit(List<Habit> habits, Habit habit){
        habits.add(habit);
    }
    public List<Habit> getHabits(List<Habit> habits){
        return habits;
    }
    /* как-то реализовать update */
    public void deleteHabit(List<Habit> habits, Habit habit){
        String habitName = habit.getName();
        int habitIndex = 0;
        for (int i = 0; i < habits.toArray().length; i++){
            Habit arrHabit = habits.get(i);
            if (arrHabit.getName().equals(habitName)){
                habitIndex = i;
            }
        }
        habits.remove(habitIndex);
    }
}
