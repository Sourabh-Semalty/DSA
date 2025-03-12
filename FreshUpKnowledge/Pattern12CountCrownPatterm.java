package FreshUpKnowledge;

public class Pattern12CountCrownPatterm {
    public static void main(String[] args) {
        int n = 5;
        int stars = 5;
        for (int i = 1; i <= n; i++, stars--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            for (int k = 1; k < (stars * 2 - 1); k++) {
                System.out.print(" ");
            }
            for (int m = i; m > 0; m--) {
                System.out.print(m);
            }
            System.out.println();
        }
    }
}
