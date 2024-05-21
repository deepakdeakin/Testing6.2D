package sit707_tasks;

import java.util.ArrayList;
import java.util.List;

public class GradeProgressTracker {
    private String studentId;
    private List<Task> tasks;
    private UserInputProvider userInputProvider; // Interface for providing user input

    public GradeProgressTracker(String studentId, UserInputProvider userInputProvider) {
        this.studentId = studentId;
        this.tasks = new ArrayList<>();
        this.userInputProvider = userInputProvider;
    }

    // Add a task with user input
    public void addTask() {
        System.out.println("Enter task name:");
        String name = userInputProvider.getUserInput().trim(); // Remove leading and trailing whitespace
        System.out.println("Enter task grade category (Pass/Credit/Distinction/High Distinction):");
        String gradeCategory = userInputProvider.getUserInput().trim(); // Remove leading and trailing whitespace
        Task task = new Task(name, gradeCategory);
        tasks.add(task);
        System.out.println("Task added successfully!");
    }

    public void completeTask(String taskName) {
        boolean taskFound = false;
        for (Task task : tasks) {
            if (task.getName().equals(taskName)) {
                task.setCompleted(true);
                taskFound = true;
                System.out.println("Task '" + taskName + "' completed!");
                break;
            }
        }
        if (!taskFound) {
            System.out.println("Task not found!");
        }
    }

    // Display all tasks
    public void displayTasks() {
        System.out.println("Tasks for student " + studentId + ":");
        for (Task task : tasks) {
            System.out.println(task.getName() + " - Grade Category: " + task.getGradeCategory() + " - Completed: " + task.isCompleted());
        }
    }

    public List<Task> getTasks() {
        return tasks;
    }
}
