public class Main {
    public static void main(String[] args) {
        TaskManager taskManager = new TaskManager();

        // Creating tasks
        Task task1 = new Task(1, "Complete homework");
        Task task2 = new Task(2, "Read a book");
        Task task3 = new Task(3,"Make coffee");
        Task task4 = new Task(4, "Go outside for a walk");

        // Adding tasks to the task manager
        taskManager.addTask(task1);
        taskManager.addTask(task2);
        taskManager.addTask(task3);
        taskManager.addTask(task4);

        // Displaying tasks
        System.out.println("Tasks:");
        taskManager.displayTasks();
    }
}