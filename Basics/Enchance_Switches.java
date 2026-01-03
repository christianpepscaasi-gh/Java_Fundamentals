import java.util.Scanner;

public class Enchance_Switches {
    public static void main(String[] args) {
        // Enhanced switch = A replacement to many else if statements

        String day;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a day: ");
        day = scanner.nextLine();

        switch (day) {
            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" -> System.out.println("It is a Weekday!");
            case "Saturday", "Sunday" -> System.out.println("It is a Weekend!");
            default -> System.out.println(day + " is not a day~");
        }

        scanner.close();
    }
}
