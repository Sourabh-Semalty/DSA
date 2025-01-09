package ArrayQuestions.pattern.NumberPattern;

public class PrintNumberPattern11 {
    public static void main(String[] args) {
        int limit = 5;
        for (int i = 1; i <= limit; i++) {
            for (int j = i; j <= limit + i - 1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
