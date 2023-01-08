package Data;

import Data.Flight.Flight;
import Data.Flight.National_Flight;
import Data.Person.User;

import java.util.Scanner;

public class Helper {
    public static void testFeatures() {
        char cont = 'n';
        int option = 0;
        Scanner input = new Scanner(System.in);

        do {
                System.out.print("Option: ");
                option = input.nextInt();

            if (option == 1) {
                for (Terminal terminal : AirportControl.terminals) {
                    System.out.println(terminal.toString() + "\n");
                }
            } else if (option == 2) {
                for (Flight flight:Terminal.terminal_Flights) {
                    System.out.println(flight.toString() + "\n");
                }
            } else if (option == 3) {
                for (Plane plane : Plane.planes) {
                    System.out.println(plane.toString() + "\n");
                }
            } else if (option == 4) {
                for (User user: AirportControl.users) {
                    System.out.println(user.toString() + "\n");
                }
            } else if (option == 5) {
                if (AirportControl.tickets.isEmpty()) {
                    System.out.println("Empty tickets");
                } else {
                    for (Ticket ticket: AirportControl.tickets) {
                        System.out.println(ticket.toString() + "\n");
                    }
                }

            }

            System.out.println("Continue (y/n): ");
            cont = input.next().charAt(0);
        } while (cont == 'y');
    }
}
