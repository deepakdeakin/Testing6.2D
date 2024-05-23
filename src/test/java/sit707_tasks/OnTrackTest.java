package sit707_tasks;

import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.*;

public class OnTrackTest {

    @Test
    public void testTaskCompletionStatus() {
        Task task = new Task("Assignment", "Pass");
        assertFalse(task.isCompleted());
        task.setCompleted(true);
        assertTrue(task.isCompleted());
    }

    @Test
    public void testTaskBoundaryConditions() {
        Task emptyTask = new Task("", "");
        assertFalse(emptyTask.isCompleted());

        Task nullTask = new Task(null, null);
        assertFalse(nullTask.isCompleted());
    }

    @Test
    public void testTaskInverseRelationships() {
        Task inverseTask = new Task("Exam", "Distinction");
        inverseTask.setCompleted(true);
        assertTrue(inverseTask.isCompleted());
        inverseTask.setCompleted(false);
        assertFalse(inverseTask.isCompleted());
    }

    @Test
    public void testTaskCrossCheckResults() {
        Task crossCheckTask = new Task("Lab Report", "Credit");
        assertFalse(crossCheckTask.isCompleted());
        crossCheckTask.setCompleted(true);
        assertTrue(crossCheckTask.isCompleted());
    }

    @Test
    public void testTaskErrorConditions() {
        Task nonExistentTask = new Task("Presentation", "High Distinction");
        assertFalse(nonExistentTask.isCompleted());

        Task nullTask = new Task(null, null);
        assertFalse(nullTask.isCompleted());
    }

    @Test
    public void testTaskWithLongTitleAndGrade() {
        Task task = new Task("Very long assignment title that exceeds normal length", "Pass with High Distinction");
        assertFalse(task.isCompleted());
    }

    @Test
    public void testTaskCompletionStatusToggle() {
        Task task = new Task("Assignment", "Pass");
        task.setCompleted(true);
        assertTrue(task.isCompleted());
        task.setCompleted(false);
        assertFalse(task.isCompleted());
    }

    @Test
    public void testUnitInformation() {
        Unit unit = new Unit("COMP101", "Introduction to Programming");
        assertEquals("COMP101", unit.getUnitCode());
        assertEquals("Introduction to Programming", unit.getUnitName());

        Unit emptyUnit = new Unit("", "");
        assertEquals("", emptyUnit.getUnitCode());
        assertEquals("", emptyUnit.getUnitName());

        Unit nullUnit = new Unit(null, null);
        assertNull(nullUnit.getUnitCode());
        assertNull(nullUnit.getUnitName());
    }

    @Test
    public void testUnitWithSpecialCharacters() {
        Unit unit = new Unit("COMP!@#", "Intro to Pr0gr@mming");
        assertEquals("COMP!@#", unit.getUnitCode());
        assertEquals("Intro to Pr0gr@mming", unit.getUnitName());
    }

    @Test
    public void testUnitCodeChange() {
        Unit unit = new Unit("COMP101", "Introduction to Programming");
        unit.setUnitCode("COMP102");
        assertEquals("COMP102", unit.getUnitCode());
    }

    @Test
    public void testTutorialInformation() {
        Tutorial tutorial = new Tutorial("LA1", "Room 101", "Monday", "9:00 AM", "John Doe");
        assertEquals("LA1", tutorial.getAbbreviation());
        assertEquals("Room 101", tutorial.getLocation());
        assertEquals("Monday", tutorial.getDay());
        assertEquals("9:00 AM", tutorial.getTime());
        assertEquals("John Doe", tutorial.getTutor());

        Tutorial emptyTutorial = new Tutorial("", "", "", "", "");
        assertEquals("", emptyTutorial.getAbbreviation());
        assertEquals("", emptyTutorial.getLocation());
        assertEquals("", emptyTutorial.getDay());
        assertEquals("", emptyTutorial.getTime());
        assertEquals("", emptyTutorial.getTutor());

        Tutorial nullTutorial = new Tutorial(null, null, null, null, null);
        assertNull(nullTutorial.getAbbreviation());
        assertNull(nullTutorial.getLocation());
        assertNull(nullTutorial.getDay());
        assertNull(nullTutorial.getTime());
        assertNull(nullTutorial.getTutor());
    }

