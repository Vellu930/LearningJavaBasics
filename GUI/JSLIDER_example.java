import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import java.awt.*;

public class JSLIDER_example implements ChangeListener {
    public static void main(String[] args) {
        JSLIDER_example sl = new JSLIDER_example();
        sl.slider();

    }

    JFrame fr = new JFrame("slider");
    JPanel panel = new JPanel();
    JLabel label = new JLabel();
    JSlider slide = new JSlider(0, 100, 50);

    public void slider() {

        slide.setSize(new Dimension(200, 60));
        slide.setOrientation(SwingConstants.VERTICAL);

        slide.setPaintTicks(true);
        slide.setMinorTickSpacing(10);

        slide.setPaintTrack(true);
        slide.setMajorTickSpacing(50);
        slide.setPaintLabels(true);
        slide.addChangeListener(this);

        slide.setSnapToTicks(true);

        label.setText(String.valueOf(slide.getValue()));

        panel.add(label);
        panel.add(label);
        panel.add(slide);
        fr.add(panel);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setLayout(new FlowLayout());
        fr.setSize(200, 300);
        fr.setVisible(true);
    }

    @Override
    public void stateChanged(ChangeEvent e) {

        label.setText(String.valueOf(slide.getValue()));
    }
}
