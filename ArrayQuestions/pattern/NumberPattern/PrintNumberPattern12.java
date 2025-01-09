package ArrayQuestions.pattern.NumberPattern;

public class PrintNumberPattern12 {
    public static void main(String[] args) {
        int limit = 5;
        int counter = 1;
        for(int i =1; i<=limit;i++){
            for(int j =1; j<=limit;j++) {
                System.out.print(counter + " ");
                counter++;
            }
            System.out.println();
        }
    }
}
