package StringQuestions;

public class FindMinimumOccuringCharacter {
    public static void main(String[] args) {
        String str = "iiiiaa";
        int min = 1;
        char ch = str.charAt(0);
        for (int i = 0; i <= str.length() - 1; i++) {
            int count = 1;
            for (int j = i+1; j <= str.length() - 1; j++) {
                if (str.charAt(i) == str.charAt(j))
                    count++;
            }
            if (count <= min) {
                min = count;
                ch = str.charAt(i);
            }
        }
        System.out.println("Minumum occuring character :" + ch);
    }
}
