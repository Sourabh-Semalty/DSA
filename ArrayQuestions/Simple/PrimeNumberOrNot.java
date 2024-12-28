public class PrimeNumberOrNot {
    public static void main(String[] args) {
        int number = 12;

        boolean prime = true;
        for(int i =2; i < number; i++ ){
            if(number % i == 0) {
                prime = false;
                break;
            }
        }

        System.out.println("The number is prime : " + prime);
    }
}
