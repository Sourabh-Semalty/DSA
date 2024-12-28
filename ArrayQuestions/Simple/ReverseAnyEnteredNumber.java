public class ReverseAnyEnteredNumber {

    static void reverseSimple(int number) {
        int rev = 0;
        for(int i = 0; i< 5; i++) {
            int rem = number % 10;
            rev = rev * 10  + rem;
            number  = number / 10;
        }
        System.out.println(rev);
    }

    static void reverseUsingWhile(int number){
        int  rev =  0;
        while (number > 0) {
            int rem = number % 10;
            rev = rev * 10  + rem;
            number  = number / 10;
        }
        System.out.println(rev);
    }

    public static void main(String[] args) {
        int number = 12345;
       reverseSimple(number);
       reverseUsingWhile(number);
    }
}
