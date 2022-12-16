package Data;

import Data.Flight.Flight;
import Data.Flight.International_Flight;
import Data.Flight.National_Flight;
import java.util.Scanner;

public class Helper {
    public static Plane new_Plane(){
        Scanner input = new Scanner(System.in);

        Plane plane;

        String plane_plate;
        String plane_model;
        int seats = 0;
        String plane_builder;
        String builder_Country;

        System.out.print("\nplane plate: ");
        plane_plate = input.next();
        System.out.print("plane model: ");
        plane_model = input.next();
        System.out.print("plane seats: ");
        seats = input.nextInt();
        System.out.print("plane builder: ");
        plane_builder = input.next();
        System.out.print("plane builder country: ");
        builder_Country = input.next();

        plane = new Plane(plane_plate,plane_model,seats,plane_builder,builder_Country);
        plane.setSeats(seats);

        return plane;
    }

    public static Flight new_Flight() {
        Scanner input = new Scanner(System.in);

        Flight flight;


        float travel_km = 0;
        String assigned_plane;
        String destiny_city;

        System.out.print("travel km: ");
        travel_km = input.nextFloat();
        System.out.print("assigned plane: ");
        assigned_plane = input.next();
        System.out.print("destiny city: ");
        destiny_city = input.next();

        return flight = new National_Flight(travel_km,assigned_plane,destiny_city);
    }
}
