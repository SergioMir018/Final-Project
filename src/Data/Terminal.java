package Data;

import Data.Flight.Flight;
import Data.Flight.International_Flight;
import Data.Flight.National_Flight;
import GUI.UserInterface;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

public class Terminal implements Serializable {

    int terminal_Number;
    String terminal_Name;

    static ArrayList<Flight> terminal_Flights = new ArrayList<Flight>();

    public Terminal (String terminal_Name, int terminal_Number){
        this.terminal_Name = terminal_Name;
        this.terminal_Number = terminal_Number;
    }

    public void addNewInternationalFlight(International_Flight international_flight) {
        terminal_Flights.add(international_flight);
    }

    public void addNewNationalFlight(National_Flight national_flight){
        terminal_Flights.add(national_flight);
    }

    public static ArrayList<Flight> getTerminal_Flights(){
        return terminal_Flights;
    }
    public static void setTerminal_Flights (ArrayList<Flight> terminal_Flights) {
        Terminal.terminal_Flights = terminal_Flights;
    }

    public static void main(String[] args) {
        /*Scanner input = new Scanner(System.in);

        char answer;
        int option = 0;
        do {
            System.out.print("Option: ");
            option = input.nextInt();

            switch (option){
                case 1 -> {
                    Plane.planes.add(Helper.new_Plane());
                    terminal_Flights.add(Helper.new_Flight());
                }
                case 2 -> {
                    for (Flight flight:terminal_Flights) {
                        System.out.print("\n" + flight.toString());
                    }
                }
                case 3 -> {
                    for(Plane plane:Plane.planes){
                        System.out.print("\n" + plane.toString());
                    }
                }
            }

            System.out.print("\nAnswer: ");
            answer = input.next().charAt(0);
        } while (answer == 'y');*/
        UserInterface gui = new UserInterface();
        gui.starGUI();
    }

}


