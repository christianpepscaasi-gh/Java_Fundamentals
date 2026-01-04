package Excercise;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Random random = new Random();

        int guess;
        int attempt = 0;
        int min = 1;
        int max = 100;
        int randomNumber = random.nextInt(min, max + 1);

        do {
            System.out.printf("Guess a Number between %d-%d: ", min, max);
            guess = scanner.nextInt();
            attempt++;

            if (guess < randomNumber) {
                System.out.println("Too low! Try again!");
            } else if (guess > randomNumber) {
                System.out.println("Too high! Try again");
            } else {
                System.out.println("CORRECT! The number was " + randomNumber);
                System.out.println("Number of Attempt: " + attempt);
            }
        } while (guess != randomNumber);

        System.out.println("You have won!");

        scanner.close();
    }
}
