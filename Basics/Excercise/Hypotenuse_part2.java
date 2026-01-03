package Excercise;

import java.util.Scanner;

public class Hypotenuse_part2 {
    public static void main(String[] args) {
        // circumference = 2 * Math.PI * radius;
        // area = Math.PI * Math.pow(radius, 2);
        // volume = (4.0/3.0) * Math.PI * Math.pow(radius, 3);
        // print F statement was printf

        double radius;
        double circumference;
        double area;
        double volume;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the Radius: ");
        radius = scanner.nextDouble();

        circumference = 2 * Math.PI * radius;
        area = Math.PI * Math.pow(radius, 2);
        volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);

        System.out.printf("The Circumference is: %.1f\n", circumference);
        System.out.printf("The Area is: %.1f\n", area);
        System.out.printf("The Volume is: %.1f\n", volume);

        scanner.close();
    }
}
