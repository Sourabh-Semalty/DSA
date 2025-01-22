package StringQuestions;

public class CountVowelsConstants {
    public static void main(String[] args) {
        String str = "I wanted to be the first person";
        int constants = 0;
        int vowel = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vowel++;
            } else {
                constants++;
            }
        }
        System.out.println("Constant: " + constants);
        System.out.println("Vowel: " + vowel);
    }
}
