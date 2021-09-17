
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Challenge {

    // Print first 'n' vowels from the given string!
    // if there's less vowel than 'n' return "invalid"

    public static void main(String[] args) {
        firstNVowels("sharpening skills", 3);
    }

	public static void firstNVowels(String str, int n) {
		Pattern p = Pattern.compile("[aeiou]{n}");
		Matcher m = p.matcher(str);
		
		boolean found = m.find();


		if (found) {
			System.out.println("group " + m.group(0));
		}
		else {
			System.out.println("invalid");
		}
	}
}
