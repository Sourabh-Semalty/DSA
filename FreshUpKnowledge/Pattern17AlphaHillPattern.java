package FreshUpKnowledge;

public class Pattern17AlphaHillPattern {
    public static void main(String[] args) {
        int n = 3;
        for (int i = 1; i <= n; i++) {
            char ch = 'A';
            for (int j = n; j >= i; j--) {
                System.out.print(" ");
            }
            int characterStar = i * 2 - 1;
            int mid = characterStar / 2;
            for (int k = 1; k <= i * 2 - 1; k++) {
                System.out.print(ch);
                if (k <= mid) {
                    ch += 1;
                } else {
                    ch -= 1;
                }
            }
            System.out.println();
        }
    }
}
