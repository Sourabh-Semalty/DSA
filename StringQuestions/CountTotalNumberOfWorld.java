package StringQuestions;

public class CountTotalNumberOfWorld {
    public static void main(String[] args) {
        String str  = "I like the way it is";
        int words = 1;
        for(int i = 0 ; i < str.length(); i++) {
            if(str.charAt(i) == ' ') {
                words++;
            }
        }
        System.out.println("Words:" + words);
    }
}
