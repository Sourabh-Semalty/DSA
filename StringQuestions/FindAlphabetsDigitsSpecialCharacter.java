package StringQuestions;

public class FindAlphabetsDigitsSpecialCharacter {
    public static void main(String[] args) {
        String str = "I love $dehun 143";
        int digits = 0;
        int alphabets = 0;
        int special = 0;
        for (int i = 0; i < str.length(); i++) {
            char character = str.charAt(i);
            if ((character >= 'a' && character <= 'z') || (character >= 'A' && character <= 'Z')) {
                alphabets++;
            } else if (character >= '0' && character <= '9') {
                digits++;
            } else {
                special++;
            }
        }
        System.out.println("Digits: " + digits);
        System.out.println("Alphabets:" + alphabets);
        System.out.println("Special: " + special);
    }
}
