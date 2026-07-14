import controller.Controller;
import repository.HabitRepository;
import service.HabitService;
import service.TrackerService;

public class Main {
    public static void main(String[] args) {
        HabitRepository repo = HabitRepository.getInstance();
        HabitService service = new HabitService(repo);
        TrackerService tservice = new TrackerService(repo);
        Controller controller = new Controller(service,tservice);
        controller.go();

    }
}
