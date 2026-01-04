import java.nio.channels.Pipe.SourceChannel;
import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = "";

        while (name.isEmpty()) {
            System.out.println("Enter your name: ");
            name = scanner.nextLine();
        }

        System.out.println("Hello " + name);

        // HOW TO BE STUCK?
        /*
         * while(1==1){
         * System.out.println("LMAO THIS IS A VIRUS!");
         * }
         */

        // HOW TO TROLL?
        String response = "";

        while (response.equals("Q")) {
            System.out.println("Lets play a game!(Press any Character)");
            System.out.println("Find what Character it was!");
            response = scanner.nextLine().toUpperCase();// make it lowercase to troll!
        }
        System.out.println("You have quit the Game!");

        scanner.close();
    }
}
