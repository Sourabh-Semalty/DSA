package StringQuestions;

public class RemoveFirstOccurenceFromString {
    public static void main(String[] args) {
        String str = "I Love programming. I Love Codeforwin. I Love India.";
        char ch = 'I';
        char[] strArr = str.toCharArray();
        int indexOfCh = str.indexOf(ch);
        strArr[indexOfCh] = ' ';
        for (int i = indexOfCh; i < strArr.length - 1; i++) {
            System.out.println(strArr[i] + " " + strArr[i + 1]);
            strArr[i] = strArr[i + 1];
        }
        System.out.println(strArr);
    }
}