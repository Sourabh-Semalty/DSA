package StringQuestions;

public class ToggleStringCase {
    public static void main(String[] args) {
        String str = "I LOVE dehradun";
        for (int i = 0; i <= str.length() - 1; i++) {
            int asciiValue = str.charAt(i);
            if (asciiValue == 32) {
                System.out.print(" ");
            } else {
                if (asciiValue > 96)
                    asciiValue -= 32;
                else
                    asciiValue += 32;
            }
            char character = (char) asciiValue;
            System.out.print(character  );
        }
    }
}
