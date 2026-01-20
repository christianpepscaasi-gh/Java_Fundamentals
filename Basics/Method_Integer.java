
public class Method_Integer {
    public static void main(String[] args) {
        double square_result = square(3);
        System.out.println(square_result);
        double cube_result = cube(3);
        System.out.printf("the Cube of number was: %.2f\n", cube_result);
    }

    static double square(double number) {
        return number * number;
    }

    static double cube(double number) {
        return number * number * number;
    }
}
