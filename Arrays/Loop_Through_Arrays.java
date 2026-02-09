package Arrays;

public class Loop_Through_Arrays {
    public static void main(String[] args) {
        // You can loop through the array elements with the for loop, and use the length
        // property to specify how many times the loop should run.

        // This example creates an array of strings and then uses a for loop to print
        // each element, one by one:

        String[] motorcycle = { "honda", "mitsubishi", "isuzu" };

        for (int i = 0; i < motorcycle.length; i++) {
            System.out.println(motorcycle[i]);
        }

        // for numbers
        int[] numbers = { 12, 44, 13, 55, 123 };
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        // Calculate the sum of the elements
        int sum = 0;
        int[] num = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        for (int i = 0; i < num.length; i++) {
            sum += num[i];
        }
        System.out.println("The sum of numbers is: " + sum);

        // FOR-EACH LOOP
        /*
         * String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
         * 
         * for (String car : cars) {
         * System.out.println(car);
         * }
         */
        // This means: for each String in the cars array (here called car), print its
        // value.
        // Compared to a regular for loop, the for-each loop is easier to write and read
        // because it does not need a counter (like i < cars.length). However, it only
        // gives you the values, not their positions (indexes) in the array.
        // So, if you need both the position (index) of each element and its value, a
        // regular for loop is the right choice. For example, when printing seat numbers
        // in a theater row, you need to show both the seat number (the index) and who
        // is sitting there (the value):

        String[] seats = { "Jenny", "Liam", "Jack", "Bo" };
        for (int i = 0; i < seats.length; i++) {
            System.out.println("Seat number" + i + " is taken by " + seats[i]);
        }
    }
}
