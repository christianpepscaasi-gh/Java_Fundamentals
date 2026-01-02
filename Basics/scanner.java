//Scanner is a Java Object that allows us to accept user input in Java

import java.util.Scanner;

public class scanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Your Name: ");// Accept String
        String name = scanner.nextLine();// User Input

        System.out.print("Enter Your Age: ");// Accept Integer
        int age = scanner.nextInt();

        System.out.print("What is your GPA: ");// Accept Double
        double gpa = scanner.nextDouble();

        System.out.print("Are you a student?(true/false)");
        boolean isStudent = scanner.nextBoolean();

        System.out.println("Hello " + name);// Output
        System.out.println("You are " + age + " Years old");
        System.out.println("Your GPA is " + gpa);
        // System.out.println("Student: " + isStudent);

        if (isStudent == true) {
            System.out.println("Your are a Student!");
        } else {
            System.out.println("Your are not a Student!");
        }

        scanner.close();

        // note: .next only take the first, .nexLine take the whole line including the
        // space

        // COMMON MISTAKE:
        /*
         * SOUT
         * int age = scanner.nextInt();
         * 
         * SOUT
         * String color = scanner.nextLine();
         * 
         * if you type a number, and hit enter, within the input buffer, there is still
         * a newline character
         * because we hit enter, so we hit enter, the new line still pick up that new
         * line character and
         * using that as the input.
         * 
         * rid that new line char~
         * SOUT
         * int age = scanner.nextInt();
         * scanner.nextline();
         * 
         * SOUT
         * String color = scanner.nextLine();
         * 
         * 
         */
    }
}
