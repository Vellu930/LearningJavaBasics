
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class JPANEL_example {
    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(500, 500);
        frame.setVisible(true);

        JPanel redPanel = new JPanel();
        redPanel.setBackground(new Color(250, 0, 0));
        redPanel.setBounds(0, 200, 500, 70);
        frame.add(redPanel);

    }
}
