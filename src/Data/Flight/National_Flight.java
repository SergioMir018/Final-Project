package Data.Flight;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class National_Flight extends Flight{

    public National_Flight(String flight_name, String destiny_city, float travel_km, String flightAirline,
                           String assigned_plane, String terminal_Name, LocalDateTime date, LocalDate partialDate){
        super(flight_name, destiny_city, travel_km, flightAirline, assigned_plane, terminal_Name, date, partialDate);
    }

    @Override
    public void sellFirstClassTickets(int firstClassTickets, float travel_km) {
        this.firstClassTickets = firstClassTickets - 1;
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
