package Data;

import java.io.Serial;
import java.io.Serializable;

public class AirportLoad implements Serializable {
    private float baseInternationalPrice;
    private float baseNationalPrice;
    private float baseCharterPrice;
    private float airportKmPrice;

    public AirportLoad(float km, float national, float international, float charter) {
        airportKmPrice = km;
        baseInternationalPrice = international;
        baseNationalPrice = national;
        baseCharterPrice = charter;
    }

    public float loadAirportKm() {
        return airportKmPrice;
    }

    public float loadBaseNational() {
        return baseNationalPrice;
    }

    public float loadBaseInternational() {
        return baseInternationalPrice;
    }

    public float loadBaseCharter() {
        return baseCharterPrice;
    }

    @Override
    public String toString() {
        return "\nAirportLoad{" +
                "\nbaseInternationalPrice=" + baseInternationalPrice +
                "\nbaseNationalPrice=" + baseNationalPrice +
                "\nbaseCharterPrice=" + baseCharterPrice +
                "\nairportKmPrice=" + airportKmPrice;
    }
}
