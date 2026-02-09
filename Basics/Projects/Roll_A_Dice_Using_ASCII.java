package Projects;

import java.util.Random;
import java.util.Scanner;

public class Roll_A_Dice_Using_ASCII {
    public static void main(String[] args) {
        // DECLARE VARIABLES
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int num_of_dice;
        int total = 0;

        // GET # OF DICE FROM THE USER
        System.out.println("Enter the # of dice to roll: ");
        num_of_dice = scanner.nextInt();
        // CHECK IF # OF DICE WAS > 0
        if (num_of_dice > 0) {
            // ROLL ALL THE DICE
            for (int i = 1; i <= num_of_dice; i++) {
                int roll = random.nextInt(1, 7);
                // pass the number to print_die
                print_die(roll);
                System.out.println("You Rolled: " + roll);
                total += roll;
            }
            // GET THE TOTAL
            System.out.println("Total: " + total);
        } else {
            System.out.println("# of dice, must be greater than 0");
        }

        // DISPLAY IN ASCII ART
        scanner.close();
    }

    static void print_die(int roll) {
        String dice1 = """
                 -------
                |       |
                |   ●   |
                |       |
                 -------
                """;
        String dice2 = """
                 -------
                | ●     |
                |       |
                |     ● |
                 -------
                """;
        String dice3 = """
                 -------
                | ●     |
                |   ●   |
                |     ● |
                 -------
                """;
        String dice4 = """
                 -------
                | ●   ● |
                |       |
                | ●   ● |
                 -------
                """;
        String dice5 = """
                 -------
                | ●   ● |
                |   ●   |
                | ●   ● |
                 -------
                """;
        String dice6 = """
                 -------
                | ●   ● |
                | ●   ● |
                | ●   ● |
                 -------
                """;

        switch (roll) {
            case 1 -> System.out.print(dice1);
            case 2 -> System.out.print(dice2);
            case 3 -> System.out.print(dice3);
            case 4 -> System.out.print(dice4);
            case 5 -> System.out.print(dice5);
            case 6 -> System.out.print(dice6);
            default -> System.out.println("INVALID ROLL");
        }

    }
}
