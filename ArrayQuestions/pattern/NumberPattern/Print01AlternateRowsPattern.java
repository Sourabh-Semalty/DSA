package ArrayQuestions.pattern.NumberPattern;

public class Print01AlternateRowsPattern {
    public static void main(String[] args) {
        int limit = 5;
        for(int i = 1; i<= limit;i++){
            for(int j= 1; j <=limit;j++){
                if(i%2 ==0) {
                    System.out.print("0");
                } else {
                    System.err.print("1");
                }
            }
            System.err.println();
        }
    }
}
