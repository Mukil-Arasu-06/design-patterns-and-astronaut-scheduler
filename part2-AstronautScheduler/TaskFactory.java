// TaskFactory.java
public class TaskFactory {
    public Task createTask(String desc, String start, String end, String priority) {
        return new Task(desc, start, end, priority);
    }
}
