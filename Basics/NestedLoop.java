public class NestedLoop {
    public static void main(String[] args) {
        // nested loop = A loop inside another loop Used often with matrices
        int i;
        int j;

        for (i = 1; i <= 3; i++) {
            for (j = 1; j < 10; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

    }
}
