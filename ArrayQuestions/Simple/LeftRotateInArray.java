public class LeftRotateInArray {

    static int[] leftRotateArray(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            int temp = arr[0];
            for (int j = 0; j < arr.length - 1; j++) {
                arr[j] = arr[j + 1];
            }
            arr[arr.length - 1] = temp;
        }
        return arr;
    }

    static int[] rightRotateArray(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            int temp = arr[arr.length - 1];
            for (int j = arr.length - 1; j > 0; j--) {
                arr[j] = arr[j - 1];
            }
            arr[0] = temp;
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        int n = 3;
        int[] rotatedArray = leftRotateArray(arr, n);

        System.out.println("Left Rotated Array");
        for (int i = 0; i < rotatedArray.length; i++) {
            System.out.print(rotatedArray[i] + ",");
        }

        int[] arrr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        System.out.println("Right Rotated Array");
        int[] rightRotateArray = rightRotateArray(arrr, n);
        for (int i = 0; i < rightRotateArray.length; i++) {
            System.out.print(rightRotateArray[i] + ",");
        }

    }
}
