public class ForLoopBreakContinue {
    public static void main(String[] args) {
        // break = break out of the loop(STOP)
        // continue = skip current iteration of a loop
        int i;
        for (i = 0; i < 10; i++) {
            if (i == 5) {
                continue;
            }
            System.out.print(i + "");
        }

    }
}
