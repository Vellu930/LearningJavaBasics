import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JRadioButton_example extends JFrame implements ActionListener {
    public static void main(String[] args) {
        new JRadioButton_example();
    }

    JLabel text = new JLabel("Today's lunch menu ");
    JLabel selection = new JLabel("Nothing selected yet.");

    JRadioButton menu1 = new JRadioButton("Potato-zucchini patties");
    JRadioButton menu2 = new JRadioButton("Gluten-free vegetable pizza");
    JRadioButton menu3 = new JRadioButton("Fish cakes with rice");
    JRadioButton menu4 = new JRadioButton("Bun-Chha");

    JRadioButton_example() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Lunchbox menu options");
        this.setSize(300, 300);
        this.setLayout(new FlowLayout());

        // To select only one button in a group:
        ButtonGroup group = new ButtonGroup();
        group.add(menu1);
        group.add(menu2);
        group.add(menu3);
        group.add(menu4);

        menu1.addActionListener(this);
        menu2.addActionListener(this);
        menu3.addActionListener(this);
        menu4.addActionListener(this);

        // ! TIP !
        // --> You can also set icons for each button!
        // Then the circles will be replaces with the icon

        this.add(text);
        this.add(menu1);
        this.add(menu2);
        this.add(menu3);
        this.add(menu4);
        this.add(selection);
        this.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == menu1) {
            selection.setText("Potato-zucchini patties");
            System.out.println("potato patties...");
        }
        if (e.getSource() == menu2) {
            selection.setText("Gluten-free vegetable pizza");
        }
        if (e.getSource() == menu3) {
            selection.setText("Fish cakes with rice");
        }
        if (e.getSource() == menu4) {
            selection.setText("Bun-Chha");
        }

    }

}
