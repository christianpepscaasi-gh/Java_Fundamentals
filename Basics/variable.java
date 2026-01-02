
public class variable {
    public static void main(String[] args) {
        // variable = a reusable container for a value
        // a variable behave as if it was the value it contains

        /*
         * Primitive = simple value stored directly in memory(stack)
         * Reference = memory address (stack) that points to the (heap)
         * 
         * Primitive vs Reference
         * ----------------------
         * int | string
         * double | array
         * char | object
         * boolean
         * 
         * 2 step to create a variable
         * 
         * 1. Declaration
         * 2. assignment
         */

        // INTEGER DECLARATION
        int age = 21;
        int year = 2026;
        int quantity = 1;

        // DECIMAL DECLARATION
        double price = 20.20;
        double gpa = 3.5;// not my real grade
        double temperature = 32.2;

        // CHARACTER DECLARATION
        char exclamation = '!';
        char grades = 'A';
        char currency = '$';

        // BOOLEAN DECLARATION
        boolean isStudent = true;
        boolean forSale = false;
        boolean isOnline = true;

        /*
         * EXAMPLE CODE USING BOOLEAN
         * 
         * if(isStudent){
         * system.out.print("Your a Student!");
         * } else {
         * system.out.print("Your not a Student!");
         * }
         */

        // DECLARATION OF STRING
        String name = "Christian Peps Caasi";
        String food = "Fried Chicken";
        System.out.println("Your name is " + name + ", and you like " + food);
        System.out.println("You are: " + age);
        System.out.println("Its " + year + exclamation + ", and you only code: " + quantity + "?");
    }
}
