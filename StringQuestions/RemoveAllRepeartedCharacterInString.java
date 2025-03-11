package StringQuestions;

public class RemoveAllRepeartedCharacterInString {
    public static void main(String[] args) {
        String str = "Programming in C.";
        char[] charArr = str.toCharArray();

        int newLength = removeRepeatedCharacters(charArr);
        
        // Print the modified character array up to the new length
        for (int i = 0; i < newLength; i++) {
            System.out.print(charArr[i]);
        }
    }
    public static int removeRepeatedCharacters(char[] charArr) {
        int n = charArr.length;
        int index = 0; // Pointer for unique characters

        for (int i = 0; i < n; i++) {
            boolean isDuplicate = false;
            // Check if charArr[i] already exists in the processed part
            for (int j = 0; j < index; j++) {
                if (charArr[i] == charArr[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            // If not duplicate, add it to the unique section
            if (!isDuplicate) {
                charArr[index++] = charArr[i];
            }
        }
        return index; // New length of the array with unique characters
    }
}
