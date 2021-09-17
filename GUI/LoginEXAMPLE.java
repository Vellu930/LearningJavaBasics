import java.awt.*;
import java.util.*;
import javax.swing.*;

public class LoginEXAMPLE {
    public static void main(String[] args) {
        HashMap<String, String> users = new HashMap<String, String>();
        users.put("Vellu", "12345");
        users.put("Cat", "0987");
        users.put("Richie", "4567");

        window();

    }

    private static void window() {
        JFrame fr = new JFrame("Login page");
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setSize(600, 600);

        ImageIcon logo = new ImageIcon("log.png");
        // now make the picture smaller size
        Image logoPic = logo.getImage();
        Image new_logo = logoPic.getScaledInstance(300, 300, java.awt.Image.SCALE_SMOOTH);
        logo = new ImageIcon(new_logo);

        JPanel panel = new JPanel();
        fr.add(panel);

        JLabel pic = new JLabel();
        pic.setIcon(logo);
        panel.add(pic);

        JLabel lb = new JLabel("Login to enter secret page!");
        lb.setBounds(120, 350, 300, 50);
        lb.setFont(new Font("Georgia", Font.PLAIN, 25));
        panel.add(lb);

        JPanel panel2 = new JPanel();
        panel2.setBounds(100, 450, 350, 250);
        panel.add(panel2);

        JLabel userLabel = new JLabel("User ID");
        userLabel.setBounds(100, 400, 100, 30);
        panel2.add(userLabel);
        JLabel passLabel = new JLabel("Password");
        passLabel.setBounds(100, 440, 100, 30);
        panel2.add(passLabel);

        JTextField userText = new JTextField(" ~ enter your name ~ ", 15);
        userText.setBounds(220, 400, 150, 30);
        panel2.add(userText);

        JPasswordField pass = new JPasswordField();
        pass.setBounds(220, 440, 150, 30);
        panel2.add(pass);

        JButton logButton = new JButton("Log in");
        logButton.setBounds(150, 490, 70, 30);
        panel2.add(logButton);

        JButton cancelBut = new JButton("Cancel");
        cancelBut.setBounds(250, 490, 90, 30);
        panel2.add(cancelBut);

        fr.setVisible(true);
    }

}