package ArrayQuestions.pattern.NumberPattern;

public class PrintNumberPattern10 {
    public static void main(String[] args) {
        int limit = 5;
        for(int  i= 1; i<= limit;i++) {
            for(int j = 1; j <= limit;j++){
                System.out.print(j);
            }
            System.err.println();
        }
    }
}
