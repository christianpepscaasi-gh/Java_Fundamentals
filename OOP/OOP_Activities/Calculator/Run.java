import java.util.Scanner;
public class Run {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        //UserInput
        //Create add, sub, times, div classes
        boolean isRunning = true;
        double result;

        while (isRunning) {
            System.out.println("""
                    |==============================|
                    |Addition: +                   | 
                    |Subtraction: -                |
                    |Multiplication: *             |
                    |Division: /                   |
                    |Modulo: %                     |
                    |Enter X on Operator to exit.  |
                    |==============================|
                    """);

            System.out.print("Enter first number: ");
            double firstNumber = scanner.nextDouble();

            System.out.print("enter operator:");
            String operator = scanner.next();
            scanner.nextLine();

            if (operator.equals("X") || operator.equals("x")) {
                isRunning = false;
            }

            System.out.print("Enter second number: ");
            double secondNumber = scanner.nextDouble();


            Backend backend = new Backend();
            switch (operator) {
                case "+" -> {
                    result = backend.add(firstNumber, secondNumber);
                    System.out.println("Result: " + result);
                }
                case "-" -> {
                    result = backend.subtract(firstNumber, secondNumber);
                    System.out.println("Result: " + result);
                }
                case "*" -> {
                    result = backend.multiply(firstNumber, secondNumber);
                    System.out.println("Result: " + result);
                }
                case "/" -> {
                    result = backend.divide(firstNumber, secondNumber);
                    System.out.println("Result: " + result);
                }
                case "%" -> {
                    result = backend.modulo(firstNumber, secondNumber);
                    System.out.println("Result: " + result);
                }
                default -> {
                    System.out.println("Invalid input");
                }
            }
        }
        scanner.close();
    }
}