package Excercise;

import java.util.Scanner;

public class Calculator1 {
    // Calculator Using Enchance Switches
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double result = 0;
        Boolean validOperation = true;

        System.out.print("Enter the first Number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter an Operator(+, -, *, /, p): ");
        char operator = scanner.next().charAt(0);

        System.out.print("Enter the second Number: ");
        double num2 = scanner.nextDouble();

        switch (operator) {
            case '+' -> result = num1 + num2;
            case '-' -> result = num1 - num2;
            case '*' -> result = num1 * num2;
            case '/' -> {
                if (num2 == 0) {
                    System.out.println("Cannot devide by Zero!");
                    validOperation = false;
                } else {
                    result = num1 / num2;
                }
            }
            case 'p' -> result = Math.pow(num1, num2);
            default -> {
                System.out.println("Invalid operator!");
                validOperation = false;
            }
        }

        if (validOperation) {
            System.out.println(result);
        }

        scanner.close();
    }
}
