package ArrayQuestions;

// C program to count frequency of each element in an array
public class CountFrequencyOfEachElement {
    public static void main(String[] args) {
        int arr[] = { 5, 10, 2, 5, 50, 5, 10, 1, 2, 2 };
        int[] freq = new int[arr.length];

        System.out.println("Initializing the element frequency to -1 ");
        for (int i = 0; i < arr.length; i++) {
            freq[i] = -1;
        }

        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if(arr[i] == arr[j]) {
                    count++;
                    freq[j] = 0;
                }
            }

            if(freq[i] != 0) {
                freq[i] = count;
            }
        }

        System.out.println("Frequency of each element as below");
        for(int i =0;i< arr.length;i++) {
            if(freq[i] != 0) {
                System.out.println("Frequency of " + arr[i] + ": " + freq[i]);
            }
        }
    }
}


// TimeCmplexiy = O(n^2)
// SpaceComplexity = O(1)