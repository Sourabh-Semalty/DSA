package StringQuestions;

public class CountAllOccurencesOfACharacterInString {
    public static void main(String[] args) {
        String str = "I love programming. I love Codeforwin.";
        char searchChar = 'o';

        int count = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            if (searchChar == str.charAt(i)) {
                count++;
            }
        }

        System.out.println("Total occurences of " + "'" +searchChar + "'" + ": " + count);
    }
}
