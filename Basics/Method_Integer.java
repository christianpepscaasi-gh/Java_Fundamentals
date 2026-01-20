
public class Method_Integer {
    public static void main(String[] args) {
        double square_result = square(3);
        System.out.println(square_result);
        double cube_result = cube(3);
        System.out.printf("the Cube of number was: %.2f\n", cube_result);

        int age = 21;

        if (ageCheck(age)) {
            System.out.println("You may Sign up now!");
        } else {
            System.out.println("you need to be +18 before signing up.");
        }
    }

    static double square(double number) {
        return number * number;
    }

    static double cube(double number) {
        return number * number * number;
    }

    static boolean ageCheck(int age) {
        if (age >= 18) {
            return true;
        } else {
            return false;
        }
    }
}
