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
import java.util.ArrayList;

public class GUI {
    private JButton save_Button;
    private JButton load_Button;
    private JPanel Main_Panel;
    private JLabel travel_Km_Label;
    private JLabel assigned_National_Plane_Label;
    private JLabel destined_City_Label;
    private JTextField assigned_National_Plane_Text;
    private JPanel new_National_Flight_Panel;
    private JTextField nationalkm_Text;
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
    private JComboBox destined_Region_ComboBox;
    private JPanel country_Panel;
    private JButton next_InternationalCountry_Button;
    private JComboBox<String> international_City_ComboBox;
    private JPanel destined_City_Panel;
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
    private JButton confirm_City_Button;
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
    private JComboBox charter_Country_ComboBox;
    private JComboBox charter_City_ComboBox;
    private JComboBox international_Airline_ComboBox;
    private JCheckBox charter_Flight_CheckBox;
    private JComboBox<String> charter_Region_ComboBox;
    private JComboBox<String> charter_Terminal_ComboBox;
    private JComboBox charter_Day_ComboBox;
    private JComboBox charter_Month_ComboBox;
    private JComboBox charter_Year_ComboBox;
    private JComboBox charter_Hour_ComboBox;
    private JComboBox charter_Minute_ComboBox;
    private JComboBox<String> charter_Assigned_Plane_ComboBox;
    private JComboBox charter_Airline_ComboBox;
    private JButton admin_Options_Button;
    private JButton new_Arrival_Button;
    private JButton new_FlightOut_Button;
    private JComboBox national_Airline_ComboBox;
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
    private JButton confirmarAerolineaButton;
    private JButton confirmarAerolineaButton1;

    AirportControl airportControl = new AirportControl();

    public GUI() {
        String empty = "";
        national_Terminal_ComboBox.addItem(empty);
        international_Terminal_ComboBox.addItem(empty);
        national_Assigned_Plane_ComboBox.addItem(empty);
        international_Assigned_Plane_ComboBox.addItem(empty);

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
        country_Panel.setVisible(false);
        destined_City_Panel.setVisible(false);
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

        admin_Options_Button.addActionListener(new OptionsActionListener());
        options_Admin_Button.addActionListener(new AdminActionListener());
        adminBack_Options_Button.addActionListener(new AdminBackOptionsButtonActionListener());

        new_Terminal_Button.addActionListener(new NewTerminalActionListener());
        add_Terminal_Button.addActionListener(new AddTerminalActionListener());
        national_Terminal_CheckBox.addActionListener(new NationalTerminalCheckBoxActionListener());
        international_Terminal_CheckBox.addActionListener(new InternationalTerminalCheckBoxActionListener());
        charter_Terminal_CheckBox.addActionListener(new CharterTerminalCheckBoxActionListener());
        confirm_City_Button.addActionListener(new ConfirmCityActionListener());


        next_InternationalRegion_Button.addActionListener(new InternationalRegionButtonComboBoxActionListener());
        next_InternationalCountry_Button.setVisible(false);
        next_InternationalCountry_Button.addActionListener(new InternationalCountryButtonComboBoxActionListener());
        confirm_International_Destiny_Button.setVisible(false);
        confirm_International_Destiny_Button.addActionListener(new ConfirmInternationalDestinyButtonActionListener());

        national_Flight_CheckBox.addActionListener(new NationalCheckboxActionListener());
        international_Flight_CheckBox.addActionListener(new InternationalCheckboxActionListener());
        charter_Flight_CheckBox.addActionListener(new CharterCheckBoxActionListener());
        add_National_Flight_Button.addActionListener(new AddNationalActionListener());
        add_International_Flight_Button.addActionListener(new AddInternationalActionListener());

        national_Plane_CheckBox.addActionListener(new NationalPlaneCheckBoxActionListener());
        international_Plane_CheckBox.addActionListener(new InternationalPlaneCheckBoxActionListener());
        charter_Plane_CheckBox.addActionListener(new CharterPlaneCheckBoxActionListener());
        add_New_Plane_Button.addActionListener(new AddNewPlaneActionListener());
    }

