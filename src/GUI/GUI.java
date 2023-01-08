package GUI;

import Data.AirportControl;
import Data.Plane;
import Data.Terminal;
import Data.Flight.Flight;

import javax.swing.*;
import javax.swing.border.EtchedBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;

public class GUI {
    private JButton save_Button;
    private JButton load_Button;
    private JPanel Main_Panel;
    private JLabel travel_Km_Label;
    private JLabel destined_City_Label;
    private JPanel new_National_Flight_Panel;
    private JPanel menu_Panel;
    private JButton menu_Button;
    private JPanel option_Panel;
    private JButton add_National_Flight_Button;
    private JCheckBox international_Flight_CheckBox;
    private JCheckBox national_Flight_CheckBox;
    private JPanel type_Flight_Panel;
    private JButton next_Type_Flight_Button;
    private JPanel new_International_Flight_Panel;
    private JComboBox<String> international_Country_ComboBox;
    private JLabel destinedCountryLabel;
    private JComboBox<String> destined_Region_ComboBox;
    private JPanel international_Country_Panel;
    private JButton next_InternationalCountry_Button;
    private JComboBox<String> international_City_ComboBox;
    private JPanel international_City_Panel;
    private JComboBox<String> national_City_ComboBox;
    private JButton new_Terminal_Button;
    private JTextField terminal_Name_Text;
    private JTextField terminal_Number_Text;
    private JPanel new_Terminal_Panel;
    private JButton add_Terminal_Button;
    public JComboBox<String> national_Terminal_ComboBox;
    public JComboBox<String> international_Terminal_ComboBox;
    private JLabel save_Label;
    private JPanel save_Panel;
    private JPanel load_Panel;
    private JLabel saveErrorLabel;
    private JLabel load_Error_Label;
    private JLabel international_Km_Label;
    private JPanel save_Error_Panel;
    private JPanel load_Error_Panel;
    private JLabel national_Km_Label;
    private JPanel national_Km_Panel;
    private JButton confirm_National_Destiny_Button;
    private JLabel destinedCityLabel;
    private JComboBox<String> national_Day_ComboBox;
    private JButton confirm_International_Destiny_Button;
    private JButton add_International_Flight_Button;
    private JPanel international_Km_Panel;
    private JComboBox<String> national_Month_ComboBox;
    private JComboBox<String> national_Year_ComboBox;
    private JComboBox<String> national_Hour_ComboBox;
    private JComboBox<String> national_Minutes_ComboBox;
    private JComboBox<String> international_Day_ComboBox;
    private JComboBox<String> international_Month_ComboBox;
    private JComboBox<String> international_Year_ComboBox;
    private JComboBox<String> international_Hour_ComboBox;
    private JComboBox<String> international_Minute_ComboBox;
    private JLabel flight_Type_Label;
    private JButton new_Plane_Button;
    private JTextField plane_Plate_Text;
    private JTextField plane_Model_Text;
    private JTextField plane_Seats_Text;
    private JTextField plane_Builder_Text;
    private JComboBox<String> plane_Builder_Country_ComboBox;
    private JLabel national_Terminal_Label;
    private JLabel national_Date_Label;
    private JLabel national_Hour_Label;
    private JLabel plane_Plate_Label;
    private JLabel plane_Model_Label;
    private JLabel plane_Seats_Label;
    private JLabel plane_Maker_Label;
    private JLabel plane_Maker_Country_Label;
    private JButton add_New_Plane_Button;
    private JPanel new_Plane_Panel;
    private JComboBox<String> national_Assigned_Plane_ComboBox;
    private JCheckBox national_Plane_CheckBox;
    private JCheckBox international_Plane_CheckBox;
    private JComboBox<String> international_Assigned_Plane_ComboBox;
    private JLabel load_Label;
    private JPanel new_Charter_Flight_Panel;
    private JCheckBox charter_Plane_CheckBox;
    private JComboBox<String> charter_Country_ComboBox;
    private JComboBox<String> charter_City_ComboBox;
    private JComboBox<String> international_Airline_ComboBox;
    private JCheckBox charter_Flight_CheckBox;
    private JComboBox<String> charter_Region_ComboBox;
    private JComboBox<String> charter_Terminal_ComboBox;
    private JComboBox<String> charter_Day_ComboBox;
    private JComboBox<String> charter_Month_ComboBox;
    private JComboBox<String> charter_Year_ComboBox;
    private JComboBox<String> charter_Hour_ComboBox;
    private JComboBox<String> charter_Minute_ComboBox;
    private JComboBox<String> charter_Assigned_Plane_ComboBox;
    private JComboBox<String> charter_Airline_ComboBox;
    private JButton admin_Options_Button;
    private JButton new_Arrival_Button;
    private JButton new_FlightOut_Button;
    private JComboBox<String> national_Airline_ComboBox;
    private JComboBox<String> international_Region_ComboBox;
    private JCheckBox national_Terminal_CheckBox;
    private JCheckBox international_Terminal_CheckBox;
    private JCheckBox charter_Terminal_CheckBox;
    private JButton next_CharterRegion_Button;
    private JButton next_CharterCountry_Button;
    private JButton confirm_Charter_Destiny_Button;
    private JLabel charter_Km_Label;
    private JTextField admin_User_Name_Text;
    private JPasswordField admin_Password_Text;
    private JButton options_Admin_Button;
    private JPanel admin_Credentials_Panel;
    private JPanel admin_Options_Panel;
    private JButton next_InternationalRegion_Button;
    private JButton adminBack_Options_Button;
    private JLabel international_Terminal_Label;
    private JPanel type_Plane_Panel;
    private JButton next_Type_Plane_Button;
    private JComboBox<String> plane_Airline_ComboBox;
    private JLabel planeNational_Type_Label;
    private JLabel planeInternational_Type_Label;
    private JLabel planeCharter_Type_Label;
    private JButton charter_ConfirmAirline_Button;
    private JPanel charter_Country_Panel;
    private JPanel charter_City_Panel;
    private JPanel charter_Km_Panel;
    private JButton international_ConfirmAirline_Button;
    private JPanel charter_Assigned_Plane_Panel;
    private JPanel international_Assigned_Plane_Panel;
    private JPanel international_Airline_Panel;
    private JButton national_ConfirmAirline_Button;
    private JLabel assigned_National_Plane_Label;
    private JPanel national_Assigned_Plane_Panel;
    private JPanel national_Airline_Panel;
    private JPanel charter_Airline_Panel;
    private JComboBox<String> plane_Rute_Destiny_ComboBox;
    private JButton confirm_PlaneAirline_Button;
    private JPanel plane_Rute_Panel;
    private JButton sell_Flight_Passage_Button;
    private JPanel type_Passage_Panel;
    private JCheckBox national_Passage_CheckBox;
    private JCheckBox international_Passage_CheckBox;
    private JCheckBox charter_Passage_CheckBox;
    private JButton next_Type_Passage_Button;
    private JPanel sell_Passage_Panel;
    private JTextField national_Flight_Name_Text;
    private JTextField international_Flight_Name_Text;
    private JTextField charter_Flight_Name_Text;
    private JComboBox<String> passenger_Destiny_ComboBox;
    private JComboBox<String> passenger_Airline_ComboBox;
    private JComboBox<String> passage_Day_ComboBox;
    private JComboBox<String> passage_Month_ComboBox;
    private JComboBox<String> passage_Class_ComboBox;
    private JButton confirm_Passage_Date_Button;
    private JTextField passenger_Name_Text;
    private JComboBox<String> passage_Flight_ComboBox;
    private JTextField passenger_LastName_Text;
    private JPanel passenger_Airline_Panel;
    private JComboBox<String> passage_Year_ComboBox;
    private JPanel passage_Flight_Panel;
    private JButton add_Charter_Flight_Button;
    private JButton change_AirlineTicket_Price_Button;
    private JComboBox<String> airline_Price_ComboBox;
    private JPanel change_Ticket_Price_Panel;
    private JTextField firstClass_Price_Text;
    private JPanel firstClass_Price_Panel;
    private JTextField secondClass_Price_Text;
    private JTextField thirdClass_Price_Text;
    private JPanel type_Ticket_Panel;
    private JCheckBox firstClass_Price_CheckBox;
    private JCheckBox secondClass_Price_CheckBox;
    private JCheckBox thirdClass_Price_CheckBox;
    private JButton next_Type_Ticket_Button;
    private JButton change_Ticket_Price_Button;
    private JButton change_AirportTicket_Price;
    private JPanel passage_Country_Panel;
    private JPanel passage_Destiny_Panel;
    private JComboBox<String> passage_Country_ComboBox;
    private JButton confirm_Passage_Country_Button;
    private JButton passenger_Destiny_NextButton;
    private JLabel passenger_Destiny_Label;
    private JTextField passage_Quantity_Text;
    private JButton sell_Passage;
    private JPanel secondClass_Price_Panel;
    private JPanel third_Class_Price_Panel;
    private JLabel thirdClass_Price_Label;

    AirportControl airportControl = new AirportControl();
    String[] empty = {""};
    String[] days = {"","1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19",
            "20","21","22","23","24","25","26","27","28","29","30","31"};
    String[] months = {"","1","2","3","4","5","6","7","8","9", "10","11","12"};
    String[] years = {"","2022","2023","2024","2025","2026","2027","2028","2029","2030"};
    String[] hours = {"","00","01","02","03","04","05","06","07","08","09","10","11","12","13","14","15","16","17",
            "18","19","20","21","22","23","24"};
    String[] minutes = {"","00","05","10","15","20","25","30","35","40","45","50","55"};
    String[] ticketClass = {"", "Primera Clase", "Clase Ejecutiva", "Clase Turista"};
    String[] cubaCities = {"", "Baracoa", "Cayo Coco", "Guantánamo", "Holguín", "Nueva Gerona", "Santiago de Cuba"};

