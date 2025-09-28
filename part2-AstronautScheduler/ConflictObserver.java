// ConflictObserver.java
import java.util.List;

public class ConflictObserver implements Observer {

    @Override
    public void notify(Task newTask, List<Task> existingTasks) {
        for (Task t : existingTasks) {
            if (isOverlap(newTask, t)) {
                System.out.println("Error: Task conflicts with existing task \"" + t.getDescription() + "\"");
            }
        }
    }

    private boolean isOverlap(Task t1, Task t2) {
        try {
            java.time.LocalTime start1 = java.time.LocalTime.parse(t1.getStartTime());
            java.time.LocalTime end1 = java.time.LocalTime.parse(t1.getEndTime());
            java.time.LocalTime start2 = java.time.LocalTime.parse(t2.getStartTime());
            java.time.LocalTime end2 = java.time.LocalTime.parse(t2.getEndTime());

            return start1.isBefore(end2) && end1.isAfter(start2);
        } catch (Exception e) {
            System.out.println("Error: Invalid time format.");
            return false;
        }
    }
}
