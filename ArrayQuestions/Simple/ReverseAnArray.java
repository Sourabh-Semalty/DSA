public class ReverseAnArray {

    public static void main(String[] args) {
        int[] arr = { 1,2,3,4,5};
        int length = arr.length;

        for(int i = 0 ; i <  length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[length - 1 - i];
            arr[length - 1- i] = temp;
        }     

        for(int i = 0; i< length ; i++) {
            System.out.print(arr[i] + ",");
        }

    }
}