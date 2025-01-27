package StringQuestions;

public class FindMaximumOccuringCharacter {
    public static void main(String[] args) {
        String str= "I love Codeforwin.";
        int max =0;
        char ch = str.charAt(0);
        for(int i = 0;i<=str.length() -1 ;i++) {
            int count = 0;
            for(int j= i+1;j<=str.length()-1;j++) {
                if(str.charAt(i) == str.charAt(j)) count++;
            }
            if(count > max) {
                max = count;
                ch = str.charAt(i);
            }
        }
        System.out.println("Maximum occuring character :" + ch);
    }
}
