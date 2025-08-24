import java.util.Scanner;

/**
 * A simple Java program that demonstrates user input and interaction with the HelloWorld class.
 */
public class AppLauncher {

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        // Loop to allow multiple entries
        while (true) {
            String name = "";
            int age = -1;

            // Input and validation
            try {
                System.out.print("Enter your name: ");
                name = scnr.nextLine().trim();

                // Validate name
                if (name.isEmpty()) {
                    throw new IllegalArgumentException("Name cannot be empty.");
                }

                System.out.print("Enter your age: ");
                age = scnr.nextInt();
                scnr.nextLine(); // Consume the newline character

                // Validate age
                if (age < 0) {
                    throw new IllegalArgumentException("Age cannot be negative.");
                }
                
                // Create HelloWorld object and call methods
                HelloWorld user = new HelloWorld(name, age);
                user.greet();
                user.greet("Please introduce yourself");
                user.introduce();

            // Exception handling for invalid inputs
            } catch (IllegalArgumentException e) {
                System.out.println("Input error: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("Unexpected error: " + e.getMessage());
            }

            // Ask if the user wants to add another student, break the loop if not
            System.out.print("Would you like to add another student? (yes/no): ");
            String response = scnr.nextLine().trim().toLowerCase();
            if (!response.equals("yes")) {
                break;
            }
        }

        scnr.close();
    }
}
