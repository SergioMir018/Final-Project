package Data.Flight;

import java.io.Serializable;

public abstract class Flight implements Serializable {
    protected float travel_km;
    protected final String assigned_plane;
    protected String destiny_city;
    protected int firstClassTickets;
    protected int secondClassTickets;
    protected int thirdClassTickets;
    protected float flightRevenue;

    public Flight(float travel_km, String assigned_plane, String destiny_city){
        this.travel_km = travel_km;
        this.assigned_plane = assigned_plane;
        this.destiny_city = destiny_city;
    }

    public float getTravel_km(){
        return travel_km;
    }

    public String getAssigned_plane(){
        return assigned_plane;
    }

    public String getDestiny_city(){
        return destiny_city;
    }

    public void setClassTickets(int firstClassSeats,int secondClassSeats,int thirdClassSeats){
        firstClassTickets = firstClassSeats;
        secondClassTickets = secondClassSeats;
        thirdClassTickets = thirdClassSeats;
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

    public abstract void sellFirstClassTickets(int firstClassTickets, float travel_km);

    @Override
    public String toString() {
        return "\ntravel_km = " + travel_km +
                "\nassigned_plane = " + assigned_plane +
                "\ndestiny_city = " + destiny_city;
    }
}