package StringQuestions;

public class ConvertLowerToUpperCase {
    public static void main(String[] args) {
        String str = "this is the best thing in the world";
        System.out.println();
        System.out.println();
        for (int i = 0; i < str.length(); i++) {
            int asciiValue = (int) str.charAt(i) - 32;
            char c = (char) asciiValue;
            System.out.print(c + " ");
        }
        System.out.println();
    }
}