public class palindromeNumber {
    public static void main(String[] args) {
        // String x = "66500066";
        // System.out.println(checkPalindrome(x));

        int i = 1;
        int max = 0;
        for (int a = 1; a <= 99; a++) {
            for (int b = 1; b <= 99; b++) {
                i = a * b;
                if (checkPalindrome(String.valueOf(i))) {
                    max = i;

                }
            }
        }
        System.out.println(max);

    }

    private static boolean checkPalindrome(String x) {
        char[] palindrome = x.toCharArray();
        StringBuilder firstHalve = new StringBuilder();
        StringBuilder secondHalve = new StringBuilder();

        for (int i = 0; i <= (palindrome.length / 2) - 1; i++) {
            firstHalve.append(palindrome[i]);

        }
        for (int p = (palindrome.length) - 1; p >= (palindrome.length / 2); p--) {
            secondHalve.append(palindrome[p]);
        }
        boolean trullyPalin;
        if (firstHalve.toString().equals(secondHalve.toString())) {
            trullyPalin = true;
        } else {
            trullyPalin = false;
        }

        return trullyPalin;
    }
}
