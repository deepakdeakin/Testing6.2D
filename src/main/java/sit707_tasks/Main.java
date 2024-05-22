package sit707_tasks;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Example usage of Task class
        System.out.println("Creating a new task...");
        System.out.print("Enter task name: ");
        String taskName = scanner.nextLine();
        System.out.print("Enter grade category (Pass/Credit/Distinction/High Distinction): ");
        String gradeCategory = scanner.nextLine();
        Task task = new Task(taskName, gradeCategory);
        System.out.println("Task created successfully!");

        // Example usage of Unit class
        System.out.println("\nCreating a new unit...");
        System.out.print("Enter unit code: ");
        String unitCode = scanner.nextLine();
        System.out.print("Enter unit name: ");
        String unitName = scanner.nextLine();
        Unit unit = new Unit(unitCode, unitName);
        System.out.println("Unit created successfully!");

        // Example usage of Tutorial class
        System.out.println("\nCreating a new tutorial...");
        System.out.print("Enter tutorial abbreviation: ");
        String abbreviation = scanner.nextLine();
        System.out.print("Enter tutorial location: ");
        String location = scanner.nextLine();
        System.out.print("Enter tutorial day: ");
        String day = scanner.nextLine();
        System.out.print("Enter tutorial time: ");
        String time = scanner.nextLine();
        System.out.print("Enter tutor name: ");
        String tutor = scanner.nextLine();
        Tutorial tutorial = new Tutorial(abbreviation, location, day, time, tutor);
        System.out.println("Tutorial created successfully!");

        // Example usage of Staff class
        System.out.println("\nCreating a new staff member...");
        System.out.print("Enter staff name: ");
        String staffName = scanner.nextLine();
        System.out.print("Enter staff role: ");
        String staffRole = scanner.nextLine();
        Staff staff = new Staff(staffName, staffRole);
        System.out.println("Staff member created successfully!");

        // Example usage of LearningOutcome class
        System.out.println("\nCreating a new learning outcome...");
        System.out.print("Enter learning outcome description: ");
        String outcomeDescription = scanner.nextLine();
        LearningOutcome outcome = new LearningOutcome(outcomeDescription);
        System.out.println("Learning outcome created successfully!");

        // Manage Learning Outcomes
        List<LearningOutcome> learningOutcomesList = new ArrayList<>();
        learningOutcomesList.add(outcome);

        System.out.println("\nAdditional Functions:");
        System.out.println("1. Update Task Completion Status");
        System.out.println("2. Display Unit Information");
        System.out.println("3. Display Tutorial Information");
        System.out.println("4. Display Staff Information");
        System.out.println("5. Manage Learning Outcomes");
        System.out.print("Enter your choice (1-5): ");
        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        switch (choice) {
            case 1:
                // Update Task Completion Status
                System.out.print("Enter task name to update completion status: ");
                String taskToUpdate = scanner.nextLine();
                task.setCompleted(true);
                System.out.println("Task '" + taskToUpdate + "' completion status updated!");
                break;
            case 2:
                // Display Unit Information
                System.out.println("Unit Code: " + unit.getUnitCode());
                System.out.println("Unit Name: " + unit.getUnitName());
                break;
            case 3:
                // Display Tutorial Information
                System.out.println("Tutorial Abbreviation: " + tutorial.getAbbreviation());
                System.out.println("Location: " + tutorial.getLocation());
                System.out.println("Day: " + tutorial.getDay());
                System.out.println("Time: " + tutorial.getTime());
                System.out.println("Tutor: " + tutorial.getTutor());
                break;
            case 4:
                // Display Staff Information
                System.out.println("Staff Name: " + staff.getName());
                System.out.println("Role: " + staff.getRole());
                break;
            case 5:
                // Manage Learning Outcomes
                System.out.println("Learning Outcomes Management:");
                System.out.println("1. Add Learning Outcome");
                System.out.println("2. Remove Learning Outcome");
                System.out.print("Enter your choice (1-2): ");
                int outcomeChoice = scanner.nextInt();
                scanner.nextLine(); // Consume newline
                switch (outcomeChoice) {
                    case 1:
                        System.out.print("Enter new learning outcome description: ");
                        String newOutcomeDescription = scanner.nextLine();
                        LearningOutcome newOutcome = new LearningOutcome(newOutcomeDescription);
                        learningOutcomesList.add(newOutcome);
                        System.out.println("Learning outcome added successfully!");
                        break;
                    case 2:
                        System.out.print("Enter learning outcome description to remove: ");
                        String outcomeToRemove = scanner.nextLine();
                        boolean removed = false;
                        for (LearningOutcome outcome1 : learningOutcomesList) {
                            if (outcome1.getDescription().equals(outcomeToRemove)) {
                                learningOutcomesList.remove(outcome1);
                                removed = true;
                                break; // Exit loop once removed
                            }
                        }
                        if (removed) {
                            System.out.println("Learning outcome removed successfully!");
                        } else {
                            System.out.println("Learning outcome not found!");
                        }
                        break;
                    default:
                        System.out.println("Invalid choice!");
                }
                break;

            default:
                System.out.println("Invalid choice!");
        }

        // Close the scanner
        scanner.close();
    }
}



