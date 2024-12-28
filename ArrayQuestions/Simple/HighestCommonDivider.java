public class HighestCommonDivider {
    public static void main(String[] args) {
        int num1 = 12;
        int num2 = 30;  // HCF = 6

        int lowestNumber = num1 < num2 ? num1 : num2;
        int hcf = 1;
        for(int i = 1 ; i<= lowestNumber; i++) {
            if(num1 % i  == 0 && num2 % i == 0 ) {
                hcf = i;
            }
        }

        System.out.println("HCF is : " +hcf);
    }
}
