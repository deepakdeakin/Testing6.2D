package sit707_tasks;
import java.util.ArrayList;
import java.util.List;

public class TaskManager {
    private List<Task> tasks;

    public TaskManager() {
        this.tasks = new ArrayList<>();
    }

    public void createTask(String name, String gradeCategory) {
        tasks.add(new Task(name, gradeCategory));
        System.out.println("Task created successfully!");
    }

    public List<Task> viewTasks() {
        return tasks;
    }

    public void updateTask(int index, String name, String gradeCategory) {
        if (index >= 0 && index < tasks.size()) {
            Task task = tasks.get(index);
            task.setName(name);
            task.setGradeCategory(gradeCategory);
            System.out.println("Task updated successfully!");
        } else {
            System.out.println("Invalid index!");
        }
    }

    public void deleteTask(int index) {
        if (index >= 0 && index < tasks.size()) {
            tasks.remove(index);
            System.out.println("Task deleted successfully!");
        } else {
            System.out.println("Invalid index!");
        }
    }
}
