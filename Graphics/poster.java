
import java.awt.Color;
import javax.swing.JFrame;
import java.awt.*;

public class poster extends Canvas {
    public static void main(String[] args) {
        JFrame win = new JFrame("Welcome to Vellu Garden!");
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        win.setBackground(Color.black);
        win.setSize(600, 600);
        win.setVisible(true);

    }
}
