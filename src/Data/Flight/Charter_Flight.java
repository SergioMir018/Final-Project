package Data.Flight;

import Data.AirportControl;
import Data.Ticket;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Charter_Flight extends Flight{

    private String destiny_country;

    public Charter_Flight(String flight_name, String destiny_city, float travel_km, String flightAirline, String assigned_plane,
                          String terminal_name, LocalDateTime date, LocalDate partialDate, String destiny_country) {
        super(flight_name, destiny_city, travel_km, flightAirline, assigned_plane, terminal_name, date, partialDate);
        this.destiny_country = destiny_country;
    }

    @Override
    public void sellFirstClassTickets(float travel_km, String flightAirline) {
        this.firstClassTickets --;
        for (Ticket ticket : AirportControl.getTickets()) {
            if (ticket.getTicketAirline().equals(flightAirline)) {
                flightRevenue += (charterKmPrice(travel_km) + airportControl.getBaseNationalPrice() + ticket.getFirstClassPrice());
                passageCost = (charterKmPrice(travel_km) + airportControl.getBaseNationalPrice() + ticket.getFirstClassPrice());
                flightSeatNumber++;
            }
        }
    }

    @Override
    public void sellSecondClassTickets(float travel_km, String flightAirline) {
        this.secondClassTickets --;
        for (Ticket ticket : AirportControl.getTickets()) {
            if (ticket.getTicketAirline().equals(flightAirline)) {
                flightRevenue += (charterKmPrice(travel_km) + airportControl.getBaseNationalPrice() + ticket.getSecondClassPrice());
                passageCost = (charterKmPrice(travel_km) + airportControl.getBaseNationalPrice() + ticket.getSecondClassPrice());
                flightSeatNumber++;
            }
        }
    }

    @Override
    public void sellThirdClassTickets(float travel_km, String flightAirline) {
        this.thirdClassTickets --;
        for (Ticket ticket : AirportControl.getTickets()) {
            if (ticket.getTicketAirline().equals(flightAirline)) {
                flightRevenue += (charterKmPrice(travel_km) + airportControl.getBaseNationalPrice() + ticket.getThirdClassPrice());
                passageCost = (charterKmPrice(travel_km) + airportControl.getBaseNationalPrice() + ticket.getThirdClassPrice());
                flightSeatNumber++;
            }
        }
    }

    public float charterKmPrice(float travel_km) {
        return (float) ((travel_km * airportControl.getAirportKmPrice()) * 0.15);
    }

    @Override
    public String toString() {
        return  "Charter_Fligth" +
                "\ndestiny_country: " + destiny_country +
                "\ndestiny_City: " + destiny_City +
                "\ntravel_km: " + travel_km +
                "\nflightAirline: " + flightAirline +
                "\nassigned_plane: " + assigned_plane +
                "\nterminal_Name: " + terminal_Name +
                "\ndate: " + date +
                "\nfirstClassTickets: " + firstClassTickets +
                "\nsecondClassTickets: " + secondClassTickets +
                "\nthirdClassTickets: " + thirdClassTickets +
                "\nflightRevenue: " + flightRevenue;
    }
}
