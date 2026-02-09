package Personal_Projects;

import java.util.Scanner;

public class Seat_System_V2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean[] seat = new boolean[5];// boolean of 5 values

        Boolean isOnline = true;// while loop key

        while (isOnline) {
            System.out.println("\nSeatStatus");
            for (int i = 0; i < seat.length; i++) {// for i = 0; i < the seat length; increment
                System.out.println("Seat: " + (i + 1) + ": " + (seat[i] ? "Occupied" : "Empty"));// tell if the seats
                                                                                                 // are occupied or not
            }

            System.out.println("\n1 = Add, 2 = Remove, 3 = Exit");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1 -> {
                    System.out.print("Pick Seat(1-5): ");
                    int seatNo = scanner.nextInt() - 1;

                    if (seatNo >= 0 && seatNo < seat.length) {
                        if (seat[seatNo]) {
                            System.out.println("Seat already occupied");
                        } else {
                            seat[seatNo] = true;
                            System.out.println("Passenger added");
                        }
                    } else {
                        System.out.println("Seat Invalid");
                    }
                }
                case 2 -> {
                    System.out.print("Pick Seat(1-5): ");
                    int seatNo = scanner.nextInt() - 1;

                    if (seatNo >= 0 && seatNo < seat.length) {
                        if (!seat[seatNo]) {
                            System.out.println("Seat is already empty");
                        } else {
                            seat[seatNo] = false;
                            System.out.println("Passenger Removed");
                        }
                    } else {
                        System.out.println("Invalid Seat");
                    }
                }
                case 3 -> isOnline = false;
                default -> System.out.println("Invalid Choice");
            }
        }
        System.out.println("Program Ended!");
        scanner.close();
    }
}