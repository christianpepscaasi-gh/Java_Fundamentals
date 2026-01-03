public class TernaryOperator {
    public static void main(String[] args) {
        // ternary operator ? = Return 1 of 2 values if a condition is true

        // condition = (condition) ? iftrue : ifFalse;

        int score = 90;
        // EXAMPLE OF NONE TERNARY OPERATOR
        /*
         * if(score >= 60){
         * System.out.println("You Passed!");
         * } else {
         * System.out.println("You failed!");
         * }
         */

        // TERNARY OPERATOR
        String passOrFail = (score >= 60) ? "PASS" : "FAIL";

        System.out.println(passOrFail);

        int number = 2;

        String evenOrOdd = (number % 2 == 0) ? "EVEN" : "ODD";

        System.out.println(evenOrOdd);

        // PRACTICAL CODE

        int hours = 13;

        String timeOfDay = (hours < 12) ? "A.M" : "P.M";

        System.out.println(timeOfDay);

        // --------------------------

        int income = 60000;
        double taxRate = (income >= 40000) ? 0.25 : 0.15;

        System.out.println(taxRate);
    }
}
