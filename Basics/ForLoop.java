import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) throws InterruptedException {
        // for loop = execute some code a CERTAIN amount of time

        for (int i = 0; i <= 2; i++) {// counter i(meaning index) loop control variable; condition; increment or
                                      // decrement
            System.out.println("I love Rice!");
        } // decrement is i--

        Scanner scanner = new Scanner(System.in);
        System.out.println("How many times you want to loop: ");
        int max = scanner.nextInt();
        for (int i = 0; i < max; i++) {
            System.out.println(i + 1);
        }

        int start = 10;
        for (int i = start; i > 0; i--) {
            System.out.println(i);
            Thread.sleep(1000);
        }
        System.out.println("HAPPY NEW YEAR!");
        scanner.close();
    }
}
