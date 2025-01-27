package StringQuestions;

public class CountFrequencyOfEachCharacter {
    public static void main(String[] args) {
        String str = "Codeforwin";
        int MAX_CHARS = str.length();
        int[] frequency = new int[MAX_CHARS];
        for (int i = 0; i < MAX_CHARS; i++) {
            frequency[i] = 1;
        }

        for (int i = 0; i <= str.length() - 1; i++) {
            for (int j = i + 1; j <str.length() - 1; j++) {
                if (frequency[j] != -1) {
                    if (str.charAt(i) == str.charAt(j)) {
                        frequency[i] = frequency[i] + 1;
                        frequency[j] = -1;
                    }
                }
            }
        }
        System.out.println("Frequency of all characters in the given string:");
        for (int i = 0; i < MAX_CHARS; i++) {
            if (frequency[i] != -1) {
                System.out.println("'" + str.charAt(i) + "'" + "=" + frequency[i]);
            }
        }
    }
}
