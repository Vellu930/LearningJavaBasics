
import java.awt.*;
import javax.swing.*;

public class smileyFace extends Canvas {

    public void paint(Graphics g) {
        // the method name must be always paint, seems like magical word for accesing
        // the inbuilt method...

        smile(g);

    }

    private void smile(Graphics g) {
        g.setColor(Color.yellow); // yellow circle
        g.fillOval(50, 50, 450, 450);

        g.setColor(Color.blue); // blue eyes
        g.fillOval(150, 200, 50, 50);
        g.fillOval(350, 200, 50, 50);

        g.drawString("Kiss me!", 250, 290);

        g.setColor(Color.red); // smiling lips
        g.fillArc(150, 250, 250, 180, 180, 180);
        g.setColor(Color.yellow);
        g.fillArc(145, 250, 260, 150, 180, 180);
    }

    public static void main(String[] args) {
        JFrame window = new JFrame("smileyFace!: java practice of graphics n. 3");
        window.setSize(600, 600);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        smileyFace canvas = new smileyFace();
        window.add(canvas);
        window.setVisible(true);

    }
}
