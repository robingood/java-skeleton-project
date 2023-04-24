package org.course.skeleton.util.sorting;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class BubbleSort {

    static int[] sort(int[] originalArray) {
        int[] sortedArray = new int[originalArray.length];
        for (int i = 0; i < originalArray.length; i++) {
            sortedArray[i] = originalArray[i];
        }
        int n = sortedArray.length;
        int temp;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (sortedArray[j - 1] > sortedArray[j]) {
                    //swap elements
                    temp = sortedArray[j - 1];
                    sortedArray[j - 1] = sortedArray[j];
                    sortedArray[j] = temp;
                }
            }
        }
        return sortedArray;
    }
}