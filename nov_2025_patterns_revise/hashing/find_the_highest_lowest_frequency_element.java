package hashing;

import java.util.HashMap;

public class find_the_highest_lowest_frequency_element {
    public static void findHighLowFrequencies(int[] arr) {
        HashMap<Integer, Integer> hmap = new HashMap<Integer, Integer>();
        int min = arr[0];
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            hmap.put(arr[i], hmap.getOrDefault(arr[i], 0) + 1);
        }

        for (int i = 0; i < arr.length; i++) {
            if (hmap.get(arr[i]) > hmap.get(max)) {
                max = arr[i];
            } else if (hmap.get(arr[i]) < hmap.get(min)) {
                min = arr[i];
            }
        }

        System.out.println(max + " : " + min);
    }

    public static void main(String[] args) {
        int[] arr = { 10, 5, 10, 15, 10, 5 };
        findHighLowFrequencies(arr);
    }
}

// 10 - 3
// 5 - 2
// 15 - 1
