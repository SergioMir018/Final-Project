package Data.Flight;

import Data.AirportControl;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

public abstract class Flight implements Serializable {
    protected final String flightName;
    protected String destiny_City;
    protected float travel_km;
    protected String flightAirline;
    protected final String assigned_plane;
    protected LocalDateTime date;
    protected LocalDate partialDate;
    protected int firstClassTickets;
    protected int secondClassTickets;
    protected int thirdClassTickets;
    protected String terminal_Name;
    protected float flightRevenue;
    protected int flightSeats;
    protected int flightSeatNumber = 0;

    protected float passageCost = 0;
    AirportControl airportControl = new AirportControl();

    public Flight(String flightName, String destiny_city, float travel_km, String flightAirline, String assigned_plane,
                  String terminal_Name, LocalDateTime date, LocalDate partialDate) {
        this.flightName = flightName;
        this.destiny_City = destiny_city;
        this.travel_km = travel_km;
        this.flightAirline = flightAirline;
        this.assigned_plane = assigned_plane;
        this.terminal_Name = terminal_Name;
        this.date = date;
        this.partialDate = partialDate;
    }

    public String getFlightName() {
        return flightName;
    }

    public float getTravel_km(){
        return travel_km;
    }

    public String getFlightAirline() {
        return flightAirline;
    }

    public String getAssigned_plane(){
        return assigned_plane;
    }

    public String getDestiny_city(){
        return destiny_City;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public LocalDate getPartialDate() {
        return partialDate;
    }

    public String getFlightTerminal() {
        return terminal_Name;
    }

    public float getFlightRevenue() {
        return flightRevenue;
    }

    public float getPassageCost() {
        return passageCost;
    }

    public int getFirstClassTickets() {
        return firstClassTickets;
    }

    public int getSecondClassTickets() {
        return secondClassTickets;
    }

    public int getThirdClassTickets() {
        return thirdClassTickets;
    }

    public void setClassTickets(int firstClassSeats,int secondClassSeats,int thirdClassSeats){
        firstClassTickets = firstClassSeats;
        secondClassTickets = secondClassSeats;
        thirdClassTickets = thirdClassSeats;
    }

    public void setFlightSeats(int seats) {
        flightSeats = seats;
    }

    public int getFlightSeatNumber() {
        return flightSeatNumber;
    }

    public abstract void sellFirstClassTickets(float travel_km, String flightAirline);

    public abstract void sellSecondClassTickets(float travel_km, String flightAirline);

    public abstract void sellThirdClassTickets(float travel_km, String flightAirline);

    @Override
    public String toString() {
        return "\ntravel_km = " + travel_km +
                "\nassigned_plane = " + assigned_plane +
                "\ndestiny_city = " + destiny_City;
    }
}