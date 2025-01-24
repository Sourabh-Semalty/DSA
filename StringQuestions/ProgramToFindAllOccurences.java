package StringQuestions;

public class ProgramToFindAllOccurences {
    public static void main(String[] args) {
        String str = "I love dehradun city. it is the best";
        char ch = 'e';
        for(int i = 1 ;i<=str.length()-1;i++) {
            if(str.charAt(i) == ch && str.charAt(i) != ' ') {
                System.out.println( "'" + ch +"'" + " found at " + i    );
            } 
        }
    }
}
