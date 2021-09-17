public class InsertionSort {
    public static void main(String[] args) {
        String word = "HelloDear";
        char [] wordChar = word.toCharArray();

        int i, j;
        int n = wordChar.length();
        
        for (i = 0; i<= n; i++) {
        j = i;
        while ((wordChar[j] < wordChar[j-1]) && (j > 0))
            swap(wordChar[j], wordChar[j-1]);
            j--;
        }
    }
    
    public static void swap(char i, char j) {
    char value = i;
    j = i;
    i = value;
    }
}
