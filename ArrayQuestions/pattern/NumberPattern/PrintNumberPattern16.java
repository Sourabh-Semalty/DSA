package ArrayQuestions.pattern.NumberPattern;

public class PrintNumberPattern16 {
    public static void main(String[] args) {
        int limit = 5;
        for(int i = limit; i>=1;i--) {
            for(int j =limit; j>= 1;j--) {
                if(j < i) {
                    System.out.print(i);
                } else{
                    System.out.print(j);
                }
            }
            System.out.println();
        }
    }
}
