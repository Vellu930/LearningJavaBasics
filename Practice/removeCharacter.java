public class removeCharacter {
    public static void main(String[] args) {

        String text = "I want tea with honeyBee";
        int last = text.length() - 1;
        String newText = text.replace(text.charAt(last), ' ');
        newText.trim();
        System.out.println(text);
        System.out.println(last);
        System.out.println(newText);
    }
}
