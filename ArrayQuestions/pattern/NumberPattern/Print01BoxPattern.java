package ArrayQuestions.pattern.NumberPattern;

public class Print01BoxPattern {
    public static void main(String[] args) {
        int limit = 5;
        for (int i = 1; i <= limit; i++) {
            for (int j = 1; j <= limit; j++) {
                if(i == 1 || i == limit || j==1 || j==limit) {
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }
            }
            System.err.println();
        }
    }
}
