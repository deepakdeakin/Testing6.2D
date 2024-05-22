package sit707_tasks;

import java.util.HashMap;
import java.util.Map;

public class TaskAlignmentManager {
    private Map<String, Map<String, Integer>> taskAlignments;

    public TaskAlignmentManager() {
        this.taskAlignments = new HashMap<>();
    }

    public void alignTask(String taskName, String learningOutcome, int alignmentStrength) {
        taskAlignments.computeIfAbsent(taskName, k -> new HashMap<>()).put(learningOutcome, alignmentStrength);
        System.out.println("Task aligned successfully!");
    }

    public Map<String, Integer> viewTaskAlignments(String taskName) {
        return taskAlignments.getOrDefault(taskName, new HashMap<>());
    }

    public void updateTaskAlignment(String taskName, String learningOutcome, int alignmentStrength) {
        if (taskAlignments.containsKey(taskName) && taskAlignments.get(taskName).containsKey(learningOutcome)) {
            taskAlignments.get(taskName).put(learningOutcome, alignmentStrength);
            System.out.println("Task alignment updated successfully!");
        } else {
            System.out.println("Task or learning outcome not found!");
        }
    }

    public void deleteTaskAlignment(String taskName, String learningOutcome) {
        if (taskAlignments.containsKey(taskName) && taskAlignments.get(taskName).remove(learningOutcome) != null) {
            System.out.println("Task alignment deleted successfully!");
        } else {
            System.out.println("Task or learning outcome not found!");
        }
    }
}