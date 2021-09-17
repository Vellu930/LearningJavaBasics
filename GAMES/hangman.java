import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class hangman {
    static ArrayList<String> words = new ArrayList<String>();

    public static void main(String[] args) throws IOException {
        // Reads from file with 127142 words dictionary and stores values in ArrayList
        // global
        myBuffReader("englishWords.txt", words);
        // chooses random word from the list based on index
        Random r = new Random();
        int index = r.nextInt(127142);
        String mysteryWord = words.get(index);
        char[] wordCharacters = mysteryWord.toCharArray(); // first array hold the char value of random word
        char[] guessCharacter = new char[mysteryWord.length()]; // second array holds the value of my guess

        for (int i = 0; i < guessCharacter.length; i++) {
            guessCharacter[i] = '_';
        }

        System.out.println("Let's play HANGMAN! I chose a special word for you, because you are special too!"
                + "\ncan you guess what words it is?");

        private int lives = 7;
        private boolean found = false;
        private StringBuilder missed = new StringBuilder();
        private boolean same = Arrays.equals(wordCharacters, guessCharacter);
        Scanner input = new Scanner(System.in);

        while (same != true) {
            for (int k = 0; k < wordCharacters.length; k++)
                System.out.print(guessCharacter[k] + " ");

            System.out.print("\n Guess: ");
            char guess = input.next().charAt(0);    //type letters and it will take the first CHAR only
            found = false;
            for (int p = 0; p < wordCharacters.length; p++) {
                if (guess == wordCharacters[p]) {
                    guessCharacter[p] = guess;
                    // System.out.print(guessCharacter[p]);
                    found = true;
                }
            }
            if (found == false) {
                System.out.println("You missed. ");
                lives--;
                missed.append(guess);
            }
            System.out.println("You have " + lives + " lives left");
            System.out.println("Missed letters " + missed);

            if (Arrays.equals(wordCharacters, guessCharacter)) {
                System.out.println("Congrats! You guess my word! I knew you are genius.");
                System.out.println("Mystery word is: " + mysteryWord);

                break;
            }
            if (lives <= 0) {
                System.out.println("Bad luck, you died. Improve your English vocubulary.");
                System.out.println("Mystery word is: " + mysteryWord);
                break;
            }
            System.out.println("..............................................");
        }

        input.close();
    }

    static void myBuffReader(String filename, ArrayList<String> listName) {
        try {
            FileReader read = new FileReader(filename);
            BufferedReader buffReader = new BufferedReader(read);
            while ((String line = buffReader.readLine()) != null) {
                listName.add(line);
            }
            buffReader.close();
        } catch (IOException e) {
            System.out.println("Could not open the file: " + listName);
            e.printStackTrace();
        }
    }
}