    @Test
    public void testTutorialWithDifferentDaysAndTimes() {
        Tutorial tutorial = new Tutorial("LA2", "Room 102", "Tuesday", "10:00 AM", "Jane Smith");
        assertEquals("Tuesday", tutorial.getDay());
        assertEquals("10:00 AM", tutorial.getTime());
    }

    @Test
    public void testTutorialLocationChange() {
        Tutorial tutorial = new Tutorial("LA1", "Room 101", "Monday", "9:00 AM", "John Doe");
        tutorial.setLocation("Room 202");
        assertEquals("Room 202", tutorial.getLocation());
    }

    @Test
    public void testStaffInformation() {
        Staff staff = new Staff("John Doe", "Tutor");
        assertEquals("John Doe", staff.getName());
        assertEquals("Tutor", staff.getRole());

        Staff emptyStaff = new Staff("", "");
        assertEquals("", emptyStaff.getName());
        assertEquals("", emptyStaff.getRole());

        Staff nullStaff = new Staff(null, null);
        assertNull(nullStaff.getName());
        assertNull(nullStaff.getRole());
    }

    @Test
    public void testStaffWithDifferentRoles() {
        Staff staff = new Staff("Alice Johnson", "Lecturer");
        assertEquals("Alice Johnson", staff.getName());
        assertEquals("Lecturer", staff.getRole());
    }

    @Test
    public void testStaffNameChange() {
        Staff staff = new Staff("John Doe", "Tutor");
        staff.setName("Jonathan Doe");
        assertEquals("Jonathan Doe", staff.getName());
    }

    @Test
    public void testManageLearningOutcomes() {
        LearningOutcome outcome1 = new LearningOutcome("Critical Thinking");
        LearningOutcome outcome2 = new LearningOutcome("Problem Solving");

        List<LearningOutcome> outcomes = new ArrayList<>();
        outcomes.add(outcome1);
        outcomes.add(outcome2);

        assertEquals(2, outcomes.size());
        assertTrue(outcomes.contains(outcome1));
        assertTrue(outcomes.contains(outcome2));

        LearningOutcome emptyOutcome = new LearningOutcome("");
        outcomes.add(emptyOutcome);
        assertEquals(3, outcomes.size());
        assertTrue(outcomes.contains(emptyOutcome));

        outcomes.remove(outcome1);
        assertEquals(2, outcomes.size());
        assertFalse(outcomes.contains(outcome1));
        assertTrue(outcomes.contains(outcome2));

        assertFalse(outcomes.remove(new LearningOutcome("Nonexistent")));

        LearningOutcome nullOutcome = new LearningOutcome(null);
        outcomes.add(nullOutcome);
        assertEquals(3, outcomes.size());
        assertTrue(outcomes.contains(nullOutcome));
    }

    @Test
    public void testLearningOutcomeWithSpecialCharacters() {
        LearningOutcome outcome = new LearningOutcome("Creat!vity & Innov@tion");
        List<LearningOutcome> outcomes = new ArrayList<>();
        outcomes.add(outcome);
        assertTrue(outcomes.contains(outcome));
    }

    @Test
    public void testLearningOutcomeAdditionAndRemoval() {
        LearningOutcome outcome1 = new LearningOutcome("Teamwork");
        LearningOutcome outcome2 = new LearningOutcome("Communication");
        List<LearningOutcome> outcomes = new ArrayList<>();
        outcomes.add(outcome1);
        outcomes.add(outcome2);

        outcomes.remove(outcome1);
        assertEquals(1, outcomes.size());
        assertFalse(outcomes.contains(outcome1));
        assertTrue(outcomes.contains(outcome2));
    }
}