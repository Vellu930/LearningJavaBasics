public class bytes {
    public static void main(String[] args) {

        int i = 153;
        String binString = Integer.toBinaryString(i);
        System.out.println(binString);
        // convert back to Int:
        int a = Integer.parseInt(binString);
        System.out.println(a);

    }

}
