import java.util.Scanner;

public class Run{
    public static void main(String[] args){


//        Exceptions = an event that interrupts the normal flow of a program
//                Surround any dagerous code with a try{} block
//            try{}, catch{}, finally{}
        Scanner scanner = new Scanner(System.in);


        try {
            System.out.println("Enter a number: ");
            int num = scanner.nextInt();
            System.out.println(num);
        } catch (InputMismatchException e) {
            System.out.println("That wasnt a number!");
        } catch (ArithmeticException e) {
            System.out.println("You Can't divide by zero!");
        } catch (Exception e) {
            System.out.println("Something went wrong!");
        } finally {
            scanner.close();
        }
    }
}