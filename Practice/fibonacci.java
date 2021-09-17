
import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many Fibonacci numbers you want?");
        int fib = sc.nextInt();
        System.out.println(fiboRecursive(fib));
        sc.close();
    }

    private static void fiboSequeqnce(int x) {
        int a = 1;
        int b = 1;
        for (int i = 0; i < x; i++) {
            int sum = a + b;
            a = b;
            b = sum;
            System.out.print(sum + "  ");
        }
    }

    private static int fiboRecursive(int n) {
        if(n == 0){
            return 0;
         } else if(n == 1) {
            return 1;
         } else {
            return (fiboRecursive(n-1) + fiboRecursive(n-2));
         }
    }
}
