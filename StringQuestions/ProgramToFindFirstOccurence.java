package StringQuestions;

public class ProgramToFindFirstOccurence {
    public static void main(String[] args) {
        String str = "I love dehradun city. it is the best";
        char ch = 'e';
        int index = 0;
        for(int i = 0 ; i <= str.length()-1 ;i++) {
            if(str.charAt(i) == ch && str.charAt(i) != ' ') {
                break; 
            } else {
                index++;
            }
        }
        System.out.println( "'" + ch +"'" + " found at " + index    );
    }
}
