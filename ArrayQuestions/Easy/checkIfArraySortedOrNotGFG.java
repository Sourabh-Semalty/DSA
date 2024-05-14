package ArrayQuestions.Easy;

public class checkIfArraySortedOrNotGFG {
    public static boolean isSorted(int arr[], int n) {
        int count = 0;
        if(arr[0] < arr[n - 1]) count++;

        for(int i=1;i< n;i++) {  
            if(arr[i-1] > arr[i]) count++;
            if(count > 1) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 1, 3, 4 };
        boolean isSorted = isSorted(arr, arr.length);
        System.out.println("The array is sorted : " + isSorted);
    }

}

// TimeComplexity : O(N)
// SpaceComplexity: O(1);