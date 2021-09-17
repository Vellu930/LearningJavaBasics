
public class quadraticEquation {
    public static void main(String[] args) {
        System.out.println("Number of solutions: " +checkSolutions(200, 56, -800));
    }

    private static int checkSolutions(int a, int b, int c) {
        int solutions = -9;
        int discriminant = b*b + 4*a*c;
            if (b == 0) {
                solutions = 1;
            }
            else if (b<0) {
                solutions = 0;
            }
            else {
                solutions = 2;
            }
        
        return solutions;
    }
}
