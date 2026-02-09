package Arrays.Arrays_GPT_Challenge;

public class Average_Score {
    public static void main(String[] args) {
        // Create an array of 5 integers.
        // Print the Average
        int[] arr = { 80, 90, 70, 100, 60 };
        int sum = 0;
        int ave = 0;
        for (int num : arr) {
            sum += num;
        }
        ave = sum / arr.length;
        System.out.println(ave);
    }
}
