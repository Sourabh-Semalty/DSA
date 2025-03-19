package Striver_Array_Questions.Easy;

public class LargestElementInArray {
    public static void main(String[] args) {
        int arr[] = { 2, 5, 1, 3, 0 };
        int largestElement = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(largestElement < arr[i]) {
                largestElement = arr[i];
            }
        }
        System.out.println("The largest element is : " + largestElement);
    }
}
