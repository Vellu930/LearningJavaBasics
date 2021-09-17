
import java.awt.*;
import java.util.Random;
import javax.swing.JFrame;

public class ranTriangles extends Canvas {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public void paint(Graphics g) {

        for (int i = 0; i < 500; i++) {
            // Random colour values:
            Random c = new Random();
            int cVal1 = c.nextInt(255);
            int cVal2 = c.nextInt(255);
            int cVal3 = c.nextInt(255);

            // Random values for triangle vertex points:
            Random v = new Random();
            int val1 = v.nextInt(750);
            int val2 = v.nextInt(550);
            int val3 = v.nextInt(750);
            int val4 = v.nextInt(550);
            int val5 = v.nextInt(750);
            int val6 = v.nextInt(550);

            Color randC1 = new Color(cVal1, cVal2, cVal3);

            Polygon tri = new Polygon();
            tri.addPoint(val1, val2);
            tri.addPoint(val3, val4);
            tri.addPoint(val5, val6);

            g.setColor(randC1);
            g.fillPolygon(tri);

            try {
                Thread.sleep(30);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        JFrame art = new JFrame("Triangle randomness");
        art.setSize(800, 600);
        art.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ranTriangles canvasss = new ranTriangles();
        art.add(canvasss);
        art.setVisible(true);
    }
}
