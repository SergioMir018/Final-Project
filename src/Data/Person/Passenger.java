package Data.Person;

import java.io.Serializable;
import java.time.LocalDate;

public class Passenger implements Serializable {
    private final String passengerName;
    private final String passengerLastName;
    private final String passengerDestiny;
    private final String passengerFlight;
    private final String passengerClass;
    private final LocalDate passageDate;
    private float passageCost;
    private final int flightSeatNumber;

    public Passenger(String passengerName, String passengerLastName, String passengerDestiny, String passengerFlight,
                     String passengerClass, LocalDate passageDate, int flightSeatNumber) {
        this.passengerName = passengerName;
        this.passengerLastName = passengerLastName;
        this.passengerDestiny = passengerDestiny;
        this.passengerFlight = passengerFlight;
        this.passengerClass = passengerClass;
        this.passageDate = passageDate;
        this.flightSeatNumber = flightSeatNumber;
    }
}
