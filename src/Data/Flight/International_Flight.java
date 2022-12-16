package Data.Flight;

public class International_Flight extends Flight{
    private final String destiny_country;
    private float internationalFlightCost;

    public International_Flight(float travel_km, String assigned_plane, String destiny_city, String destiny_country){
        super(travel_km, assigned_plane, destiny_city);
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
