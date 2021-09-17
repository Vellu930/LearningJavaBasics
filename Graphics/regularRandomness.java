
import java.awt.*;
import java.util.Random;
import javax.swing.JFrame;

public class regularRandomness extends Canvas {

    private static final long serialVersionUID = 1L;

    public void paint(Graphics g) {

        for (int i = 0; i < 500; i++) {
            // Random colour values:
            Random c1 = new Random();
            Random c2 = new Random();
            Random c3 = new Random();
            int cVal1 = c1.nextInt(255);
            int cVal2 = c2.nextInt(255);
            int cVal3 = c3.nextInt(255);
            Color randC1 = new Color(cVal1, cVal2, cVal3);

            // Random values for triangle vertex points:
            Random v1 = new Random();
            Random v2 = new Random();
            int x = v1.nextInt(750);
            int y = v2.nextInt(550);

            Polygon tri = new Polygon();
            tri.addPoint(x, y);
            tri.addPoint(x, y + 50);
            tri.addPoint(x + 40, y + 50);

            g.setColor(randC1);
            g.fillPolygon(tri);

            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        JFrame art = new JFrame("Triangle randomness");
        art.setSize(800, 600);
        art.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        regularRandomness canvasss = new regularRandomness();
        art.add(canvasss);
        art.setVisible(true);
    }
}
