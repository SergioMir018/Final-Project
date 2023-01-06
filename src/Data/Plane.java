package Data;

import java.io.Serializable;
import java.util.ArrayList;

public class Plane implements Serializable {

    private final String plate;
    private final String model;
    private final int seats;
    private final String builder;
    private final String builder_Country;
    private final boolean isNational;
    private final boolean isCharter;
    private final String planeAirline;
    private final String planeRuteDestiny;
    private int firstClass_seats;
    private int secondClass_seats;
    private int thirdClass_seats;

    static ArrayList<Plane> planes = new ArrayList<>();

    public Plane (String plate, String model, int seats, String builder, String builder_Country, boolean isNational,
                  boolean isCharter, String planeAirline, String planeRuteDestiny){
        this.plate = plate;
        this.model = model;
        this.seats = seats;
        this.builder = builder;
        this.builder_Country = builder_Country;
        this.isNational = isNational;
        this.isCharter = isCharter;
        this.planeAirline = planeAirline;
        this.planeRuteDestiny = planeRuteDestiny;
    }

    public void setSeats(int seats){
        firstClass_seats = (int)(seats * 0.15);
        secondClass_seats = (int)(seats * 0.25);
        thirdClass_seats = (int)(seats * 0.6);
    }

    public int sellFirst_ClassSeat(int firstClass_seats){
        return firstClass_seats - 1;
    }

    public int sellSecond_ClassSeat(int secondClass_seats){
        return secondClass_seats - 1;
    }

    public int sellThird_ClassSeat(int thirdClass_seats){
        return thirdClass_seats - 1;
    }

    public String getPlate() {
        return plate;
    }

    public String getModel() {
        return model;
    }

    public int getSeats() {
        return seats;
    }

    public boolean getIsNational() {
        return isNational;
    }

    public boolean getIsCharter() {
        return isCharter;
    }

    public String getPlaneAirline() {
        return planeAirline;
    }

    public String getPlaneRuteDestiny() {
        return planeRuteDestiny;
    }

    public int getFirstClass_seats() {
        return firstClass_seats;
    }

    public int getSecondClass_seats() {
        return secondClass_seats;
    }

    public int getThirdClass_seats() {
        return thirdClass_seats;
    }

    public static ArrayList<Plane> getAirportPlanes() {
        return planes;
    }

    public static void setAirPortPlanes(ArrayList<Plane> planes) {
        Plane.planes = planes;
    }


    @Override
    public String toString() {
        return "plate: " + plate +
                "\nmodel: " + model +
                "\nseats: " + seats +
                "\nbuilder: " + builder +
                "\nbuilder_Country: " + builder_Country +
                "\nisNational: " + isNational +
                "\nisCharter: " + isCharter +
                "\nplaneAirline: " + planeAirline;
    }
}
