package Arrays.Arrays_GPT_Challenge;

import java.util.Scanner;

public class Input_Array {
    public static void main(String[] args) {
        // Ask the user to enter 5 numbers.
        // Store them in an array.
        // Print only the numbers greater than 10.

        Scanner scanner = new Scanner(System.in);
        int[] number_input = new int[5];

        System.out.print("Enter Number 1: ");
        number_input[0] = scanner.nextInt();
        System.out.print("Enter Number 2: ");
        number_input[1] = scanner.nextInt();
        System.out.print("Enter Number 3: ");
        number_input[2] = scanner.nextInt();
        System.out.print("Enter Number 4: ");
        number_input[3] = scanner.nextInt();
        System.out.print("Enter Number 5: ");
        number_input[4] = scanner.nextInt();

        for (int number : number_input) {
            if (number > 10) {
                System.out.println(number);
            }
        }

        scanner.close();
    }
}
