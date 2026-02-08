package BinarySearchQuestions;

public class FloorAndCeilInSortedArray {

    public static void findFloorCeilArray(int arr[], int n, int x) {
        int left = 0;
        int right = n - 1;

        int floor = -1;
        int ceil = -1;
        while (left <= right) {
            int mid = (left + right) / 2;

            if (arr[mid] <= x) {
                floor = arr[mid];
                left = mid + 1;
            }
            if (arr[mid] >= x) {
                ceil = arr[mid];
                right = mid - 1;
            }
        }
        System.out.println("Floor: " + floor);
        System.out.println("Ceil: " + ceil);

    }

    public static void main(String[] args) {
        int n = 6;
        int arr[] = { 3, 4, 4, 7, 8, 10 };
        int x = 5;

        findFloorCeilArray(arr, n, x);
    }
}
