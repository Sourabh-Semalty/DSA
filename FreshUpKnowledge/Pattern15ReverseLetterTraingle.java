package FreshUpKnowledge;

public class Pattern15ReverseLetterTraingle {
    public static void main(String[] args) {
        int n = 5;
        for(int i= n; i>=1;i--) {
            for(char ch = 'A';  ch < 'A' + i;ch++) {
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}
