package Arrays.Arrays_GPT_Challenge;

public class Find_Max_Value {
    public static void main(String[] args) {
        // Create an array of 6 integers.
        // Print the largest number in the array.

        int[] numbers = { 10, 20, 30, 40, 50, 60 };
        int n = 0;

        for (int num : numbers) {

            if (n < num) {
                n = num;
            }

        }
        System.out.println(n);

    }
}
