
public class bytesCovert {
    public static void main(String[] args) {
        double bytes = 258000;
        double convert = 0;

        if (bytes >= 100 && bytes < 1000) {
            convert = bytes;
            System.out.println(convert + " Bytes");
        } else if (bytes >= 1000 && bytes < 10000) {
            convert = bytes / 1000;
            System.out.println(convert + " kBytes");
        } else if (bytes >= 100000 && bytes < 1000000000) {
            convert = bytes / 1000000;
            System.out.println(convert + " MBytes");
        } else {
            convert = bytes / 1000000000;
            System.out.println(convert + " GBytes");
        }
    }
}
