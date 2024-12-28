public class FindMaxMinInArray {

    static int[] sortArray(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    static int findMin(int[] arr, int n) {
        int min = arr[0];
        for(int i= 1; i < n ; i++ ){
            if(min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }


    static int findMax(int[] arr, int n) {
        int max = arr[0];
        for(int i= 1; i< n ; i++ ){
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    static void findMaxAndMin(int[] arr, int n) {
        int min = arr[0];
        int max = arr[0];
        for(int i= 1; i < n ; i++ ){
            if(min > arr[i]) {
                min = arr[i];
            } else {
                max = arr[i];
            }
        }

        System.out.println("Minumum:" + min);
        System.out.println("Maximum:" + max);
    }

    static void findMaxAndMinUsingRecursion(int arr[], int max , int min, int n) {
        if(n == 0) {
            System.out.println("Minimum:" + min);
            System.out.println("Maximum:" + max);
            return;
        }

        if(max < arr[n - 1]) max = arr[n- 1];
        if(min > arr[n- 1]) min = arr[n-1];

        n = n -1;
        findMaxAndMinUsingRecursion(arr, max, min, n);
    }

    public static void main(String[] args) {
        int[] arr = { 10, 50, 12, 16, 2 };
        int[] sortedArray = sortArray(arr,arr.length);
        

        int min = sortedArray[0];
        int max = sortedArray[arr.length - 1];

        System.out.println("Minimum: "+ min);
        System.out.println("Maximum: "+ max);

        System.out.println("Approach second");
        System.out.println("Minumum:" + findMin(arr, arr.length));
        System.out.println("Maximum:" + findMax(arr, arr.length));


        System.out.println("Approach third");
        findMaxAndMin(arr,arr.length);

        System.out.println("Approach with recursion");
        findMaxAndMinUsingRecursion(sortedArray, arr[0], arr[0], arr.length);
    }
}
