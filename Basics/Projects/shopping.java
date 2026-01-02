package Projects;

import java.util.Scanner;

public class shopping {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double milk = 5.4;
        double bread = 1.7;
        double coffee = 3.99;
        double tea = 4.99;

        double amount;
        double milk_quantity;
        double bread_quantity;
        double coffee_quantity;
        double tea_quantity;
        char currency = '$';

        System.out.println("Price of the Items are:");
        System.out.println("Milk: " + milk);
        System.out.println("Bread: " + bread);
        System.out.println("Coffee: " + coffee);
        System.out.println("Tea: " + tea);

        System.out.print("How many Milk you want to Buy?: ");
        milk_quantity = scanner.nextDouble();
        System.out.print("How many Bread you want to Buy?: ");
        bread_quantity = scanner.nextDouble();
        System.out.print("How many Coffee you want to Buy?: ");
        coffee_quantity = scanner.nextDouble();
        System.out.print("How many Tea you want to Buy?: ");
        tea_quantity = scanner.nextDouble();

        amount = (milk_quantity * milk) + (bread_quantity * bread) + (coffee_quantity * coffee) + (tea_quantity * tea);

        System.out.print("Overall Amount is: " + currency + amount);

        scanner.close();
    }
}
