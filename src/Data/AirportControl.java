package Data;

import Data.Flight.Charter_Flight;
import Data.Flight.Flight;
import Data.Flight.International_Flight;
import Data.Flight.National_Flight;
import Data.Person.Passenger;
import Data.Person.User;
import GUI.GUI;

import javax.swing.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Objects;

public class AirportControl implements Serializable {

    static ArrayList<Terminal> terminals = new ArrayList<>();
    static ArrayList<Ticket> tickets = new ArrayList<>();
    static ArrayList<User> users = new ArrayList<>();
    float baseNationalPrice;
    float basInternationalPrice;
    float baseCharterPrice;
    float airportKmPrice;
    static GUI gui = new GUI();

    public void setKmPrice(float kmPrice) {
        airportKmPrice = kmPrice;
    }

    public void setBaseNationalPrice(float baseNationalPrice) {
        this.baseNationalPrice = baseNationalPrice;
    }

    public void setBaseInternationalPrice(float baseInternationalPrice) {
        this.basInternationalPrice = baseInternationalPrice;
    }

    public void setBaseCharterPrice(float baseCharterPrice) {
        this.baseCharterPrice = baseCharterPrice;
    }

    public float getBaseNationalPrice() {
        return baseNationalPrice;
    }

    public float getBaseInternationalPrice() {
        return basInternationalPrice;
    }

    public float getBaseCharterPrice() {
        return baseCharterPrice;
    }

    public float getAirportKmPrice() {
        return airportKmPrice;
    }

    public static ArrayList<Terminal> getTerminals() {
        return terminals;
    }

    public static ArrayList<Ticket> getTickets() {
        return tickets;
    }

    public static void setTerminals(ArrayList < Terminal > terminals) {
        AirportControl.terminals = terminals;
    }

    public boolean newTerminal(String terminal_Name, int terminal_Number, boolean isNational, boolean isCharter) {
        boolean cont = true;

        for (Terminal terminal: terminals) {
            if (Objects.equals(terminal.getTerminal_Name(), terminal_Name) && terminal.getTerminal_Number() == terminal_Number) {
                JOptionPane.showMessageDialog(null, "ERROR!\nEste nombre y numero ya estan" +
                    " registrados", "ERROR!", JOptionPane.WARNING_MESSAGE);
                cont = false;
                break;
            }
            if (Objects.equals(terminal.getTerminal_Name(), terminal_Name)) {
                JOptionPane.showMessageDialog(null, "ERROR!\nEste nombre de terminal ya esta" +
                    " registrado", "ERROR!", JOptionPane.WARNING_MESSAGE);
                cont = false;
                break;
            }
            if (terminal.getTerminal_Number() == terminal_Number) {
                JOptionPane.showMessageDialog(null, "ERROR!\nEste numero de terminal ya esta" +
                    " registrado", "ERROR!", JOptionPane.WARNING_MESSAGE);
                cont = false;
                break;
            }
        }

        if (cont) {
            Terminal newTerminal = new Terminal(terminal_Name, terminal_Number,isNational,isCharter);
            addTerminal(newTerminal);
        }

        return cont;
    }

    public void addTerminal(Terminal terminal) {
        terminals.add(terminal);
    }

    public boolean newPlane(String plate, String model, int seats, String builder, String builder_Country,
                            boolean isNational, boolean isCharter, String planeAirline, String planeRuteDestiny) {
        boolean cont = true;

        for (Plane plane: Plane.planes) {
            if (plane.getPlate().equals(plate)) {
                JOptionPane.showMessageDialog(null, "ERROR!\nEsta matricula ya esta registrada",
                    "ERROR!", JOptionPane.WARNING_MESSAGE);
                cont = false;
                break;
            }
        }

        if (seats > 615 || seats < 110) {
            JOptionPane.showMessageDialog(null, "ERROR!\nEste numero de asientos es invalido",
                    "ERROR!", JOptionPane.WARNING_MESSAGE);
            cont = false;
        }

        if (cont) {
            Plane plane = new Plane(plate, model, seats, builder, builder_Country, isNational, isCharter, planeAirline,
                    planeRuteDestiny);
            plane.setSeats(seats);
            Plane.planes.add(plane);
        }

        return cont;
    }

