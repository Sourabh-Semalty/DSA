package StringQuestions;

public class PrintAllOccurenceInACharacter {
    public static void main(String[] args) {
        String str = "I love programming. I love Codeforwin.";
        char searchChar = 'o';

        System.out.println(searchChar + " found at index: ");
        for (int i = 0; i < str.length() - 1; i++) {
            if (searchChar == str.charAt(i))
                System.out.print(i + ",");
        }
    }
}
