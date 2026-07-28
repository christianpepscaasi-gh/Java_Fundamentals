public class Backend {
    double firstNumber;
    double secondNumber;
    double result;
    String error = "Error! Second number must not be 0!";

    double add(double firstNumber, double secondNumber){
        result = firstNumber + secondNumber;
        System.out.println(result);
        return result;
    }

    double subtract(double firstNumber, double secondNumber){
        result = firstNumber - secondNumber;
        return result;
    }

    double multiply(double firstNumber, double secondNumber){
        result = firstNumber * secondNumber;
        return result;
    }

    double divide(double firstNumber, double secondNumber) {
        if (secondNumber == 0) {
            System.out.println("Cannot divide by zero");
            return 0;
        } else if (secondNumber != 0) {
            result = firstNumber / secondNumber;
            return result;
        } else {
            System.out.println("Invalid Input!");
        }
    return 0;
    }

    double modulo(double firstNumber, double secondNumber){
        result = firstNumber % secondNumber;
        return result;
    }
}