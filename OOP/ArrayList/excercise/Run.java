import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Run {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<String> foods = new ArrayList<>();

        System.out.print("Enter the number of food you want to store: ");
        int numOfFood = scanner.nextInt();
        scanner.nextLine();

        for(int i = 1; i <= numOfFood; i++){
            System.out.print("Enter food #" + i + " : ");
            String foodName = scanner.nextLine();

            foods.add(foodName);
        }

        System.out.println(foods);

        scanner.close();
    }
}