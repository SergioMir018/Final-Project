package GUI;

import javax.swing.*;
import java.awt.*;

public class UserInterface {
    JFrame frame = new JFrame();

    public void starGUI(){
        JPanel panelMenu = new JPanel();
        JButton button = new JButton("TEST BUTTON");
        JButton button2 = new JButton("TEST BUTTON2");
        panelMenu.setLayout(new BoxLayout(panelMenu,BoxLayout.X_AXIS));

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);

        panelMenu.add(button);
        panelMenu.add(button2);

        frame.getContentPane().add(BorderLayout.NORTH, panelMenu);
        panelMenu.setBackground(Color.LIGHT_GRAY);
        frame.setVisible(true);
    }
}
