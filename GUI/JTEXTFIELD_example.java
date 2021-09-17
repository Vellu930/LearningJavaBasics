import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JTEXTFIELD_example implements ActionListener {

    static JTextField txet;

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        txet = new JTextField();
        txet.setBounds(30, 30, 240, 50);
        txet.setCaretColor(Color.green);
        txet.setFont(new Font("Georgia", Font.BOLD, 20));
        txet.setText("write here!");
        frame.add(txet);

        JButton but = new JButton();
        but.setBounds(90, 90, 150, 40);
        but.setText("Change Color");
        but.addActionListener(new JTEXTFIELD_example()); // today traditional way of Action
        frame.add(but);

        frame.setVisible(true);
        frame.setSize(500, 250);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        txet.setForeground(Color.MAGENTA);
        System.out.println(txet.getText());
    }
}
