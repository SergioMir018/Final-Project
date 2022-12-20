package GUI;

import Data.Flight.Flight;
import Data.Terminal;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.ArrayList;

public class UserInterface {
    static JFrame frame = new JFrame();
    static JPanel background = new JPanel();
    static JPanel fillFlightPanel;
    public void starGUI(){
        Box menuBox = new Box(BoxLayout.Y_AXIS);

        JButton saveTerminalFlights = new JButton("Save Terminal Flights");
        JButton loadTerminalFlights = new JButton("Load Terminal Flights");
        JButton newFlight = new JButton("Add Flight");

        frame.setVisible(true);
        frame.getContentPane().add(BorderLayout.EAST, menuBox);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(background);
        frame.setBounds(50,50,600,600);
        frame.setMinimumSize(new Dimension(250, 250));

        background.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));

        saveTerminalFlights.addActionListener(new SaveActionListener());
        loadTerminalFlights.addActionListener(new LoadActionListener());
        newFlight.addActionListener(new NewFlight());

        menuBox.add(saveTerminalFlights);
        menuBox.add(loadTerminalFlights);
        menuBox.add(newFlight);

        //frame.pack();
    }

    public static class SaveActionListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("TerminalFlights.ser"));
                os.writeObject(Terminal.getTerminal_Flights());
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }

    public static class LoadActionListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                ObjectInputStream is = new ObjectInputStream(new FileInputStream("TerminalFlights.ser"));
                Terminal.setTerminal_Flights((ArrayList<Flight>) is.readObject());
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }

    public static class NewFlight implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            background.setVisible(false);
            fillFlightPanel = new JPanel();
            fillFlightPanel.setVisible(true);
            fillFlightPanel.setLayout(new BorderLayout());
            /*fillFlightPanel.setLayout(new BoxLayout(fillFlightPanel,BoxLayout.Y_AXIS));

            JLabel travel_Km_Label = new JLabel("Flight travel km: ");
            JLabel assigned_Plane_Label = new JLabel("Assigned plane: ");
            JLabel destiny_City_Label = new JLabel("Destiny city: ");

            JTextField travel_Km_text = new JTextField();
            JTextField assigned_Plane_text = new JTextField();
            JTextField destiny_City_text = new JTextField();

            fillFlightPanel.add(BorderLayout.WEST,travel_Km_Label);
            fillFlightPanel.add(BorderLayout.WEST,assigned_Plane_Label);
            fillFlightPanel.add(BorderLayout.WEST,destiny_City_Label);

            fillFlightPanel.add(BorderLayout.CENTER,travel_Km_text);
            fillFlightPanel.add(BorderLayout.CENTER,assigned_Plane_text);
            fillFlightPanel.add(BorderLayout.CENTER,destiny_City_text);*/

            fillFlightPanel.setBackground(Color.BLACK);
            frame.getContentPane().add(BorderLayout.WEST,fillFlightPanel);
        }
    }
}