    public GUI() {
        national_Terminal_ComboBox.setModel(new DefaultComboBoxModel<>(empty));
        international_Terminal_ComboBox.setModel(new DefaultComboBoxModel<>(empty));
        charter_Terminal_ComboBox.setModel(new DefaultComboBoxModel<>(empty));
        national_Assigned_Plane_ComboBox.setModel(new DefaultComboBoxModel<>(empty));
        international_Assigned_Plane_ComboBox.setModel(new DefaultComboBoxModel<>(empty));
        charter_Assigned_Plane_ComboBox.setModel(new DefaultComboBoxModel<>(empty));

        for (Terminal terminal: AirportControl.getTerminals()) {
            if (terminal.getTerminal_Number() == 1) {
                national_Terminal_ComboBox.addItem(terminal.getTerminal_Name());
            } else if (terminal.getTerminal_Number() == 2) {
                charter_Terminal_ComboBox.addItem(terminal.getTerminal_Name());
            } else if (terminal.getTerminal_Number() == 3) {
                international_Terminal_ComboBox.addItem(terminal.getTerminal_Name());
            }
        }

        new_National_Flight_Panel.setVisible(false);
        new_International_Flight_Panel.setVisible(false);
        menu_Panel.setVisible(true);
        type_Flight_Panel.setVisible(false);
        international_Country_Panel.setVisible(false);
        international_City_Panel.setVisible(false);
        option_Panel.setVisible(false);
        new_Terminal_Panel.setVisible(false);
        save_Panel.setVisible(false);
        save_Error_Panel.setVisible(false);
        load_Panel.setVisible(false);
        load_Error_Panel.setVisible(false);
        national_Km_Panel.setVisible(false);
        international_Km_Panel.setVisible(false);
        new_Plane_Panel.setVisible(false);
        new_Charter_Flight_Panel.setVisible(false);
        admin_Credentials_Panel.setVisible(false);
        admin_Options_Panel.setVisible(false);
        adminBack_Options_Button.setVisible(false);
        type_Plane_Panel.setVisible(false);
        planeNational_Type_Label.setVisible(false);
        planeInternational_Type_Label.setVisible(false);
        planeCharter_Type_Label.setVisible(false);
        charter_City_Panel.setVisible(false);
        charter_Country_Panel.setVisible(false);
        charter_Km_Panel.setVisible(false);
        next_CharterCountry_Button.setVisible(false);
        confirm_Charter_Destiny_Button.setVisible(false);
        national_Airline_Panel.setVisible(false);
        national_Assigned_Plane_Panel.setVisible(false);
        international_Airline_Panel.setVisible(false);
        international_Assigned_Plane_Panel.setVisible(false);
        charter_Airline_Panel.setVisible(false);
        charter_Assigned_Plane_Panel.setVisible(false);
        national_ConfirmAirline_Button.setVisible(false);
        international_ConfirmAirline_Button.setVisible(false);
        charter_ConfirmAirline_Button.setVisible(false);
        plane_Rute_Panel.setVisible(false);
        type_Passage_Panel.setVisible(false);
        sell_Passage_Panel.setVisible(false);
        change_Ticket_Price_Panel.setVisible(false);
        type_Ticket_Panel.setVisible(false);
        passenger_Airline_Panel.setVisible(false);
        passage_Flight_Panel.setVisible(false);
        passage_Country_Panel.setVisible(false);
        passage_Destiny_Panel.setVisible(false);
        confirm_Passage_Country_Button.setVisible(false);
        confirm_Passage_Date_Button.setVisible(false);
        passenger_Destiny_NextButton.setVisible(false);

        new_National_Flight_Panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        new_International_Flight_Panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        Main_Panel.setBorder(BorderFactory.createEmptyBorder(0, 10, 10, 10));
        menu_Panel.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));

        menu_Button.addActionListener(new MenuActionListenerActionListener());
        save_Button.addActionListener(new SaveButtonActionListener());
        load_Button.addActionListener(new LoadButtonActionListener());
        new_FlightOut_Button.addActionListener(new NewFlightActionListener());
        next_Type_Flight_Button.addActionListener(new NextTypeFlightButtonActionListener());
        new_Plane_Button.addActionListener(new NewPlaneButtonActionListener());
        next_Type_Plane_Button.addActionListener(new NextPlaneButtonActionListener());
        sell_Flight_Passage_Button.addActionListener(new SellPassageMenuButtonActionListener());
        national_Passage_CheckBox.addActionListener(new NationalPassageCheckBoxActionListener());
        international_Passage_CheckBox.addActionListener(new InternationalPassageCheckBoxActionListener());
        charter_Passage_CheckBox.addActionListener(new CharterPassageCheckBoxActionListener());
        next_Type_Passage_Button.addActionListener(new NextTypePassageButtonActionListener());

        admin_Options_Button.addActionListener(new OptionsActionListener());
        options_Admin_Button.addActionListener(new AdminActionListener());
        adminBack_Options_Button.addActionListener(new AdminBackOptionsButtonActionListener());
        change_AirlineTicket_Price_Button.addActionListener(new ChangeAirlineTicketPriceButtonActionListener());
        next_Type_Ticket_Button.addActionListener(new NextTypeTicketPriceButtonActionListener());
        change_Ticket_Price_Button.addActionListener(new ChangeTicketPriceButtonActionListener());

        new_Terminal_Button.addActionListener(new NewTerminalActionListener());
        add_Terminal_Button.addActionListener(new AddTerminalActionListener());
        national_Terminal_CheckBox.addActionListener(new NationalTerminalCheckBoxActionListener());
        international_Terminal_CheckBox.addActionListener(new InternationalTerminalCheckBoxActionListener());
        charter_Terminal_CheckBox.addActionListener(new CharterTerminalCheckBoxActionListener());
        confirm_National_Destiny_Button.addActionListener(new ConfirmNationalCityActionListener());

        next_InternationalRegion_Button.addActionListener(new InternationalRegionButtonActionListener());
        next_InternationalCountry_Button.setVisible(false);
        next_InternationalCountry_Button.addActionListener(new InternationalCountryButtonActionListener());
        confirm_International_Destiny_Button.setVisible(false);
        confirm_International_Destiny_Button.addActionListener(new ConfirmInternationalDestinyButtonActionListener());

        national_Flight_CheckBox.addActionListener(new NationalCheckboxActionListener());
        international_Flight_CheckBox.addActionListener(new InternationalCheckboxActionListener());
        charter_Flight_CheckBox.addActionListener(new CharterCheckBoxActionListener());
        add_National_Flight_Button.addActionListener(new AddNationalActionListener());
        add_International_Flight_Button.addActionListener(new AddInternationalActionListener());
        add_Charter_Flight_Button.addActionListener(new AddCharterActionListener());
        national_ConfirmAirline_Button.addActionListener(new ConfirmNationalAirlineButtonActionListener());
        international_ConfirmAirline_Button.addActionListener(new ConfirmInternationalAirlineButtonActionListener());
        charter_ConfirmAirline_Button.addActionListener(new ConfirmCharterAirlineButtonActionListener());

        next_CharterRegion_Button.addActionListener(new CharterRegionButtonActionListener());
        next_CharterCountry_Button.addActionListener(new CharterCountryButtonActionListener());
        confirm_Charter_Destiny_Button.addActionListener(new ConfirmCharterDestinyButtonActionListener());

        national_Plane_CheckBox.addActionListener(new NationalPlaneCheckBoxActionListener());
        international_Plane_CheckBox.addActionListener(new InternationalPlaneCheckBoxActionListener());
        charter_Plane_CheckBox.addActionListener(new CharterPlaneCheckBoxActionListener());
        add_New_Plane_Button.addActionListener(new AddNewPlaneActionListener());
        confirm_PlaneAirline_Button.addActionListener(new ConfirmPlaneAirlineButtonActionListener());

        passenger_Destiny_NextButton.addActionListener(new PassengerDestinyNextButton());
        confirm_Passage_Country_Button.addActionListener(new ConfirmPassageCountryButtonActionListener());
        confirm_Passage_Date_Button.addActionListener(new ConfirmPassageDateButtonActionListener());
        sell_Passage.addActionListener(new SellPassageActionButton());

    }

    public void startGUI() {
        JFrame frame = new JFrame("Control Aeropuerto");
        frame.setContentPane(new GUI().Main_Panel);
        frame.pack();
        frame.setMinimumSize(new Dimension(580, 450));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }

    public class MenuActionListenerActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            menu_Panel.setVisible(true);
            new_National_Flight_Panel.setVisible(false);
            new_International_Flight_Panel.setVisible(false);
            international_Country_Panel.setVisible(false);
            option_Panel.setVisible(false);
            new_Terminal_Panel.setVisible(false);
            save_Panel.setVisible(false);
            save_Error_Panel.setVisible(false);
            load_Panel.setVisible(false);
            load_Error_Panel.setVisible(false);
            national_Flight_CheckBox.setSelected(false);
            international_Flight_CheckBox.setSelected(false);
            type_Flight_Panel.setVisible(false);
            new_Plane_Panel.setVisible(false);
            national_Plane_CheckBox.setSelected(false);
            international_Plane_CheckBox.setSelected(false);
            charter_Plane_CheckBox.setSelected(false);
            charter_Flight_CheckBox.setSelected(false);
            new_Charter_Flight_Panel.setVisible(false);
            terminal_Name_Text.setText("");
            terminal_Number_Text.setText("");
            national_Terminal_CheckBox.setSelected(false);
            international_Terminal_CheckBox.setSelected(false);
            charter_Terminal_CheckBox.setSelected(false);
            admin_Options_Panel.setVisible(false);
            adminBack_Options_Button.setVisible(false);
            admin_User_Name_Text.setText("");
            admin_Password_Text.setText("");
            planeNational_Type_Label.setVisible(false);
            planeInternational_Type_Label.setVisible(false);
            planeCharter_Type_Label.setVisible(false);
            national_Km_Panel.setVisible(false);
            confirm_National_Destiny_Button.setVisible(true);
            national_City_ComboBox.setSelectedItem("");
            national_Airline_ComboBox.setSelectedItem("");
            national_Terminal_ComboBox.setSelectedItem("");
            national_Day_ComboBox.setSelectedItem("");
            national_Month_ComboBox.setSelectedItem("");
            national_Year_ComboBox.setSelectedItem("");
            national_Hour_ComboBox.setSelectedItem("");
            national_Minutes_ComboBox.setSelectedItem("");
            international_Region_ComboBox.setSelectedItem("");
            next_InternationalRegion_Button.setVisible(true);
            international_City_ComboBox.setSelectedItem("");
            international_City_Panel.setVisible(false);
            international_Country_Panel.setVisible(false);
            international_Country_ComboBox.setSelectedItem("");
            next_InternationalCountry_Button.setVisible(false);
            international_City_Panel.setVisible(false);
            confirm_International_Destiny_Button.setVisible(false);
            international_City_ComboBox.setSelectedItem("");
            international_Km_Panel.setVisible(false);
            international_Airline_ComboBox.setSelectedItem("");
            international_ConfirmAirline_Button.setVisible(false);
            international_Assigned_Plane_Panel.setVisible(false);
            international_Assigned_Plane_ComboBox.setSelectedItem("");
            international_Terminal_ComboBox.setSelectedItem("");
            international_Day_ComboBox.setSelectedItem("");
            international_Month_ComboBox.setSelectedItem("");
            international_Year_ComboBox.setSelectedItem("");
            international_Hour_ComboBox.setSelectedItem("");
            international_Minute_ComboBox.setSelectedItem("");
            charter_Region_ComboBox.setSelectedItem("");
            next_CharterRegion_Button.setVisible(true);
            charter_Country_Panel.setVisible(false);
            charter_Country_ComboBox.setSelectedItem("");
            next_CharterCountry_Button.setVisible(false);
            charter_City_Panel.setVisible(false);
            charter_City_ComboBox.setSelectedItem("");
            confirm_Charter_Destiny_Button.setVisible(false);
            charter_Km_Panel.setVisible(false);
            charter_Airline_ComboBox.setSelectedItem("");
            charter_ConfirmAirline_Button.setVisible(false);
            charter_Assigned_Plane_Panel.setVisible(false);
            charter_Assigned_Plane_ComboBox.setSelectedItem("");
            charter_Terminal_ComboBox.setSelectedItem("");
            charter_Day_ComboBox.setSelectedItem("");
            charter_Month_ComboBox.setSelectedItem("");
            charter_Year_ComboBox.setSelectedItem("");
            charter_Hour_ComboBox.setSelectedItem("");
            charter_Minute_ComboBox.setSelectedItem("");
            national_Airline_Panel.setVisible(false);
            national_Assigned_Plane_Panel.setVisible(false);
            international_Airline_Panel.setVisible(false);
            international_Assigned_Plane_Panel.setVisible(false);
            charter_Airline_Panel.setVisible(false);
            charter_Assigned_Plane_Panel.setVisible(false);
            national_Assigned_Plane_ComboBox.setModel(new DefaultComboBoxModel<>(empty));
            international_Assigned_Plane_ComboBox.setModel(new DefaultComboBoxModel<>(empty));
            charter_Assigned_Plane_ComboBox.setModel(new DefaultComboBoxModel<>(empty));
            plane_Airline_ComboBox.setSelectedItem("");
            plane_Rute_Panel.setVisible(false);
            plane_Rute_Destiny_ComboBox.setModel(new DefaultComboBoxModel<>(empty));
            national_Flight_Name_Text.setText("");
            international_Flight_Name_Text.setText("");
            charter_Flight_Name_Text.setText("");
            sell_Passage_Panel.setVisible(false);
            passenger_Destiny_ComboBox.setSelectedItem("");
            passenger_Name_Text.setText("");
            passenger_LastName_Text.setText("");
            passenger_Airline_ComboBox.setSelectedItem("");
            passenger_Airline_Panel.setVisible(false);
            passage_Flight_ComboBox.setModel(new DefaultComboBoxModel<>(empty));
            national_Passage_CheckBox.setSelected(false);
            international_Passage_CheckBox.setSelected(false);
            charter_Passage_CheckBox.setSelected(false);
            passage_Country_Panel.setVisible(false);
            passage_Country_ComboBox.setModel(new DefaultComboBoxModel<>(empty));
            passenger_Destiny_NextButton.setVisible(false);
            change_Ticket_Price_Panel.setVisible(false);
            firstClass_Price_CheckBox.setSelected(false);
            secondClass_Price_CheckBox.setSelected(false);
            thirdClass_Price_CheckBox.setSelected(false);
            firstClass_Price_Panel.setVisible(false);
            secondClass_Price_Panel.setVisible(false);
            third_Class_Price_Panel.setVisible(false);
            firstClass_Price_Text.setText("");
            secondClass_Price_Text.setText("");
            thirdClass_Price_Text.setText("");
        }
    }

    public class SaveButtonActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("TerminalFlights.ser"));

                os.writeObject(Terminal.getTerminal_Flights());
                os.writeObject(AirportControl.getTerminals());
                os.writeObject(Plane.getAirportPlanes());

                save_Panel.setVisible(true);
                load_Error_Panel.setVisible(false);
                load_Panel.setVisible(false);
            } catch (IOException ex) {
                ex.printStackTrace();
                save_Error_Panel.setVisible(true);
                save_Panel.setVisible(false);
                load_Error_Panel.setVisible(false);
                load_Panel.setVisible(false);
            }
        }
    }

    public class LoadButtonActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                ObjectInputStream is = new ObjectInputStream(new FileInputStream("TerminalFlights.ser"));

                Terminal.setTerminal_Flights((ArrayList<Flight>) is.readObject());
                AirportControl.setTerminals((ArrayList<Terminal>) is.readObject());
                Plane.setAirPortPlanes((ArrayList<Plane>) is.readObject());

                load_Panel.setVisible(true);
                save_Panel.setVisible(false);
                save_Error_Panel.setVisible(false);
                load_Button.setVisible(false);
            } catch (Exception ex) {
                ex.printStackTrace();
                load_Panel.setVisible(false);
                load_Error_Panel.setVisible(true);
                save_Panel.setVisible(false);
                save_Error_Panel.setVisible(false);
            }
        }
    }

    public class NewFlightActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            national_Day_ComboBox.setModel(new DefaultComboBoxModel<>(days));
            international_Day_ComboBox.setModel(new DefaultComboBoxModel<>(days));
            charter_Day_ComboBox.setModel(new DefaultComboBoxModel<>(days));
            national_Month_ComboBox.setModel(new DefaultComboBoxModel<>(months));
            international_Month_ComboBox.setModel(new DefaultComboBoxModel<>(months));
            charter_Month_ComboBox.setModel(new DefaultComboBoxModel<>(months));
            national_Year_ComboBox.setModel(new DefaultComboBoxModel<>(years));
            international_Year_ComboBox.setModel(new DefaultComboBoxModel<>(years));
            charter_Year_ComboBox.setModel(new DefaultComboBoxModel<>(years));
            national_Hour_ComboBox.setModel(new DefaultComboBoxModel<>(hours));
            international_Hour_ComboBox.setModel(new DefaultComboBoxModel<>(hours));
            charter_Hour_ComboBox.setModel(new DefaultComboBoxModel<>(hours));
            national_Minutes_ComboBox.setModel(new DefaultComboBoxModel<>(minutes));
            international_Minute_ComboBox.setModel(new DefaultComboBoxModel<>(minutes));
            charter_Minute_ComboBox.setModel(new DefaultComboBoxModel<>(minutes));

            type_Flight_Panel.setVisible(true);

            JOptionPane.showOptionDialog(null, type_Flight_Panel,"Tipo de vuelo",
                    JOptionPane.DEFAULT_OPTION,JOptionPane.QUESTION_MESSAGE,null,new Object[]{},null);
        }
    }

    public class OptionsActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            admin_Credentials_Panel.setVisible(true);

            JOptionPane.showOptionDialog(null,admin_Credentials_Panel,"Admin",
                    JOptionPane.DEFAULT_OPTION,JOptionPane.QUESTION_MESSAGE,null,new Object[]{},null);
        }
    }

    public class AdminActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String admin_User_Name;
            String admin_User_Password;

            if (admin_User_Name_Text.getText().equals("") && String.valueOf(admin_Password_Text.getPassword()).equals("")) {
                JOptionPane.showMessageDialog(null, "ERROR!\nIngrese el nombre de usuario y la " +
                                "contraseña", "ERROR!", JOptionPane.INFORMATION_MESSAGE);
            }else if (admin_User_Name_Text.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "ERROR!\nIngrese el nombre de usuario",
                        "ERROR!", JOptionPane.INFORMATION_MESSAGE);
            }else if (String.valueOf(admin_Password_Text.getPassword()).equals("")) {
                JOptionPane.showMessageDialog(null, "ERROR!\nIngrese la contraseña", "ERROR!",
                        JOptionPane.INFORMATION_MESSAGE);
            } else {
                try {
                    admin_User_Name = admin_User_Name_Text.getText();
                    admin_User_Password = String.valueOf(admin_Password_Text.getPassword()) ;

                    System.out.println(admin_User_Name + " " + admin_User_Password);

                    if (airportControl.checkAdminUser(admin_User_Name,admin_User_Password)) {
                        JDialog pane = (JDialog) SwingUtilities.getWindowAncestor(SwingUtilities.getRootPane(admin_Credentials_Panel));
                        pane.dispose();

                        menu_Panel.setVisible(false);
                        option_Panel.setVisible(true);
                        admin_Credentials_Panel.setVisible(false);
                        admin_Options_Panel.setVisible(true);
                        admin_User_Name_Text.setText("");
                        admin_Password_Text.setText("");
                    }
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        }
    }

    public class AdminBackOptionsButtonActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            adminBack_Options_Button.setVisible(false);
            admin_Options_Panel.setVisible(true);
            new_Terminal_Panel.setVisible(false);
            change_Ticket_Price_Panel.setVisible(false);
            firstClass_Price_CheckBox.setSelected(false);
            secondClass_Price_CheckBox.setSelected(false);
            thirdClass_Price_CheckBox.setSelected(false);
            firstClass_Price_Panel.setVisible(false);
            secondClass_Price_Panel.setVisible(false);
            third_Class_Price_Panel.setVisible(false);
            firstClass_Price_Text.setText("");
            secondClass_Price_Text.setText("");
            thirdClass_Price_Text.setText("");
        }
    }

    public class NextTypeFlightButtonActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (national_Flight_CheckBox.isSelected()) {
                JDialog pane = (JDialog) SwingUtilities.getWindowAncestor(SwingUtilities.getRootPane(type_Flight_Panel));
                pane.dispose();

                national_City_ComboBox.setModel(new DefaultComboBoxModel<>(cubaCities));

                menu_Panel.setVisible(false);
                type_Flight_Panel.setVisible(false);
                new_National_Flight_Panel.setVisible(true);
                option_Panel.setVisible(true);
                confirm_National_Destiny_Button.setVisible(true);
            } else if (international_Flight_CheckBox.isSelected()) {
                JDialog pane = (JDialog) SwingUtilities.getWindowAncestor(SwingUtilities.getRootPane(type_Flight_Panel));
                pane.dispose();

                String[] regions = {"", "America del Norte", "America Central", "America del Sur", "Europa", "Africa"};
                international_Region_ComboBox.setModel(new DefaultComboBoxModel<>(regions));
                international_Region_ComboBox.setSelectedItem("");

                menu_Panel.setVisible(false);
                type_Flight_Panel.setVisible(false);
                new_International_Flight_Panel.setVisible(true);
                option_Panel.setVisible(true);
            } else if (charter_Flight_CheckBox.isSelected()) {
                JDialog pane = (JDialog) SwingUtilities.getWindowAncestor(SwingUtilities.getRootPane(type_Flight_Panel));
                pane.dispose();

                String[] regions = {"", "America del Norte", "America Central"};
                charter_Region_ComboBox.setModel(new DefaultComboBoxModel<>(regions));
                charter_Region_ComboBox.setSelectedItem("");

                menu_Panel.setVisible(false);
                type_Flight_Panel.setVisible(false);
                new_Charter_Flight_Panel.setVisible(true);
                option_Panel.setVisible(true);
            }
        }
    }

    public class NationalCheckboxActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            international_Flight_CheckBox.setSelected(false);
            charter_Flight_CheckBox.setSelected(false);
        }
    }

    public class InternationalCheckboxActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            national_Flight_CheckBox.setSelected(false);
            charter_Flight_CheckBox.setSelected(false);
        }
    }

    public class CharterCheckBoxActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            international_Flight_CheckBox.setSelected(false);
            national_Flight_CheckBox.setSelected(false);
        }
    }

    public class InternationalRegionButtonActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (international_Region_ComboBox.getItemAt(international_Region_ComboBox.getSelectedIndex()).equals("")) {
                JOptionPane.showMessageDialog(null, "ERROR!\nIngrese una region para continuar",
                        "ERROR!", JOptionPane.INFORMATION_MESSAGE);
            } else {
                internationalCountryList();
                next_InternationalRegion_Button.setVisible(false);
                next_InternationalCountry_Button.setVisible(true);
                international_Country_Panel.setVisible(true);
            }
        }
    }

    public void internationalCountryList() {
        String[] countryListNorthAmerica = {"", "Canadá", "Estados Unidos", "México"};
        String[] countryListCenterAmerica = {"", "Bahamas", "Haití", "Islas Caimán",
                "Jamaica", "Nicaragua", "Panamá", "República Dominicana", "Trinidad y Tobago"};
        String[] countryListSouthAmerica = {"", "Argentina", "Colombia", " Guyana", "Surinam", "Venezuela"};
        String[] countryListEurope = {"", "Alemania", "España", "Francia", "Italia", "Rusia", "Suiza", "Turquía"};
        String[] countryListAfrica = {"", "Angola"};

        if (international_Region_ComboBox.getItemAt(international_Region_ComboBox.getSelectedIndex()).equals("America del Norte")) {
            international_Country_ComboBox.setModel(new DefaultComboBoxModel<>(countryListNorthAmerica));
        }
        if (international_Region_ComboBox.getItemAt(international_Region_ComboBox.getSelectedIndex()).equals("America Central")) {
            international_Country_ComboBox.setModel(new DefaultComboBoxModel<>(countryListCenterAmerica));
        }
        if (international_Region_ComboBox.getItemAt(international_Region_ComboBox.getSelectedIndex()).equals("America del Sur")) {
            international_Country_ComboBox.setModel(new DefaultComboBoxModel<>(countryListSouthAmerica));
        }
        if (international_Region_ComboBox.getItemAt(international_Region_ComboBox.getSelectedIndex()).equals("Europa")) {
            international_Country_ComboBox.setModel(new DefaultComboBoxModel<>(countryListEurope));
        }
        if (international_Region_ComboBox.getItemAt(international_Region_ComboBox.getSelectedIndex()).equals("Africa")) {
            international_Country_ComboBox.setModel(new DefaultComboBoxModel<>(countryListAfrica));
        }
    }

    public class InternationalCountryButtonActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (international_Country_ComboBox.getItemAt(international_Country_ComboBox.getSelectedIndex()).equals("")) {
                JOptionPane.showMessageDialog(null, "ERROR!\nIngrese un pais para continuar",
                        "ERROR!", JOptionPane.INFORMATION_MESSAGE);
            } else {
                internationalCityList();
                next_InternationalCountry_Button.setVisible(false);
                international_City_Panel.setVisible(true);
                confirm_International_Destiny_Button.setVisible(true);

            }
        }
    }

    public void internationalCityList() {
        String[] Canada = {"", "Montreal", "Toronto"};
        String[] EEUU = {"", "Fort Lauderdale", "Houston", "Miami", "Newark", "Nueva York", "Tampa"};
        String[] Mexico = {"", "Cancún", "Ciudad de México", "Mérida", "Monterrey"};
        String[] Bahamas = {"", "Nasáu"};
        String[] Haiti = {"", "Puerto Príncipe"};
        String[] Islas_Caiman = {"", "Gran Caimán"};
        String[] Jamaica = {"", "Kingston", "Montego Bay"};
        String[] Nicaragua = {"", "Managua"};
        String[] Panama = {"", "Ciudad de Panamá"};
        String[] Republica_Dominicana = {"", "Punta Cana", "Santo Domingo"};
        String[] Trinidad_Tobago = {"", "Puerto España"};
        String[] Argentina = {"", "Buenos Aires"};
        String[] Colombia = {"", "Bogotá", "Medellín"};
        String[] Guyana = {"", "Georgetown"};
        String[] Surinam = {"", "Paramaribo"};
        String[] Venezuela = {"", "Caracas", "Las Piedras"};
        String[] Alemania = {"", "Fráncfort"};
        String[] Espana = {"", "Madrid"};
        String[] Francia = {"", "París"};
        String[] Italia = {"", "Milán", "Roma"};
        String[] Rusia = {"", "Moscú"};
        String[] Suiza = {"", "Zúrich"};
        String[] Turquia = {"", "Estambul"};
        String[] Angola = {"", "Luanda"};

        if (international_Flight_CheckBox.isSelected()){
            if (international_Country_ComboBox.getItemAt(international_Country_ComboBox.getSelectedIndex()).equals("Canadá")) {
                international_City_ComboBox.setModel(new DefaultComboBoxModel<>(Canada));
            }
            if (international_Country_ComboBox.getItemAt(international_Country_ComboBox.getSelectedIndex()).equals("Estados Unidos")) {
                international_City_ComboBox.setModel(new DefaultComboBoxModel<>(EEUU));
            }
            if (international_Country_ComboBox.getItemAt(international_Country_ComboBox.getSelectedIndex()).equals("México")) {
                international_City_ComboBox.setModel(new DefaultComboBoxModel<>(Mexico));
            }
            if (international_Country_ComboBox.getItemAt(international_Country_ComboBox.getSelectedIndex()).equals("Bahamas")) {
                international_City_ComboBox.setModel(new DefaultComboBoxModel<>(Bahamas));
            }
            if (international_Country_ComboBox.getItemAt(international_Country_ComboBox.getSelectedIndex()).equals("Haití")) {
                international_City_ComboBox.setModel(new DefaultComboBoxModel<>(Haiti));
            }
            if (international_Country_ComboBox.getItemAt(international_Country_ComboBox.getSelectedIndex()).equals("Islas Caimán")) {
                international_City_ComboBox.setModel(new DefaultComboBoxModel<>(Islas_Caiman));
            }
            if (international_Country_ComboBox.getItemAt(international_Country_ComboBox.getSelectedIndex()).equals("Jamaica")) {
                international_City_ComboBox.setModel(new DefaultComboBoxModel<>(Jamaica));
            }
            if (international_Country_ComboBox.getItemAt(international_Country_ComboBox.getSelectedIndex()).equals("Nicaragua")) {
                international_City_ComboBox.setModel(new DefaultComboBoxModel<>(Nicaragua));
            }
            if (international_Country_ComboBox.getItemAt(international_Country_ComboBox.getSelectedIndex()).equals("Panamá")) {
                international_City_ComboBox.setModel(new DefaultComboBoxModel<>(Panama));
            }
            if (international_Country_ComboBox.getItemAt(international_Country_ComboBox.getSelectedIndex()).equals("República Dominicana")) {
                international_City_ComboBox.setModel(new DefaultComboBoxModel<>(Republica_Dominicana));
            }
            if (international_Country_ComboBox.getItemAt(international_Country_ComboBox.getSelectedIndex()).equals("Trinidad y Tobago")) {
                international_City_ComboBox.setModel(new DefaultComboBoxModel<>(Trinidad_Tobago));
            }
            if (international_Country_ComboBox.getItemAt(international_Country_ComboBox.getSelectedIndex()).equals("Argentina")) {
                international_City_ComboBox.setModel(new DefaultComboBoxModel<>(Argentina));
            }
            if (international_Country_ComboBox.getItemAt(international_Country_ComboBox.getSelectedIndex()).equals("Colombia")) {
                international_City_ComboBox.setModel(new DefaultComboBoxModel<>(Colombia));
            }
            if (international_Country_ComboBox.getItemAt(international_Country_ComboBox.getSelectedIndex()).equals("Guyana")) {
                international_City_ComboBox.setModel(new DefaultComboBoxModel<>(Guyana));
            }
            if (international_Country_ComboBox.getItemAt(international_Country_ComboBox.getSelectedIndex()).equals("Surinam")) {
                international_City_ComboBox.setModel(new DefaultComboBoxModel<>(Surinam));
            }
            if (international_Country_ComboBox.getItemAt(international_Country_ComboBox.getSelectedIndex()).equals("Venezuela")) {
                international_City_ComboBox.setModel(new DefaultComboBoxModel<>(Venezuela));
            }
            if (international_Country_ComboBox.getItemAt(international_Country_ComboBox.getSelectedIndex()).equals("Alemania")) {
                international_City_ComboBox.setModel(new DefaultComboBoxModel<>(Alemania));
            }
            if (international_Country_ComboBox.getItemAt(international_Country_ComboBox.getSelectedIndex()).equals("España")) {
                international_City_ComboBox.setModel(new DefaultComboBoxModel<>(Espana));
            }
            if (international_Country_ComboBox.getItemAt(international_Country_ComboBox.getSelectedIndex()).equals("Francia")) {
                international_City_ComboBox.setModel(new DefaultComboBoxModel<>(Francia));
            }
            if (international_Country_ComboBox.getItemAt(international_Country_ComboBox.getSelectedIndex()).equals("Italia")) {
                international_City_ComboBox.setModel(new DefaultComboBoxModel<>(Italia));
            }
            if (international_Country_ComboBox.getItemAt(international_Country_ComboBox.getSelectedIndex()).equals("Rusia")) {
                international_City_ComboBox.setModel(new DefaultComboBoxModel<>(Rusia));
            }
            if (international_Country_ComboBox.getItemAt(international_Country_ComboBox.getSelectedIndex()).equals("Suiza")) {
                international_City_ComboBox.setModel(new DefaultComboBoxModel<>(Suiza));
            }
            if (international_Country_ComboBox.getItemAt(international_Country_ComboBox.getSelectedIndex()).equals("Turquía")) {
                international_City_ComboBox.setModel(new DefaultComboBoxModel<>(Turquia));
            }
            if (international_Country_ComboBox.getItemAt(international_Country_ComboBox.getSelectedIndex()).equals("Angola")) {
                international_City_ComboBox.setModel(new DefaultComboBoxModel<>(Angola));
            }
        }

        if (international_Passage_CheckBox.isSelected()) {
            switch (passage_Country_ComboBox.getItemAt(passage_Country_ComboBox.getSelectedIndex())) {
                case "Canadá" -> passenger_Destiny_ComboBox.setModel(new DefaultComboBoxModel<>(Canada));
                case "Estados Unidos" -> passenger_Destiny_ComboBox.setModel(new DefaultComboBoxModel<>(EEUU));
                case "México" -> passenger_Destiny_ComboBox.setModel(new DefaultComboBoxModel<>(Mexico));
                case "Bahamas" -> passenger_Destiny_ComboBox.setModel(new DefaultComboBoxModel<>(Bahamas));
                case "Haití" -> passenger_Destiny_ComboBox.setModel(new DefaultComboBoxModel<>(Haiti));
                case "Islas Caimán" -> passenger_Destiny_ComboBox.setModel(new DefaultComboBoxModel<>(Islas_Caiman));
                case "Jamaica" -> passenger_Destiny_ComboBox.setModel(new DefaultComboBoxModel<>(Jamaica));
                case "Nicaragua" -> passenger_Destiny_ComboBox.setModel(new DefaultComboBoxModel<>(Nicaragua));
                case "Panamá" -> passenger_Destiny_ComboBox.setModel(new DefaultComboBoxModel<>(Panama));
                case "República Dominicana" -> passenger_Destiny_ComboBox.setModel(new DefaultComboBoxModel<>(Republica_Dominicana));
                case "Trinidad y Tobago" -> passenger_Destiny_ComboBox.setModel(new DefaultComboBoxModel<>(Trinidad_Tobago));
                case "Argentina" -> passenger_Destiny_ComboBox.setModel(new DefaultComboBoxModel<>(Argentina));
                case "Colombia" -> passenger_Destiny_ComboBox.setModel(new DefaultComboBoxModel<>(Colombia));
                case "Guyana" -> passenger_Destiny_ComboBox.setModel(new DefaultComboBoxModel<>(Guyana));
                case "Surinam" -> passenger_Destiny_ComboBox.setModel(new DefaultComboBoxModel<>(Surinam));
                case "Venezuela" -> passenger_Destiny_ComboBox.setModel(new DefaultComboBoxModel<>(Venezuela));
                case "Alemania" -> passenger_Destiny_ComboBox.setModel(new DefaultComboBoxModel<>(Alemania));
                case "España" -> passenger_Destiny_ComboBox.setModel(new DefaultComboBoxModel<>(Espana));
                case "Francia" -> passenger_Destiny_ComboBox.setModel(new DefaultComboBoxModel<>(Francia));
                case "Italia" -> passenger_Destiny_ComboBox.setModel(new DefaultComboBoxModel<>(Italia));
                case "Rusia" -> passenger_Destiny_ComboBox.setModel(new DefaultComboBoxModel<>(Rusia));
                case "Suiza" -> passenger_Destiny_ComboBox.setModel(new DefaultComboBoxModel<>(Suiza));
                case "Turquía" -> passenger_Destiny_ComboBox.setModel(new DefaultComboBoxModel<>(Turquia));
                case "Angola" -> passenger_Destiny_ComboBox.setModel(new DefaultComboBoxModel<>(Angola));
            }
        }
    }

    public class NewTerminalActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            admin_Options_Panel.setVisible(false);
            option_Panel.setVisible(true);
            new_Terminal_Panel.setVisible(true);
            adminBack_Options_Button.setVisible(true);
        }
    }

    public class NationalTerminalCheckBoxActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            international_Terminal_CheckBox.setSelected(false);
            charter_Terminal_CheckBox.setSelected(false);
        }
    }

    public class InternationalTerminalCheckBoxActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            national_Terminal_CheckBox.setSelected(false);
            charter_Terminal_CheckBox.setSelected(false);
        }
    }

    public class CharterTerminalCheckBoxActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            international_Terminal_CheckBox.setSelected(false);
            national_Terminal_CheckBox.setSelected(false);
        }
    }

    public class AddTerminalActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String terminal_Name;
            int terminal_Number = 0;
            boolean isNational = false;
            boolean isCharter = false;

            try {
                if ((terminal_Name_Text.getText().isEmpty() && terminal_Number_Text.getText().isEmpty())) {
                    JOptionPane.showMessageDialog(null, "ERROR!\nNo ha introducido ni el nombre" +
                            " ni el numero de la terminal", "ERROR!", JOptionPane.INFORMATION_MESSAGE);
                } else if (terminal_Number_Text.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "ERROR!\nNo ha introducido el numero" +
                            " de la terminal", "ERROR!", JOptionPane.INFORMATION_MESSAGE);
                } else if (terminal_Name_Text.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "ERROR!\nNo ha introducido el nombre" +
                            " de la terminal", "ERROR!", JOptionPane.INFORMATION_MESSAGE);
                }else if (!national_Terminal_CheckBox.isSelected() && !international_Terminal_CheckBox.isSelected()
                    && !charter_Terminal_CheckBox.isSelected()) {
                    JOptionPane.showMessageDialog(null, "ERROR!\nNo ha seleccionado el tipo" +
                            " de operaciones que realizara la terminal", "ERROR!", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    terminal_Name = terminal_Name_Text.getText();
                    terminal_Number = Integer.parseInt(terminal_Number_Text.getText());

                    if (national_Terminal_CheckBox.isSelected()) {
                        isNational = true;
                    } else if (charter_Terminal_CheckBox.isSelected()) {
                        isCharter = true;
                    }

                    if (airportControl.newTerminal(terminal_Name, terminal_Number, isNational, isCharter)) {
                        addNameTerminal(terminal_Name, isNational, isCharter);
                        terminal_Name_Text.setText("");
                        terminal_Number_Text.setText("");
                        national_Terminal_CheckBox.setSelected(false);
                        international_Terminal_CheckBox.setSelected(false);
                        charter_Terminal_CheckBox.setSelected(false);
                    }
                }
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, """
                                ERROR!
                                Caracteres erroneos!
                                Ingrese solo numeros en >>NUMERO DE LA TERMINAL<<""",
                        "ERROR!", JOptionPane.INFORMATION_MESSAGE);
                terminal_Number_Text.setText("");
            }
        }
    }

    public void addNameTerminal(String terminal_Name, boolean isNational, boolean isCharter) {
        if (isNational) {
            national_Terminal_ComboBox.addItem(terminal_Name);
        } else if (isCharter) {
            charter_Terminal_ComboBox.addItem(terminal_Name);
        } else {
            international_Terminal_ComboBox.addItem(terminal_Name);
        }
    }

    public class ChangeAirlineTicketPriceButtonActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            type_Ticket_Panel.setVisible(true);
            JOptionPane.showOptionDialog(null, type_Ticket_Panel,"Precio a configurar",
                    JOptionPane.DEFAULT_OPTION,JOptionPane.QUESTION_MESSAGE,null,new Object[]{},null);
        }
    }

    public class NextTypeTicketPriceButtonActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (firstClass_Price_CheckBox.isSelected() || secondClass_Price_CheckBox.isSelected()
                    || thirdClass_Price_CheckBox.isSelected()) {
                JDialog pane = (JDialog) SwingUtilities.getWindowAncestor(SwingUtilities.getRootPane(type_Ticket_Panel));
                pane.dispose();

                if (firstClass_Price_CheckBox.isSelected() && secondClass_Price_CheckBox.isSelected() &&
                        thirdClass_Price_CheckBox.isSelected()) {
                    firstClass_Price_Panel.setVisible(true);
                    secondClass_Price_Panel.setVisible(true);
                    third_Class_Price_Panel.setVisible(true);
                } else if (firstClass_Price_CheckBox.isSelected() && secondClass_Price_CheckBox.isSelected()) {
                    firstClass_Price_Panel.setVisible(true);
                    secondClass_Price_Panel.setVisible(true);
                } else if (firstClass_Price_CheckBox.isSelected() && thirdClass_Price_CheckBox.isSelected()) {
                    firstClass_Price_Panel.setVisible(true);
                    third_Class_Price_Panel.setVisible(true);
                } else if (secondClass_Price_CheckBox.isSelected() && thirdClass_Price_CheckBox.isSelected()) {
                    secondClass_Price_Panel.setVisible(true);
                    third_Class_Price_Panel.setVisible(true);
                } else if (firstClass_Price_CheckBox.isSelected()) {
                    firstClass_Price_Panel.setVisible(true);
                } else if (secondClass_Price_CheckBox.isSelected()) {
                    secondClass_Price_Panel.setVisible(true);
                } else if (thirdClass_Price_CheckBox.isSelected()) {
                    third_Class_Price_Panel.setVisible(true);
                }

                admin_Options_Panel.setVisible(false);
                option_Panel.setVisible(true);
                change_Ticket_Price_Panel.setVisible(true);
                adminBack_Options_Button.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null,"ERROR!", "Elija una de las opciones para " +
                        "continuar!",JOptionPane.WARNING_MESSAGE);
            }
        }
    }

    public class ChangeTicketPriceButtonActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {

        }
    }

    public class AddNationalActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String flight_Name;
            String national_City;
            float travel_km = 0;
            int day;
            int month;
            int year;
            int hour;
            int minute;
            LocalDateTime date;
            LocalDate partialDate;
            String flightAirline;
            String assigned_Plane;
            String terminal;

                if (national_Assigned_Plane_ComboBox.getItemAt(national_Assigned_Plane_ComboBox.getSelectedIndex()).equals("")) {
                    JOptionPane.showMessageDialog(null, "ERROR!\nNo ha introducido el avion" +
                            " asignado al vuelo", "ERROR!", JOptionPane.WARNING_MESSAGE);
                } else if (national_Terminal_ComboBox.getItemAt(national_Terminal_ComboBox.getSelectedIndex()).equals("")) {
                    JOptionPane.showMessageDialog(null, "ERROR!\nNo ha introducido la terminal" +
                            " asignada al vuelo", "ERROR!", JOptionPane.WARNING_MESSAGE);
                } else if (national_City_ComboBox.getItemAt(national_City_ComboBox.getSelectedIndex()).equals("")) {
                    JOptionPane.showMessageDialog(null, "ERROR!\nNo ha introducido la ciudad" +
                            " destino del vuelo", "ERROR!", JOptionPane.WARNING_MESSAGE);
                } else if (national_Day_ComboBox.getItemAt(national_Day_ComboBox.getSelectedIndex()).equals("") ||
                        national_Month_ComboBox.getItemAt(national_Month_ComboBox.getSelectedIndex()).equals("") ||
                        national_Year_ComboBox.getItemAt(national_Day_ComboBox.getSelectedIndex()).equals("") ||
                        national_Hour_ComboBox.getItemAt(national_Hour_ComboBox.getSelectedIndex()).equals("") ||
                        national_Minutes_ComboBox.getItemAt(national_Minutes_ComboBox.getSelectedIndex()).equals("")) {
                    JOptionPane.showMessageDialog(null,"ERROR!\nNo ha intoducido la fecha del" +
                            " vuelo","ERROR!",JOptionPane.WARNING_MESSAGE);
                } else if (national_Km_Label.getText().equals("Label")) {
                    JOptionPane.showMessageDialog(null,"ERROR!\nNo ha confirmado la ciudad destino" +
                            " del vuelo","ERROR!",JOptionPane.WARNING_MESSAGE);
                } else if (national_Flight_Name_Text.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "ERROR!\nNo ha introducido el nombre" +
                            " del vuelo", "ERROR!", JOptionPane.WARNING_MESSAGE);
                } else {
                    try {
                        flight_Name = national_Flight_Name_Text.getText();
                        national_City = national_City_ComboBox.getItemAt(national_City_ComboBox.getSelectedIndex());
                        flightAirline = national_Airline_ComboBox.getItemAt(national_Airline_ComboBox.getSelectedIndex());
                        travel_km = Float.parseFloat(national_Km_Label.getText());
                        assigned_Plane = national_Assigned_Plane_ComboBox.getItemAt(national_Assigned_Plane_ComboBox.getSelectedIndex());

                        day = Integer.parseInt(national_Day_ComboBox.getItemAt(national_Day_ComboBox.getSelectedIndex()));
                        month = Integer.parseInt(national_Month_ComboBox.getItemAt(national_Month_ComboBox.getSelectedIndex()));
                        year = Integer.parseInt(national_Year_ComboBox.getItemAt(national_Year_ComboBox.getSelectedIndex()));
                        hour = Integer.parseInt(national_Hour_ComboBox.getItemAt(national_Hour_ComboBox.getSelectedIndex()));
                        minute = Integer.parseInt(national_Minutes_ComboBox.getItemAt(national_Minutes_ComboBox.getSelectedIndex()));
                        partialDate = LocalDate.of(year,Month.of(month),day);
                        date = LocalDateTime.of(year,Month.of(month),day,hour,minute);

                        terminal = national_Terminal_ComboBox.getItemAt(national_Terminal_ComboBox.getSelectedIndex());

                        airportControl.newNationalFlight(flight_Name, national_City, travel_km, flightAirline, assigned_Plane,
                                terminal, date, partialDate);
                } catch (Exception ex) {
                        ex.printStackTrace();
                    }
            }
        }
    }

    public class ConfirmNationalCityActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (national_City_ComboBox.getItemAt(national_City_ComboBox.getSelectedIndex()).equals("")) {
                JOptionPane.showMessageDialog(null, "ERROR!\nIngrese una ciudad para continuar",
                        "ERROR!", JOptionPane.INFORMATION_MESSAGE);
            } else {
                nationalCitiesDistance();
                confirm_National_Destiny_Button.setVisible(false);
                national_Km_Panel.setVisible(true);
                setAirlineFlight();
                national_Airline_Panel.setVisible(true);
                national_ConfirmAirline_Button.setVisible(true);
            }

        }
    }

    public class ConfirmNationalAirlineButtonActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            national_ConfirmAirline_Button.setVisible(false);
            setAirlinePlanes();
            national_Assigned_Plane_Panel.setVisible(true);
        }
    }

    public class ConfirmInternationalAirlineButtonActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            international_ConfirmAirline_Button.setVisible(false);
            setAirlinePlanes();
            international_Assigned_Plane_Panel.setVisible(true);
        }
    }

    public class ConfirmCharterAirlineButtonActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            charter_ConfirmAirline_Button.setVisible(false);
            setAirlinePlanes();
            charter_Assigned_Plane_Panel.setVisible(true);
        }
    }

    public class AddCharterActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String flight_Name;
            String destined_Country;
            String destined_Charter_City;
            float travel_km = 0;
            String terminal;
            String flightAirline;
            String assigned_Plane;
            int day;
            int month;
            int year;
            int hour;
            int minute;
            LocalDateTime date;
            LocalDate partialDate;

            if (charter_Region_ComboBox.getItemAt(charter_Region_ComboBox.getSelectedIndex()).equals("") ||
                    charter_Country_ComboBox.getItemAt(charter_Country_ComboBox.getSelectedIndex()).equals("") ||
                    charter_City_ComboBox.getItemAt(charter_City_ComboBox.getSelectedIndex()).equals("")) {
                JOptionPane.showMessageDialog(null, "ERROR!\nNo ha terminado de introducir los " +
                        "datos sobre el destino del vuelo", "ERROR!", JOptionPane.WARNING_MESSAGE);
            } else if (charter_Km_Label.getText().equals("Label")) {
                JOptionPane.showMessageDialog(null, "ERROR!\nNo ha confirmado el destino del vuelo",
                        "ERROR!", JOptionPane.WARNING_MESSAGE);
            } else if (charter_Terminal_ComboBox.getItemAt(charter_Terminal_ComboBox.getSelectedIndex()).equals("")) {
                JOptionPane.showMessageDialog(null, "ERROR!\nNo ha introducido la terminal asignada " +
                        "al vuelo", "ERROR!", JOptionPane.WARNING_MESSAGE);
            } else if (charter_Assigned_Plane_ComboBox.getItemAt(charter_Assigned_Plane_ComboBox.getSelectedIndex()).equals("")) {
                JOptionPane.showMessageDialog(null, "ERROR!\nNo ha introducido el avion asignado al" +
                        " vuelo", "ERROR!", JOptionPane.WARNING_MESSAGE);
            } else if (charter_Day_ComboBox.getItemAt(charter_Day_ComboBox.getSelectedIndex()).equals("") ||
                    charter_Month_ComboBox.getItemAt(charter_Month_ComboBox.getSelectedIndex()).equals("") ||
                    charter_Year_ComboBox.getItemAt(charter_Year_ComboBox.getSelectedIndex()).equals("") ||
                    charter_Hour_ComboBox.getItemAt(charter_Hour_ComboBox.getSelectedIndex()).equals("") ||
                    charter_Minute_ComboBox.getItemAt(charter_Minute_ComboBox.getSelectedIndex()).equals("")) {
                JOptionPane.showMessageDialog(null, "ERROR!\nNo ha intoducido la fecha del" +
                        " vuelo", "ERROR!", JOptionPane.WARNING_MESSAGE);
            } else if (charter_Flight_Name_Text.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "ERROR!\nNo ha introducido el nombre" +
                        " del vuelo", "ERROR!", JOptionPane.WARNING_MESSAGE);
            } else {
                try {
                    flight_Name = charter_Flight_Name_Text.getText();
                    destined_Charter_City = charter_City_ComboBox.getItemAt(charter_City_ComboBox.getSelectedIndex());
                    travel_km = Float.parseFloat(charter_Km_Label.getText());
                    flightAirline = charter_Airline_ComboBox.getItemAt(charter_Airline_ComboBox.getSelectedIndex());
                    assigned_Plane = charter_Assigned_Plane_ComboBox.getItemAt(charter_Assigned_Plane_ComboBox.getSelectedIndex());
                    terminal = charter_Terminal_ComboBox.getItemAt(charter_Terminal_ComboBox.getSelectedIndex());

                    day = Integer.parseInt( charter_Day_ComboBox.getItemAt(charter_Day_ComboBox.getSelectedIndex()));
                    month = Integer.parseInt( charter_Month_ComboBox.getItemAt(charter_Month_ComboBox.getSelectedIndex()));
                    year = Integer.parseInt( charter_Year_ComboBox.getItemAt(charter_Year_ComboBox.getSelectedIndex()));
                    hour = Integer.parseInt( charter_Hour_ComboBox.getItemAt(charter_Hour_ComboBox.getSelectedIndex()));
                    minute = Integer.parseInt( charter_Minute_ComboBox.getItemAt(charter_Minute_ComboBox.getSelectedIndex()));
                    partialDate = LocalDate.of(year,Month.of(month),day);
                    date = LocalDateTime.of(year,Month.of(month),day,hour,minute);

                    destined_Country = charter_Country_ComboBox.getItemAt(charter_Country_ComboBox.getSelectedIndex());

                    airportControl.newCharterFlight(flight_Name, destined_Charter_City, travel_km, flightAirline, assigned_Plane,
                            terminal, date, partialDate, destined_Country);
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        }
    }

    public void setAirlinePlanes() {
        for (Plane plane : Plane.getAirportPlanes()) {
            if (plane.getIsNational() && !plane.getIsCharter()) {
                if (plane.getPlaneAirline().equals(national_Airline_ComboBox.getItemAt(national_Airline_ComboBox.getSelectedIndex()))
                        && plane.getPlaneRuteDestiny().equals(national_City_ComboBox.getItemAt(national_City_ComboBox.getSelectedIndex()))) {
                    national_Assigned_Plane_ComboBox.addItem(plane.getPlate());
                }
            } else if (!plane.getIsNational() && plane.getIsCharter()) {
                if (plane.getPlaneAirline().equals(charter_Airline_ComboBox.getItemAt(charter_Airline_ComboBox.getSelectedIndex()))
                        && plane.getPlaneRuteDestiny().equals(charter_City_ComboBox.getItemAt(charter_City_ComboBox.getSelectedIndex()))) {
                    charter_Assigned_Plane_ComboBox.addItem(plane.getPlate());
                }
            } else if (!plane.getIsNational() && !plane.getIsCharter()) {
                if (plane.getPlaneAirline().equals(international_Airline_ComboBox.getItemAt(international_Airline_ComboBox.getSelectedIndex()))
                        && plane.getPlaneRuteDestiny().equals(international_City_ComboBox.getItemAt(international_City_ComboBox.getSelectedIndex()))) {
                    international_Assigned_Plane_ComboBox.addItem(plane.getPlate());
                }
            }
        }
    }

    public void nationalCitiesDistance() {
        if (national_City_ComboBox.getItemAt(national_City_ComboBox.getSelectedIndex()).equals("Baracoa")) {
            national_Km_Label.setText("871");
        } else if (national_City_ComboBox.getItemAt(national_City_ComboBox.getSelectedIndex()).equals("Cayo Coco")) {
            national_Km_Label.setText("402");
        } else if (national_City_ComboBox.getItemAt(national_City_ComboBox.getSelectedIndex()).equals("Guantánamo")) {
            national_Km_Label.setText("812");
        } else if (national_City_ComboBox.getItemAt(national_City_ComboBox.getSelectedIndex()).equals("Holguín")) {
            national_Km_Label.setText("678");
        } else if (national_City_ComboBox.getItemAt(national_City_ComboBox.getSelectedIndex()).equals("Nueva Gerona")) {
            national_Km_Label.setText("128");
        } else if (national_City_ComboBox.getItemAt(national_City_ComboBox.getSelectedIndex()).equals("Santiago de Cuba")) {
            national_Km_Label.setText("762");
        }
    }

    public class AddInternationalActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String flight_Name;
            String destined_Country;
            String destined_International_City;
            float travel_km = 0;
            String terminal;
            String flightAirline;
            String assigned_Plane;
            int day;
            int month;
            int year;
            int hour;
            int minute;
            LocalDate partialDate;
            LocalDateTime date;

            if (destined_Region_ComboBox.getItemAt(destined_Region_ComboBox.getSelectedIndex()).equals("") ||
                    international_Country_ComboBox.getItemAt(international_Country_ComboBox.getSelectedIndex()).equals("") ||
                    international_City_ComboBox.getItemAt(international_City_ComboBox.getSelectedIndex()).equals("")) {
                JOptionPane.showMessageDialog(null, "ERROR!\nNo ha terminado de introducir los " +
                        "datos sobre el destino del vuelo", "ERROR!", JOptionPane.WARNING_MESSAGE);
            } else if (international_Km_Label.getText().equals("Label")) {
                JOptionPane.showMessageDialog(null, "ERROR!\nNo ha confirmado el destino del vuelo",
                        "ERROR!", JOptionPane.WARNING_MESSAGE);
            } else if (international_Terminal_ComboBox.getItemAt(international_Terminal_ComboBox.getSelectedIndex()).equals("")) {
                JOptionPane.showMessageDialog(null, "ERROR!\nNo ha introducido la terminal asignada " +
                        "al vuelo", "ERROR!", JOptionPane.WARNING_MESSAGE);
            } else if (international_Assigned_Plane_ComboBox.getItemAt(international_Assigned_Plane_ComboBox.getSelectedIndex()).equals("")) {
                JOptionPane.showMessageDialog(null, "ERROR!\nNo ha introducido el avion asignado al" +
                        " vuelo", "ERROR!", JOptionPane.WARNING_MESSAGE);
            } else if (international_Day_ComboBox.getItemAt(international_Day_ComboBox.getSelectedIndex()).equals("") ||
                    international_Month_ComboBox.getItemAt(international_Month_ComboBox.getSelectedIndex()).equals("") ||
                    international_Year_ComboBox.getItemAt(international_Year_ComboBox.getSelectedIndex()).equals("") ||
                    international_Hour_ComboBox.getItemAt(international_Hour_ComboBox.getSelectedIndex()).equals("") ||
                    international_Minute_ComboBox.getItemAt(international_Minute_ComboBox.getSelectedIndex()).equals("")) {
                JOptionPane.showMessageDialog(null, "ERROR!\nNo ha intoducido la fecha del" +
                        " vuelo", "ERROR!", JOptionPane.WARNING_MESSAGE);
            } else if (international_Flight_Name_Text.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "ERROR!\nNo ha introducido el nombre" +
                        " del vuelo", "ERROR!", JOptionPane.WARNING_MESSAGE);
            } else {
                try {
                    flight_Name = international_Flight_Name_Text.getText();
                    destined_International_City = international_City_ComboBox.getItemAt(international_City_ComboBox.getSelectedIndex());
                    travel_km = Float.parseFloat(international_Km_Label.getText());
                    flightAirline = international_Airline_ComboBox.getItemAt(international_Airline_ComboBox.getSelectedIndex());
                    assigned_Plane = international_Assigned_Plane_ComboBox.getItemAt(international_Assigned_Plane_ComboBox.getSelectedIndex());
                    terminal = international_Terminal_ComboBox.getItemAt(international_Terminal_ComboBox.getSelectedIndex());

                    day = Integer.parseInt(international_Day_ComboBox.getItemAt(international_Day_ComboBox.getSelectedIndex()));
                    month = Integer.parseInt(international_Month_ComboBox.getItemAt(international_Month_ComboBox.getSelectedIndex()));
                    year = Integer.parseInt(international_Year_ComboBox.getItemAt(international_Year_ComboBox.getSelectedIndex()));
                    hour = Integer.parseInt(international_Hour_ComboBox.getItemAt(international_Hour_ComboBox.getSelectedIndex()));
                    minute = Integer.parseInt(international_Minute_ComboBox.getItemAt(international_Minute_ComboBox.getSelectedIndex()));
                    partialDate = LocalDate.of(year,Month.of(month),day);
                    date = LocalDateTime.of(year,Month.of(month),day,hour,minute);

                    destined_Country = international_Country_ComboBox.getItemAt(international_Country_ComboBox.getSelectedIndex());

                    airportControl.newInternationalFlight(flight_Name, destined_International_City, travel_km, flightAirline,
                            assigned_Plane, terminal, date, partialDate, destined_Country);
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        }
    }

    public void internationalCitiesDistance() {
        if (international_City_ComboBox.getItemAt(international_City_ComboBox.getSelectedIndex()).equals("Montreal")) {
            international_Km_Label.setText("2616");
        } else if (international_City_ComboBox.getItemAt(international_City_ComboBox.getSelectedIndex()).equals("Toronto")) {
            international_Km_Label.setText("2299");
        } else if (international_City_ComboBox.getItemAt(international_City_ComboBox.getSelectedIndex()).equals("Fort Lauderdale")) {
            international_Km_Label.setText("410");
        } else if (international_City_ComboBox.getItemAt(international_City_ComboBox.getSelectedIndex()).equals("Houston")) {
            international_Km_Label.setText("1360");
        } else if (international_City_ComboBox.getItemAt(international_City_ComboBox.getSelectedIndex()).equals("Miami")) {
            international_Km_Label.setText("369");
        } else if (international_City_ComboBox.getItemAt(international_City_ComboBox.getSelectedIndex()).equals("Newark")) {
            international_Km_Label.setText("2109");
        } else if (international_City_ComboBox.getItemAt(international_City_ComboBox.getSelectedIndex()).equals("Nueva York")) {
            international_Km_Label.setText("2107");
        } else if (international_City_ComboBox.getItemAt(international_City_ComboBox.getSelectedIndex()).equals("Tampa")) {
            international_Km_Label.setText("536");
        } else if (international_City_ComboBox.getItemAt(international_City_ComboBox.getSelectedIndex()).equals("Cancún")) {
            international_Km_Label.setText("509");
        } else if (international_City_ComboBox.getItemAt(international_City_ComboBox.getSelectedIndex()).equals("Ciudad de México")) {
            international_Km_Label.setText("1782");
        } else if (international_City_ComboBox.getItemAt(international_City_ComboBox.getSelectedIndex()).equals("Mérida")) {
            international_Km_Label.setText("784");
        } else if (international_City_ComboBox.getItemAt(international_City_ComboBox.getSelectedIndex()).equals("Monterrey")) {
            international_Km_Label.setText("1837");
        } else if (international_City_ComboBox.getItemAt(international_City_ComboBox.getSelectedIndex()).equals("Nasáu")) {
            international_Km_Label.setText("554");
        } else if (international_City_ComboBox.getItemAt(international_City_ComboBox.getSelectedIndex()).equals("Pointe-à-Pitre")) {
            international_Km_Label.setText("2335");
        } else if (international_City_ComboBox.getItemAt(international_City_ComboBox.getSelectedIndex()).equals("Puerto Príncipe")) {
            international_Km_Label.setText("1159");
        } else if (international_City_ComboBox.getItemAt(international_City_ComboBox.getSelectedIndex()).equals("Gran Caimán")) {
            international_Km_Label.setText("440");
        } else if (international_City_ComboBox.getItemAt(international_City_ComboBox.getSelectedIndex()).equals("Kingston")) {
            international_Km_Label.setText("812");
        } else if (international_City_ComboBox.getItemAt(international_City_ComboBox.getSelectedIndex()).equals("Montego Bay")) {
            international_Km_Label.setText("683");
        } else if (international_City_ComboBox.getItemAt(international_City_ComboBox.getSelectedIndex()).equals("Managua")) {
            international_Km_Label.setText("1288");
        } else if (international_City_ComboBox.getItemAt(international_City_ComboBox.getSelectedIndex()).equals("Ciudad de Panamá")) {
            international_Km_Label.setText("1594");
        } else if (international_City_ComboBox.getItemAt(international_City_ComboBox.getSelectedIndex()).equals("Punta Cana")) {
            international_Km_Label.setText("1537");
        } else if (international_City_ComboBox.getItemAt(international_City_ComboBox.getSelectedIndex()).equals("Santo Domingo")) {
            international_Km_Label.setText("1387");
        } else if (international_City_ComboBox.getItemAt(international_City_ComboBox.getSelectedIndex()).equals("Puerto España")) {
            international_Km_Label.setText("2625");
        } else if (international_City_ComboBox.getItemAt(international_City_ComboBox.getSelectedIndex()).equals("Buenos Aires")) {
            international_Km_Label.setText("6905");
        } else if (international_City_ComboBox.getItemAt(international_City_ComboBox.getSelectedIndex()).equals("Bogotá")) {
            international_Km_Label.setText("2243");
        } else if (international_City_ComboBox.getItemAt(international_City_ComboBox.getSelectedIndex()).equals("Medellín")) {
            international_Km_Label.setText("2016");
        } else if (international_City_ComboBox.getItemAt(international_City_ComboBox.getSelectedIndex()).equals("Georgetown")) {
            international_Km_Label.setText("3164");
        } else if (international_City_ComboBox.getItemAt(international_City_ComboBox.getSelectedIndex()).equals("Paramaribo")) {
            international_Km_Label.setText("3508");
        } else if (international_City_ComboBox.getItemAt(international_City_ComboBox.getSelectedIndex()).equals("Caracas")) {
            international_Km_Label.setText("2161");
        } else if (international_City_ComboBox.getItemAt(international_City_ComboBox.getSelectedIndex()).equals("Las Piedras")) {
            international_Km_Label.setText("1967");
        } else if (international_City_ComboBox.getItemAt(international_City_ComboBox.getSelectedIndex()).equals("Fráncfort")) {
            international_Km_Label.setText("8132");
        } else if (international_City_ComboBox.getItemAt(international_City_ComboBox.getSelectedIndex()).equals("Madrid")) {
            international_Km_Label.setText("7442");
        } else if (international_City_ComboBox.getItemAt(international_City_ComboBox.getSelectedIndex()).equals("París")) {
            international_Km_Label.setText("4290");
        } else if (international_City_ComboBox.getItemAt(international_City_ComboBox.getSelectedIndex()).equals("Milán")) {
            international_Km_Label.setText("8318");
        } else if (international_City_ComboBox.getItemAt(international_City_ComboBox.getSelectedIndex()).equals("Roma")) {
            international_Km_Label.setText("8801");
        } else if (international_City_ComboBox.getItemAt(international_City_ComboBox.getSelectedIndex()).equals("Moscú")) {
            international_Km_Label.setText("9589");
        } else if (international_City_ComboBox.getItemAt(international_City_ComboBox.getSelectedIndex()).equals("Zúrich")) {
            international_Km_Label.setText("8208");
        } else if (international_City_ComboBox.getItemAt(international_City_ComboBox.getSelectedIndex()).equals("Estambul")) {
            international_Km_Label.setText("9978");
        } else if (international_City_ComboBox.getItemAt(international_City_ComboBox.getSelectedIndex()).equals("Luanda")) {
            international_Km_Label.setText("10969");
        }
    }

    public class ConfirmInternationalDestinyButtonActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (international_City_ComboBox.getItemAt(international_City_ComboBox.getSelectedIndex()).equals("")) {
                JOptionPane.showMessageDialog(null,"ERROR!\nNo ha intoducido la ciudad " +
                        "destino del vuelo","ERROR!",JOptionPane.INFORMATION_MESSAGE);
            } else {
                internationalCitiesDistance();
                international_Km_Panel.setVisible(true);
                confirm_International_Destiny_Button.setVisible(false);
                setAirlineFlight();
                international_Airline_Panel.setVisible(true);
                international_ConfirmAirline_Button.setVisible(true);
            }
        }
    }

    public class NewPlaneButtonActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            type_Plane_Panel.setVisible(true);

            JOptionPane.showOptionDialog(null, type_Plane_Panel,"Tipo de avion",
                    JOptionPane.DEFAULT_OPTION,JOptionPane.QUESTION_MESSAGE,null,new Object[]{},null);
        }
    }

    public class NextPlaneButtonActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            JDialog pane = (JDialog) SwingUtilities.getWindowAncestor(SwingUtilities.getRootPane(type_Plane_Panel));
            pane.dispose();

            String[] national_Airlines = {"", "Aerogaviota", "Cubana de Aviación"};
            String[] international_Airlines = {"", "Air Transat", "Air Canada Rouge", "JetBlue Airways", "Southwest Airlines",
                    "United Airlines", "United Express", "American Airlines", "Delta Air Lines", "Aeromar", "Viva Aerobus",
                    "Aeroméxico" ,"Magnicharters", "Bahamasair", "Sunrise Airways", "Cayman Airways", "Aerogaviota",
                    "InterCaribbean Airways", "Aruba Airlines", "Conviasa", "Copa Airlines", "Wingo", "Aerolíneas Argentinas",
                    "Air Century", "Caribbean Airlines", "Fly All Ways", "Condor", "Air Europa", "Iberia", "Cubana de Aviación",
                    "Iberojet", "World2fly", "Air France", "Neos", "Aeroflot", "Edelweiss Air", "Turkish Airlines",
                    "TAAG Angola Airlines"};
            String[] charter_Airlines = {"", "Havana Air", "Air France"};

            String[] world_Country_List = {"","Afganistán", "Albania", "Alemania", "Andorra", "Angola",
                    "Antigua y Barbuda", "Arabia Saudita", "Argelia", "Argentina", "Armenia", "Australia", "Austria",
                    "Azerbaiyán", "Bahamas", "Bahrein", "Bangladesh", "Barbados", "Belarús", "Bélgica", "Belice",
                    "Benin", "Bhután", "Bolivia", "Bosnia y Herzegovina", "Botswana", "Brasil", "Brunei Darussalam",
                    "Bulgaria", "Burkina Faso", "Burundi", "Cabo Verde", "Camboya", "Camerún", "Canadá", "Chad",
                    "Chequia", "Chile", "China", "Chipre", "Colombia", "Comoras", "Congo", "Costa Rica", "Côte d’Ivoire",
                    "Croacia", "Cuba", "Dinamarca", "Djibouti", "Dominica", "Ecuador", "Egipto", "El Salvador",
                    "Emiratos Árabes Unidos", "Eritrea", "Eslovaquia", "Eslovenia", "España", "Estados Unidos", "Estonia",
                    "Eswatini", "Etiopía", "Rusia", "Fiji", "Filipinas", "Finlandia", "Francia", "Gabón", "Gambia",
                    "Georgia", "Ghana", "Granada", "Grecia", "Guatemala", "Guinea", "Guinea Ecuatorial", "Guinea-Bissau",
                    "Guyana", "Haití", "Honduras", "Hungría", "India", "Indonesia", "Irán", "Iraq", "Irlanda", "Islandia",
                    "Islas Cook", "Islas Marshall", "Islas Salomón", "Israel", "Italia", "Jamaica", "Japón", "Jordania",
                    "Kazajstán", "Kenya", "Kirguistán", "Kiribati", "Kuwait", "Lesotho", "Letonia", "Líbano", "Liberia",
                    "Libia", "Liechtenstein", "Lituania", "Luxemburgo", "Madagascar", "Malasia", "Malawi", "Maldivas",
                    "Malí", "Malta", "Marruecos", "Mauricio", "Mauritania", "México", "Micronesia", "Mónaco", "Mongolia",
                    "Montenegro", "Mozambique", "Myanmar", "Namibia", "Nauru", "Nepal", "Nicaragua", "Níger", "Nigeria",
                    "Niue", "Noruega", "Nueva Zelandia", "Omán", "Países Bajos", "Pakistán", "Palau", "Panamá",
                    "Papua Nueva Guinea", "Paraguay", "Perú", "Polonia", "Portugal", "Qatar", "Reino Unido", "Siria",
                    "República Centroafricana", "República de Corea", "República de Macedonia del Norte",
                    "República de Moldova", "República Democrática del Congo", "República Democrática Popular Lao",
                    "República Dominicana", "República Popular Democrática de Corea", "República Unida de Tanzanía",
                    "Rumania", "Rwanda", "Saint Kitts y Nevis", "Samoa", "San Marino", "San Vicente y las Granadinas",
                    "Santa Lucía","Santa Sede", "Santo Tomé y Príncipe", "Senegal", "Serbia", "Seychelles",
                    "Sierra Leona", "Singapur", "Somalia", "Sri Lanka", "Sudáfrica", "Sudán", "Sudán del Sur", "Suecia",
                    "Suiza", "Suriname", "Tailandia", "Tayikistán", "Timor-Leste", "Togo", "Tonga", "Trinidad y Tabago",
                    "Túnez", "Turkmenistán", "Turquía", "Tuvalu", "Ucrania", "Uganda", "Uruguay", "Uzbekistán",
                    "Vanuatu", "Venezuela", "Viet Nam", "Yemen", "Zambia", "Zimbabwe"};

            if (national_Plane_CheckBox.isSelected()) {
                plane_Airline_ComboBox.setModel(new DefaultComboBoxModel<String>(national_Airlines));
                planeNational_Type_Label.setVisible(true);
            } else if (international_Plane_CheckBox.isSelected()) {
                plane_Airline_ComboBox.setModel(new DefaultComboBoxModel<String>(international_Airlines));
                planeInternational_Type_Label.setVisible(true);
            } else if (charter_Plane_CheckBox.isSelected()) {
                plane_Airline_ComboBox.setModel(new DefaultComboBoxModel<String>(charter_Airlines));
                planeCharter_Type_Label.setVisible(true);
            }

            plane_Builder_Country_ComboBox.setModel(new DefaultComboBoxModel<>(world_Country_List));

            menu_Panel.setVisible(false);
            type_Plane_Panel.setVisible(false);
            new_Plane_Panel.setVisible(true);
            option_Panel.setVisible(true);
        }
    }

    public class NationalPlaneCheckBoxActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            international_Plane_CheckBox.setSelected(false);
            charter_Plane_CheckBox.setSelected(false);
        }
    }

    public class InternationalPlaneCheckBoxActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            national_Plane_CheckBox.setSelected(false);
            charter_Plane_CheckBox.setSelected(false);
        }
    }

    public class CharterPlaneCheckBoxActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            national_Plane_CheckBox.setSelected(false);
            international_Plane_CheckBox.setSelected(false);
        }
    }

    public class ConfirmPlaneAirlineButtonActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            confirm_PlaneAirline_Button.setVisible(false);
            setPlaneRute();
            plane_Rute_Panel.setVisible(true);
        }
    }

    public class AddNewPlaneActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String plane_Plate;
            String plane_Model;
            int plane_Seats = 0;
            String plane_Builder;
            String plane_Builder_Country;
            boolean isNational = false;
            boolean isCharter = false;
            String plane_Airline;
            String planeRuteDestiny;

            if (plane_Plate_Text.getText().isEmpty() && plane_Model_Text.getText().isEmpty() &&
                    plane_Seats_Text.getText().isEmpty() && plane_Builder_Text.getText().isEmpty() &&
                    plane_Builder_Country_ComboBox.getItemAt(plane_Builder_Country_ComboBox.getSelectedIndex()).equals("") &&
                    plane_Airline_ComboBox.getItemAt(plane_Airline_ComboBox.getSelectedIndex()).equals("")) {
                JOptionPane.showMessageDialog(null,"ERROR!\nNo ha introducido ninguna informacion " +
                        "sobre el avion","ERROR!",JOptionPane.WARNING_MESSAGE);
            } else if (plane_Plate_Text.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null,"ERROR!\nNo ha introducido ninguna informacion " +
                        "sobre la matricula del identificacion del avion","ERROR!",JOptionPane.WARNING_MESSAGE);
            } else if (plane_Model_Text.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null,"ERROR!\nNo ha introducido ninguna informacion " +
                        "sobre el modelo del avion","ERROR!",JOptionPane.WARNING_MESSAGE);
            } else if (plane_Seats_Text.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null,"ERROR!\nNo ha introducido ninguna informacion " +
                        "sobre la cantidad de asientos del avion","ERROR!",JOptionPane.WARNING_MESSAGE);
            } else if (plane_Builder_Text.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null,"ERROR!\nNo ha introducido ninguna informacion " +
                        "sobre el fabricante del avion","ERROR!",JOptionPane.WARNING_MESSAGE);
            } else if (plane_Builder_Country_ComboBox.getItemAt(plane_Builder_Country_ComboBox.getSelectedIndex()).equals("")) {
                JOptionPane.showMessageDialog(null,"ERROR!\nNo ha introducido ninguna informacion " +
                        "sobre el pais del fabricante del avion","ERROR!",JOptionPane.WARNING_MESSAGE);
            } else if (plane_Airline_ComboBox.getItemAt(plane_Airline_ComboBox.getSelectedIndex()).equals("")){
                JOptionPane.showMessageDialog(null,"ERROR!\nNo ha introducido ninguna informacion " +
                        "sobre la aerolinea a la que pertenece el avion","ERROR!",JOptionPane.WARNING_MESSAGE);
            } else {

                if (national_Plane_CheckBox.isSelected()) {
                    isNational = true;
                } else if (charter_Plane_CheckBox.isSelected()) {
                    isCharter = true;
                }

                try {
                    plane_Plate = plane_Plate_Text.getText();
                    plane_Airline = plane_Airline_ComboBox.getItemAt(plane_Airline_ComboBox.getSelectedIndex());
                    plane_Model = plane_Model_Text.getText();
                    plane_Seats = Integer.parseInt(plane_Seats_Text.getText());
                    plane_Builder = plane_Builder_Text.getText();
                    plane_Builder_Country = plane_Builder_Country_ComboBox.getItemAt(plane_Builder_Country_ComboBox.getSelectedIndex());
                    planeRuteDestiny = plane_Rute_Destiny_ComboBox.getItemAt(plane_Rute_Destiny_ComboBox.getSelectedIndex());

                    if (airportControl.newPlane(plane_Plate,plane_Model, plane_Seats,plane_Builder,plane_Builder_Country,
                            isNational, isCharter, plane_Airline, planeRuteDestiny)) {

                        plane_Plate_Text.setText("");
                        plane_Airline_ComboBox.setSelectedItem("");
                        plane_Model_Text.setText("");
                        plane_Seats_Text.setText("");
                        plane_Builder_Text.setText("");
                        plane_Builder_Country_ComboBox.setSelectedItem("");
                        plane_Rute_Destiny_ComboBox.setSelectedItem("");
                        national_Plane_CheckBox.setSelected(false);
                        international_Plane_CheckBox.setSelected(false);
                    }
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, """
                                ERROR!
                                Caracteres erroneos!
                                Ingrese solo numeros en >> CANTIDAD DE ASIENTOS <<""",
                            "ERROR!", JOptionPane.INFORMATION_MESSAGE);
                    plane_Seats_Text.setText("");
                }
            }
        }
    }

    public class CharterRegionButtonActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (charter_Region_ComboBox.getItemAt(charter_Region_ComboBox.getSelectedIndex()).equals("")) {
                JOptionPane.showMessageDialog(null, "ERROR!\nIngrese una region para continuar",
                        "ERROR!", JOptionPane.INFORMATION_MESSAGE);
            } else {
                charterCountryList();
                charter_Country_Panel.setVisible(true);
                next_CharterRegion_Button.setVisible(false);
                next_CharterCountry_Button.setVisible(true);
            }
        }
    }

    public class CharterCountryButtonActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (charter_Country_ComboBox.getItemAt(charter_Country_ComboBox.getSelectedIndex()).equals("")) {
                JOptionPane.showMessageDialog(null, "ERROR!\nIngrese un pais para continuar",
                        "ERROR!", JOptionPane.INFORMATION_MESSAGE);
            } else {
                charterCityList();
                charter_City_Panel.setVisible(true);
                next_CharterCountry_Button.setVisible(false);
                confirm_Charter_Destiny_Button.setVisible(true);
            }
        }
    }

    public class ConfirmCharterDestinyButtonActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (charter_City_ComboBox.getItemAt(charter_City_ComboBox.getSelectedIndex()).equals("")) {
                JOptionPane.showMessageDialog(null, "ERROR!\nIngrese una ciudad para continuar",
                        "ERROR!", JOptionPane.INFORMATION_MESSAGE);
            } else {
                charterCityDistance();
                charter_Km_Panel.setVisible(true);
                confirm_Charter_Destiny_Button.setVisible(false);
                setAirlineFlight();
                charter_Airline_Panel.setVisible(true);
                charter_ConfirmAirline_Button.setVisible(true);
            }
        }
    }

    public void setAirlineFlight() {
        String[] baracoaAirlines = {"", "Aerogaviota"};
        String[] cayoCocoAirlines = {"", "Aerogaviota"};
        String[] guantanamoAirlines = {"", "Cubana de Aviación"};
        String[] holguinAirlines = {"", "Aerogaviota"};
        String[] nuevaGeronaAirlines = {"", "Cubana de Aviación"};
        String[] santiagoDesCubaAirlines = {"", "Aerogaviota", "Cubana de Aviación"};
        String[] montrealAirlines = {"", "Air Transat"};
        String[] torontoAirlines = {"", "Air Canada Rouge"};
        String[] fortLauderdaleAirlines = {"", "JetBlue Airways", "Southwest Airlines"};
        String[] houstonAirlines = {"", "United Airlines", "United Express"};
        String[] miamiAirlines = {"", "American Airlines", "Delta Air Lines"};
        String[] miamiCharterAirlines = {"", "Havana Air"};
        String[] newarkAirlines = {"", "United Express"};
        String[] newYorkAirlines = {"", "JetBlue Airways"};
        String[] tampaAirlines = {"", "Havana Air"};
        String[] tampaCharterAirlines = {"", "Southwest Airlines"};
        String[] cancunAirlines = {"", "Aeromar", "Viva Aerobus"};
        String[] ciudadMexicoAirlines = {"", "Aeromar", "Viva Aerobus", "Magnicharters"};
        String[] meridaAirlines = {"", "Viva Aerobus"};
        String[] monterreyAirlines = {"", "Viva Aerobus"};
        String[] nasauAirlines = {"", "Bahamasair"};
        String[] guadalupeCharterAirlines = {"", "Air France"};
        String[] haitiAirlines = {"", "Sunrise Airways"};
        String[] caimanAirlines = {"", "Cayman Airways"};
        String[] kingstonAirlines = {"", "Aerogaviota", "InterCaribbean Airways"};
        String[] montegoBayAirlines = {"", "Aerogaviota"};
        String[] managuaAirlines = {"", "Aruba Airlines", "Conviasa"};
        String[] panamaAirlines = {"", "Copa Airlines", "Wingo"};
        String[] puntaCanaAirlines = {"", "Aerolíneas Argentinas"};
        String[] santoDomingoAirlines = {"", "InterCaribbean Airways", "Air Century"};
        String[] puertoEspanaAirlines = {"", "Caribbean Airlines"};
        String[] buenosAiresAirlines = {"", "Aerolíneas Argentinas", "Cubana de Aviación"};
        String[] bogotaleAirlines = {"", "Wingo"};
        String[] medellinAirlines = {"", "Wingo"};
        String[] georgetownAirlines = {"", "Aruba Airlines", "Fly All Ways"};
        String[] paramariboAirlines = {"", "Fly All Ways"};
        String[] caracasAirlines = {"", "Conviasa"};
        String[] lasPiedrasAirlines = {"", "Conviasa"};
        String[] francfortAirlines = {"", "Condor"};
        String[] madridAirlines = {"", "Air Europa", "Cubana de Aviación", "Iberia", "Iberojet", "World2fly"};
        String[] parisAirlines = {"", "Air France"};
        String[] milanAirlines = {"", "Neos"};
        String[] romaAirlines = {"", "Neos"};
        String[] moscuAirlines = {"", "Aeroflot"};
        String[] zurichAirlines = {"", "Edelweiss Air"};
        String[] estambulAirlines = {"", "Turkish Airlines"};
        String[] luandaAirlines = {"", "TAAG Angola Airlines"};

        //setting national airlines
        if (national_Flight_CheckBox.isSelected()) {
            if (national_City_ComboBox.getItemAt(national_City_ComboBox.getSelectedIndex()).equals("Baracoa")) {
                national_Airline_ComboBox.setModel(new DefaultComboBoxModel<>(baracoaAirlines));
            } else if (national_City_ComboBox.getItemAt(national_City_ComboBox.getSelectedIndex()).equals("Cayo Coco")) {
                national_Airline_ComboBox.setModel(new DefaultComboBoxModel<>(cayoCocoAirlines));
            } else if (national_City_ComboBox.getItemAt(national_City_ComboBox.getSelectedIndex()).equals("Guantánamo")) {
                national_Airline_ComboBox.setModel(new DefaultComboBoxModel<>(guantanamoAirlines));
            } else if (national_City_ComboBox.getItemAt(national_City_ComboBox.getSelectedIndex()).equals("Holguín")) {
                national_Airline_ComboBox.setModel(new DefaultComboBoxModel<>(holguinAirlines));
            } else if (national_City_ComboBox.getItemAt(national_City_ComboBox.getSelectedIndex()).equals("Nueva Gerona")) {
                national_Airline_ComboBox.setModel(new DefaultComboBoxModel<>(nuevaGeronaAirlines));
            } else if (national_City_ComboBox.getItemAt(national_City_ComboBox.getSelectedIndex()).equals("Santiago de Cuba")) {
                national_Airline_ComboBox.setModel(new DefaultComboBoxModel<>(santiagoDesCubaAirlines));
            }
        }


        //setting international airlines
        if (international_Flight_CheckBox.isSelected()) {
            if (international_City_ComboBox.getItemAt(international_City_ComboBox.getSelectedIndex()).equals("Montreal")) {
                international_Airline_ComboBox.setModel(new DefaultComboBoxModel<>(montrealAirlines));
            } else if (international_City_ComboBox.getItemAt(international_City_ComboBox.getSelectedIndex()).equals("Toronto")) {
                international_Airline_ComboBox.setModel(new DefaultComboBoxModel<>(torontoAirlines));
            } else if (international_City_ComboBox.getItemAt(international_City_ComboBox.getSelectedIndex()).equals("Fort Lauderdale")) {
                international_Airline_ComboBox.setModel(new DefaultComboBoxModel<>(fortLauderdaleAirlines));
            } else if (international_City_ComboBox.getItemAt(international_City_ComboBox.getSelectedIndex()).equals("Houston")) {
                international_Airline_ComboBox.setModel(new DefaultComboBoxModel<>(houstonAirlines));
            } else if (international_City_ComboBox.getItemAt(international_City_ComboBox.getSelectedIndex()).equals("Miami")) {
                international_Airline_ComboBox.setModel(new DefaultComboBoxModel<>(miamiAirlines));
            } else if (international_City_ComboBox.getItemAt(international_City_ComboBox.getSelectedIndex()).equals("Newark")) {
                international_Airline_ComboBox.setModel(new DefaultComboBoxModel<>(newarkAirlines));
            } else if (international_City_ComboBox.getItemAt(international_City_ComboBox.getSelectedIndex()).equals("Nueva York")) {
                international_Airline_ComboBox.setModel(new DefaultComboBoxModel<>(newYorkAirlines));
            } else if (international_City_ComboBox.getItemAt(international_City_ComboBox.getSelectedIndex()).equals("Tampa")) {
                international_Airline_ComboBox.setModel(new DefaultComboBoxModel<>(tampaAirlines));
            } else if (international_City_ComboBox.getItemAt(international_City_ComboBox.getSelectedIndex()).equals("Cancún")) {
                international_Airline_ComboBox.setModel(new DefaultComboBoxModel<>(cancunAirlines));
            } else if (international_City_ComboBox.getItemAt(international_City_ComboBox.getSelectedIndex()).equals("Ciudad de México")) {
                international_Airline_ComboBox.setModel(new DefaultComboBoxModel<>(ciudadMexicoAirlines));
            } else if (international_City_ComboBox.getItemAt(international_City_ComboBox.getSelectedIndex()).equals("Mérida")) {
                international_Airline_ComboBox.setModel(new DefaultComboBoxModel<>(meridaAirlines));
            } else if (international_City_ComboBox.getItemAt(international_City_ComboBox.getSelectedIndex()).equals("Monterrey")) {
                international_Airline_ComboBox.setModel(new DefaultComboBoxModel<>(monterreyAirlines));
            } else if (international_City_ComboBox.getItemAt(international_City_ComboBox.getSelectedIndex()).equals("Nasáu")) {
                international_Airline_ComboBox.setModel(new DefaultComboBoxModel<>(nasauAirlines));
            } else if (international_City_ComboBox.getItemAt(international_City_ComboBox.getSelectedIndex()).equals("Puerto Príncipe")) {
                international_Airline_ComboBox.setModel(new DefaultComboBoxModel<>(haitiAirlines));
            } else if (international_City_ComboBox.getItemAt(international_City_ComboBox.getSelectedIndex()).equals("Gran Caimán")) {
                international_Airline_ComboBox.setModel(new DefaultComboBoxModel<>(caimanAirlines));
            } else if (international_City_ComboBox.getItemAt(international_City_ComboBox.getSelectedIndex()).equals("Kingston")) {
                international_Airline_ComboBox.setModel(new DefaultComboBoxModel<>(kingstonAirlines));
            } else if (international_City_ComboBox.getItemAt(international_City_ComboBox.getSelectedIndex()).equals("Montego Bay")) {
                international_Airline_ComboBox.setModel(new DefaultComboBoxModel<>(montegoBayAirlines));
            } else if (international_City_ComboBox.getItemAt(international_City_ComboBox.getSelectedIndex()).equals("Managua")) {
                international_Airline_ComboBox.setModel(new DefaultComboBoxModel<>(managuaAirlines));
            } else if (international_City_ComboBox.getItemAt(international_City_ComboBox.getSelectedIndex()).equals("Ciudad de Panamá")) {
                international_Airline_ComboBox.setModel(new DefaultComboBoxModel<>(panamaAirlines));
            } else if (international_City_ComboBox.getItemAt(international_City_ComboBox.getSelectedIndex()).equals("Punta Cana")) {
                international_Airline_ComboBox.setModel(new DefaultComboBoxModel<>(puntaCanaAirlines));
            } else if (international_City_ComboBox.getItemAt(international_City_ComboBox.getSelectedIndex()).equals("Santo Domingo")) {
                international_Airline_ComboBox.setModel(new DefaultComboBoxModel<>(santoDomingoAirlines));
            } else if (international_City_ComboBox.getItemAt(international_City_ComboBox.getSelectedIndex()).equals("Puerto España")) {
                international_Airline_ComboBox.setModel(new DefaultComboBoxModel<>(puertoEspanaAirlines));
            } else if (international_City_ComboBox.getItemAt(international_City_ComboBox.getSelectedIndex()).equals("Buenos Aires")) {
                international_Airline_ComboBox.setModel(new DefaultComboBoxModel<>(buenosAiresAirlines));
            } else if (international_City_ComboBox.getItemAt(international_City_ComboBox.getSelectedIndex()).equals("Bogotá")) {
                international_Airline_ComboBox.setModel(new DefaultComboBoxModel<>(bogotaleAirlines));
            } else if (international_City_ComboBox.getItemAt(international_City_ComboBox.getSelectedIndex()).equals("Medellín")) {
                international_Airline_ComboBox.setModel(new DefaultComboBoxModel<>(medellinAirlines));
            } else if (international_City_ComboBox.getItemAt(international_City_ComboBox.getSelectedIndex()).equals("Georgetown")) {
                international_Airline_ComboBox.setModel(new DefaultComboBoxModel<>(georgetownAirlines));
            } else if (international_City_ComboBox.getItemAt(international_City_ComboBox.getSelectedIndex()).equals("Paramaribo")) {
                international_Airline_ComboBox.setModel(new DefaultComboBoxModel<>(paramariboAirlines));
            } else if (international_City_ComboBox.getItemAt(international_City_ComboBox.getSelectedIndex()).equals("Caracas")) {
                international_Airline_ComboBox.setModel(new DefaultComboBoxModel<>(caracasAirlines));
            } else if (international_City_ComboBox.getItemAt(international_City_ComboBox.getSelectedIndex()).equals("Las Piedras")) {
                international_Airline_ComboBox.setModel(new DefaultComboBoxModel<>(lasPiedrasAirlines));
            } else if (international_City_ComboBox.getItemAt(international_City_ComboBox.getSelectedIndex()).equals("Fráncfort")) {
                international_Airline_ComboBox.setModel(new DefaultComboBoxModel<>(francfortAirlines));
            } else if (international_City_ComboBox.getItemAt(international_City_ComboBox.getSelectedIndex()).equals("Madrid")) {
                international_Airline_ComboBox.setModel(new DefaultComboBoxModel<>(madridAirlines));
            } else if (international_City_ComboBox.getItemAt(international_City_ComboBox.getSelectedIndex()).equals("París")) {
                international_Airline_ComboBox.setModel(new DefaultComboBoxModel<>(parisAirlines));
            } else if (international_City_ComboBox.getItemAt(international_City_ComboBox.getSelectedIndex()).equals("Milán")) {
                international_Airline_ComboBox.setModel(new DefaultComboBoxModel<>(milanAirlines));
            } else if (international_City_ComboBox.getItemAt(international_City_ComboBox.getSelectedIndex()).equals("Roma")) {
                international_Airline_ComboBox.setModel(new DefaultComboBoxModel<>(romaAirlines));
            } else if (international_City_ComboBox.getItemAt(international_City_ComboBox.getSelectedIndex()).equals("Moscú")) {
                international_Airline_ComboBox.setModel(new DefaultComboBoxModel<>(moscuAirlines));
            } else if (international_City_ComboBox.getItemAt(international_City_ComboBox.getSelectedIndex()).equals("Zúrich")) {
                international_Airline_ComboBox.setModel(new DefaultComboBoxModel<>(zurichAirlines));
            } else if (international_City_ComboBox.getItemAt(international_City_ComboBox.getSelectedIndex()).equals("Estambul")) {
                international_Airline_ComboBox.setModel(new DefaultComboBoxModel<>(estambulAirlines));
            } else if (international_City_ComboBox.getItemAt(international_City_ComboBox.getSelectedIndex()).equals("Luanda")) {
                international_Airline_ComboBox.setModel(new DefaultComboBoxModel<>(luandaAirlines));
            }
        }


        //setting charter airlines
        if (charter_Flight_CheckBox.isSelected()) {
            if (charter_City_ComboBox.getItemAt(charter_City_ComboBox.getSelectedIndex()).equals("Pointe-à-Pitre")) {
                charter_Airline_ComboBox.setModel(new DefaultComboBoxModel<>(guadalupeCharterAirlines));
            } else if (charter_City_ComboBox.getItemAt(charter_City_ComboBox.getSelectedIndex()).equals("Miami")) {
                charter_Airline_ComboBox.setModel(new DefaultComboBoxModel<>(miamiCharterAirlines));
            }else if (charter_City_ComboBox.getItemAt(charter_City_ComboBox.getSelectedIndex()).equals("Tampa")) {
                charter_Airline_ComboBox.setModel(new DefaultComboBoxModel<>(tampaCharterAirlines));
            }
        }

        //setting passage airlines
        if (national_Passage_CheckBox.isSelected()) {
            switch (passenger_Destiny_ComboBox.getItemAt(passenger_Destiny_ComboBox.getSelectedIndex())) {
                case "Baracoa" -> passenger_Airline_ComboBox.setModel(new DefaultComboBoxModel<>(baracoaAirlines));
                case "Cayo Coco" -> passenger_Airline_ComboBox.setModel(new DefaultComboBoxModel<>(cayoCocoAirlines));
                case "Guantánamo" -> passenger_Airline_ComboBox.setModel(new DefaultComboBoxModel<>(guantanamoAirlines));
                case "Holguín" -> passenger_Airline_ComboBox.setModel(new DefaultComboBoxModel<>(holguinAirlines));
                case "Nueva Gerona" -> passenger_Airline_ComboBox.setModel(new DefaultComboBoxModel<>(nuevaGeronaAirlines));
                case "Santiago de Cuba" -> passenger_Airline_ComboBox.setModel(new DefaultComboBoxModel<>(santiagoDesCubaAirlines));
            }
        } else if (international_Passage_CheckBox.isSelected()) {
            switch (passenger_Destiny_ComboBox.getItemAt(passenger_Destiny_ComboBox.getSelectedIndex())) {
                case "Montreal" -> passenger_Airline_ComboBox.setModel(new DefaultComboBoxModel<>(montrealAirlines));
                case "Toronto" -> passenger_Airline_ComboBox.setModel(new DefaultComboBoxModel<>(torontoAirlines));
                case "Fort Lauderdale" -> passenger_Airline_ComboBox.setModel(new DefaultComboBoxModel<>(fortLauderdaleAirlines));
                case "Houston" -> passenger_Airline_ComboBox.setModel(new DefaultComboBoxModel<>(houstonAirlines));
                case "Miami" -> passenger_Airline_ComboBox.setModel(new DefaultComboBoxModel<>(miamiAirlines));
                case "Newark" -> passenger_Airline_ComboBox.setModel(new DefaultComboBoxModel<>(newarkAirlines));
                case "Nueva York" -> passenger_Airline_ComboBox.setModel(new DefaultComboBoxModel<>(newYorkAirlines));
                case "Tampa" -> passenger_Airline_ComboBox.setModel(new DefaultComboBoxModel<>(tampaAirlines));
                case "Cancún" -> passenger_Airline_ComboBox.setModel(new DefaultComboBoxModel<>(cancunAirlines));
                case "Ciudad de México" -> passenger_Airline_ComboBox.setModel(new DefaultComboBoxModel<>(ciudadMexicoAirlines));
                case "Mérida" -> passenger_Airline_ComboBox.setModel(new DefaultComboBoxModel<>(meridaAirlines));
                case "Monterrey" -> passenger_Airline_ComboBox.setModel(new DefaultComboBoxModel<>(monterreyAirlines));
                case "Nasáu" -> passenger_Airline_ComboBox.setModel(new DefaultComboBoxModel<>(nasauAirlines));
                case "Puerto Príncipe" -> passenger_Airline_ComboBox.setModel(new DefaultComboBoxModel<>(haitiAirlines));
                case "Gran Caimán" -> passenger_Airline_ComboBox.setModel(new DefaultComboBoxModel<>(caimanAirlines));
                case "Kingston" -> passenger_Airline_ComboBox.setModel(new DefaultComboBoxModel<>(kingstonAirlines));
                case "Montego Bay" -> passenger_Airline_ComboBox.setModel(new DefaultComboBoxModel<>(montegoBayAirlines));
                case "Managua" -> passenger_Airline_ComboBox.setModel(new DefaultComboBoxModel<>(managuaAirlines));
                case "Ciudad de Panamá" -> passenger_Airline_ComboBox.setModel(new DefaultComboBoxModel<>(panamaAirlines));
                case "Punta Cana" -> passenger_Airline_ComboBox.setModel(new DefaultComboBoxModel<>(puntaCanaAirlines));
                case "Santo Domingo" -> passenger_Airline_ComboBox.setModel(new DefaultComboBoxModel<>(santoDomingoAirlines));
                case "Puerto España" -> passenger_Airline_ComboBox.setModel(new DefaultComboBoxModel<>(puertoEspanaAirlines));
                case "Buenos Aires" -> passenger_Airline_ComboBox.setModel(new DefaultComboBoxModel<>(buenosAiresAirlines));
                case "Bogotá" -> passenger_Airline_ComboBox.setModel(new DefaultComboBoxModel<>(bogotaleAirlines));
                case "Medellín" -> passenger_Airline_ComboBox.setModel(new DefaultComboBoxModel<>(medellinAirlines));
                case "Georgetown" -> passenger_Airline_ComboBox.setModel(new DefaultComboBoxModel<>(georgetownAirlines));
                case "Paramaribo" -> passenger_Airline_ComboBox.setModel(new DefaultComboBoxModel<>(paramariboAirlines));
                case "Caracas" -> passenger_Airline_ComboBox.setModel(new DefaultComboBoxModel<>(caracasAirlines));
                case "Las Piedras" -> passenger_Airline_ComboBox.setModel(new DefaultComboBoxModel<>(lasPiedrasAirlines));
                case "Fráncfort" -> passenger_Airline_ComboBox.setModel(new DefaultComboBoxModel<>(francfortAirlines));
                case "Madrid" -> passenger_Airline_ComboBox.setModel(new DefaultComboBoxModel<>(madridAirlines));
                case "París" -> passenger_Airline_ComboBox.setModel(new DefaultComboBoxModel<>(parisAirlines));
                case "Milán" -> passenger_Airline_ComboBox.setModel(new DefaultComboBoxModel<>(milanAirlines));
                case "Roma" -> passenger_Airline_ComboBox.setModel(new DefaultComboBoxModel<>(romaAirlines));
                case "Moscú" -> passenger_Airline_ComboBox.setModel(new DefaultComboBoxModel<>(moscuAirlines));
                case "Zúrich" -> passenger_Airline_ComboBox.setModel(new DefaultComboBoxModel<>(zurichAirlines));
                case "Estambul" -> passenger_Airline_ComboBox.setModel(new DefaultComboBoxModel<>(estambulAirlines));
                case "Luanda" -> passenger_Airline_ComboBox.setModel(new DefaultComboBoxModel<>(luandaAirlines));
            }
        } else if (charter_Passage_CheckBox.isSelected()) {
            switch (passenger_Destiny_ComboBox.getItemAt(passenger_Destiny_ComboBox.getSelectedIndex())) {
                case "Pointe-à-Pitre" -> passenger_Airline_ComboBox.setModel(new DefaultComboBoxModel<>(guadalupeCharterAirlines));
                case "Miami" -> passenger_Airline_ComboBox.setModel(new DefaultComboBoxModel<>(miamiCharterAirlines));
                case "Tampa" -> passenger_Airline_ComboBox.setModel(new DefaultComboBoxModel<>(tampaCharterAirlines));
            }
        }
    }

    public void charterCountryList() {
        String[] countryListNorthAmerica = {"", "Estados Unidos"};
        String[] countryListCenterAmerica = {"", "Guadalupe"};

        if (charter_Region_ComboBox.getItemAt(charter_Region_ComboBox.getSelectedIndex()).equals("America del Norte")) {
            charter_Country_ComboBox.setModel(new DefaultComboBoxModel<>(countryListNorthAmerica));
        }
        if (charter_Region_ComboBox.getItemAt(charter_Region_ComboBox.getSelectedIndex()).equals("America Central")) {
            charter_Country_ComboBox.setModel(new DefaultComboBoxModel<>(countryListCenterAmerica));
        }
    }

    public void charterCityList() {
        String[] EEUU = {"", "Miami", "Tampa"};
        String[] Guadalupe = {"", "Pointe-à-Pitre"};

        if (charter_Flight_CheckBox.isSelected()){
            if (charter_Country_ComboBox.getItemAt(charter_Country_ComboBox.getSelectedIndex()).equals("Estados Unidos")) {
                charter_City_ComboBox.setModel(new DefaultComboBoxModel<>(EEUU));
            } else if (charter_Country_ComboBox.getItemAt(charter_Country_ComboBox.getSelectedIndex()).equals("Guadalupe")) {
                charter_City_ComboBox.setModel(new DefaultComboBoxModel<>(Guadalupe));
            }
        }

        if (charter_Passage_CheckBox.isSelected()) {
            switch (passage_Country_ComboBox.getItemAt(passage_Country_ComboBox.getSelectedIndex())) {
                case "Estados Unidos" -> passenger_Destiny_ComboBox.setModel(new DefaultComboBoxModel<>(EEUU));
                case "Guadalupe" -> passenger_Destiny_ComboBox.setModel(new DefaultComboBoxModel<>(Guadalupe));
            }
        }
    }

    public void charterCityDistance() {
        if (charter_City_ComboBox.getItemAt(charter_City_ComboBox.getSelectedIndex()).equals("Pointe-à-Pitre")) {
            charter_Km_Label.setText("2310");
        } else if (charter_City_ComboBox.getItemAt(charter_City_ComboBox.getSelectedIndex()).equals("Tampa")) {
            charter_Km_Label.setText("536");
        } else if (charter_City_ComboBox.getItemAt(charter_City_ComboBox.getSelectedIndex()).equals("Miami")) {
            charter_Km_Label.setText("369");
        }
    }

    public void setPlaneRute() {
        String[] aerogaviota = {"", "Baracoa", "Cayo Coco", "Holguín", "Santiago de Cuba"};
        String[] aerogaviotaInternational = {"", "Kingston", "Montego Bay"};
        String[] cubanaAviacion = {"", "Guantánamo", "Nueva Gerona", "Santiago de Cuba"};
        String[] cubanaAviacionInternational = {"", "Buenos Aires", "Madrid"};
        String[] airTransat = {"", "Montreal"};
        String[] airCanadaRogue = {"", "Toronto"};
        String[] jetBlueAirways = {"", "Fort Lauderdale", "Nueva York"};
        String[] southWestAirlines = {"", "Fort Lauderdale", "Tampa"};
        String[] unitedAirlines = {"", "Houston"};
        String[] unitedExpress = {"", "Houston", "Newark"};
        String[] americanAirlines = {"", "Miami"};
        String[] deltaAirAirlines = {"", "Miami"};
        String[] aeromar = {"", "Cancún"};
        String[] vivaAerobus = {"", "Ciudad de México", "Mérida", "Monterrey"};
        String[] aeromexico = {"", "Ciudad de México"};
        String[] magnicharters = {"", "Ciudad de México"};
        String[] bahamasair = {"", "Nasáu"};
        String[] sunriseAirways = {"", "Puerto Príncipe"};
        String[] caymanAirways = {"", "Gran Caimán"};
        String[] intercaribbeanAirways = {"", "Kingston"};
        String[] arubaAirlines = {"", "Managua", "Georgetown"};
        String[] conviasa = {"", "Managua", "Caracas", "Las Piedras"};
        String[] copaAirlines = {"", "Ciudad de Panamá"};
        String[] wingo = {"", "Ciudad de Panamá", "Bogotá", "Medellín"};
        String[] aerolineasArgentinas = {"", "Punta Cana", "Buenos Aires"};
        String[] airCentury = {"", "Santo Domingo"};
        String[] caribbeanAirlines = {"", "Puerto España"};
        String[] flyAllWays = {"", "Georgetown", "Paramaribo"};
        String[] condor = {"", "Fráncfort"};
        String[] airEuropa = {"", "Madrid"};
        String[] iberia = {"", "Madrid"};
        String[] iberojet = {"", "Madrid"};
        String[] world2fly = {"", "Madrid"};
        String[] airFrance = {"", "París"};
        String[] airFranceCharter = {"", "Pointe-à-Pitre"};
        String[] neos = {"", "Milán", "Roma"};
        String[] aeroflot = {"", "Moscú"};
        String[] edelweissAir = {"", "Zúrich"};
        String[] turkishAirlines = {"", "Estambul"};
        String[] taagAngolaAirlines = {"", "Luanda"};
        String[] havanaAir = {"", "Miami", "Tampa"};

        if (national_Plane_CheckBox.isSelected()) {
            switch (plane_Airline_ComboBox.getItemAt(plane_Airline_ComboBox.getSelectedIndex())) {
                case "Aerogaviota" -> plane_Rute_Destiny_ComboBox.setModel(new DefaultComboBoxModel<>(aerogaviota));
                case "Cubana de Aviación" -> plane_Rute_Destiny_ComboBox.setModel(new DefaultComboBoxModel<>(cubanaAviacion));
            }
        } else if (international_Plane_CheckBox.isSelected()) {
            switch (plane_Airline_ComboBox.getItemAt(plane_Airline_ComboBox.getSelectedIndex())) {
                case "Aerogaviota" -> plane_Rute_Destiny_ComboBox.setModel(new DefaultComboBoxModel<>(aerogaviotaInternational));
                case "Cubana de Aviación" -> plane_Rute_Destiny_ComboBox.setModel(new DefaultComboBoxModel<>(cubanaAviacionInternational));
                case "Air Transat" -> plane_Rute_Destiny_ComboBox.setModel(new DefaultComboBoxModel<>(airTransat));
                case "Air Canada Rouge" -> plane_Rute_Destiny_ComboBox.setModel(new DefaultComboBoxModel<>(airCanadaRogue));
                case "JetBlue Airways" -> plane_Rute_Destiny_ComboBox.setModel(new DefaultComboBoxModel<>(jetBlueAirways));
                case "Southwest Airlines" -> plane_Rute_Destiny_ComboBox.setModel(new DefaultComboBoxModel<>(southWestAirlines));
                case "United Airlines" -> plane_Rute_Destiny_ComboBox.setModel(new DefaultComboBoxModel<>(unitedAirlines));
                case "United Express" -> plane_Rute_Destiny_ComboBox.setModel(new DefaultComboBoxModel<>(unitedExpress));
                case "American Airlines" -> plane_Rute_Destiny_ComboBox.setModel(new DefaultComboBoxModel<>(americanAirlines));
                case "Delta Air Lines" -> plane_Rute_Destiny_ComboBox.setModel(new DefaultComboBoxModel<>(deltaAirAirlines));
                case "Aeromar" -> plane_Rute_Destiny_ComboBox.setModel(new DefaultComboBoxModel<>(aeromar));
                case "Viva Aerobus" -> plane_Rute_Destiny_ComboBox.setModel(new DefaultComboBoxModel<>(vivaAerobus));
                case "Aeroméxico" -> plane_Rute_Destiny_ComboBox.setModel(new DefaultComboBoxModel<>(aeromexico));
                case "Magnicharters" -> plane_Rute_Destiny_ComboBox.setModel(new DefaultComboBoxModel<>(magnicharters));
                case "Bahamasair" -> plane_Rute_Destiny_ComboBox.setModel(new DefaultComboBoxModel<>(bahamasair));
                case "Sunrise Airways" -> plane_Rute_Destiny_ComboBox.setModel(new DefaultComboBoxModel<>(sunriseAirways));
                case "Cayman Airways" -> plane_Rute_Destiny_ComboBox.setModel(new DefaultComboBoxModel<>(caymanAirways));
                case "InterCaribbean Airways" -> plane_Rute_Destiny_ComboBox.setModel(new DefaultComboBoxModel<>(intercaribbeanAirways));
                case "Aruba Airlines" -> plane_Rute_Destiny_ComboBox.setModel(new DefaultComboBoxModel<>(arubaAirlines));
                case "Conviasa" -> plane_Rute_Destiny_ComboBox.setModel(new DefaultComboBoxModel<>(conviasa));
                case "Copa Airlines" -> plane_Rute_Destiny_ComboBox.setModel(new DefaultComboBoxModel<>(copaAirlines));
                case "Wingo" -> plane_Rute_Destiny_ComboBox.setModel(new DefaultComboBoxModel<>(wingo));
                case "Aerolíneas Argentinas" -> plane_Rute_Destiny_ComboBox.setModel(new DefaultComboBoxModel<>(aerolineasArgentinas));
                case "Air Century" -> plane_Rute_Destiny_ComboBox.setModel(new DefaultComboBoxModel<>(airCentury));
                case "Caribbean Airlines" -> plane_Rute_Destiny_ComboBox.setModel(new DefaultComboBoxModel<>(caribbeanAirlines));
                case "Fly All Ways" -> plane_Rute_Destiny_ComboBox.setModel(new DefaultComboBoxModel<>(flyAllWays));
                case "Condor" -> plane_Rute_Destiny_ComboBox.setModel(new DefaultComboBoxModel<>(condor));
                case "Air Europa" -> plane_Rute_Destiny_ComboBox.setModel(new DefaultComboBoxModel<>(airEuropa));
                case "Iberia" -> plane_Rute_Destiny_ComboBox.setModel(new DefaultComboBoxModel<>(iberia));
                case "Iberojet" -> plane_Rute_Destiny_ComboBox.setModel(new DefaultComboBoxModel<>(iberojet));
                case "World2fly" -> plane_Rute_Destiny_ComboBox.setModel(new DefaultComboBoxModel<>(world2fly));
                case "Air France" -> plane_Rute_Destiny_ComboBox.setModel(new DefaultComboBoxModel<>(airFrance));
                case "Neos" -> plane_Rute_Destiny_ComboBox.setModel(new DefaultComboBoxModel<>(neos));
                case "Aeroflot" -> plane_Rute_Destiny_ComboBox.setModel(new DefaultComboBoxModel<>(aeroflot));
                case "Edelweiss Air" -> plane_Rute_Destiny_ComboBox.setModel(new DefaultComboBoxModel<>(edelweissAir));
                case "Turkish Airlines" -> plane_Rute_Destiny_ComboBox.setModel(new DefaultComboBoxModel<>(turkishAirlines));
                case "TAAG Angola Airlines" -> plane_Rute_Destiny_ComboBox.setModel(new DefaultComboBoxModel<>(taagAngolaAirlines));
            }
        } else if (charter_Plane_CheckBox.isSelected()) {
            switch (plane_Airline_ComboBox.getItemAt(plane_Airline_ComboBox.getSelectedIndex())) {
                case "Havana Air" -> plane_Rute_Destiny_ComboBox.setModel(new DefaultComboBoxModel<>(havanaAir));
                case "Air France" -> plane_Rute_Destiny_ComboBox.setModel(new DefaultComboBoxModel<>(airFranceCharter));
            }
        }
    }

    public class SellPassageMenuButtonActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {

            passage_Class_ComboBox.setModel(new DefaultComboBoxModel<>(ticketClass));
            passage_Day_ComboBox.setModel(new DefaultComboBoxModel<>(days));
            passage_Month_ComboBox.setModel(new DefaultComboBoxModel<>(months));
            passage_Year_ComboBox.setModel(new DefaultComboBoxModel<>(years));

            type_Passage_Panel.setVisible(true);
            JOptionPane.showOptionDialog(null, type_Passage_Panel,"Tipo de pasaje",
                        JOptionPane.DEFAULT_OPTION,JOptionPane.QUESTION_MESSAGE,null,new Object[]{},null);
        }
    }

    public class NextTypePassageButtonActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (national_Passage_CheckBox.isSelected() || international_Passage_CheckBox.isSelected()
                    || charter_Passage_CheckBox.isSelected()) {
                JDialog pane = (JDialog) SwingUtilities.getWindowAncestor(SwingUtilities.getRootPane(type_Passage_Panel));
                pane.dispose();

                if (national_Passage_CheckBox.isSelected()) {
                    passage_Destiny_Panel.setVisible(true);
                    passenger_Destiny_NextButton.setVisible(true);
                    passenger_Destiny_ComboBox.setModel(new DefaultComboBoxModel<>(cubaCities));
                } else if (international_Passage_CheckBox.isSelected()) {
                    String[] passage_International_Country = {"", "Canadá", "Estados Unidos", "México", "Bahamas", "Haití", "Islas Caimán",
                            "Jamaica", "Nicaragua", "Panamá", "República Dominicana", "Trinidad y Tobago", "Argentina", "Colombia",
                            " Guyana", "Surinam", "Venezuela", "Alemania", "España", "Francia", "Italia", "Rusia", "Suiza",
                            "Turquía", "Angola"};

                    passage_Country_Panel.setVisible(true);
                    confirm_Passage_Country_Button.setVisible(true);
                    passage_Country_ComboBox.setModel(new DefaultComboBoxModel<>(passage_International_Country));
                } else if (charter_Passage_CheckBox.isSelected()) {
                    String[] passage_Charter_Country = {"", "Estados Unidos", "Guadalupe"};

                    passage_Country_Panel.setVisible(true);
                    confirm_Passage_Country_Button.setVisible(true);
                    passage_Country_ComboBox.setModel(new DefaultComboBoxModel<>(passage_Charter_Country));
                }

                menu_Panel.setVisible(false);
                option_Panel.setVisible(true);
                sell_Passage_Panel.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null,"ERROR!\nSeleccione un tipo de pasaje para " +
                        "continuar","ERROR!",JOptionPane.WARNING_MESSAGE);
            }
        }
    }

    public class NationalPassageCheckBoxActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (national_Passage_CheckBox.isSelected()) {
                international_Passage_CheckBox.setSelected(false);
                charter_Passage_CheckBox.setSelected(false);
            }
        }
    }

    public class InternationalPassageCheckBoxActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (international_Passage_CheckBox.isSelected()) {
                national_Passage_CheckBox.setSelected(false);
                charter_Passage_CheckBox.setSelected(false);
            }
        }
    }

    public class CharterPassageCheckBoxActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (charter_Passage_CheckBox.isSelected()) {
                national_Passage_CheckBox.setSelected(false);
                international_Passage_CheckBox.setSelected(false);
            }
        }
    }

    public class PassengerDestinyNextButton implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            setAirlineFlight();
            passenger_Destiny_NextButton.setVisible(false);
            passenger_Airline_Panel.setVisible(true);
            confirm_Passage_Date_Button.setVisible(true);
        }
    }

    public class ConfirmPassageCountryButtonActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (international_Passage_CheckBox.isSelected()){
                internationalCityList();
                confirm_Passage_Country_Button.setVisible(false);
                passage_Destiny_Panel.setVisible(true);
                passenger_Destiny_NextButton.setVisible(true);
            } else if (charter_Passage_CheckBox.isSelected()) {
                charterCityList();
                confirm_Passage_Country_Button.setVisible(false);
                passage_Destiny_Panel.setVisible(true);
                passenger_Destiny_NextButton.setVisible(true);
            }
        }
    }

    public class ConfirmPassageDateButtonActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            int day;
            int month;
            int year;
            LocalDate date;

            day = Integer.parseInt(passage_Day_ComboBox.getItemAt(passage_Day_ComboBox.getSelectedIndex()));
            month = Integer.parseInt(passage_Month_ComboBox.getItemAt(passage_Month_ComboBox.getSelectedIndex()));
            year = Integer.parseInt(passage_Year_ComboBox.getItemAt(passage_Year_ComboBox.getSelectedIndex()));
            date = LocalDate.of(year,Month.of(month),day);

            for (Flight flight : Terminal.getTerminal_Flights()) {
                if (flight.getPartialDate().equals(date) &&
                        flight.getFlightAirline().equals(passenger_Airline_ComboBox.getItemAt(passenger_Airline_ComboBox.getSelectedIndex()))) {
                    passage_Flight_ComboBox.addItem(flight.getFlightName());
                }
            }

            confirm_Passage_Date_Button.setVisible(false);
            passage_Flight_Panel.setVisible(true);
        }
    }

    public class SellPassageActionButton implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String name;
            String last_Name;
            String destiny;
            String flight_Name;
            String classPassage;
            int passageNumber = 0;
            int day;
            int month;
            int year;
            LocalDate date;

            if (national_Passage_CheckBox.isSelected()){
                if (passenger_Name_Text.getText().equals("") || passenger_LastName_Text.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "ERROR!\nIntroduzca el nombre completo del " +
                            "cliente para continuar", "ERROR!", JOptionPane.WARNING_MESSAGE);
                } else if (passenger_Destiny_ComboBox.getItemAt(passenger_Destiny_ComboBox.getSelectedIndex()).equals("")) {
                    JOptionPane.showMessageDialog(null, "ERROR!\nNo ha concluido con la seleccion " +
                            "del destinio", "ERROR!", JOptionPane.WARNING_MESSAGE);
                }
            } else {
                if (passenger_Name_Text.getText().equals("") || passenger_LastName_Text.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "ERROR!\nIntroduzca el nombre completo del " +
                            "cliente para continuar", "ERROR!", JOptionPane.WARNING_MESSAGE);
                } else if (passage_Country_ComboBox.getItemAt(passage_Country_ComboBox.getSelectedIndex()).equals("") ||
                        passenger_Destiny_ComboBox.getItemAt(passenger_Destiny_ComboBox.getSelectedIndex()).equals("")) {
                    JOptionPane.showMessageDialog(null, "ERROR!\nNo ha concluido con la seleccion " +
                            "del destinio", "ERROR!", JOptionPane.WARNING_MESSAGE);
                } else if (passage_Day_ComboBox.getItemAt(passage_Day_ComboBox.getSelectedIndex()).equals("") ||
                        passage_Month_ComboBox.getItemAt(passage_Month_ComboBox.getSelectedIndex()).equals("") ||
                        passage_Year_ComboBox.getItemAt(passage_Year_ComboBox.getSelectedIndex()).equals("")) {
                    JOptionPane.showMessageDialog(null, "ERROR!\nNo ha terminado con la seleccion " +
                            "de la fecha del pasaje", "ERROR!", JOptionPane.WARNING_MESSAGE);
                } else if (passage_Flight_ComboBox.getItemAt(passage_Flight_ComboBox.getSelectedIndex()).equals("")) {
                    JOptionPane.showMessageDialog(null, "ERROR!\nNo ha seleccionado " +
                            "el vuelo del pasaje", "ERROR!", JOptionPane.WARNING_MESSAGE);
                } else if (passage_Quantity_Text.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "ERROR!\nNo ha introducido la cantidad " +
                            "de pasajes q desea comprar", "ERROR!", JOptionPane.WARNING_MESSAGE);
                } else {
                    try {
                        name = passenger_Name_Text.getText();
                        last_Name = passenger_LastName_Text.getText();
                        destiny = passenger_Destiny_ComboBox.getItemAt(passenger_Destiny_ComboBox.getSelectedIndex());
                        flight_Name = passage_Flight_ComboBox.getItemAt(passage_Flight_ComboBox.getSelectedIndex());
                        classPassage = passage_Class_ComboBox.getItemAt(passage_Class_ComboBox.getSelectedIndex());
                        passageNumber = Integer.parseInt(passage_Quantity_Text.getText());
                        day = Integer.parseInt(passage_Day_ComboBox.getItemAt(passage_Day_ComboBox.getSelectedIndex()));
                        month = Integer.parseInt(passage_Month_ComboBox.getItemAt(passage_Month_ComboBox.getSelectedIndex()));
                        year = Integer.parseInt(passage_Year_ComboBox.getItemAt(passage_Year_ComboBox.getSelectedIndex()));
                        date = LocalDate.of(year,Month.of(month),day);

                        if (airportControl.newPassage(name,last_Name,destiny,flight_Name,classPassage,passageNumber)) {
                            JOptionPane.showMessageDialog(null, "La compra se ha completado",
                                    "Compra completada!",JOptionPane.INFORMATION_MESSAGE);
                        }
                    } catch (NumberFormatException ex) {
                        JOptionPane.showMessageDialog(null, """
                                ERROR!
                                Caracteres erroneos!
                                Ingrese solo numeros en >>CANTIDAD DE PASAJES<<""",
                                "ERROR!", JOptionPane.INFORMATION_MESSAGE);
                        passage_Quantity_Text.setText("");
                    }
                }
            }
        }
    }
}