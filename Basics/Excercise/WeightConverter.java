package Excercise;

import java.util.Scanner;

public class WeightConverter {
    public static void main(String[] args) {

        // WEIGHT CONVERSION PROGRAM
        Scanner scanner = new Scanner(System.in);

        double lbs = 2.20462;
        double weight;
        double new_weight;

        System.out.println("Weight Conversion Program");
        System.out.println("1: Convert lbs to kgs");
        System.out.println("2: Convert kgs to lbs");

        System.out.print("Enter what conversion you want(1 or 2): ");
        int choose = scanner.nextInt();

        if (choose == 1) {
            System.out.println("Enter the weight in Lbs: ");
            weight = scanner.nextDouble();
            new_weight = weight / lbs;
            System.out.printf("Lbs %.2f is equal to: %.2f kgs", weight, new_weight);
        } else if (choose == 2) {
            System.out.println("Enter the weight in kgs: ");
            weight = scanner.nextDouble();
            new_weight = weight * lbs;
            System.out.printf("Kgs %.2f is equal to: %.2f lbs", weight, new_weight);
        } else {
            System.out.println("You entered a wrong number");
        }

        scanner.close();
    }
}
