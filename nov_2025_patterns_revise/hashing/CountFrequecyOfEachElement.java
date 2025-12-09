package hashing;

import java.util.HashMap;

public class CountFrequecyOfEachElement {
    public static void countFrequencies(int[] arr) {
        HashMap<Integer, Integer> hmap = new HashMap<Integer, Integer>();
        for (int i = 0; i < arr.length; i++) {
            hmap.put(arr[i], hmap.getOrDefault(arr[i], 0) + 1);
        }
        for (Integer key : hmap.keySet()) {
            System.out.println(key + " : " + hmap.get(key));
        }
    }

    public static void main(String[] args) {
        int[] arr = { 2, 3, 4, 2, 3, 4, 1, 2, 4, 5, 5, 6, 7, 6, 7, 5, 7 };
        countFrequencies(arr);
    }
}