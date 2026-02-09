package Arrays.Arrays_GPT_Challenge;

//Note: This only work on 1 duplicate
public class Find_Duplicate {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 2 };
        int dup = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == arr[i]) {
                dup = arr[i];
            }
        }
        System.out.println(dup);
    }
}
// still dont know how to multiple lmao~

/*
 * GPT recommendation
 * for (int i = 0; i < arr.length; i++) {
 * for (int j = i + 1; j < arr.length; j++) {
 * if (arr[i] == arr[j]) {
 * System.out.println(arr[i]);
 * }
 * }
 * }
 */