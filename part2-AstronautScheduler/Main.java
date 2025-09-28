// Main.java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TaskFactory factory = new TaskFactory();
        ScheduleManager manager = ScheduleManager.getInstance();
        manager.addObserver(new ConflictObserver());

        boolean isRunning = true;

        while (isRunning) {
            System.out.println("\n1. Add Task\n2. Remove Task\n3. View Tasks\n4. Exit");
            System.out.print("Choose an option: ");
            String choice = sc.nextLine();

            switch (choice) {
                case "1":
                    System.out.print("Description: ");
                    String desc = sc.nextLine();
                    System.out.print("Start time (HH:mm): ");
                    String start = sc.nextLine();
                    System.out.print("End time (HH:mm): ");
                    String end = sc.nextLine();
                    System.out.print("Priority (High/Medium/Low): ");
                    String priority = sc.nextLine();

                    try {
                        Task t = factory.createTask(desc, start, end, priority);
                        manager.addTask(t);
                    } catch (Exception e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;

                case "2":
                    System.out.print("Task Description to remove: ");
                    String removeDesc = sc.nextLine();
                    manager.removeTask(removeDesc);
                    break;

                case "3":
                    manager.viewTasks();
                    break;

                case "4":
                    isRunning = false;
                    System.out.println("Exiting application.");
                    break;

                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
        sc.close();
    }
}

