package ArrayQuestions.Easy;

public class LargestElementInArray {

    public static int findLargestElement(int arr[], int n) {
        int largestElement = Integer.MIN_VALUE;
        
        for(int i =0 ;i< n ;i++) {
            if(arr[i] > largestElement) largestElement = arr[i];   
        }
        
        return largestElement;
    }
    public static void main(String[] args) {
        int[] arr= {1, 8, 7, 56, 90};
        int n = arr.length;

        int max = findLargestElement(arr, n);
        System.out.println("Largest Element in the array is :"+ max);
    }   
}

// Time Complexity -> O(n)
// Space Complexity -> O(1);