    public void startGUI() {
        JFrame frame = new JFrame("Control Aeropuerto");
        frame.setContentPane(new GUI().Main_Panel);
        frame.pack();
        frame.setMinimumSize(new Dimension(580, 400));
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
            country_Panel.setVisible(false);
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

                for (Terminal terminal : AirportControl.getTerminals()) {
                    if (terminal.getTerminal_Number() == 1) {
                        national_Terminal_ComboBox.addItem(terminal.getTerminal_Name());
                    } else if (terminal.getTerminal_Number() == 2) {
                        charter_Terminal_ComboBox.addItem(terminal.getTerminal_Name());
                    } else if (terminal.getTerminal_Number() == 3) {
                        international_Terminal_ComboBox.addItem(terminal.getTerminal_Name());
                    }
                }

                for (Plane plane : Plane.getAirportPlanes()) {
                    if (plane.getIsNational()) {
                        national_Assigned_Plane_ComboBox.addItem(plane.getPlate());
                    } else if (plane.getIsCharter()){
                        charter_Assigned_Plane_ComboBox.addItem(plane.getPlate());
                    } else {
                        international_Assigned_Plane_ComboBox.addItem(plane.getPlate());
                    }
                }

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
            String[] days = {"","1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19",
                    "20","21","22","23","24","25","26","27","28","29","30","31"};
            String[] months = {"","enero","febrero","marzo","abril","mayo","junio","julio","agosto","septiembre",
                    "octubre","noviembre","diciembre"};
            String[] years = {"","2022","2023","2024","2025","2026","2027","2028","2029","2030"};
            String[] hours = {"","00","01","02","03","04","05","06","07","08","09","10","11","12","13","14","15","16","17",
                    "18","19","20","21","22","23","24"};
            String[] minutes = {"","00","05","10","15","20","25","30","35","40","45","50","55"};

            national_Day_ComboBox.setModel(new DefaultComboBoxModel<>(days));
            international_Day_ComboBox.setModel(new DefaultComboBoxModel<>(days));
            national_Month_ComboBox.setModel(new DefaultComboBoxModel<>(months));
            international_Month_ComboBox.setModel(new DefaultComboBoxModel<>(months));
            national_Year_ComboBox.setModel(new DefaultComboBoxModel<>(years));
            international_Year_ComboBox.setModel(new DefaultComboBoxModel<>(years));
            national_Hour_ComboBox.setModel(new DefaultComboBoxModel<>(hours));
            international_Hour_ComboBox.setModel(new DefaultComboBoxModel<>(hours));
            national_Minutes_ComboBox.setModel(new DefaultComboBoxModel<>(minutes));
            international_Minute_ComboBox.setModel(new DefaultComboBoxModel<>(minutes));

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
        }
    }

    public class NextTypeFlightButtonActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (national_Flight_CheckBox.isSelected()) {
                JDialog pane = (JDialog) SwingUtilities.getWindowAncestor(SwingUtilities.getRootPane(type_Flight_Panel));
                pane.dispose();

                String[] cubaCities = {"", "Baracoa", "Cayo Coco", "Guantánamo", "Holguín", "Nueva Gerona", "Santiago de Cuba"};
                national_City_ComboBox.setModel(new DefaultComboBoxModel<>(cubaCities));

                menu_Panel.setVisible(false);
                type_Flight_Panel.setVisible(false);
                new_National_Flight_Panel.setVisible(true);
                option_Panel.setVisible(true);
                confirm_City_Button.setVisible(true);
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

    public class InternationalRegionButtonComboBoxActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (international_Region_ComboBox.getItemAt(international_Region_ComboBox.getSelectedIndex()).equals("")) {
                JOptionPane.showMessageDialog(null, "ERROR!\nIngrese una region para continuar",
                        "ERROR!", JOptionPane.INFORMATION_MESSAGE);
            } else {
                internationalCountryList();
                next_InternationalRegion_Button.setVisible(false);
                next_InternationalCountry_Button.setVisible(true);
                country_Panel.setVisible(true);
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

    public class InternationalCountryButtonComboBoxActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (international_Country_ComboBox.getItemAt(international_Country_ComboBox.getSelectedIndex()).equals("")) {
                JOptionPane.showMessageDialog(null, "ERROR!\nIngrese un pais para continuar",
                        "ERROR!", JOptionPane.INFORMATION_MESSAGE);
            } else {
                internationalCityList();
                next_InternationalCountry_Button.setVisible(false);
                destined_City_Panel.setVisible(true);
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

    public class CharterRegionButton implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (charter_Region_ComboBox.getItemAt(charter_Region_ComboBox.getSelectedIndex()).equals("")) {
                JOptionPane.showMessageDialog(null, "ERROR!\nIngrese una region para continuar",
                        "ERROR!", JOptionPane.INFORMATION_MESSAGE);
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
        } else if (!isNational && !isCharter) {
            international_Terminal_ComboBox.addItem(terminal_Name);
        }
    }

    public class AddNationalActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String national_City;
            float travel_km = 0;
            StringBuffer date = new StringBuffer("");
            String assigned_Plane;
            String terminal;
            String hour;
            String minutes;

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
                } else {
                    try {
                        national_City = national_City_ComboBox.getItemAt(national_City_ComboBox.getSelectedIndex());
                        travel_km = Float.parseFloat(national_Km_Label.getText());
                        assigned_Plane = national_Assigned_Plane_ComboBox.getItemAt(national_Assigned_Plane_ComboBox.getSelectedIndex());
                        date.append(national_Day_ComboBox.getItemAt(national_Day_ComboBox.getSelectedIndex()));
                        date.append(national_Month_ComboBox.getItemAt(national_Month_ComboBox.getSelectedIndex()));
                        date.append(national_Year_ComboBox.getItemAt(national_Year_ComboBox.getSelectedIndex()));
                        terminal = national_Terminal_ComboBox.getItemAt(national_Terminal_ComboBox.getSelectedIndex());
                        hour = national_Hour_ComboBox.getItemAt(national_Hour_ComboBox.getSelectedIndex());
                        minutes = national_Minutes_ComboBox.getItemAt(national_Minutes_ComboBox.getSelectedIndex());

                        airportControl.newNationalFlight(national_City, travel_km, assigned_Plane, terminal,
                                String.valueOf(date), hour, minutes);
                } catch (Exception ex) {
                        ex.printStackTrace();
                    }
            }
        }
    }

    public class ConfirmCityActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (national_City_ComboBox.getItemAt(national_City_ComboBox.getSelectedIndex()).equals("")) {
                JOptionPane.showMessageDialog(null, "ERROR!\nIngrese una ciudad para continuar",
                        "ERROR!", JOptionPane.INFORMATION_MESSAGE);
            } else {
                nationalCitiesDistance();
                confirm_City_Button.setVisible(false);
                national_Km_Panel.setVisible(true);
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
            String destined_Country;
            String destined_International_City;
            float travel_km = 0;
            String terminal;
            String assigned_Plane;
            StringBuffer date = new StringBuffer("");
            String hour;
            String minutes;

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
            } else {
                try {
                    destined_International_City = international_City_ComboBox.getItemAt(international_City_ComboBox.getSelectedIndex());
                    travel_km = Float.parseFloat(international_Km_Label.getText());
                    assigned_Plane = international_Assigned_Plane_ComboBox.getItemAt(international_Assigned_Plane_ComboBox.getSelectedIndex());
                    terminal = international_Terminal_ComboBox.getItemAt(international_Terminal_ComboBox.getSelectedIndex());
                    date.append(international_Day_ComboBox.getItemAt(international_Day_ComboBox.getSelectedIndex()));
                    date.append(international_Month_ComboBox.getItemAt(international_Month_ComboBox.getSelectedIndex()));
                    date.append(international_Year_ComboBox.getItemAt(international_Year_ComboBox.getSelectedIndex()));
                    hour = international_Hour_ComboBox.getItemAt(international_Hour_ComboBox.getSelectedIndex());
                    minutes = international_Minute_ComboBox.getItemAt(international_Minute_ComboBox.getSelectedIndex());
                    destined_Country = international_Country_ComboBox.getItemAt(international_Country_ComboBox.getSelectedIndex());

                    airportControl.newInternationalFlight(destined_International_City, travel_km, assigned_Plane, terminal,
                            String.valueOf(date), hour, minutes, destined_Country);
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

            String[] national_Airlines = {"", "Aerogaviota", "Cubana de Aviacion"};
            String[] international_Airlines = {"", "Air Transat", "Air Canada Rouge", "JetBlue Airways", "Southwest Airlines",
            "United Airlines", "United Express", "American Airlines", "Delta Air Lines", "United Express",
            "Aeromar", "Viva Aerobus", "Aeroméxico" ,"Magnicharters", "Bahamasair", "Sunrise Airways", "Cayman Airways",
            "Aerogaviota", "InterCaribbean Airways", "Aruba Airlines", "Conviasa", "Copa Airlines", "Wingo", "Aerolíneas Argentinas",
            "Air Century", "Caribbean Airlines", "Fly All Ways", "Condor", "Air Europa", "Iberia", "Iberojet", "World2fly",
            "Air France", "Neos", "Aeroflot", "Edelweiss Air", "Turkish Airlines", "TAAG Angola Airlines"};
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

                    if (airportControl.newPlane(plane_Plate,plane_Model, plane_Seats,plane_Builder,plane_Builder_Country,
                            isNational, isCharter, plane_Airline)) {
                        if (national_Plane_CheckBox.isSelected()) {
                            national_Assigned_Plane_ComboBox.addItem(plane_Plate);
                        } else if (international_Plane_CheckBox.isSelected()) {
                            international_Assigned_Plane_ComboBox.addItem(plane_Plate);
                        } else if (charter_Plane_CheckBox.isSelected()) {
                            charter_Assigned_Plane_ComboBox.addItem(plane_Plate);
                        }

                        plane_Plate_Text.setText("");
                        plane_Airline_ComboBox.setSelectedItem("");
                        plane_Model_Text.setText("");
                        plane_Seats_Text.setText("");
                        plane_Builder_Text.setText("");
                        plane_Builder_Country_ComboBox.setSelectedItem("");
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
}
    
