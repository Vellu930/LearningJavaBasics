
import java.util.Random;

public class FlickerPhrase {
	public static void main(String[] args) {
		Random rng = new Random();
		String text = "I pledge allegiance to the flag.";

		for (int j = 1; j < 10; j++) {
			for (int i = 1; i < 6; i++) {
				int r = 1 + rng.nextInt(5);
				// Write five if statements here.
				// If r is 1, then call the function named 'first'.
				// If r is 2, then call the function named 'second', and so on.
				switch (r) {
					case 1:
						first();
						break;
					case 2:
						second();
						break;
					case 3:
						third();
						break;
					case 4:
						fourth();
						break;
					case 5:
						fifth();
						break;
					default:
						text = "Invalid value!";

				}
				try {
					Thread.sleep(200);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

				// Optional: after the if statements are over, add in a slight delay.
			}
		}

		System.out.println(text);

	}

	public static void first() {
		System.out.print("I                               \r");
	}

	public static void second() {
		System.out.print("  pledge                        \r");
	}

	public static void third() {
		System.out.print("         allegiance             \r");
	}

	public static void fourth() {
		System.out.print("                    to the      \r");
	}

	public static void fifth() {
		System.out.print("                           flag.\r");
	}
}
