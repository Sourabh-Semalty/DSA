package ArrayQuestions.pattern;

public class Print8StartPattern {

    public static void main(String[] args) {
        int n = 6;
        for (int i = 1; i < n * 2; i++) {
            for (int j = 1; j <= n; j++) {
                if ((i == 1 && (j == 1 || j == n)) ||
                        (i == n && (j == 1 || j == n)) ||
                        (i == n * 2 - 1  && (j == 1 || j == n))) {
                    System.out.print(" ");
                } else if (i == 1 || i == n * 2 - 1 || j == 1 || j == n || i == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}