package Arrays.Arrays_GPT_Challenge;

//i asked help on this WAAAAAAHH
//i felt dumb after seeing the result, wtf
public class Shift_Right {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4 };
        int lastElement = arr[arr.length - 1];

        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = lastElement;

        for (int num : arr) {
            System.out.println(num);
        }
    }
}
