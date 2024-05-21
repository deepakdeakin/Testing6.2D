package sit707_tasks;
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.List;
import java.util.Scanner;

public class GradeProgressTrackerTest {

    private GradeProgressTracker tracker;
    private InputStream sysInBackup;

    @Before
    public void setUp() {
        // Backup System.in to restore it later
        sysInBackup = System.in;
        // Prepare a mock user input for testing
        String mockInput = "Test Task\nDistinction";
        ByteArrayInputStream in = new ByteArrayInputStream(mockInput.getBytes());
        System.setIn(in);
        // Create GradeProgressTracker instance for testing
        tracker = new GradeProgressTracker("TestStudent", new MockUserInputProvider(new Scanner(System.in)));
    }

    @After
    public void tearDown() {
        // Restore System.in
        System.setIn(sysInBackup);
    }

    @Test
    
    public void testAddTask() {
        tracker.addTask();
        List<Task> tasks = tracker.getTasks();
        assertEquals(1, tasks.size());
        Task task = tasks.get(0);
        assertEquals("Test Task", task.getName());
        assertEquals("Distinction", task.getGradeCategory());
        assertFalse(task.isCompleted());
    }

    @Test
    public void testCompleteTask() {
        tracker.addTask();
        // Simulate completion of the task "Test Task"
        tracker.completeTask("Test Task");
        List<Task> tasks = tracker.getTasks();
        assertFalse(tasks.isEmpty());
        Task task = tasks.get(0);
        assertNotNull(task);
        assertTrue(task.isCompleted());
    }
    
    @Test
   
    public void testDisplayTasks() {
        // Add a task first
        tracker.addTask();
        // Display tasks
        tracker.displayTasks(); // Just checking if it executes without errors
        // No assertions here as it just prints to console
    }

    @Test
    public void testCompleteTask_StatusNotSet() {
        // Add a task first
        tracker.addTask();
        // Do not actually complete the task
        List<Task> tasks = tracker.getTasks();
        assertFalse(tasks.isEmpty());
        Task task = tasks.get(0);
        assertNotNull(task);
        // The task completion status should still be false
        assertFalse("Task completion status should not be set without completing it", task.isCompleted());
    }
    
//    @Test
//    public void testCompleteTask_StatusNotSet1() {
//        // Add a task first
//        tracker.addTask();
//        // Do not actually complete the task
//        List<Task> tasks = tracker.getTasks();
//        assertFalse(tasks.isEmpty());
//        Task task = tasks.get(0);
//        assertNotNull(task);
//        // The task completion status should still be false, but we assert true to make the test fail
//        assertTrue("Task completion status should not be set without completing it", task.isCompleted());
//    }
}
