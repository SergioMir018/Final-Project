package Data;

import java.io.Serializable;

public class Ticket implements Serializable {
    private final String ticketAirline;
    private float firstClassPrice ;
    private float secondClassPrice;
    private float thirdClassPrice ;

    public Ticket(String ticketAirline, float firstClassPrice, float secondClassPrice, float thirdClassPrice) {
        this.ticketAirline = ticketAirline;
        this.firstClassPrice = firstClassPrice;
        this.secondClassPrice = secondClassPrice;
        this.thirdClassPrice = thirdClassPrice;
    }

    public String getTicketAirline() {
        return ticketAirline;
    }

    public float getFirstClassPrice() {
        return firstClassPrice;
    }

    public float getSecondClassPrice() {
        return secondClassPrice;
    }

    public float getThirdClassPrice() {
        return thirdClassPrice;
    }

    public void setFirstClassPrice(float newFirstClassBasePrice) {
        firstClassPrice = newFirstClassBasePrice;
    }

    public void setSecondClassPrice(float newSecondClassBasePrice) {
        secondClassPrice = newSecondClassBasePrice;
    }

    public void setThirdClassPrice(float newThirdClassBasePrice) {
        thirdClassPrice = newThirdClassBasePrice;
    }

    @Override
    public String toString() {
        return "Ticket" +
                "\nticketAirline: " + ticketAirline +
                "\nfirstClassPrice: " + firstClassPrice +
                "\nsecondClassPrice: " + secondClassPrice +
                "\nthirdClassPrice: " + thirdClassPrice;
    }
}
