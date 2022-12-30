package Data.Flight;

public class National_Flight extends Flight{

    private float nationalFlightCost;
    private float nationalKmCost;

    public National_Flight(String destiny_city, float travel_km, String assigned_plane, String terminal_Name, String date,
                           String hour, String minute){
        super(destiny_city, travel_km, assigned_plane, terminal_Name, date, hour, minute);
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

    @Override
    public String toString() {
        return "National_Flight" +
                "\ntravel_km: " + travel_km +
                "\nassigned_plane: " + assigned_plane +
                "\ndestiny_city: " + destiny_City +
                "\nterminal_name: " + terminal_Name +
                "\ndate: " + date +
                "\nhour: " + hour +
                "\nminute: " + minute;
    }
}
