package Excercise;

import java.util.Scanner;

public class Hypotenuse {
    public static void main(String[] args) {
        // HYPOTENUSE c = Math.sqrt(a² + b²);
        // Must Accept user input
        Scanner scanner = new Scanner(System.in);

        double a;
        double b;
        double c;

        System.out.print("Enter dimensions of A: ");
        a = scanner.nextDouble();
        System.out.print("Enter dimensions of B: ");
        b = scanner.nextDouble();

        // c = Math.sqrt((a * a) + (b * b)); //My first Take
        c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));

        System.out.println("Dimensions of A was " + a);
        System.out.println("Dimensions of B was " + b);
        System.out.println("Dimensions of C was " + c);

        scanner.close();
    }
}
