package Projects;

import java.util.Scanner;

public class UserName_UsingLogicOp {
    public static void main(String[] args) {
        // Create a username and password
        String username = "user123";
        String password = "pass123";

        // Simulate user input
        String inputUsername = "user123";
        String inputPassword = "pass123";
        // Check if the username and password are correct using logical operators
        if (inputUsername.equals(username) && inputPassword.equals(password)) {
            System.out.println("Login successful!");
        } else {
            System.out.println("Invalid username or password.");
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter username: ");
        String userInput = scanner.nextLine();

        // this is not valid, must check the pre-existing.
        // this is only for checking password given by the user.
        if (userInput.length() < 4 || userInput.length() > 12) {
            System.out.println("Username must be within 4-12 character!");
        } else if (userInput.contains(" ") || userInput.contains("_") || userInput.contains("-")) {
            System.out.println("Username must not contain space, underscore or slash");
        } else {
            System.out.println("Welcome " + userInput);
        }
        System.out.print("Enter password: ");
        String passwordInput = scanner.nextLine();

        if (passwordInput.length() < 7) {
            System.out.println("Password must not under 8 character!");
        } else {
            System.out.println("Welcome, Password Accepted!");
        }
        scanner.close();
    }
}
