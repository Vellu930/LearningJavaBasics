package arrays;

import java.net.URL;
import java.util.Random;
import java.util.Scanner;

public class MovieTitleGen {
	public static void main(String[] args) throws Exception {

		String[] adjectives = arrayFromUrl("http://cs.leanderisd.org/txt/adjectives.txt");
		String[] nouns = arrayFromUrl("http://cs.leanderisd.org/txt/nouns.txt");

		System.out.println("Mitchell's Random Movie Title Generator\n");

		System.out.print("Choosing randomly from " + adjectives.length + " adjectives ");
		System.out.println("and " + nouns.length + " nouns (" + (adjectives.length * nouns.length) + " combinations).");

		Random r = new Random();
		int index1 = r.nextInt(adjectives.length);
		String adjective = adjectives[index1];
		Random r2 = new Random();
		int index2 = r2.nextInt(nouns.length);
		String noun = nouns[index2];

		System.out.println("Your movie title is: " + adjective + " " + noun);
	}

	/**
	 * @param url - the URL to read words from
	 * @return An array of words, initialized from the given URL
	 */
	public static String[] arrayFromUrl(String url) throws Exception {
		Scanner fin = new Scanner((new URL(url)).openStream());
		int count = fin.nextInt();

		String[] words = new String[count];

		for (int i = 0; i < words.length; i++) {
			words[i] = fin.next();
		}
		fin.close();

		return words;
	}

}
