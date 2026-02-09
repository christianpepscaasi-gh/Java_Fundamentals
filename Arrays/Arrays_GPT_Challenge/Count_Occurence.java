package Arrays.Arrays_GPT_Challenge;

public class Count_Occurence {
    // lol, it said Count how many times 5 appears, soo~
    public static void main(String[] args) {
        int[] arr = { 5, 3, 5, 2, 5, 1 };
        int five = 5;
        int i = 0;

        for (int num : arr) {
            if (num == five) {
                i++;
            }
        }
        System.out.println(i);
    }
}
