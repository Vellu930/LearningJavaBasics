
import java.awt.*;
import java.util.Random;
import javax.swing.JFrame;

public class chaosGame extends Canvas {

    public void paint(Graphics g) {
        g.setColor(Color.black);
        // the starting point:
        int x = 300;
        int y = 300;
        // Three vertices for big triangle:
        int x1 = 150;
        int y1 = 150;
        int x2 = 450;
        int y2 = 150;
        int x3 = 450;
        int y3 = 450;
        int x4 = 150;
        int y4 = 450;
        int x5 = 700;
        int y5 = 300;
        int dx = 0;
        int dy = 0;

        Random rand = new Random();
        int value = 0;
        int option;

        for (int i = 0; i < 1000000; i++) {
            // draw a point with pre-set values from above
            g.drawLine(x, y, x, y);

            // generates random number for choosing vertex
            option = rand.nextInt(5);
            // checks if the number is not the same as in previous loop (two number in a row
            // must be different to create the pattern)
            // if it's same, it generates different number until it gets different than the
            // previous one
            while (option == value) {
                option = rand.nextInt(5);
            }
            // here the random vertex is chosen based on random number
            if (option == 0) {
                dx = x - x1;
                dy = y - y1;

            } else if (option == 1) {
                dx = x - x2;
                dy = y - y2;
            } else if (option == 2) {
                dx = x - x3;
                dy = y - y3;
            } else if (option == 3) {
                dx = x - x4;
                dy = y - y4;
            } else {
                dx = x - x5;
                dy = y - y5;
            }
            // the new vaues for x and y are calculated based on the chosen vertex and
            // original x, y value distance new values to x,y are created.
            // so that in next round, new point is drawn basd on thsi pattern
            x = x - dx / 2;
            y = y - dy / 2;
            // the randomly generated number from this loop is assigned to value variable so
            // that it can be comapred in next loop round
            value = option;

        }
    }

    public static void main(String[] args) {
        JFrame art = new JFrame("Sierpinski inspired chaos game!");
        art.setSize(800, 600);
        art.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        chaosGame canvasss = new chaosGame();
        art.add(canvasss);
        art.setVisible(true);
    }
}
