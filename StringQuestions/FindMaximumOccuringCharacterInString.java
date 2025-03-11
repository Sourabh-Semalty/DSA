package StringQuestions;

public class FindMaximumOccuringCharacterInString {
    public static void main(String[] args) {
        String str = "I love programming. I love Codeforwin.";
        char maxOccuringCharacter = str.charAt(0);
        int maxOccuringCount = 1;
        for (int i = 0; i < str.length() - 1; i++) {
            int count = 0;
            for (int j = 0; j < str.length() - 1; j++) {
                if (str.charAt(i) == str.charAt(j) && str.charAt(i) != ' ')
                    count++;
            }
            if (count > maxOccuringCount) {
                maxOccuringCount = count;
                maxOccuringCharacter = str.charAt(i);
            }
        }

        System.out.println("Max occuring character: " + maxOccuringCharacter);
    }
}