public class TotalDuplicateElementInArray {
    public static void main(String[] args) {
        int arr[] = { 1, 10, 20, 1, 25, 1, 10, 30, 25, 1 };

        boolean[] frequency = new boolean[arr.length];

        for (int i = 0; i < arr.length; i++) {
            frequency[i] = false;
        }

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (frequency[i] == true) { 
                count++;
                continue;
            }

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    frequency[j] = true;
                }
            }
        }

        System.out.println(count);
    }
}
