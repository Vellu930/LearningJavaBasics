import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JCHECKBOX_example extends JFrame implements ActionListener {
    public static void main(String[] args) {
        JCHECKBOX_example checkie = new JCHECKBOX_example();
    }

    String peanuts = "peanuts";
    String strawberries = "Strawberies";
    String beet = "Beetroot";
    String raisings = "Raisins";

    StringBuilder text = new StringBuilder();
    JCheckBox check1 = new JCheckBox("Peanuts");
    JCheckBox check2 = new JCheckBox("Strawberries");
    JCheckBox check3 = new JCheckBox("Beetroot");
    JCheckBox check4 = new JCheckBox("Raisins");

    JButton submit = new JButton("Submit");

    JLabel sentence = new JLabel("Label is here.");

    JCHECKBOX_example() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(300, 300);
        this.setLayout(new FlowLayout());

        sentence.setBorder(BorderFactory.createLineBorder(Color.BLUE));

        submit.addActionListener(this);

        this.add(check4);
        this.add(check3);
        this.add(check2);
        this.add(check1);
        this.add(submit);
        this.add(sentence);
        this.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == submit) {
            text.delete(0, text.length());
            if (check1.isSelected()) {
                text.append(peanuts + " ");
            }
            if (check2.isSelected()) {
                text.append(strawberries + " ");
            }
            if (check3.isSelected()) {
                text.append(beet + " ");
            }
            if (check4.isSelected()) {
                text.append(raisings + " ");
            }

            sentence.setText(text.toString());
            System.out.println(text.toString());

        }

    }

}
