public class CountNegative {
    public static void main(String[] args) {
            int arr[] = {-1,-2,-4,3,5,6,-10};
            int count = 0;
            for(int i = 0; i< arr.length;i++) {
                if(arr[i] < 0) {
                    count ++;
                }
            }
            System.out.println("Total negative "+count);
    }
}
