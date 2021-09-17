import javax.swing.JFrame;
import javax.swing.JLabel;

public class frameMain {
    public static void main(String[] args) {
        myFrame f = new myFrame();

        labels(f);

    }

    private static void labels(JFrame f) {
        JLabel label = new JLabel();
        label.setText("Welcome to my game!");
        f.add(label);
    }
}
