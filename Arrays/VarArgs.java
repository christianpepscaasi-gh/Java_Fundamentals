public class VarArgs {
    public static void main(String[] args) {
        System.out.println(average(1, 2, 3, 4, 5));
    }

    static double average(double... numbers){
        double sum =0;

        for (double num : numbers){
            sum+=num;
        }
        return sum/numbers.length;
    }
}