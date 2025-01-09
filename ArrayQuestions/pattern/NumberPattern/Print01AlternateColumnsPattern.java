package ArrayQuestions.pattern.NumberPattern;

public class Print01AlternateColumnsPattern {
    public static void main(String[] args) {
        int limit = 5;
        for(int i = 1; i<= limit;i++){
            for(int j= 1; j <=limit;j++){
                if(j%2 ==0) {
                    System.out.print("1");
                } else {
                    System.err.print("0");
                }
            }
            System.err.println();
        }
    }
}
