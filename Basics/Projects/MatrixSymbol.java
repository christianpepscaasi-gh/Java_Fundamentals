package Projects;

import java.util.Scanner;

public class MatrixSymbol {
    public static void main(String[] args) {
        int rows;
        int columns;
        char symbol;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of Rows: ");
        rows = scanner.nextInt();

        System.out.print("Enter the number of Columns: ");
        columns = scanner.nextInt();

        System.out.print("Enter the symbol to use: ");
        symbol = scanner.next().charAt(0);

        for (int j = 0; j < rows; j++) {
            for (int i = 0; i < columns; i++) {
                System.out.print(symbol);
            }
            System.out.println();
        }

        scanner.close();
    }
}
