
public class comparing1 {
    public static void main(String[] args) {
        // Three words in alphabetical order:
        String word1 = "cat";
        String word2 = "flower";
        String word3 = "love";
        System.out.println("Your words are: \"" + word1 + "\", \"" + word2 + "\" and \"" + word3 + "\"");

        System.out.print(word1.compareTo(word2) + "   ");
        System.out.print(word2.compareTo(word3) + "   ");
        System.out.println(word1.compareTo(word3) + "   ");

        String w1 = "turtle";
        String w2 = "paper";
        String w3 = "marmelade";
        System.out.println("Your words are now in descending  alphabetical order: \"" + w1 + "\", " + w2 + "\" and \""
                + w3 + "\" !");

        System.out.print(w1.compareTo(w2) + "   ");
        System.out.print(w2.compareTo(w3) + "   ");
        System.out.println(w1.compareTo(w3) + "   ");

        String w6 = "coding";
        String w8 = "cod";

        System.out.println("Your words are now: \"" + w6 + "\" and \"" + w8 + "\".");
        System.out.println(w6.compareTo(w8));
    }
}