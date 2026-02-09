package Arrays.Arrays_GPT_Challenge;

import java.util.Scanner;

public class Simple_Grade_System {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[5];
        // lmao i reuse this loop from past activities
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter Number: " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 75) {
                System.out.println("Score " + i + ": PASS");
            } else {
                System.out.println("Score " + i + ": FAILED");
            }
        }
        scanner.close();
    }

}
