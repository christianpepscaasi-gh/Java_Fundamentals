// if statement = performs a block of code if its condition is true

import java.util.Scanner;

public class if_statement {
    public static void main(String[] args) {
        int age;
        Scanner scanner = new Scanner(System.in);
        Boolean isStudent;

        System.out.print("Enter your Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter your Age: ");
        age = scanner.nextInt();
        System.out.print("Are you a Student?(true/false):");
        isStudent = scanner.nextBoolean();

        // GROUP 1
        if (name.isEmpty()) {
            System.out.println("You didnt enter your name!");
        } else {
            System.out.println("Hello " + name + "1!");
        }

        // GROUP 2
        if (age >= 65) {
            System.out.println("You are a Senior.");
        } else if (age >= 18) {
            System.out.println("You are an Adult.");
        } else if (age < 0) {
            System.out.println("You haven't born yet!");
        } else if (age == 0) {
            System.out.println("Your are a Baby.");
        } else {
            System.out.println("Your are a Child.");
        }

        // GROUP B
        if (isStudent) {
            System.out.println("You are a student!");
        } else {
            System.out.println("You are not a Student!");
        }

        scanner.close();
    }
}
