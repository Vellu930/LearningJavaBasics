
import java.awt.*;
import javax.swing.JFrame;

public class graphics1 extends Canvas {
    public void paint(Graphics g) {
        int x = 200;
        int y = 50;

        g.setColor(Color.black);
        g.drawString("Graphics are pretty neat.", 500, 100);
        x = getWidth() / 2;
        y = getHeight() / 2;
        g.drawString("The first letter of this string is at (" + x + "," + y + ")", x, y);

    }

    public static void main(String[] args) {
        // You can change the title or size here if you want.
        JFrame win = new JFrame("GraphicsDemo1");
        win.setSize(800, 600);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        graphics1 canvas = new graphics1();
        win.add(canvas);
        win.setVisible(true);
    }
}