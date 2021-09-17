package login_basic;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginPage implements ActionListener {

    JFrame frame = new JFrame("Login");
    JTextField userIDfield = new JTextField();
    JPasswordField passwordField = new JPasswordField();
    JLabel userIDlabel = new JLabel("User ID");
    JLabel passwordLabel = new JLabel("Password");
    JLabel messageLabel = new JLabel("");
    JButton loginButton = new JButton("Login");
    JButton resetButton = new JButton("Reset");
    HashMap<String, String> logininfo = new HashMap<String, String>();

    LoginPage(HashMap<String, String> loginInfoOriginal) {
        logininfo = loginInfoOriginal;
        System.out.println(logininfo);

        userIDlabel.setBounds(50, 100, 75, 25);
        passwordLabel.setBounds(50, 150, 75, 25);

        messageLabel.setBounds(90, 260, 350, 60);
        messageLabel.setFont(new Font("Consolas", Font.ITALIC, 20));

        userIDfield.setBounds(130, 100, 200, 25);
        passwordField.setBounds(130, 150, 200, 25);

        loginButton.setBounds(125, 200, 100, 25);
        loginButton.setFocusable(false);
        loginButton.addActionListener(this);

        resetButton.setBounds(250, 200, 100, 25);
        resetButton.setFocusable(false);

        resetButton.addActionListener(this);

        frame.add(userIDlabel);
        frame.add(passwordLabel);
        frame.add(messageLabel);
        frame.add(userIDfield);
        frame.add(passwordField);
        frame.add(loginButton);
        frame.add(resetButton);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLayout(null);
        frame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == resetButton) {
            userIDfield.setText("");
            passwordField.setText("");
        }
        if (e.getSource() == loginButton) {

            String user = userIDfield.getText();
            String password = String.valueOf(passwordField.getPassword());

            if (logininfo.containsKey(user)) {
                if (logininfo.get(user).equals(password)) {
                    messageLabel.setText("You are logged in successfully");
                    messageLabel.setForeground(Color.GREEN);
                    welcomePage welcome = new welcomePage(user);
                } else {
                    messageLabel.setText("Wrong password");
                    messageLabel.setForeground(Color.RED);
                }
            } else {
                messageLabel.setText("Wrong password or username, Try again.");
                messageLabel.setForeground(Color.RED);
            }
        }
    }

}
