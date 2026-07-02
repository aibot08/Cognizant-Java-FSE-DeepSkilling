package task;

public class Main {

    public static void main(String[] args) {

        TaskManagementSystem task = new TaskManagementSystem();

        task.addTask(101, "Complete Java", "Pending");
        task.addTask(102, "Submit Assignment", "Completed");
        task.addTask(103, "Practice DSA", "Pending");

        System.out.println("===== Task List =====");
        task.displayTasks();

        System.out.println("\n===== Search Task =====");
        task.searchTask(102);

        System.out.println("\n===== Delete Task =====");
        task.deleteTask(102);

        System.out.println("\n===== After Delete =====");
        task.displayTasks();
    }
}
