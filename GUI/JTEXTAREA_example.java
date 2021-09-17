import javax.swing.*;
import java.awt.*;

public class JTEXTAREA_example {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // frame.setLayout(null);
        frame.setSize(400, 400);

        JTextArea textArea = new JTextArea("Display some text please!");
        textArea.setText("Courteous intention loses with Rebecca and with Sexy Reindeer in the Garage."
                + "\n Faithful Juan matures with investigation and with Humble Hippopotamus in the Pedestrian crossing."
                + "\n Attentive Anthony generates with view and with Attentive Bat in the Garage"
                + "\n Adventurous Cynthia manufactures with grass and with Adventurous Bald eagle in the Road sign"
                + "\n Worried Grace attends with food and with Sincere Panda in the Mental Hospital"
                + "\n Ambitious Isabella reminds with deputy and with Fearless Coyote in the Sports centre"
                + "\n Placid Marie beats with judge and with Nervous Rabbit in the Underpass"
                + "\n Straightforward Michelle eliminates with sugar and with Bossy Dolphin in the Farm"
                + "\n Mean Julia searches with chest and with Brave Frog in the Supermarket  "
                + "\n Serious Amanda argues need with Emotional Hedgehog in the Farm"
                + "\n Intelligent Isabella departs figure with Messy Starfish in the Petrol station"
                + "\n Sensible Emily focuses file with Sociable Fish in the Swimming pool"
                + "\n Adventurous Cynthia manufactures with grass and with");
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        textArea.setBackground(Color.ORANGE);
        textArea.setForeground(Color.BLUE);
        textArea.setFont(new Font("Georgia", Font.PLAIN, 17));
        textArea.setSize(200, 200); // without bounds it wouldn't work with null layout
        textArea.setBorder(BorderFactory.createBevelBorder(1));
        textArea.setEditable(false);

        JScrollPane scrollPane = new JScrollPane(textArea);
        scrollPane.setPreferredSize(new Dimension(300, 300));
        scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        // frame.add(textArea);
        frame.add(scrollPane);
        frame.setVisible(true);
    }
}
