
import java.util.Random;
import javax.swing.JFrame;
import java.awt.*;

public class test extends Canvas {
    public void paint(Graphics g) {
        for (int i = 0; i < 500; i++) {
            g.setColor(new Color(i * 655 % 256, i * 355 % 256, i * 958 % 256));
            Random r = new Random();
            int rr = r.nextInt(500);
            int rr1 = r.nextInt(500);
            int rr2 = r.nextInt(100);
            g.fillOval(rr, rr1, rr2, rr2);
        }
    }

    public static void main(String[] args) {
        JFrame window = new JFrame("Random oval from SOverflow");
        window.setSize(600, 600);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        test canvas = new test();
        window.add(canvas);
        window.setVisible(true);
    }
}
