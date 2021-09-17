//: Practice.basicCalculator.java
// This is my first GUI calculator

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class basicCalculator implements ActionListener {
    JFrame frame = new JFrame();
    JPanel buttonsPanel = new JPanel();
    JTextField textField = new JTextField();
    String calcString;
    JButton[] numberButtons = new JButton[10];
    JButton[] functionButtons = new JButton[6];
    JButton bPlus, bMinus, bDivide, bTimes, bDot, bEquals;
    JButton delButton = new JButton();
    JButton clearButton = new JButton();

    double num1, num2, result;
    char operator;

    Font myFont = new Font("Consolas", Font.BOLD, 25);

    public static void main(String[] args) {
        basicCalculator calc = new basicCalculator();
        calc.myCalculator();
    }

    public void myCalculator() {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("The best Calculator in the world!");
        frame.getContentPane().setBackground(Color.ORANGE);
        frame.setLayout(null);

        textField.setBounds(40, 20, 300, 40);
        textField.setEditable(false);
        textField.setBackground(Color.WHITE);
        textField.setFont(myFont);

        buttonsPanel.setBounds(40, 80, 300, 300);
        buttonsPanel.setLayout(new GridLayout(4, 4, 10, 10));
        buttonsPanel.setBackground(Color.ORANGE);

        delButton.setBounds(40, 400, 120, 40);
        delButton.setText("Delete");
        delButton.setFocusable(false);
        delButton.addActionListener(this);
        delButton.setFont(myFont);

        clearButton.setBounds(220, 400, 120, 40);
        clearButton.setText("Clear");
        clearButton.setFocusable(false);
        clearButton.addActionListener(this);
        clearButton.setFont(myFont);

        bPlus = new JButton("+");
        bMinus = new JButton("-");
        bTimes = new JButton("*");
        bDivide = new JButton("/");
        bEquals = new JButton("=");
        bDot = new JButton(".");

        for (int i = 0; i < 10; i++) {
            numberButtons[i] = new JButton();
            numberButtons[i].setText(String.valueOf(i));
            numberButtons[i].setFocusable(false);
            numberButtons[i].setFont(myFont);
            numberButtons[i].addActionListener(this);
        }
        functionButtons[0] = bPlus;
        functionButtons[1] = bMinus;
        functionButtons[2] = bTimes;
        functionButtons[3] = bDivide;
        functionButtons[4] = bDot;
        functionButtons[5] = bEquals;

        for (int i = 0; i < 6; i++) {
            functionButtons[i].setFocusable(false);
            functionButtons[i].setFont(myFont);
            functionButtons[i].addActionListener(this);
        }

        buttonsPanel.add(numberButtons[1]);
        buttonsPanel.add(numberButtons[2]);
        buttonsPanel.add(numberButtons[3]);
        buttonsPanel.add(bPlus);
        buttonsPanel.add(numberButtons[4]);
        buttonsPanel.add(numberButtons[5]);
        buttonsPanel.add(numberButtons[6]);
        buttonsPanel.add(bMinus);
        buttonsPanel.add(numberButtons[7]);
        buttonsPanel.add(numberButtons[8]);
        buttonsPanel.add(numberButtons[9]);
        buttonsPanel.add(bTimes);
        buttonsPanel.add(bDot);
        buttonsPanel.add(numberButtons[0]);
        buttonsPanel.add(bEquals);
        buttonsPanel.add(bDivide);

        frame.add(delButton);
        frame.add(clearButton);
        frame.add(buttonsPanel);
        frame.add(textField);
        frame.setSize(400, 500);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        for (int i = 0; i < 10; i++) {
            if (e.getSource() == numberButtons[i]) {
                textField.setText(textField.getText().concat(String.valueOf(i)));

            }
        }
        if (e.getSource() == delButton) {
            String text = textField.getText();
            int last = text.length() - 1;
            if (last >= 0) {
                String newText = text.substring(0, last);
                textField.setText(newText);
            }
        }
        if (e.getSource() == bDot) {
            textField.setText(textField.getText().concat("."));
        }
        if (e.getSource() == bPlus) {
            num1 = Double.parseDouble(textField.getText());
            operator = '+';
            textField.setText("");
        }
        if (e.getSource() == bMinus) {
            num1 = Double.parseDouble(textField.getText());
            operator = '-';
            textField.setText("");
        }
        if (e.getSource() == bTimes) {
            num1 = Double.parseDouble(textField.getText());
            operator = '*';
            textField.setText("");
        }
        if (e.getSource() == bDivide) {
            num1 = Double.parseDouble(textField.getText());
            operator = '/';
            textField.setText("");
        }
        if (e.getSource() == clearButton) {
            textField.setText("");
            num1 = 0;
            num2 = 0;
            result = 0;

        }

        if (e.getSource() == bEquals) {
            num2 = Double.parseDouble(textField.getText());
            textField.setText("");

            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    result = num1 / num2;
                    break;
                default:
                    break;
            }
            textField.setText(String.valueOf(result));
            num1 = result;
        }

    }

}
