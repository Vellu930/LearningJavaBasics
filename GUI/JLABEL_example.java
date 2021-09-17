
import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class JLABEL_example {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // frame.setSize(500, 500);
        frame.setVisible(true);
        // frame.getContentPane().setBackground(Color.DARK_GRAY);
        // frame.setLayout(null); // cancels the default settings for layout

        Border border = BorderFactory.createLineBorder(Color.GREEN, 5);
        JLabel label = new JLabel("Hey bro do you code today?");
        // label.setText("Hey bro do you code today?"); <-- alternative way to set text
        frame.add(label);
        label.setForeground(Color.RED);
        label.setFont(new Font("MV Boli", Font.BOLD, 50));
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setBackground(Color.BLACK);
        // to make the background colour appear, set the opaque to true
        label.setOpaque(true);
        label.setBorder(border);
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);
        // label.setBounds(110, 100, 300, 200);
        frame.pack(); // adjusts the size of frame to the components size

    }
}