    public void newNationalFlight(String flight_Name, String national_City, float travel_km, String flightAirline,
                                  String assigned_Plane, String terminal, LocalDateTime date, LocalDate partialDate) {

        if (checkFlights(flight_Name, date)) {
            National_Flight national_flight = new National_Flight(flight_Name, national_City, travel_km, flightAirline,
                    assigned_Plane, terminal, date, partialDate);

            for (Plane plane : Plane.planes) {
                if (plane.getPlate().equals(assigned_Plane)) {
                    national_flight.setClassTickets(plane.getFirstClass_seats(), plane.getSecondClass_seats(), plane.getThirdClass_seats());
                    national_flight.setFlightSeats(plane.getSeats());
                }
            }

            Terminal.terminal_Flights.add(national_flight);
        }
    }

    public void newInternationalFlight(String flight_Name, String international_City, float travel_km, String flightAirline,
                                       String assigned_Plane, String terminal, LocalDateTime date, LocalDate partialDate,
                                       String destined_Country) {

        if (checkFlights(flight_Name, date)) {
            International_Flight international_flight = new International_Flight(flight_Name, international_City, travel_km,
                    flightAirline, assigned_Plane, terminal, date, partialDate, destined_Country);

            for (Plane plane : Plane.planes) {
                if (plane.getPlate().equals(assigned_Plane)) {
                    international_flight.setClassTickets(plane.getFirstClass_seats(), plane.getSecondClass_seats(), plane.getThirdClass_seats());
                    international_flight.setFlightSeats(plane.getSeats());
                }
            }

            Terminal.terminal_Flights.add(international_flight);
        }
    }

    public void newCharterFlight(String flight_Name, String international_City, float travel_km, String flightAirline,
                                 String assigned_Plane, String terminal, LocalDateTime date, LocalDate partialDate, String destined_Country) {
        if (checkFlights(flight_Name, date)) {
            Charter_Flight charter_flight = new Charter_Flight(flight_Name, international_City, travel_km, flightAirline,
                    assigned_Plane, terminal, date, partialDate, destined_Country);

            for (Plane plane : Plane.planes) {
                if (plane.getPlate().equals(assigned_Plane)) {
                    charter_flight.setClassTickets(plane.getFirstClass_seats(), plane.getSecondClass_seats(), plane.getThirdClass_seats());
                    charter_flight.setFlightSeats(plane.getSeats());
                }
            }

            Terminal.terminal_Flights.add(charter_flight);
        }
    }

    public boolean checkFlights(String flight_Name, LocalDateTime date) {
        boolean cont =true;

        for (Flight flight: Terminal.terminal_Flights) {
            if (flight.getDate().equals(date)) {
                JOptionPane.showMessageDialog(null, "ERROR!\nEste hora ya esta confirmada para " +
                    "otro vuelo", "ERROR!", JOptionPane.WARNING_MESSAGE);
                cont = false;
                break;
            } else if (flight.getFlightName().equals(flight_Name)) {
                JOptionPane.showMessageDialog(null, "ERROR!\nEste nombre ya esta asignado para " +
                        "otro vuelo", "ERROR!", JOptionPane.WARNING_MESSAGE);
                cont = false;
                break;
            }
        }
        return cont;
    }

    public boolean checkAdminUser(String userName, String userPassword) {
        String reas = "";
        boolean cont = false;

        for (User user : users) {
            if (user.isAdmin()) {
                if (user.getUserName().equals(userName) && user.getUserPassword().equals(userPassword)) {
                    reas = "";
                    cont = true;
                }else if (user.getUserName() != userName && user.getUserPassword() != userPassword) {
                    reas = "name&password";
                    cont = false;
                }else if (user.getUserName() != userName) {;
                    reas = "name";
                    cont = false;
                }else if (user.getUserPassword() != userPassword) {
                    reas = "password";
                    cont = false;
                }
            }
        }

        switch (reas) {
            case "name&password" -> JOptionPane.showMessageDialog(null, "ERROR!\nEl nombre de usuario y la contraseña " +
                            "son incorrectos", "ERROR!", JOptionPane.WARNING_MESSAGE);
            case "name" -> JOptionPane.showMessageDialog(null, "ERROR!\nEl nombre de usuario es incorrecto",
                    "ERROR!", JOptionPane.WARNING_MESSAGE);
            case "password" -> JOptionPane.showMessageDialog(null, "ERROR!\nLa contraseña es incorrecta",
                    "ERROR!", JOptionPane.WARNING_MESSAGE);
        }

        return cont;
    }

