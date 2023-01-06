package Data.Flight;

public class International_Flight extends Flight{
    private final String destiny_country;
    private float internationalFlightCost;

    public International_Flight(String flight_name, String destiny_city, float travel_km, String assigned_plane, String terminal_Name,
                                String date, String hour, String minute, String destiny_country){
        super(flight_name, destiny_city, travel_km, assigned_plane, terminal_Name, date, hour, minute);
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

    @Override
    public String toString() {
        return "International_Flight" +
                "\ndestiny_country: " + destiny_country +
                "\ninternationalFlightCost: " + internationalFlightCost +
                "\ndestiny_City: " + destiny_City +
                "\ntravel_km: " + travel_km +
                "\nassigned_plane: " + assigned_plane +
                "\nterminal_Name: " + terminal_Name +
                "\ndate: " + date +
                "\nhour: " + hour +
                "\nminute: " + minute +
                "\nfirstClassTickets: " + firstClassTickets +
                "\nsecondClassTickets: " + secondClassTickets +
                "\nthirdClassTickets: " + thirdClassTickets;
    }
}
