package Projects;

import java.util.Scanner;

public class Banking_Project {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int balance = 10000;
        boolean isOnline = true;
        System.out.println("Welcome to Peps Banking System");

        while (isOnline) {
            System.out.println("Enter the Following numbers to use Service:");
            System.out.println("1: Withdraw");
            System.out.println("2: Deposit");
            System.out.println("3: Check Balance");
            System.out.println("4: Exit");
            System.out.print("Enter a Service: ");
            int service = scanner.nextInt();

            switch (service) {
                case 1 -> {
                    System.out.println("Withdrawing Money...");
                    System.out.println("Enter amount: ");
                    int amount = scanner.nextInt();
                    if (balance >= amount && amount > 0) {
                        balance -= amount;
                        System.out.printf("Withdrawn %,d%n Amount.\n", amount);
                        System.out.printf("current balance is: %,d%n\n", balance);
                    } else {
                        System.out.println("Invalid Amount!");
                        System.out.printf("current balance is: %,d%n\n", balance);
                    }
                }
                case 2 -> {
                    System.out.println("Depositing Money...");
                    System.out.println("Enter amount: ");
                    int amount = scanner.nextInt();
                    if (amount > 0) {
                        balance += amount;
                        System.out.printf("Deposited %,d%n Amount.\n", amount);
                        System.out.printf("current balance is: %,d%n\n", balance);
                    } else {
                        System.out.println("Invalid Amount");
                    }
                }
                case 3 -> {
                    System.out.println("Checking Balance...");
                    System.out.printf("current balance is: %,d%n\n", balance);
                }
                case 4 -> {
                    System.out.println("Exiting System...");
                    System.out.println("Thank you!");
                    isOnline = false;
                }
                default -> System.out.println("Enter numbers between 1-4");
            }
        }
        scanner.close();
    }

    static void FirstTry() {

        // if (service == 1) {
        // System.out.println("Withdrawing Money...");
        // System.out.println("Enter amount: ");
        // int amount = scanner.nextInt();

        // if (balance >= amount) {

        // balance -= amount;
        // System.out.printf("Withdrawn %,d%n Amount.\n", amount);
        // System.out.printf("current balance is: %,d%n\n", balance);
        // } else {
        // System.out.println("Invalid Amount!");
        // System.out.printf("current balance is: %,d%n\n", balance);
        // }
        // } else if (service == 2) {
        // System.out.println("Depositing Money...");
        // System.out.println("Enter amount: ");
        // int amount = scanner.nextInt();
        // balance += amount;
        // System.out.printf("Deposited %,d%n Amount.\n", amount);
        // System.out.printf("current balance is: %,d%n\n", balance);
        // } else if (service == 3) {
        // System.out.println("Checking Balance...");
        // System.out.printf("current balance is: %,d%n\n", balance);
        // } else if (service == 4) {
        // System.out.println("Exiting System...");
        // System.out.println("Thank you!");
        // isOnline = false;
        // scanner.close();
        // } else {
        // System.out.println("Invalid Number, Please press 1-4 only.");
        // }
    }
}
