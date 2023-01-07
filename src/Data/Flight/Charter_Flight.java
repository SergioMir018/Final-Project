package Data.Flight;

import java.time.LocalDateTime;

public class Charter_Flight extends International_Flight{

    public Charter_Flight(String flight_name, String destiny_city, float travel_km, String assigned_plane,
                          String terminal_name, LocalDateTime date, String destiny_country) {
        super(flight_name, destiny_city, travel_km, assigned_plane, terminal_name, date, destiny_country);
    }
}
