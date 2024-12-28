public class SecondLargestInArray {

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

    static int secondLargestNumber(int[] arr, int n) {
        int secondLargest = arr[0];
        int max = arr[1];

        for (int i = 0; i < n; i++) {
            if (max < arr[i]) {
                secondLargest = max;
                max = arr[i];
            } else if (secondLargest < arr[i]) {
                secondLargest = arr[i];
            }
        }

        return secondLargest;
    }

    public static void main(String[] args) {
        int[] arr = { -7, 2, 3, 8, 6, 6, 75, 38, 3, 2 };
        // int[] arr = { 41,1,2,8,3};
        // int arr[] = { 41, 2, 3, 8, 1 };

        System.out.println("Approach second");
        System.out.println("Second largest:" + secondLargestNumber(arr, arr.length));
        int[] sortedArray = sortArray(arr, arr.length);

        System.out.println("Apprach first:");
        System.out.println("Second largest:" + sortedArray[arr.length - 2]);

    }
}
