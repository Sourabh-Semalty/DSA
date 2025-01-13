public class PrintNumberPattern36 {
    public static void main(String[] args) {
        int counter = 1;
        int limit = 5;
        int completedCounter = 1;
        int patternLimit = 1;
        for (int i = 1; i <= limit; i++) {
            for (int j = 1; j <= patternLimit; j++) {
                if (counter == 10)
                    counter = 1;
                System.out.print(counter);
                counter++;
                completedCounter++;
            }
            patternLimit = completedCounter;
            System.out.println();
        }
    }
}
