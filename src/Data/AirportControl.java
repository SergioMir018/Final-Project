package Data;

import Data.Flight.Flight;
import Data.Flight.National_Flight;
import Data.Plane;
import GUI.GUI;

import javax.swing.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class AirportControl implements Serializable {

    static ArrayList<Terminal> terminals = new ArrayList<>();
    static GUI gui = new GUI();

    public static ArrayList<Terminal> getTerminals() {
        return terminals;
    }

    public static void setTerminals(ArrayList<Terminal> terminals) {
        AirportControl.terminals = terminals;
    }

    public boolean newTerminal(String terminal_Name, int terminal_Number) {
        boolean cont = true;

        for (Terminal terminal : terminals) {
            if (Objects.equals(terminal.getTerminal_Name(),terminal_Name) && terminal.getTerminal_Number() == terminal_Number) {
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
            Terminal newTerminal = new Terminal(terminal_Name, terminal_Number);
            addTerminal(newTerminal);
        }

        return cont;
    }

    public void addTerminal(Terminal terminal){
        terminals.add(terminal);
    }

    public boolean newPlane(String plate, String model, int seats, String builder, String builder_Country,boolean isNational) {
        boolean cont = true;

        for (Plane plane : Plane.planes) {
            if (plane.getPlate().equals(plate)) {
                JOptionPane.showMessageDialog(null,"ERROR!\nEsta matricula ya esta registrada",
                        "ERROR!",JOptionPane.WARNING_MESSAGE);
                cont = false;
                break;
            }
        }

        if (cont) {
            Plane plane = new Plane(plate, model, seats, builder, builder_Country, isNational);
            Plane.planes.add(plane);
        }

        return cont;
    }

    public void newNationalFlight(String national_City, float travel_km, String assigned_Plane, String terminal,
                          String date, String hour, String minute) {

        boolean cont = true;

        checkFlights(cont,date,assigned_Plane,minute);

        if (cont) {
            National_Flight national_flight = new National_Flight(national_City, travel_km, assigned_Plane, terminal, date,
                    hour,minute);
            Terminal.terminal_Flights.add(national_flight);
        }
    }

    public void newInternationalFlight(String international_City, float travel_km, String assigned_Plane, String terminal,
                                       String date, String hour, String minute, String destined_Country) {
        boolean cont = true;

        checkFlights(cont,date,assigned_Plane,minute);

    }

    public boolean checkFlights(boolean cont, String date, String assigned_Plane, String minute) {
            for (Flight flight : Terminal.terminal_Flights) {
                if (flight.getDate().equals(date) && flight.getAssigned_plane().equals(assigned_Plane)) {
                    JOptionPane.showMessageDialog(null,"ERROR!\nEste avion ya esta asignado a otro " +
                            "vuelo en esta fecha", "ERROR!",JOptionPane.WARNING_MESSAGE);
                    cont = false;
                    break;
                } else if (flight.getMinute().equals(minute) && flight.getDate().equals(date)) {
                    JOptionPane.showMessageDialog(null,"ERROR!\nEste hora ya esta confirmada para " +
                            "otro vuelo", "ERROR!", JOptionPane.WARNING_MESSAGE);
                    cont = false;
                    break;
                }
            }
            return cont;
        }
    public static void main(String[] args) {
        gui.startGUI();
        Helper.testFeatures();
    }
}


