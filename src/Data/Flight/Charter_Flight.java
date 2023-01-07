package Data.Flight;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Charter_Flight extends International_Flight{

    public Charter_Flight(String flight_name, String destiny_city, float travel_km, String flightAirline, String assigned_plane,
                          String terminal_name, LocalDateTime date, LocalDate partialDate, String destiny_country) {
        super(flight_name, destiny_city, travel_km, flightAirline, assigned_plane, terminal_name, date, partialDate, destiny_country);
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
                "\nthirdClassTickets: " + thirdClassTickets;
    }
}
