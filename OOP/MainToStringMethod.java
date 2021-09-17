
public class MainToStringMethod {
    public static void main(String[] args) {
        Student st = new Student("Ritesh", 35, "London");
        Student st2 = new Student("Vellu", 23, "Pilsen");

        System.out.println(st + " \n" + st2);
        System.out.println(st.activity());
        System.out.println(st2.activity("beer"));
    }
}