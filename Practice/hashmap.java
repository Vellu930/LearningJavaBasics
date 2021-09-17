
import java.util.HashMap;
import java.util.Map;

public class hashmap {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String, String>();
        map.put("key1", "value1");
        map.put("key2", "value2");
        map.put("key3", "value3");
        System.out.println(map); // print whole hashmap

        System.out.println(map.get("key2")); // print specific value - GET()
        System.out.println("----------------------------");

        HashMap<String, String> login = new HashMap<String, String>();
        login.put("Marti", "1234asdf");
        login.put("Ritesh", "werty89");
        login.put("Nobody", "nonsense");

        for (Map.Entry m : login.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }

        login.remove("Nobody");
        System.out.println("----------------------------");
        for (Map.Entry m : login.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
        System.out.println("----------------------------");

        System.out.println(login.containsValue("1234asdf"));

        System.out.println(login.size());
        System.out.println(login.values());
        System.out.println(login.keySet());

    }
}
