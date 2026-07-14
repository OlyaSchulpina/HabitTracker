package service;

import model.Habit;
import model.HabitRecord;
import repository.HabitRepository;

import java.time.LocalDate;
import java.util.List;

public class TrackerService {
    private final HabitRepository repo;
    LocalDate today = LocalDate.now();

    public TrackerService(HabitRepository repo) {
        this.repo = repo;
    }

    public void markHabitDone(long id){
        Habit habit = repo.searchById(id);
        int currentStreak = habit.getStreak();
        if (isDoneToday(id)){
            System.out.println("Habit has already done today.");
        }
        if (isDoneYesterday(id)){
            habit.incrementStreak();
        }else{
            habit.setStreak(1);
        }
        repo.addRecord(id,today);

    }
    public boolean isDoneToday(long id){
        List<HabitRecord> records = repo.getAllRecords(id);
        for (HabitRecord record: records){
            if (record.getDoneDate(record.getId()).equals(today)){
                return true;
            }
        }
        return false;
    }
    public boolean isDoneYesterday(long id){
        LocalDate yesterday = today.minusDays(1);
        List<HabitRecord> records = repo.getAllRecords(id);
        for (HabitRecord record: records){
            if (record.getDoneDate(record.getId()).equals(yesterday)){
                return true;
            }
        }
        return false;
    }
    public int getTotalDone(long id){
        return repo.getAllRecords(id).toArray().length;
    }
}
