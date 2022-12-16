package Data.Flight;

public class National_Flight extends Flight{

    private float nationalFlightCost;
    private float nationalKmCost;

    public National_Flight(float travel_km, String assigned_plane, String destiny_city){
        super(travel_km, assigned_plane, destiny_city);
    }

    public void setNationalFlightCost(float nationalFlightCost){
        this.nationalFlightCost = nationalFlightCost;
    }

    public float getNationalFlightCost(){
        return nationalFlightCost;
    }

    public float getNationalKmCost() {
        return nationalKmCost;
    }

    public void setNationalKmCost(float nationalKmCost) {
        this.nationalKmCost = nationalKmCost;
    }

    @Override
    public void sellFirstClassTickets(int firstClassTickets, float travel_km) {
        this.firstClassTickets = firstClassTickets - 1;


    }
}
