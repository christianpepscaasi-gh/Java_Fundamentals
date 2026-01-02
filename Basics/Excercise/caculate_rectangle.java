package Excercise;

import java.util.Scanner;

public class caculate_rectangle {
    // Calculate area of a rectangle

    public static void main(String[] args) {
        double width = 0;
        double height = 0;
        double area = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the width: ");
        width = scanner.nextDouble();

        System.out.print("Enter the height: ");
        height = scanner.nextDouble();

        area = width * height;

        System.out.println("The Area is: " + area + "cm²");

        scanner.close();
    }
}
