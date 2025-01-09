package ArrayQuestions.pattern.NumberPattern;

public class PrintChessBoardPattern {
    public static void main(String[] args) {
        int limit = 5;
        for (int i = 1; i <= limit; i++) {
            boolean isEven = i % 2 == 0 ? true : false;
            for (int j = 1; j <= limit; j++) {
                if(isEven) {
                    if(j %2 == 0 && isEven) {
                        System.out.print("1");
                    } else {
                        System.out.print("0");
                    }
                } else {
                    if(j %2 == 0) {
                        System.out.print("0");
                    } else {
                        System.out.print("1");
                    }
                }
            }
            System.err.println();
        }
    }
}
