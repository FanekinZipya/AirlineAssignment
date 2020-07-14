package ClassAssignment;
import java.util.Scanner;
public class AirlineReservations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean[] seatCapacity = new boolean[10];
        int seatReservation = 1;
        int[] firstClass = {1, 2, 3, 4, 5};
        int[] economy = {6, 7, 8, 9, 10};

        while (seatReservation <= 10) {
            System.out.println("Enter 1 for Firstclass and 2 for Economy: ");
            System.out.println();
            int planeClass = input.nextInt();
            if (seatCapacity[0] == true && seatCapacity[1] == true && seatCapacity[2] == true && seatCapacity[3] == true && seatCapacity[4] == true
                    && seatCapacity[5] == true && seatCapacity[6] == true && seatCapacity[7] == true && seatCapacity[8] == true
                    && seatCapacity[9] == true) {
                System.out.println("Next flight leaves in 3 hours%n");
                break;
            }
            if (planeClass == 1 && seatCapacity[0] == true && seatCapacity[1] == true && seatCapacity[2] == true && seatCapacity[3] == true && seatCapacity[4] == true) {
                System.out.println("Firstclass is full. Would you like to try the Economy class?%n");
                System.out.println("Enter 1 for no or 2 for yes");
                planeClass = input.nextInt();
                if (planeClass == 1) {
                    System.out.println("Next flight leaves in 3 hours");
                    break;
                } else
                    continue;
            }
            if (planeClass == 1) {
                int seat = (firstClass[input.nextInt(5)]);
                while (seatCapacity[seat - 1] == true) {
                    seat = (firstClass[input.nextInt(5)]);
                    if (seatCapacity[seat - 1] == false) {
                        seatCapacity[seat - 1] = true;
                        System.out.println("PASSENGERS BOARDING PASS: ");
                        System.out.printf("Seat no: ", seat);
                        System.out.println("Firstclass%n");
                        break;
                    } else {
                        continue;
                    }
                }
            }
            if (planeClass == 2 && seatCapacity[5] == true && seatCapacity[6] == true && seatCapacity[7] == true && seatCapacity[8] == true && seatCapacity[9] == true) {
                System.out.println("Economy is full. Would you like to try the Firstclass?%n");
                System.out.println("Enter 1 for no or 2 for yes");
                planeClass = input.nextInt();
                if (planeClass == 1) {
                    System.out.println("Next flight leaves in 3 hours");
                    break;
                } else
                    continue;
            }
            if (planeClass == 2) {
                int seat = (firstClass[input.nextInt(5)]);
                while (seatCapacity[seat - 1] == true) {
                    seat = (firstClass[input.nextInt(5)]);
                    if (seatCapacity[seat - 1] == false) {
                        seatCapacity[seat - 1] = true;
                        System.out.println("PASSENGERS BOARDING PASS: ");
                        System.out.printf("Seat no: ", seat);
                        System.out.println("Economy%n");
                        break;
                    } else {
                        continue;
                    }
                }
            }
        }
    }
}