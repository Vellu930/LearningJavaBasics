package Wheel;

import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.*;

public class optionPane {
    public void showPane() {

        JLabel message = new JLabel();
        message.setText("text");

        JFrame pane = new JFrame();
        pane.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pane.setLayout(new FlowLayout());
        pane.setSize(200, 150);
        pane.setVisible(true);

    }
}
