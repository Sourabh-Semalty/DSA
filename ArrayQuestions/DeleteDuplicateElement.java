// C program to delete duplicate elements from array
package ArrayQuestions;

import java.util.HashSet;
import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

public class DeleteDuplicateElement {

    public static void main(String[] args) {
        int arr[] = { 10, 20, 10, 1, 100, 10, 2, 1, 5, 10 };
        int size = arr.length;
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (arr[i] == arr[j]) {
                    for (int k = j; k < size - 1; k++) {
                        arr[k] = arr[k + 1];
                    }
                    size--;
                }
            }
        }

        System.out.println("total size : " + size);
        for (int i = 0; i < size; i++) {
            System.out.println(arr[i]);
        }
    }
}

