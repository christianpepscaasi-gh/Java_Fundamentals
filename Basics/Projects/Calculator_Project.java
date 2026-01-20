package Projects;

import java.util.Scanner;

public class Calculator_Project {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Peps Banking System");
        System.out.println("Please enter the first number: ");
        double first_number = scanner.nextDouble();
        System.out.println("Please enter the operator your using(+, -, *, /): ");
        char operator = scanner.next().charAt(0);
        System.out.println("Please enter the second number: ");
        double second_number = scanner.nextDouble();

        if (operator == '+') {
            double result = first_number + second_number;
            System.out.printf("The addition of %.0f and %.0f is %.0f", first_number, second_number, result);
        } else if (operator == '-') {
            double result = first_number - second_number;
            System.out.printf("The subtraction of %.0f and %.0f is %.0f", first_number, second_number, result);
        } else if (operator == '*') {
            double result = first_number * second_number;
            System.out.printf("The multiplication of %.0f and %.0f is %.0f", first_number, second_number, result);
        } else if (operator == '/') {
            if (second_number == 0) {
                System.out.printf("ERROR: Cannot be divided by 0");
            } else {
                double result = first_number / second_number;
                System.out.printf("The Division of %.2f and %.0f is %.2f", first_number, second_number, result);
            }
        } else {
            System.out.println("Invalid Entry!");
        }
        scanner.close();
    }
}
