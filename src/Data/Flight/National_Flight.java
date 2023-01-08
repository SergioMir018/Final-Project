package Data.Flight;

import Data.AirportControl;
import Data.Ticket;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class National_Flight extends Flight{

    public National_Flight(String flight_name, String destiny_city, float travel_km, String flightAirline,
                           String assigned_plane, String terminal_Name, LocalDateTime date, LocalDate partialDate){
        super(flight_name, destiny_city, travel_km, flightAirline, assigned_plane, terminal_Name, date, partialDate);
    }

    @Override
    public void sellFirstClassTickets(int firstClassTickets, float travel_km, String flight_Airline) {
        this.firstClassTickets -= firstClassTickets;
        for (Ticket ticket : AirportControl.getTickets()) {
            if (ticket.getTicketAirline().equals(flight_Airline)) {
                flightRevenue += (firstClassTickets * (nationalKmPrice(travel_km) + airportControl.getBaseNationalPrice() + ticket.getFirstClassPrice()));
                flightSeatNumber++;
            }
        }
    }

    @Override
    public void sellSecondClassTickets(int secondClassTickets, float travel_km, String flightAirline) {
        this.secondClassTickets -= secondClassTickets;
        for (Ticket ticket : AirportControl.getTickets()) {
            if (ticket.getTicketAirline().equals(flightAirline)) {
                flightRevenue += (secondClassTickets * (nationalKmPrice(travel_km) + airportControl.getBaseNationalPrice() + ticket.getSecondClassPrice()));
                flightSeatNumber++;
            }
        }
    }

    @Override
    public void sellThirdClassTickets(int thirdClassTickets, float travel_km, String flightAirline) {
        this.thirdClassTickets -= thirdClassTickets;
        for (Ticket ticket : AirportControl.getTickets()) {
            if (ticket.getTicketAirline().equals(flightAirline)) {
                flightRevenue += (thirdClassTickets * (nationalKmPrice(travel_km) + airportControl.getBaseNationalPrice() + ticket.getThirdClassPrice()));
                flightSeatNumber++;
            }
        }
    }

    public float nationalKmPrice(float travel_km) {
        return (float) ((travel_km * airportControl.getAirportKmPrice()) * 0.20);
    }

    @Override
    public String toString() {
        return "National_Flight" +
                "\ndestiny_city: " + destiny_City +
                "\ntravel_km: " + travel_km +
                "\nflightAirline: " + flightAirline +
                "\nassigned_plane: " + assigned_plane +
                "\nterminal_name: " + terminal_Name +
                "\ndate: " + date +
                "\nfirstClass: " + firstClassTickets +
                "\nsecondClass: " + secondClassTickets +
                "\nthirdClass: " + thirdClassTickets;
    }
}
