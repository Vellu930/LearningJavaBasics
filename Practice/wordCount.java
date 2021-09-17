public class wordCount {
    public static void main(String[] args) {
        String myDream = "I wish for flowers and money falling from the sky.";

        int countStrWords = 0;

        String[] splitting = myDream.split(" ");
        for (String s : splitting) {
            System.out.print(s + " ");
            countStrWords++;
        }
        System.out.println();
        System.out.println("Number of words in my string: " + countStrWords);

    }
}
