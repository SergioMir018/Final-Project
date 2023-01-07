package Data;

public class Ticket {
    private final String ticketAirline;
    private float firstBaseClassPrice;
    private float secondBaseClassPrice;
    private float thirdBaseClassPrice;

    public Ticket(String ticketAirline, float firstClassPrice, float secondClassPrice, float thirdClassPrice) {
        this.ticketAirline = ticketAirline;
        this.firstBaseClassPrice = firstClassPrice;
        this.secondBaseClassPrice = secondClassPrice;
        this.thirdBaseClassPrice = thirdClassPrice;
    }

    public String getTicketAirline() {
        return ticketAirline;
    }

    public float getFirstBaseClassPrice() {
        return firstBaseClassPrice;
    }

    public float getSecondBaseClassPrice() {
        return secondBaseClassPrice;
    }

    public float getThirdBaseClassPrice() {
        return thirdBaseClassPrice;
    }

    public void setFirstBaseClassPrice(float newFirstClassBasePrice) {
        firstBaseClassPrice = newFirstClassBasePrice;
    }

    public void setSecondBaseClassPrice(float newSecondClassBasePrice) {
        secondBaseClassPrice = newSecondClassBasePrice;
    }

    public void setThirdBaseClassPrice(float newThirdClassBasePrice) {
        thirdBaseClassPrice = newThirdClassBasePrice;
    }
}
