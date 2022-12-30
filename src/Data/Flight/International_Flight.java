package Data.Flight;

public class International_Flight extends Flight{
    private final String destiny_country;
    private float internationalFlightCost;

    public International_Flight(String destiny_city, float travel_km, String assigned_plane, String terminal_Name,
                                String date, String hour, String minute, String destiny_country){
        super(destiny_city, travel_km, assigned_plane, terminal_Name, date, hour, minute);
        this.destiny_country = destiny_country;
    }

    public String getDestiny_country() {
        return destiny_country;
    }

    public void setInternationalFlightCost(float internationalFlightCost){
        this.internationalFlightCost = internationalFlightCost;
    }

    public float getInternationalFlightCost(){
        return internationalFlightCost;
    }

    @Override
    public void sellFirstClassTickets(int firstClassTickets, float travel_km) {

    }
}
