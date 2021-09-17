
import java.awt.*;
import java.util.Random;
import javax.swing.JFrame;

public class randomLines extends Canvas {

    public void paint(Graphics g) {
        // Choose a random colour for all drawn lines:
        Random c1 = new Random();
        Random c2 = new Random();
        Random c3 = new Random();
        int cVal1 = c1.nextInt(255);
        int cVal2 = c2.nextInt(255);
        int cVal3 = c3.nextInt(255);
        Color randC1 = new Color(cVal1, cVal2, cVal3);

        for (int i = 0; i < 10000; i++) {
            // Random values for line points:
            Random v1 = new Random();
            Random v2 = new Random();
            Random v3 = new Random();
            Random v4 = new Random();
            int x1 = v1.nextInt(598);
            int y1 = v2.nextInt(598);
            int x2 = v3.nextInt(598);
            int y2 = v4.nextInt(598);

            g.setColor(randC1);
            g.drawLine(x1, y1, x2, y2);
            /*
             * try { Thread.sleep(1); } catch (InterruptedException e) {
             * e.printStackTrace(); }
             */
        }
    }

    public static void main(String[] args) {
        JFrame art = new JFrame("Triangle randomness");
        art.setSize(600, 600);
        art.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        randomLines canvasss = new randomLines();
        art.add(canvasss);
        art.setVisible(true);
    }
}
