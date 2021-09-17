import java.awt.*;
import java.awt.geom.*;
import java.awt.image.*;
import java.awt.event.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.io.File;
import javax.imageio.ImageIO;

public class rotateImage extends Canvas implements ActionListener {

    BufferedImage icon;
    int angle = 1;
    static JButton stopButton = new JButton("Stop");
    static JButton startButton = new JButton("Start");

    public rotateImage() throws Exception {
        icon = ImageIO.read(new File("wheel.png"));

    }

    public void paint(Graphics g) {
        // cast the Graphics to Graphics2D
        Graphics2D g2 = (Graphics2D) g;
        int w = icon.getWidth();
        int h = icon.getHeight();
        AffineTransform tr = new AffineTransform();
        tr.scale(0.5, 0.5);
        tr.translate((int) getX() + 100, (int) getY() + 100);
        tr.rotate(Math.toRadians(35), w / 2, h / 2);
        // Improve the quality using Rendering
        RenderingHints hints = new RenderingHints(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        hints.put(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
        g2.addRenderingHints(hints);
        // draw the icon
        g2.drawImage(icon, tr, this);

    }

    public static void main(String[] args) throws Exception {
        JFrame win = new JFrame("Image Demo");
        win.setSize(500, 600);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        win.add(new rotateImage());

        stopButton.addActionListener(new rotateImage());
        startButton.addActionListener(new rotateImage());

        stopButton.setBounds(20, 20, 70, 30);
        startButton.setBounds(140, 20, 70, 30);

        win.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == startButton) {
            start();
        }

        if (e.getSource() == stopButton) {
            stop();
        }
    }

    private void stop() {

    }

    void start() {
        for (int i = 0; i < 360; i++)
            

    }

}
