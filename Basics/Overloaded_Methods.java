public class Overloaded_Methods {
    public static void main(String[] args) {
        // overloaded methods = methods that are share the same name, but different
        // parameters
        // signature = name + parameter

        // System.out.println(add(1, 2));
        String pizza = bake_pizza("Flat Bread");
        System.out.println(pizza);
    }

    // same name but different parameters
    // static double add(double a, double b) {
    // return a + b;
    // }

    // static double add(double a, double b, double c) {
    // return a + b + c;
    // }
    static String bake_pizza(String bread) {
        return bread + " Pizza";
    }

    static String bake_pizza(String bread, String cheeze) {
        return cheeze + " " + bread + " Pizza";
    }

    static String bake_pizza(String bread, String cheeze, String topping) {
        return topping + " " + cheeze + " " + bread + " Pizza";
    }

}
