package Arrays;

public class array {
    public static void main(String[] args) {
        String[] car;
        String[] cars = { "honda", "suzuki", "mitsubishi" };// 0 = honda, 1= suzuki, 2=mitsubishi

        int[] num = { 1, 2, 3, 4 };

        // Example1
        System.out.println(cars[0]);// honda will be printed

        /*
         * to change the value, you just need to change the targets value
         * for example:
         * cars[0] = "Isuzu"
         * honda will be changed to Isuzu
         */

        System.out.println(cars.length);// print the length of cars which is 3

        // You can also create an array by specifying its size with new. This makes an
        // empty array with space for a fixed number of elements, which you can fill
        // later:
        String[] motorcycle = new String[3];
        motorcycle[0] = "Honda";
        motorcycle[1] = "Suzuki";
        motorcycle[2] = "Mitsubishi";

    }

}
