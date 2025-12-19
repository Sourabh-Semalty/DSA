public class union_of_two_sorted_arrays {
    public static void main(String[] args) {
        int n = 5, m = 5;
        int arr1[] = { 1, 2, 3, 4, 5 };
        int arr2[] = { 2, 3, 4, 4, 5 };
        int arr3[] = new int[n + m];

        int i = 0, j = 0, k = 0;

        while (i < n && j < m) {
            if (arr1[i] < arr2[j]) {
                arr3[k++] = arr1[i++];
            } else if (arr1[i] > arr2[j]) {
                arr3[k++] = arr2[j++];
            } else {
                arr3[k++] = arr1[i];
                i++;
                j++;
            }
        }

        // Copy remaining elements
        while (i < n) {
            arr3[k++] = arr1[i++];
        }

        while (j < m) {
            arr3[k++] = arr2[j++];
        }

        // Print union
        for (int x = 0; x < k; x++) {
            System.out.print(arr3[x] + " ");
        }
    }
}
