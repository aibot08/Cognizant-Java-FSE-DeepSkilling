package task;

public class TaskManagementSystem {

    private Task head;

    public void addTask(int id, String name, String status) {

        Task newTask = new Task(id, name, status);

        if (head == null) {
            head = newTask;
            return;
        }

        Task temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newTask;
    }

    public void searchTask(int id) {

        Task temp = head;

        while (temp != null) {

            if (temp.taskId == id) {

                System.out.println("Task Found");
                System.out.println("Task ID : " + temp.taskId);
                System.out.println("Task Name : " + temp.taskName);
                System.out.println("Status : " + temp.status);
                return;
            }

            temp = temp.next;
        }

        System.out.println("Task Not Found");
    }

    public void displayTasks() {

        Task temp = head;

        while (temp != null) {

            System.out.println("Task ID : " + temp.taskId);
            System.out.println("Task Name : " + temp.taskName);
            System.out.println("Status : " + temp.status);
            System.out.println("----------------------");

            temp = temp.next;
        }
    }

    public void deleteTask(int id) {

        if (head == null)
            return;

        if (head.taskId == id) {

            head = head.next;
            System.out.println("Task Deleted Successfully!");
            return;
        }

        Task temp = head;

        while (temp.next != null && temp.next.taskId != id) {
            temp = temp.next;
        }

        if (temp.next != null) {

            temp.next = temp.next.next;
            System.out.println("Task Deleted Successfully!");

        } else {

            System.out.println("Task Not Found");
        }
    }
}