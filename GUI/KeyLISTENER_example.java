import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class KeyLISTENER_example implements KeyListener {
    JLabel cat = new JLabel();
    JFrame frame = new JFrame("Cat hunt");
    int x = 10, y = 10;
    int z = 150, w = 150;

    public static void main(String[] args) {
        KeyLISTENER_example catObj = new KeyLISTENER_example();
        catObj.cathuntCall();
    }

    private void cathuntCall() {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(500, 500);
        frame.addKeyListener(this);

        ImageIcon cattie = new ImageIcon("catface.png");
        Image catPic = cattie.getImage();
        Image new_cat = catPic.getScaledInstance(z, w, java.awt.Image.SCALE_SMOOTH);
        cattie = new ImageIcon(new_cat);

        cat.setHorizontalAlignment(JLabel.CENTER);
        cat.setIcon(cattie);
        cat.setBounds(x, y, z + 20, w + 20);
        cat.setBackground(Color.LIGHT_GRAY);
        cat.setOpaque(true);

        frame.add(cat);
        frame.getContentPane().setBackground(Color.PINK);
        frame.setVisible(true);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        char k = e.getKeyChar();
        switch (k) {
            case 'l':
                cat.setSize(z += 10, w += 10);
                break;
            case 's':
                cat.setSize(z -= 10, w -= 10);
                break;
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();
        switch (key) {
            case 37:
                cat.setLocation(x -= 10, y);
                break;
            case 38:
                cat.setLocation(x, y -= 10);
                break;
            case 39:
                cat.setLocation(x += 10, y);
                break;
            case 40:
                cat.setLocation(x, y += 10);
                break;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

}