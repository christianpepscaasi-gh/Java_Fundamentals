package Excercise;

import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        double temp;
        double newtemp;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a Unit(C for celsius or F for Fahrenheit): ");
        String unit = scanner.nextLine().toUpperCase();

        System.out.println("Enter the temperature: ");
        temp = scanner.nextDouble();

        newtemp = (unit.equals("C")) ? (temp - 32) * 5 / 9 : (temp * 5 / 9) + 32;

        System.out.printf("%.1fdegree %s", newtemp, unit);

        scanner.close();
    }
}