    public boolean newPassage(String name, String last_Name, String passenger_Destiny, String passenger_Flight,
                           String passengerClass, int passageNumber) {
        boolean cont = true;
        Terminal terminal = new Terminal();

        if (sellPassage(passenger_Flight, passageNumber, passengerClass)) {
            int SeatNumber = 0;
            for (Flight flight : Terminal.getTerminal_Flights()) {
                if (flight.getFlightName().equals(passenger_Flight)) {
                    SeatNumber = flight.getFlightSeatNumber();
                    break;
                }
            }

            for (int i = 0; i < passageNumber; i++) {
                Passenger passenger = new Passenger(name, last_Name, passenger_Destiny, passenger_Flight, passengerClass,
                        SeatNumber);
                terminal.addNewSoldPassage(passenger);
            }
        } else {
            cont = false;
        }
        return cont;
    }

    public boolean sellPassage(String flight_Name, int passageQuantity, String passageClass) {
        boolean cont = true;

        for (Flight flight : Terminal.getTerminal_Flights()) {
            if (flight.getFlightName().equals(flight_Name)) {
                switch (passageClass) {
                    case "Primera Clase" -> {
                        if (passageQuantity < flight.getFirstClassTickets()) {
                            if (flight instanceof National_Flight) {
                                flight.sellFirstClassTickets(passageQuantity, flight.getTravel_km(), flight.getFlightAirline());
                            } else if (flight instanceof International_Flight) {
                                flight.sellFirstClassTickets(passageQuantity, flight.getTravel_km(), flight.getFlightAirline());
                            } else if (flight instanceof Charter_Flight) {
                                flight.sellFirstClassTickets(passageQuantity, flight.getTravel_km(), flight.getFlightAirline());
                            }
                        }
                    }
                    case "Clase Ejecutiva" -> {
                        if (flight instanceof National_Flight) {
                            flight.sellSecondClassTickets(passageQuantity, flight.getTravel_km(), flight.getFlightAirline());
                        } else if (flight instanceof International_Flight) {
                            flight.sellSecondClassTickets(passageQuantity, flight.getTravel_km(), flight.getFlightAirline());
                        } else if (flight instanceof Charter_Flight)
                            flight.sellSecondClassTickets(passageQuantity, flight.getTravel_km(), flight.getFlightAirline());
                    }
                    case "Clase Turista" -> {
                        if (flight instanceof National_Flight) {
                            flight.sellThirdClassTickets(passageQuantity, flight.getTravel_km(), flight.getFlightAirline());
                        } else if (flight instanceof International_Flight) {
                            flight.sellThirdClassTickets(passageQuantity, flight.getTravel_km(), flight.getFlightAirline());
                        } else if (flight instanceof Charter_Flight) {
                            flight.sellThirdClassTickets(passageQuantity, flight.getTravel_km(), flight.getFlightAirline());
                        }
                    }
                }
            } else {
                cont = false;
            }
        }
        return cont;
    }

public void newTicket() {

}


    public static void main(String[] args) {
        Terminal terminal1 = new Terminal("Terminal 1 Vuelos Nacionales", 1,true,false);
        Terminal terminal2 = new Terminal("Terminal 2 Vuelos Chartes", 2, false, true);
        Terminal terminal3 = new Terminal("Terminal 3 Vuelos Internacionales", 3, false, false);
        User adminUser1 = new User("SergioMir", "sergio2002",true);
        User user1 = new User("Idania","123",false);

        terminals.add(terminal1);
        terminals.add(terminal2);
        terminals.add(terminal3);
        users.add(adminUser1);
        users.add(user1);

        gui.startGUI();
        Helper.testFeatures();
    }
}