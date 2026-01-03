package Projects;

import java.util.Scanner;

public class InterestCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double principal;
        double rate;
        int time_compounded;
        double amount;
        int year;

        System.out.print("Enter the principal amount: ");
        principal = scanner.nextDouble();
        System.out.print("Enter the Interest Rate(in %): ");
        rate = scanner.nextDouble() / 100;

        System.out.print("Enter the number of Time Compounded per year: ");
        time_compounded = scanner.nextInt();

        System.out.print("Enter the number of Years: ");
        year = scanner.nextInt();

        amount = principal * Math.pow(1 + rate / time_compounded, time_compounded * year);

        System.out.printf("The amount after %d years is $%.2f", year, amount);

        scanner.close();
    }
}
