package sit707_tasks;

import java.util.Random;
import java.util.Scanner;

/**
 * Hello world!
 * @author Deepak Kumar khatri
 */
public class Main 
{
    public static void main( String[] args )
    {  
    	 
    	  Scanner scanner = new Scanner(System.in);
          
          System.out.println("Welcome to OnTrack!");
          System.out.println("Enter your student ID:");
          String studentId = scanner.nextLine();
          
          GradeProgressTracker tracker = new GradeProgressTracker(studentId, new MockUserInputProvider(scanner));
          tracker.addTask();
          
          // Display tasks
          tracker.displayTasks();
          
          scanner.close();
      }
    }
    