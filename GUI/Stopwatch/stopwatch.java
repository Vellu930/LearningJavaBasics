package Stopwatch;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class stopwatch implements ActionListener {

    JFrame fr = new JFrame("Stopwatch");
    JButton startButton = new JButton("Start");
    JButton resetButton = new JButton("Reset");
    JLabel timeLabel = new JLabel();
    int elapsedTime = 0;
    int seconds = 0;
    int minutes = 0;
    int hours = 0;
    boolean started = false;
    String second_string = String.format("%02d", seconds);
    String minute_string = String.format("%02d", minutes);
    String hour_string = String.format("%02d", hours);

    Timer tm = new Timer(1000, new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            // this is what timer do every 1000 miliseconds
            elapsedTime += 1000;
            hours = (elapsedTime / 3600000);
            minutes = (elapsedTime / 60000) % 60;
            seconds = (elapsedTime / 1000) % 60;
            second_string = String.format("%02d", seconds);
            minute_string = String.format("%02d", minutes);
            hour_string = String.format("%02d", hours);
            timeLabel.setText(hour_string + ":" + minute_string + ":" + second_string);
        }
    });

    stopwatch() {
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setSize(400, 300);
        fr.setLayout(null);

        timeLabel.setSize(250, 80);
        int x = fr.getWidth() / 2 - (timeLabel.getWidth() / 2);
        timeLabel.setText(hour_string + ":" + minute_string + ":" + second_string);
        timeLabel.setLocation(x, 60);
        timeLabel.setFont(new Font("Consolas", Font.PLAIN, 35));
        timeLabel.setBorder(BorderFactory.createBevelBorder(1));
        timeLabel.setBackground(Color.black);
        timeLabel.setForeground(Color.ORANGE);
        timeLabel.setOpaque(true);
        timeLabel.setHorizontalAlignment(JTextField.CENTER);

        startButton.setSize(120, 40);
        startButton.setLocation(x, 160);
        startButton.setFont(new Font("Ink Free", Font.PLAIN, 25));
        startButton.setFocusable(false);
        startButton.addActionListener(this);

        resetButton.setSize(120, 40);
        resetButton.setLocation(x + 140, 160);
        resetButton.setFont(new Font("Ink Free", Font.PLAIN, 25));
        resetButton.setFocusable(false);
        resetButton.addActionListener(this);

        fr.add(startButton);
        fr.add(resetButton);
        fr.add(timeLabel);
        fr.setVisible(true);
    }

    void start() {
        tm.start();
    }

    void stop() {
        tm.stop();
    }

    void reset() {
        tm.stop();
        elapsedTime = 0;
        seconds = 0;
        minutes = 0;
        hours = 0;
        second_string = String.format("%02d", seconds);
        minute_string = String.format("%02d", minutes);
        hour_string = String.format("%02d", hours);
        timeLabel.setText(hour_string + ":" + minute_string + ":" + second_string);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == startButton) {
            if (started == false) {
                started = true;
                startButton.setText("Stop");
                start();
            } else {
                started = false;
                startButton.setText("Start");
                stop();
            }
        }
        if (e.getSource() == resetButton) {
            started = false;
            startButton.setText("Start");
            reset();
        }

    }
}
