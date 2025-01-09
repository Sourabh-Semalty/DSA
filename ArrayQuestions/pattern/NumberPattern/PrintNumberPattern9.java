package ArrayQuestions.pattern.NumberPattern;

public class PrintNumberPattern9 {
    public static void main(String[] args) {
        int limit = 5;
        for(int i = 1; i<= limit;i++) {
            for(int j = 1; j<=limit;j++){
                System.out.print(i);
            }
            System.out.println();
        }   
    }
}
