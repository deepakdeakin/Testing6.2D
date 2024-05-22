package sit707_tasks;

import java.util.ArrayList;
import java.util.List;

public class LearningOutcomeManager {
    private List<LearningOutcome> learningOutcomes;

    public LearningOutcomeManager() {
        this.learningOutcomes = new ArrayList<>();
    }

    public void addLearningOutcome(String outcomeDescription) {
        learningOutcomes.add(new LearningOutcome(outcomeDescription));
        System.out.println("Learning outcome added successfully!");
    }

    public List<LearningOutcome> viewLearningOutcomes() {
        return learningOutcomes;
    }

    public void updateLearningOutcome(int index, String newDescription) {
        if (index >= 0 && index < learningOutcomes.size()) {
            learningOutcomes.get(index).setDescription(newDescription);
            System.out.println("Learning outcome updated successfully!");
        } else {
            System.out.println("Invalid index!");
        }
    }

    public void deleteLearningOutcome(int index) {
        if (index >= 0 && index < learningOutcomes.size()) {
            learningOutcomes.remove(index);
            System.out.println("Learning outcome deleted successfully!");
        } else {
            System.out.println("Invalid index!");
        }
    }
}
