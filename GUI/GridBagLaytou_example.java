import java.awt.*;
import java.util.EventListener;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class GridBagLaytou_example  implements EventListener {
    public static void main(String[] args) {

        GridBagLayout gbl = new GridBagLayout();
        GridBagConstraints gc = new GridBagConstraints();

        JPanel pane1 = new JPanel();
        pane1.setLayout(gbl);
        JLabel label1 = new JLabel("pane1");
        label1.setHorizontalAlignment(SwingConstants.CENTER);
        label1.setForeground(Color.white);
        label1.add(pane1);
        pane1.setBackground(Color.red);
        pane1.setPreferredSize(new Dimension(50,50));
        gc.gridx = 1;
        gc.gridy = 1;
        gbl.setConstraints(pane1, gc);

        JPanel pane2 = new JPanel();
        pane2.setBackground(Color.blue);
        pane2.setPreferredSize(new Dimension(70,70));
        gc.gridx = 2;
        gc.gridy = 2;
        gbl.setConstraints(pane1, gc);

        JPanel pane3 = new JPanel();
        pane3.setBackground(Color.yellow);
        pane3.setPreferredSize(new Dimension(50,50));
        
        gc.fill = GridBagConstraints.NORTHEAST;
        gbl.setConstraints(pane1, gc);

        myFrame fr = new myFrame();
        fr.setLayout(gbl);
        fr.add(pane1);
        fr.add(pane2);
        fr.add(pane3);
        
    }
}
