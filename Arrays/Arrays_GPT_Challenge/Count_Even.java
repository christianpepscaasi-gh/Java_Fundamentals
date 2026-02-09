package Arrays.Arrays_GPT_Challenge;

public class Count_Even {
    public static void main(String[] args) {
        // Create an array of integers: {2, 7, 4, 9, 10, 3}
        // Count and print how many numbers are even.

        int[] numbers = { 2, 7, 4, 9, 10, 3 };
        int even_number = 0;

        for (int num : numbers) {

            if (num % 2 == 0) {
                even_number++;
            }
        }
        System.out.println(even_number);
    }
}
