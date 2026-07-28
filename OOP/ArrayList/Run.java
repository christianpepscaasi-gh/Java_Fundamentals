import java.util.ArrayList;

import java.util.Collections;
public class Run {
    public static void main(String[] args) {
        // ArrayList = a resizable array that stores objects(autoboxing).
        // Arrays are fixed in size, but arraylist can change.

        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Pineapple");
        fruits.add("Coconut");

//        fruits.remove(0);

        fruits.set(2 ,"Orange");

        Collections.sort(fruits);

        System.out.println(fruits);
        System.out.println(fruits.get(2));
        System.out.println(fruits.size());

        for(String fruit : fruits){
            System.out.println(fruit);
        }

    }
}