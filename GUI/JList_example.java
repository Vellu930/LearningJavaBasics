import javax.swing.JFrame;
import javax.swing.JList;

import java.awt.*;
import java.awt.event.*;
import java.util.List;

public class JList_example extends JFrame implements ActionListener {
    public static void main(String[] args) {
        new JList_example();
    }

    JList<Integer> list = new JList<Integer>();

    JList_example() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        Integer[] nums = { 1, 2, 4, 7, 5, 45, 99, 6 };
        list.setListData(nums);

        add(list);
        pack();
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == list) {
            System.out.println(list.getSelectedValue());
        }
    }
}
