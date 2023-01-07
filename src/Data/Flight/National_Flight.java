package Data.Flight;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class National_Flight extends Flight{

    public National_Flight(String flight_name, String destiny_city, float travel_km, String assigned_plane, String terminal_Name, LocalDateTime date){
        super(flight_name, destiny_city, travel_km, assigned_plane, terminal_Name, date);
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
                "\nassigned_plane: " + assigned_plane +
                "\nterminal_name: " + terminal_Name +
                "\ndate: " + date +
                "\nfirstClass: " + firstClassTickets +
                "\nsecondClass: " + secondClassTickets +
                "\nthirdClass: " + thirdClassTickets;
    }
}
