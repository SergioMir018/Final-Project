package Data.Flight;

import Data.AirportControl;
import Data.Ticket;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class International_Flight extends Flight{
    protected final String destiny_country;

    public International_Flight(String flight_name, String destiny_city, float travel_km, String flightAirline, String assigned_plane,
                                String terminal_Name, LocalDateTime date, LocalDate partialDate, String destiny_country){
        super(flight_name, destiny_city, travel_km, flightAirline, assigned_plane, terminal_Name, date, partialDate);
        this.destiny_country = destiny_country;
    }

    public String getDestiny_country() {
        return destiny_country;
    }

    @Override
    public void sellFirstClassTickets(int firstClassTickets, float travel_km, String flightAirline) {
        this.firstClassTickets -= firstClassTickets;
        for (Ticket ticket : AirportControl.getTickets()) {
            if (ticket.getTicketAirline().equals(flightAirline)) {
                flightRevenue += (firstClassTickets * (internationalKmPrice(travel_km) + airportControl.getBaseInternationalPrice() + ticket.getFirstClassPrice()));
            }
        }
    }

    @Override
    public void sellSecondClassTickets(int secondClassTickets, float travel_km, String flightAirline) {
        this.secondClassTickets -= secondClassTickets;
        for (Ticket ticket : AirportControl.getTickets()) {
            if (ticket.getTicketAirline().equals(flightAirline)) {
                flightRevenue += (secondClassTickets * (internationalKmPrice(travel_km) + airportControl.getBaseInternationalPrice() + ticket.getSecondClassPrice()));
            }
        }
    }

    @Override
    public void sellThirdClassTickets(int thirdClassTickets, float travel_km, String flightAirline) {
        this.thirdClassTickets -= thirdClassTickets;
        for (Ticket ticket : AirportControl.getTickets()) {
            if (ticket.getTicketAirline().equals(flightAirline)) {
                flightRevenue += (thirdClassTickets * (internationalKmPrice(travel_km) + airportControl.getBaseInternationalPrice() + ticket.getThirdClassPrice()));
            }
        }
    }

    public float internationalKmPrice(float travel_km) {
        return (float) ((travel_km * airportControl.getAirportKmPrice()) * 0.10);
    }

    @Override
    public String toString() {
        return "International_Flight" +
                "\ndestiny_country: " + destiny_country +
                "\ndestiny_City: " + destiny_City +
                "\ntravel_km: " + travel_km +
                "\nflightAirline: " + flightAirline +
                "\nassigned_plane: " + assigned_plane +
                "\nterminal_Name: " + terminal_Name +
                "\ndate: " + date +
                "\nfirstClassTickets: " + firstClassTickets +
                "\nsecondClassTickets: " + secondClassTickets +
                "\nthirdClassTickets: " + thirdClassTickets;
    }
}
