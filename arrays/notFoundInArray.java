
import java.util.Scanner;

public class notFoundInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] heroes = { "Abderus", "Achilles", "Aeneas", "Ajax", "Amphitryon", "Bellerophon", "Castor",
                "Chrysippus", "Daedalus", "Diomedes", "Eleusis", "Eunostus", "Ganymede", "Hector", "Iolaus", "Jason",
                "Meleager", "Odysseus", "Orpheus", "Perseus", "Theseus" };

        String guess;
        boolean foundFlag = false; /*
                                    * this is so called flag. This is trick to confirm that value is not in the
                                    * array, the value stay same until match is found.
                                    */

        System.out.println("Name a mortal greek hero:  ");
        guess = sc.nextLine();

        for (String hero : heroes) {
            if (guess.equals(hero)) {
                System.out.println("Yeah, we have " + guess + " in our database!");
                foundFlag = true;
            }
        }
        // This IF must be outside the loop. The loop must be finished before we can say
        // for sure that the value is missing.
        if (foundFlag == false)
            System.out.println("Sorry, " + guess + " is not a mortal greek hero.");

        sc.close();

    }
}
