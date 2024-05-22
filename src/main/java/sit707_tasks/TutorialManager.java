package sit707_tasks;

import java.util.ArrayList;
import java.util.List;

public class TutorialManager {
    private List<Tutorial> tutorials;

    public TutorialManager() {
        this.tutorials = new ArrayList<>();
    }

    public void createTutorial(String abbreviation, String location, String day, String time, String tutor) {
        tutorials.add(new Tutorial(abbreviation, location, day, time, tutor));
        System.out.println("Tutorial created successfully!");
    }

    public List<Tutorial> viewTutorials() {
        return tutorials;
    }

    public void updateTutorial(int index, String abbreviation, String location, String day, String time, String tutor) {
        if (index >= 0 && index < tutorials.size()) {
            Tutorial tutorial = tutorials.get(index);
            tutorial.setAbbreviation(abbreviation);
            tutorial.setLocation(location);
            tutorial.setDay(day);
            tutorial.setTime(time);
            tutorial.setTutor(tutor);
            System.out.println("Tutorial updated successfully!");
        } else {
            System.out.println("Invalid index!");
        }
    }

    public void deleteTutorial(int index) {
        if (index >= 0 && index < tutorials.size()) {
            tutorials.remove(index);
            System.out.println("Tutorial deleted successfully!");
        } else {
            System.out.println("Invalid index!");
        }
    }
}
