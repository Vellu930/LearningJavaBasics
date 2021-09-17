
public class Student {
    String name;
    int age;
    String city;

    Student(String name, int age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;

    }

    public String activity() {
        return name + " likes to code in C and drink water!";
    }

    public String activity(String drink) {
        return name + " likes to code in Java and drink " + drink + "!";
    }

    @Override
    public String toString() {
        return name + ", age " + age + " lives in " + city;

    }
}
