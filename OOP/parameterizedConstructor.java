
import java.util.Scanner;

public class parameterizedConstructor {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter students name:   ");
        String stName = sc.nextLine();
        System.out.println("Enter students age:  ");
        int stAge = sc.nextInt();

        Student myStudent1 = new Student(stName, stAge);
        Student myStudent2 = new Student("Caroline", 23);
        Student myStudent3 = new Student("Peter", 18);

        myStudent1.display();
        myStudent2.display();
        myStudent3.display();

        sc.close();

    }

}
