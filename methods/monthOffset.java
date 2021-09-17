
public class monthOffset {
    public static int month_offset(int month) {
        int month_offset = 0;
        switch (month) {
            case 1:
                month_offset = 1;
                break;
            case 2:
                month_offset = 4;
                break;
            case 3:
                month_offset = 4;
                break;
            case 4:
                month_offset = 0;
                break;
            case 5:
                month_offset = 2;
                break;
            case 6:
                month_offset = 5;
                break;
            case 7:
                month_offset = 0;
                break;
            case 8:
                month_offset = 3;
                break;
            case 9:
                month_offset = 6;
                break;
            case 10:
                month_offset = 1;
                break;
            case 11:
                month_offset = 4;
                break;
            case 12:
                month_offset = 6;
                break;
            default:
                month_offset = -1;
                break;

        }

        return month_offset;
    }

    public static void main(String[] args) {
        System.out.println("Offset for month 1: " + month_offset(1));
        System.out.println("Offset for month 2: " + month_offset(2));
        System.out.println("Offset for month 3: " + month_offset(3));
        System.out.println("Offset for month 4: " + month_offset(4));
        System.out.println("Offset for month 5: " + month_offset(5));
        System.out.println("Offset for month 6: " + month_offset(6));
        System.out.println("Offset for month 7: " + month_offset(7));
        System.out.println("Offset for month 8: " + month_offset(8));
        System.out.println("Offset for month 9: " + month_offset(9));
        System.out.println("Offset for month 10: " + month_offset(10));
        System.out.println("Offset for month 11: " + month_offset(11));
        System.out.println("Offset for month 12: " + month_offset(12));
        System.out.println("Offset for month 43: " + month_offset(43));
    }
}