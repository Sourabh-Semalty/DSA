package basicMaths;

public class GCD {
    public static void main(String[] args) {
        int n1 = 9;
        int n2 = 12;
        int min = n1 < n2 ? n1 : n2;
        int GCD = 1;
        for (int i = 2; i <= min; i++) {
            if(n1 % i == 0&& n2 %i ==0){
                GCD = i;
            }
        }

        System.out.println("The Greatest common divider is " + GCD);
    }
}
