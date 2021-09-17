import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Random;

public class funnyPhrases {
    static ArrayList<String> adj = new ArrayList<String>();
    static ArrayList<String> nouns = new ArrayList<String>();
    static ArrayList<String> names = new ArrayList<String>();
    static ArrayList<String> verbs = new ArrayList<String>();
    static ArrayList<String> places = new ArrayList<String>();
    static ArrayList<String> animals = new ArrayList<String>();

    public static void main(String[] args) {

        hangman.myBuffReader("w_personalityAdjectives.txt", adj);
        hangman.myBuffReader("w_names.txt", names);
        hangman.myBuffReader("w_nouns.txt", nouns);
        hangman.myBuffReader("w_verbs.txt", verbs);
        hangman.myBuffReader("w_places.txt", places);
        hangman.myBuffReader("w_animals.txt", animals);

        // choose adjective
        Random in0 = new Random();
        int index0 = in0.nextInt(adj.size());
        String adjective2 = adj.get(index0);

        // choose adjective
        Random in1 = new Random();
        int index = in1.nextInt(adj.size());
        String adjective = adj.get(index);

        // choose noun
        Random in2 = new Random();
        int index2 = in2.nextInt(nouns.size());
        String noun = nouns.get(index2);

        // choose verb
        Random in3 = new Random();
        int index3 = in3.nextInt(verbs.size());
        String verb = verbs.get(index3);

        // choose name
        Random in4 = new Random();
        int index4 = in4.nextInt(names.size());
        String name = names.get(index4);

        // choose place
        Random in5 = new Random();
        int index5 = in5.nextInt(places.size());
        String place = places.get(index5);

        // choose animal
        Random in6 = new Random();
        int index6 = in6.nextInt(animals.size());
        String animal = animals.get(index6);

        writeSentence(adjective, name, verb, noun, adjective2, animal, place);

    }

    private static void writeSentence(String adjective, String name, String verb, String noun, String adjective2,
            String animal, String place) {
        String phrase = adjective + " " + name + " " + verb + " " + noun + " with " + adjective2 + " " + animal
                + " in the " + place;

        System.out.printf("%s %s %s %s with %s %s", adjective, name, verb, noun, adjective2, animal);
        System.out.printf(" in the %s.\n", place);

        saveSentenceToFile(phrase);

    }

    private static void saveSentenceToFile(String phrase) {
        try {
            FileWriter writer = new FileWriter("funnyPhrases.txt", true);
            writer.write(phrase);
            writer.write("\n \n");
            writer.close();
        } catch (IOException e) {
            System.out.println("Exception IO happened...");
            e.printStackTrace();
        }
    }

}
