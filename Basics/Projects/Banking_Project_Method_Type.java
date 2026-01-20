package Projects;

import java.util.Scanner;

public class Banking_Project_Method_Type {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        double balance = 0;
        boolean isRunning = true;
        int choice;

        System.out.println("Welcome to Peps Banking System");

        while (isRunning) {
            System.out.println("1: Withdraw");
            System.out.println("2: Deposit");
            System.out.println("3: Check Balance");
            System.out.println("4: Exit");
            System.out.print("Enter a Service: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1 -> {
                    balance -= withdraw(balance);
                }
                case 2 -> {
                    balance += deposit();
                }
                case 3 -> showBalance(balance);

                case 4 -> {
                    isRunning = false;
                }
                default -> System.out.println("Invalid Entry: Please Enter Between 1-4");
            }
        }
        scanner.close();
    }

    static void showBalance(double balance) {
        System.out.println("Checking Balance...");
        System.out.printf("current balance is: %,.2f%n\n", balance);
    }

    static double withdraw(double balance) {
        double amount;
        System.out.print("Withdrawing Money...");
        System.out.print("Enter amount: ");
        amount = scanner.nextDouble();
        if (balance >= amount && amount > 0) {
            return amount;
        } else {
            System.out.println("Invalid Amount!");
            System.out.printf("current balance is: %,.2f%n\n", balance);
            return 0;
        }
    }

    static double deposit() {
        double amount;
        System.out.println("Depositing Money...");
        System.out.println("Enter amount: ");
        amount = scanner.nextDouble();
        if (amount > 0) {
            return amount;
        } else {
            System.out.println("Invalid Amount");
            return 0;
        }
    }
}