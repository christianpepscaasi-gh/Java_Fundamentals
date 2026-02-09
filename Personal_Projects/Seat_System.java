package Personal_Projects;

import java.util.Scanner;

public class Seat_System {
    public static void main(String[] args) {
        Boolean seat1 = false, seat2 = false, seat3 = false, seat4 = false, seat5 = false;
        char X, x;
        Boolean isSeated = true;
        Boolean isOnline = true;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Seat System!");

        while (isOnline) {
            System.out.println("Enter 1 to add passenger on a seat, 2 for removing passenger on seat, 3 for exit: ");
            int add_or_remove = scanner.nextInt();
            Boolean Add_passenger = true;
            Boolean Remove_passenger = true;
            switch (add_or_remove) {
                case 1 -> {
                    while (Add_passenger == true) {
                        // Add passenger
                        System.out.print("Pick a Seat on Seat1 to Seat5(1-5), and pick 6 for exit: ");
                        int seat_no = scanner.nextInt();

                        switch (seat_no) {
                            case 1 -> {
                                if (seat1 == isSeated) {
                                    System.out.println("The seat was occupied");
                                } else {
                                    seat1 = true;
                                }
                            }
                            case 2 -> {
                                if (seat2 == isSeated) {
                                    System.out.println("The seat was occupied");
                                } else {
                                    seat2 = true;
                                }
                            }
                            case 3 -> {
                                if (seat3 == isSeated) {
                                    System.out.println("The seat was occupied");
                                } else {
                                    seat3 = true;
                                }
                            }
                            case 4 -> {
                                if (seat4 == isSeated) {
                                    System.out.println("The seat was occupied");
                                } else {
                                    seat4 = true;
                                }
                            }
                            case 5 -> {
                                if (seat5 == isSeated) {
                                    System.out.println("The seat was occupied");
                                } else {
                                    seat5 = true;
                                }
                            }
                            case 6 -> {
                                System.out.println("Exiting Add Passenger...");
                                Add_passenger = false;
                            }
                            default -> System.out.println("Invalid number: Please enter between 1-5");
                        }
                    }
                }
                case 2 -> {
                    while (Remove_passenger == true) {
                        // Remove passenger
                        System.out.print("Pick a Seat on Seat1 to Seat5(1-5), and pick 6 for exit: ");
                        int seat_no = scanner.nextInt();

                        switch (seat_no) {
                            case 1 -> {
                                if (seat1 != isSeated) {
                                    System.out.println("The seat wasnt occupied");
                                } else {
                                    seat1 = false;
                                }
                            }
                            case 2 -> {
                                if (seat2 != isSeated) {
                                    System.out.println("The seat wasnt occupied");
                                } else {
                                    seat2 = false;
                                }
                            }
                            case 3 -> {
                                if (seat3 != isSeated) {
                                    System.out.println("The seat wasnt occupied");
                                } else {
                                    seat3 = false;
                                }
                            }
                            case 4 -> {
                                if (seat4 != isSeated) {
                                    System.out.println("The seat wasnt occupied");
                                } else {
                                    seat4 = false;
                                }
                            }
                            case 5 -> {
                                if (seat5 != isSeated) {
                                    System.out.println("The seat wasnt occupied");
                                } else {
                                    seat5 = false;
                                }
                            }
                            case 6 -> {
                                System.out.println("Exiting Add Passenger...");
                                Add_passenger = false;
                            }
                            default -> System.out.println("Invalid number: Please enter between 1-5");
                        }
                    }
                }
                case 3 -> {
                    isOnline = false;
                }
            }
        }

        System.out.println("Exiting Program...");
        System.out.println("Seats: " + seat1 + " " + seat2 + " " + seat3 + " " + seat4 + " " + seat5);
        scanner.close();
    }
}
