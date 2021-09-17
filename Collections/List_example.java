import java.util.*;

public class List_example {
    public static void main(String[] args) {
        String[] c = { "Chennai", "Dubrovnik", "Prague", "Paris", "Malaga" };
        // Immutable List
        List<String> cities = Arrays.asList(c);
        // cities.add("London"); --> throws ERROR when adding new value
        for (String s : cities) {
            System.out.print(s + ", ");
        }

        System.out.println();

        // Mutable list
        List<String> cities2 = new ArrayList<String>(Arrays.asList(c));
        cities2.add("London");

        for (String v : cities2) {
            System.out.print(v + ", ");
        }

    }
}