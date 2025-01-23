package StringQuestions;

public class ReverseOrderOfWordsInString {
    public static void main(String[] args) {
        String str = "I love dehradun. it is a beautiful place";
        String[] sr = str.split(" ");
        for (int i = sr.length - 1; i >= 0; i--) {
            System.out.print(sr[i] + " ");
        }
    }
}
