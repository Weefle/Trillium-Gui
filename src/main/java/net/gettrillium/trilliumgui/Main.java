package net.gettrillium.trilliumgui;

import javax.swing.*;
import java.awt.*;

public class Main {

    private static JFrame frame = new JFrame("Trillium Configurator");

    public static void main(String[] args) {
        frame.setResizable(true);
        frame.setSize(new Dimension(500, 720));
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);


    }
}
