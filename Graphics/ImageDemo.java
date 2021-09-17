
import java.awt.*;
import javax.swing.JFrame;
import java.io.File;
import javax.imageio.ImageIO;

public class ImageDemo extends Canvas {
	Image coolFace;

	public ImageDemo() throws Exception {
		coolFace = ImageIO.read(new File("iconW.png"));
		// Java supports PNG, JPEG, and GIF (but not animated GIFs). It does not support
		// BMP.
	}

	public void paint(Graphics g) {
		// Image , x, y, this
		g.drawImage(coolFace, 50, 50, this);
	}

	public static void main(String[] args) throws Exception {
		JFrame win = new JFrame("Image Demo");
		win.setSize(500, 600);
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		win.add(new ImageDemo());
		win.setVisible(true);
	}

}
