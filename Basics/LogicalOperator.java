public class LogicalOperator {
    public static void main(String[] args) {
        // Logical Operators = used to connect two or more expressions
        // && (AND) = both expressions must be true
        // || (OR) = at least one expression must be true
        // ! (NOT) = reverses the logical state of an expression

        int temp = 22;

        // AND Operator
        if (temp > 15 && temp < 30) {
            System.out.println("The weather is good!");
        } else {
            System.out.println("The weather is bad!");
        }

        // OR Operator
        if (temp < -5 || temp > 35) {
            System.out.println("The weather is extreme!");
        } else {
            System.out.println("The weather is moderate!");
        }

        // NOT Operator
        boolean sunny = false;
        if (!sunny) {
            System.out.println("It is cloudy outside!");
        } else {
            System.out.println("It is sunny outside!");
        }
    }
}
