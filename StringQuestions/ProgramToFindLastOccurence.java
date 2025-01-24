package StringQuestions;

public class ProgramToFindLastOccurence {
    public static void main(String[] args) {
        String str = "I love dehradun city. it is the best";
        char ch = 'e';
        int index = str.length()-1;
        for(int i = str.length() - 1 ;i>=0;i--) {
            if(str.charAt(i) == ch && str.charAt(i) != ' ') {
                break; 
            } else {
                index--;
            }
        }
        System.out.println( "'" + ch +"'" + " found at " + index    );
    }
}
