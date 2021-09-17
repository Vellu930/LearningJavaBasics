package Wheel;

import java.awt.*;
import java.awt.geom.*;
import java.awt.image.*;
import java.awt.event.*;

import javax.swing.*;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class rotatingCircle extends Canvas implements ActionListener {

    JFrame win = new JFrame("Clock");
    JPanel header = new JPanel();
    JPanel controlsPane = new JPanel();
    JLabel title;
    JTextField startDateText = new JTextField();
    JButton editNoteButton = new JButton("Write a note");
    JButton newCycleButton = new JButton("New cycle");
    JButton okButton = new JButton("OK");
    private int width = 500;
    private int height = 700;

    public static void main(String[] args) throws IOException {
        rotatingCircle frame = new rotatingCircle();
        frame.drawFrame();
    }

    public void drawFrame() throws IOException {
        // header text and panel
        title = new JLabel("My clock");
        title.setLabelFor(header);
        title.setSize(300, 70); // not reacting
        title.setVerticalAlignment(SwingConstants.BOTTOM); // not reacting
        // title.setBackground(Color.GREEN);
        // title.setOpaque(true);
        title.setFont(new Font("Consolas", Font.ITALIC, 40));
        header.setBounds(0, 20, 500, 80);
        header.setLayout(new FlowLayout());
        header.setBackground(Color.lightGray);
        header.add(title);
        win.add(header);

        // Below panel with button controls
        editNoteButton.setHorizontalAlignment(SwingConstants.CENTER);
        editNoteButton.setFocusable(false);
        editNoteButton.addActionListener(this);

        newCycleButton.setHorizontalAlignment(SwingConstants.CENTER);
        newCycleButton.setFocusable(false);
        newCycleButton.addActionListener(this);

        startDateText.setEditable(false);
        startDateText.setFont(new Font("Consolas", Font.PLAIN, 25));

        okButton.setFocusable(false);
        okButton.addActionListener(this);

        controlsPane.add(editNoteButton);
        controlsPane.add(newCycleButton);
        controlsPane.add(startDateText);
        controlsPane.add(okButton);
        controlsPane.setBackground(Color.LIGHT_GRAY);
        controlsPane.setLayout(new FlowLayout());
        controlsPane.setBounds(0, 550, 500, 60);
        win.add(controlsPane);
        // frame window
        win.setSize(width, height);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        win.add(new rotatingCircle());
        win.setVisible(true);
    }

    String dateStart = "07/02/2021";
    public final double degree1day = 360.0 / 28.0;
    BufferedImage icon;
    double angle = 0;
    dateCalc d = new dateCalc();

    rotatingCircle() throws IOException {
        icon = ImageIO.read(new File("wheel.png"));
        angle = 360 - (d.days(dateStart) * degree1day);
        startDateText.setText(dateStart);

    }

    public void paint(Graphics g) {

        drawWheel(g);
        drawPointer(g);

    }

    private void drawWheel(Graphics g) {
        int x = width / 2 - 10;
        // cast the Graphics to Graphics2D
        Graphics2D g2 = (Graphics2D) g;
        int w = icon.getWidth();
        int h = icon.getHeight();
        AffineTransform tr = new AffineTransform();
        tr.scale(0.2, 0.2);
        tr.translate(getX() + x, getY() + 600);
        tr.rotate(Math.toRadians(angle), w / 2, h / 2);
        // Improve the quality using Rendering
        RenderingHints hints = new RenderingHints(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        hints.put(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
        g2.addRenderingHints(hints);
        // draw the wheel
        g2.drawImage(icon, tr, this);
    }

    private void drawPointer(Graphics g) {
        Polygon pointer = new Polygon();
        pointer.addPoint(230, 100);
        pointer.addPoint(270, 100);
        pointer.addPoint(250, 130);

        g.setColor(Color.BLACK);
        g.fillPolygon(pointer);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == newCycleButton) {
            startDateText.setEditable(true);
        }
        if (e.getSource() == okButton) {
            dateStart = startDateText.getText();
            angle = 360 - (d.days(dateStart) * degree1day);
            invalidate();
            repaint();
            System.out.println(dateStart);
            System.out.println(angle);
            // startDateText.setEditable(false);
        }

    }
}
