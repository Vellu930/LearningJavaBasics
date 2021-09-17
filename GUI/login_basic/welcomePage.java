package login_basic;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class welcomePage {

    JFrame frame = new JFrame();
    JLabel welcomeLabel = new JLabel("Hi!");

    welcomePage(String userID) {

        welcomeLabel.setBounds(70, 70, 200, 50);
        welcomeLabel.setText("Hello, " + userID);
        welcomeLabel.setForeground(Color.MAGENTA);
        frame.add(welcomeLabel);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setLayout(null);
        frame.getContentPane().setBackground(Color.YELLOW);
        frame.setVisible(true);
    }

}
