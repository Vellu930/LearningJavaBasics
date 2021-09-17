
import java.awt.*;
import javax.swing.JFrame;

public class drawBoxes extends Canvas {

    public void paint(Graphics g) {

        makeBoxes(g, Color.BLUE, 400, 400, 20, 100);
        makeBoxes(g, Color.red, 130, 430, 40, 200);
        makeBoxes(g, Color.YELLOW, 250, 150, 200, 300);
        makeBoxes(g, Color.BLACK, 100, 250, 80, 55);
    }

    public void makeBoxes(Graphics g, Color c, int x, int y, int h, int w) {

        g.setColor(c);
        g.fillRect(x, y, h, w);
        g.setColor(Color.white);
        g.fillRect(x + 10, y + 10, h - 20, w - 20);

    }

    public static void main(String[] args) {
        JFrame win = new JFrame();
        win.setSize(700, 700);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        drawBoxes canvasss = new drawBoxes();
        win.add(canvasss);
        win.setVisible(true);
    }
}