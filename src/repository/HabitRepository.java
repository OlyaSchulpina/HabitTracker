package repository;

import model.Habit;
import model.HabitRecord;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

public class HabitRepository {
    private static HabitRepository instance;

    private final Map<Long, Habit> habits = new HashMap<>();
    private final AtomicLong idGenerator = new AtomicLong(1);

    private final Map<Long, List<HabitRecord>> records = new HashMap<>();
    private final AtomicLong idRecordGenerator = new AtomicLong(1);

    private HabitRepository(){}

    public static HabitRepository getInstance(){
        if (instance==null){
            instance = new HabitRepository();
        }
        return instance;
    }

    public void addHabit(Habit habit){
        long newId = idGenerator.getAndIncrement();
        habit.setId(newId);
        habits.put(newId,habit);
        records.put(newId, new ArrayList<>());
    }
    /* выбросить исключение, когда id не существует */
    public Habit searchById(long id){
        return habits.get(id);
    }

    public Habit searchByName(String name){
        for (Long i : habits.keySet()){
            if(habits.get(i).getName().equals(name)) {
                return habits.get(i);
            }
        }
        return habits.get(1);
    }

    public Map<Long, Habit> getHabits(){
        return habits;
    }
    public Habit updateHabit(long id, Habit habit){
        habits.remove(id);
        habits.put(id,habit);
        return habit;
    }
    /* выбросить исключение, когда id не существует */
    public void deleteHabit(long id){
        habits.remove(id);
    }
    public List<HabitRecord> getAllRecords(long id){
        return records.get(id);
    }
    public void addRecord(long id, LocalDate date){
        List<HabitRecord> recordList = getAllRecords(id);
        HabitRecord habitRecord = new HabitRecord(id, date);
        recordList.add(habitRecord);
    }
}
