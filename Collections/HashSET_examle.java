import java.util.HashSet;

public class HashSET_examle {
    public static void main(String[] args) {

        // Hashset set store only unique values

        HashSet<String> plants = new HashSet<>();
        plants.add("Kroton");
        plants.add("Monstera");
        plants.add("Potos");
        plants.add("Kroton");

        for (String c : plants) {
            System.out.print(c + " ");
        }
        plants.remove("Kroton");
        System.out.println(plants.toString());
    }
}
