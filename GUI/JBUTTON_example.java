import java.awt.Color;
import javax.swing.JButton;

public class JBUTTON_example {
    public static void main(String[] args) {
        myFrame frame = new myFrame();

        JButton but = new JButton();
        frame.add(but);
        but.setBackground(Color.BLUE);
        but.setText("Kick me!");
        but.setForeground(Color.PINK);
        but.setBounds(150, 150, 200, 70);
        but.addActionListener(e -> System.out.println("Clicky click!")); // my firt LAMBDA expression

    }

}