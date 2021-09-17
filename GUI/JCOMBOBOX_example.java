import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.*;
import java.awt.event.*;

public class JCOMBOBOX_example extends JFrame implements ActionListener {
    public static void main(String[] args) {
        new JCOMBOBOX_example();
    }

    JComboBox combo = new JComboBox();
    JLabel label = new JLabel("Nothing yet");

    JCOMBOBOX_example() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        this.setSize(300,200);

        String[] animal = { "Dog", "Cat", "Horse", "Turtle" };

        combo = new JComboBox(animal);
        combo.addActionListener(this);

        combo.setEditable(true);
        combo.addItem("Hen");
        combo.insertItemAt("Pig", 0);
        combo.setSelectedIndex(0);
        // combo.removeItem("Dog");

        System.out.println(combo.getItemCount());

        this.add(combo);
        this.add(label);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == combo) {
            label.setText(String.valueOf(combo.getSelectedItem()));
            System.out.print(combo.getSelectedItem() + " at index ");
            System.out.println(combo.getSelectedIndex());
        }

    }
}
