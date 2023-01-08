package Data;

import Data.Flight.Flight;
import Data.Flight.International_Flight;
import Data.Flight.National_Flight;
import Data.Person.Passenger;

import java.io.Serializable;
import java.util.ArrayList;

public class Terminal implements Serializable {
    int terminal_Number;
    String terminal_Name;
    boolean isNational;
    boolean isCharter;

    static ArrayList<Flight> terminal_Flights = new ArrayList<Flight>();
    static ArrayList<Passenger> terminal_Sold_Passages = new ArrayList<>();
    static ArrayList<Flight> terminal_Arrivals = new ArrayList<>();

    public Terminal() {}

    public Terminal (String terminal_Name, int terminal_Number, boolean isNational, boolean isCharter){
        this.terminal_Name = terminal_Name;
        this.terminal_Number = terminal_Number;
        this.isNational = isNational;
        this.isCharter = isCharter;
    }

    public String getTerminal_Name() {
        return this.terminal_Name;
    }

    public int getTerminal_Number() {
        return this.terminal_Number;
    }

    public void addNewInternationalFlight(International_Flight international_flight) {
        terminal_Flights.add(international_flight);
    }

    public void addNewNationalFlight(National_Flight national_flight){
        terminal_Flights.add(national_flight);
    }

    public void addNewSoldPassage(Passenger passenger) {
        terminal_Sold_Passages.add(passenger);
    }

    public static ArrayList<Flight> getTerminal_Flights(){
        return terminal_Flights;
    }

    public static void setTerminal_Flights (ArrayList<Flight> terminal_Flights) {
        Terminal.terminal_Flights = terminal_Flights;
    }

    @Override
    public String toString() {
        return  "terminal_Name " + terminal_Name +
                "\nterminal_Number " + terminal_Number;
    }
}


