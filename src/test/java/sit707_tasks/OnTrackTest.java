package sit707_tasks;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.*;

public class OnTrackTest {

    @Test
    public void testUpdateTaskCompletionStatus() {
        // Right
        Task task = new Task("Assignment", "Pass");
        assertFalse(task.isCompleted());
        task.setCompleted(true);
        assertTrue(task.isCompleted());

        // Boundary Conditions
        Task emptyTask = new Task("", "");
        assertFalse(emptyTask.isCompleted()); // Should remain false

        // Inverse Relationships
        Task inverseTask = new Task("Exam", "Distinction");
        assertTrue(inverseTask.isCompleted());
        inverseTask.setCompleted(false);
        assertFalse(inverseTask.isCompleted());

        // Cross-Check Results
        Task crossCheckTask = new Task("Lab Report", "Credit");
        assertFalse(crossCheckTask.isCompleted());
        crossCheckTask.setCompleted(true);
        assertTrue(crossCheckTask.isCompleted());

        // Error Conditions
        Task nonExistentTask = new Task("Presentation", "High Distinction");
        assertFalse(nonExistentTask.isCompleted()); // Task doesn't exist, should remain false
    }

    @Test
    public void testDisplayUnitInformation() {
        // Right
        Unit unit = new Unit("COMP101", "Introduction to Programming");
        assertEquals("COMP101", unit.getUnitCode());
        assertEquals("Introduction to Programming", unit.getUnitName());

        // Boundary Conditions
        Unit emptyUnit = new Unit("", "");
        assertEquals("", emptyUnit.getUnitCode());
        assertEquals("", emptyUnit.getUnitName());

        // Additional Boundary Conditions
        Unit nullUnit = new Unit(null, null);
        assertNull(nullUnit.getUnitCode());
        assertNull(nullUnit.getUnitName());
    }

    @Test
    public void testDisplayTutorialInformation() {
        // Right
        Tutorial tutorial = new Tutorial("LA1", "Room 101", "Monday", "9:00 AM", "John Doe");
        assertEquals("LA1", tutorial.getAbbreviation());
        assertEquals("Room 101", tutorial.getLocation());
        assertEquals("Monday", tutorial.getDay());
        assertEquals("9:00 AM", tutorial.getTime());
        assertEquals("John Doe", tutorial.getTutor());

        // Boundary Conditions
        Tutorial emptyTutorial = new Tutorial("", "", "", "", "");
        assertEquals("", emptyTutorial.getAbbreviation());
        assertEquals("", emptyTutorial.getLocation());
        assertEquals("", emptyTutorial.getDay());
        assertEquals("", emptyTutorial.getTime());
        assertEquals("", emptyTutorial.getTutor());

        // Additional Boundary Conditions
        Tutorial nullTutorial = new Tutorial(null, null, null, null, null);
        assertNull(nullTutorial.getAbbreviation());
        assertNull(nullTutorial.getLocation());
        assertNull(nullTutorial.getDay());
        assertNull(nullTutorial.getTime());
        assertNull(nullTutorial.getTutor());
    }

    @Test
    public void testDisplayStaffInformation() {
        // Right
        Staff staff = new Staff("John Doe", "Tutor");
        assertEquals("John Doe", staff.getName());
        assertEquals("Tutor", staff.getRole());

        // Boundary Conditions
        Staff emptyStaff = new Staff("", "");
        assertEquals("", emptyStaff.getName());
        assertEquals("", emptyStaff.getRole());

        // Additional Boundary Conditions
        Staff nullStaff = new Staff(null, null);
        assertNull(nullStaff.getName());
        assertNull(nullStaff.getRole());
    }

    @Test
    public void testManageLearningOutcomes() {
        // Right
        LearningOutcome outcome1 = new LearningOutcome("Critical Thinking");
        LearningOutcome outcome2 = new LearningOutcome("Problem Solving");

        List<LearningOutcome> outcomes = new ArrayList<>();
        outcomes.add(outcome1);
        outcomes.add(outcome2);

        assertEquals(2, outcomes.size());
        assertTrue(outcomes.contains(outcome1));
        assertTrue(outcomes.contains(outcome2));

        // Boundary Conditions
        LearningOutcome emptyOutcome = new LearningOutcome("");
        outcomes.add(emptyOutcome);
        assertEquals(3, outcomes.size());
        assertTrue(outcomes.contains(emptyOutcome));

        // Inverse Relationships
        outcomes.remove(outcome1);
        assertEquals(2, outcomes.size());
        assertFalse(outcomes.contains(outcome1));
        assertTrue(outcomes.contains(outcome2));

        // Error Conditions
        // No error conditions applicable

        // Additional Error Conditions
        assertFalse(outcomes.remove(new LearningOutcome("Nonexistent"))); // Trying to remove a non-existent outcome

        // Additional Boundary Conditions
        LearningOutcome nullOutcome = new LearningOutcome(null);
        outcomes.add(nullOutcome);
        assertEquals(3, outcomes.size());
        assertTrue(outcomes.contains(nullOutcome));
    }

    @Test
    public void testUpdateTaskCompletionStatusBoundary() {
        // Boundary Conditions
        Task emptyTask = new Task("", "");
        assertFalse(emptyTask.isCompleted()); // Should remain false

        // Additional Boundary Conditions
        Task nullTask = new Task(null, null);
        assertFalse(nullTask.isCompleted()); // Should remain false
    }

    @Test
    public void testUpdateTaskCompletionStatusInverse() {
        // Inverse Relationships
        Task inverseTask = new Task("Exam", "Distinction");
        assertTrue(inverseTask.isCompleted());
        inverseTask.setCompleted(false);
        assertFalse(inverseTask.isCompleted());

        // Additional Inverse Relationships
        Task nullTask = new Task(null, null);
        assertTrue(nullTask.isCompleted()); // Task with null values should be considered completed
        nullTask.setCompleted(false);
        assertFalse(nullTask.isCompleted()); // Setting it as incomplete should work
    }

    @Test
    public void testUpdateTaskCompletionStatusCrossCheck() {
        // Cross-Check Results
        Task crossCheckTask = new Task("Lab Report", "Credit");
        assertFalse(crossCheckTask.isCompleted());
        crossCheckTask.setCompleted(true);
        assertTrue(crossCheckTask.isCompleted());

        // Additional Cross-Check Results
        Task nullTask= new Task(null, null);
        assertFalse(nullTask.isCompleted()); // Task with null values should be considered completed
        nullTask.setCompleted(true);
        assertTrue(nullTask.isCompleted()); // Setting it as completed should work
    }

    @Test
    public void testUpdateTaskCompletionStatusError() {
        // Error Conditions
        Task nonExistentTask = new Task("Presentation", "High Distinction");
        assertFalse(nonExistentTask.isCompleted()); // Task doesn't exist, should remain false

        // Additional Error Conditions
        Task nullTask = new Task(null, null);
        assertFalse(nullTask.isCompleted()); // Task with null values should be considered completed
    }
}
