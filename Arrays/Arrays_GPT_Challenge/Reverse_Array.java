package Arrays.Arrays_GPT_Challenge;

public class Reverse_Array {
    public static void main(String[] args) {
        // Create an array of strings: {"A","B","C","D"}
        // Print the elements in reverse order.
        String[] letters = { "A", "B", "C", "D" };

        for (int i = letters.length - 1; i >= 0; i--) {
            System.out.print(letters[i] + " ");
        }
    }
}
