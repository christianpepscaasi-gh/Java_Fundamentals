package Projects;

//MAD LIBS GAME using Scanner in Java

import java.util.Scanner;

public class mad_libs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String adjective1;
        String noun1;
        String adjective2;
        String verb1;
        String adjective3;

        System.out.print("Enter an Adjective(description): ");
        adjective1 = scanner.nextLine();
        System.out.print("Enter a Noun(Animal/Person): ");
        noun1 = scanner.nextLine();
        System.out.print("Enter an Adjective(description): ");
        adjective2 = scanner.nextLine();
        System.out.print("Enter a Verb with -ing(action): ");
        verb1 = scanner.nextLine();
        System.out.print("Enter an Adjective(description): ");
        adjective3 = scanner.nextLine();

        System.out.println("Today i went to a " + adjective1 + " zoo.");
        System.out.println("In an exhibit, i saw a " + noun1 + ".");
        System.out.println(noun1 + " was " + adjective2 + " and " + verb1 + "!");
        System.out.println("I was " + adjective3 + "!");

        scanner.close();
    }
}
