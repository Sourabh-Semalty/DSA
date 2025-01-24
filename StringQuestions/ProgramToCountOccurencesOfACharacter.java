package StringQuestions;

public class ProgramToCountOccurencesOfACharacter {
    public static void main(String[] args) {
        String str = "I love dehradun city. it is the best";
        char ch = 'e';
        int index = 0;
        for(int i = 1 ;i<=str.length()-1;i++) {
            if(str.charAt(i) == ch && str.charAt(i) != ' ') {
                index++;
            } 
        }
        System.out.println( "Total Occurences: " + index    );
    }
}
