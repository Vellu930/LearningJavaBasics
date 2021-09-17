public class trueArray {
    public static void main(String[] args) {
        boolean[] countTrue = { false, false, false, true, true, false };
        int count = 0;
        for (boolean i : countTrue) {
            if (i == true) {
                count++;
            }
        }
        System.out.println(count);
    }

}
