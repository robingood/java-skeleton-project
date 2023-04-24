package org.course.skeleton.util.searching;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class InterpolationSearch {

    public static boolean search(int[] arr, int n) {
        int lengthOfArray = arr.length;
        int mid; // to store middle element
        int low = 0;
        int high = lengthOfArray - 1;
        while (low <= high) {
            mid = low + (((high - low) / (arr[high] - arr[low])) * (n - arr[low])); // Formula for finding the pivot point or probe
            if (arr[mid] == n) {
                return true;
            } else if (arr[mid] < n) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return false;
    }
}
