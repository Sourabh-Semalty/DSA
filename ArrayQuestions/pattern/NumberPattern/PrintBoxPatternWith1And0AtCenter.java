package ArrayQuestions.pattern.NumberPattern;

public class PrintBoxPatternWith1And0AtCenter {
    public static void main(String[] args) {
        int limit = 5;
        int mid = limit / 2 + 1;
        for (int i = 1; i <= limit; i++) {
            for (int j = 1; j <= limit; j++) {
                if (i == mid && i == j) {
                    System.out.print("0");
                } else {
                    System.out.print("1");
                }
            }
            System.err.println();
        }
    }
}
