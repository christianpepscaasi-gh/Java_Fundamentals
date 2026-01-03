import java.util.Random;

public class random_class {
    public static void main(String[] args) {
        Random random = new Random();

        int number1;
        int number2;
        int number3;
        double number;
        boolean isHeads;

        number1 = random.nextInt(1, 7);// origin was the start and bound was the end
        number2 = random.nextInt(1, 7);// bound was always excluded on the list
        number3 = random.nextInt(1, 7);// origin 1 and bound 7 mean, it was random between 1-6
        number = random.nextDouble();// only will generate only decimal
        isHeads = random.nextBoolean();// good for a coin toss
        System.out.println(number1);
        System.out.println(number2);
        System.out.println(number3);
        System.out.println(number);

        if (isHeads) {
            System.out.println("HEADS");
        } else {
            System.out.println("TAILS");
        }
    }
}
