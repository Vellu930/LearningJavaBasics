import java.awt.*;
import java.awt.event.*;

import javax.swing.JButton;
import javax.swing.JFrame;

public class repaint_example extends Canvas implements ActionListener {

    static JFrame f = new JFrame("Title");
    static JButton button = new JButton("Add");

    public static void main(String[] args) {
        repaint_example obj = new repaint_example();
        obj.myFR();
    }

    private void myFR() {
        button.addActionListener(this);
        button.setFocusable(false);
        button.setBounds(30, 30, 90, 40);
        f.add(button);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.add(new repaint_example());
        f.setSize(300, 250);
        f.setVisible(true);
    }

    int i = 0;

    public void paint(Graphics g) {

        drawText(g);
        repaint();
    }

    private void drawText(Graphics g) {
        g.drawString("i = " + i, 100, 100);

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == button) {
            i += 1;
            repaint();
        }
    }
}
