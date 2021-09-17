import java.util.HashMap;

public class HashMAP_example {
    public static void main(String[] args) {
        HashMap<String, String> loginData = new HashMap<String, String>();
        loginData.put("Marti", "Coding123");
        loginData.put("Cat", "cat101");
        loginData.put("Dog", "hafhaf");

        System.out.println(loginData.get("Marti"));
        System.out.println(loginData.values());
        System.out.println(loginData.size());

        System.out.println("Show all users: ");
        for (String i : loginData.keySet()) {
            System.out.print(i + ", ");
        }
        System.out.println(loginData.keySet());

        System.out.println("Display pairs: ");
        for (String i : loginData.keySet()) {
            System.out.println(i + " - " + loginData.get(i));
        }
    }
}
