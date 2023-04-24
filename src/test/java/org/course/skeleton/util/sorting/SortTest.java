package org.course.skeleton.util.sorting;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class SortTest {

    @Test
    void testBubbleSortingWithUnsortedList_ShouldSort() {

        int[] unsortedArray = new int[]{3, 5, 1, 76, 23};

        int[] sortedArray = BubbleSort.sort(unsortedArray);

        Assertions.assertArrayEquals(new int[]{1, 3, 5, 23, 76}, sortedArray);
    }

    @Test
    void testQuickSortingWithUnsortedList_ShouldSort() {

        int[] unsortedArray = new int[]{3, 5, 1, 76, 23};

        int[] sortedArray = QuickSort.sort(unsortedArray);

        Assertions.assertArrayEquals(new int[]{1, 3, 5, 23, 76}, sortedArray);
    }

    @Test
    void testArraySortingWithUnsortedList_ShouldSort() {
        
        int[] unsortedArray = new int[]{3, 5, 1, 76, 23};

        int[] sortedArray = Arrays.stream(unsortedArray).sorted().toArray();

        Assertions.assertArrayEquals(new int[]{1, 3, 5, 23, 76}, sortedArray);
    }
}