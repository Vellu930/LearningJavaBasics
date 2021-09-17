public class maxValue {
    public static void main(String[] args) {

        int[] myArray = new int[10];

        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = basicArrays.getRandomNumInRange(0, 100);
            System.out.print(myArray[i] + " ");
        }
        int maxValue = 0, slotNum = 0;

        for (int e = 0; e < myArray.length; e++) {
            if (myArray[e] >= maxValue) {
                maxValue = myArray[e];
                slotNum = e;
            }
        }
        System.out.println();
        System.out.println("Maximum value in the array is: " + maxValue);
        System.out.println("It was found in slot n.:  " + slotNum);
    }
}
