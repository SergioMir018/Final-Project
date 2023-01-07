package Data.Flight;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

public abstract class Flight implements Serializable {
    protected final String flightName;
    protected String destiny_City;
    protected float travel_km;
    protected final String assigned_plane;
    protected LocalDateTime date;
    protected int firstClassTickets;
    protected int secondClassTickets;
    protected int thirdClassTickets;
    protected String terminal_Name;
    protected float flightRevenue;

    public Flight(String flightName, String destiny_city, float travel_km, String assigned_plane,String terminal_Name, LocalDateTime date) {
        this.flightName = flightName;
        this.destiny_City = destiny_city;
        this.travel_km = travel_km;
        this.assigned_plane = assigned_plane;
        this.terminal_Name = terminal_Name;
        this.date = date;
    }

    public String getFlightName() {
        return flightName;
    }

    public float getTravel_km(){
        return travel_km;
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

    public abstract void sellFirstClassTickets(int firstClassTickets, float travel_km);

    @Override
    public String toString() {
        return "\ntravel_km = " + travel_km +
                "\nassigned_plane = " + assigned_plane +
                "\ndestiny_city = " + destiny_City;
    }
}