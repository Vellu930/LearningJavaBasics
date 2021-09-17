import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchMadeIn {
    public static void main(String[] args) {
        String regex = "[aeiouy]";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher("My favourite String, sing my bird, sing a song!");

        System.out.println(m.group(3));
        
    }
}