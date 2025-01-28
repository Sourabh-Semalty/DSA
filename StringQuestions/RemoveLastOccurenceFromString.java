package StringQuestions;

public class RemoveLastOccurenceFromString {
    public static void main(String[] args) {
      String str = "I Love programming. I Love Codeforwin.";
        char ch = 'I';
        char[] strArr = str.toCharArray();
        int indexOfCh = str.lastIndexOf(ch);
        strArr[indexOfCh] = ' ';
        for (int i = indexOfCh; i < strArr.length - 1; i++) {
            strArr[i] = strArr[i + 1];
        }
        System.out.println(strArr);
    }
}
