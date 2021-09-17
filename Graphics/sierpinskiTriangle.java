
import java.awt.*;
import java.util.Random;
import javax.swing.JFrame;

public class sierpinskiTriangle extends Canvas {
    public void paint(Graphics g) {
        g.setColor(Color.black);
        // the starting point:
        int x = 333;
        int y = 456;
        // Three vertices for big triangle:
        int x1 = 512;
        int y1 = 109;
        int x2 = 146;
        int y2 = 654;
        int x3 = 876;
        int y3 = 654;
        int dx = 0;
        int dy = 0;

        Random rand = new Random();

        for (int i = 0; i < 50000; i++) {
            g.drawLine(x, y, x, y);

            int option = rand.nextInt(3);
            if (option == 0) {
                dx = x - x1;
                dy = y - y1;

            } else if (option == 1) {
                dx = x - x2;
                dy = y - y2;

            } else {
                dx = x - x3;
                dy = y - y3;

            }
            x = x - dx / 2;
            y = y - dy / 2;

        }
    }

    public static void main(String[] args) {
        JFrame art = new JFrame("Sierpinski triangle mystery - solved");
        art.setSize(1024, 768);
        art.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        sierpinskiTriangle canvasss = new sierpinskiTriangle();
        art.add(canvasss);
        art.setVisible(true);
    }
}
