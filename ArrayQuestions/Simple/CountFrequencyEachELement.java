public class CountFrequencyEachELement {
    public static void main(String[] args) {
        int arr[] = { 5, 10, 2, 5, 50, 5, 10, 1, 2, 2 };
        int[] frequency = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            frequency[i] = -1;
        }

        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    frequency[j] = 0;
                }
            }

            if(frequency[i] != 0) {
                frequency[i] = count;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if(frequency[i] != 0)
            System.out.println("Frequency of "+  arr[i] + " is: " + frequency[i]);
        }
    }
}
