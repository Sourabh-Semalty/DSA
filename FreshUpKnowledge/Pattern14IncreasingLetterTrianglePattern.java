package FreshUpKnowledge;

public class Pattern14IncreasingLetterTrianglePattern {
    public static void main(String[] args) {
        int n = 3;
        for (int i = 1; i <= n; i++) {
            for(char ch = 'A'; ch<='A'+i;ch++){
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }
}
