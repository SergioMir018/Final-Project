package Data.Person;

public class Passenger {
    private final String passengerName;
    private final String passengerLastName;
    private final String passengerDestiny;
    private final String passengerFlight;
    private final String passengerClass;
    private float passageCost;
    private final int flightSeatNumber;

    public Passenger(String passengerName, String passengerLastName, String passengerDestiny, String passengerFlight,
                     String passengerClass, int flightSeatNumber) {
        this.passengerName = passengerName;
        this.passengerLastName = passengerLastName;
        this.passengerDestiny = passengerDestiny;
        this.passengerFlight = passengerFlight;
        this.passengerClass = passengerClass;
        this.flightSeatNumber = flightSeatNumber;
    }
}
