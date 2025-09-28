// Observer.java
public interface Observer {
    void notify(Task newTask, java.util.List<Task> existingTasks);
}
