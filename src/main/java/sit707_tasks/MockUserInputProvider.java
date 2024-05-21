package sit707_tasks;

import java.util.Scanner;

public class MockUserInputProvider implements UserInputProvider {
	 private Scanner scanner;

	    public MockUserInputProvider(Scanner scanner) {
	        this.scanner = scanner;
	    }

	    @Override
	    public String getUserInput() {
	        return scanner.nextLine();
	    }
}
