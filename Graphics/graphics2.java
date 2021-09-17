
import java.awt.*;
import javax.swing.*;

public class graphics2 extends Canvas {

    public void paint(Graphics g) {
        g.setColor(Color.black);

        g.drawRect(50, 20, 100, 200);
        g.fillOval(160, 20, 100, 200);

        g.drawArc(270, 20, 100, 200, 0, 270); // arc starting degree is 0, second degree counts from that zero.
        g.drawArc(50, 250, 150, 150, 90, 180);
        g.drawArc(210, 250, 150, 150, 45, 90);
        g.fillArc(210, 280, 150, 150, 45, 90);

        g.setColor(Color.yellow);
        g.fillArc(150, 400, 150, 150, 45, 270); // arc starting degree is 45, finished degree counts from 45, not from
                                                // original zero!

        g.setColor(Color.CYAN);
        g.fillArc(310, 450, 70, 70, 225, 270);

        // My custom colour:
        Color myOrange = new Color(230, 92, 50); // Red, green, blue values as parameters.

        g.setColor(myOrange);
        g.fillOval(500, 50, 150, 150);

        Color myGrey = new Color(250, 130, 130);
        g.setColor(myGrey);
        g.fillOval(550, 100, 50, 50);

        g.setColor(Color.yellow);
        g.fillOval(500, 210, 150, 150);

        g.setColor(Color.green);
        g.fillOval(500, 370, 150, 150);

    }

    public static void main(String[] args) {
        JFrame window = new JFrame("Graphics 2: Arcs and colors");
        window.setSize(800, 650);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        graphics2 Canvasss = new graphics2();
        window.add(Canvasss);
        window.setVisible(true);
    }
}
