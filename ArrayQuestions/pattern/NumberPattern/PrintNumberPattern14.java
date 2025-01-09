package ArrayQuestions.pattern.NumberPattern;

public class PrintNumberPattern14 {
    public static void main(String[] args) {    
        int limit =5;
        for(int i =1; i<=limit;i++){
            for(int j= i; j<=limit;j++){
                System.out.print(j);
            }
            for(int k = 1; k < i;k++){
                System.err.print(limit);
            }
            System.err.println();
        }
    }
}
