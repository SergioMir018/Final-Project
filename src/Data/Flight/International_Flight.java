package Data.Flight;

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
    public void sellFirstClassTickets(int firstClassTickets, float travel_km) {

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
