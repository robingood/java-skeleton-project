package org.course.skeleton.util.searching;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class SearchingTest {

    @Test
    void testInterpolationSearch_ShouldFind() {

        int[] searchArray = new int[]{3, 5, 1, 76, 23};

        boolean isFound = InterpolationSearch.search(searchArray, 5);
        Assertions.assertTrue(isFound);

        isFound = InterpolationSearch.search(searchArray, 55);
        Assertions.assertFalse(isFound);
    }

    @Test
    void testDefaultSearch_ShouldFind() {

        int[] searchArray = new int[]{3, 5, 1, 76, 23};

        boolean isFound = Arrays.stream(searchArray).anyMatch(x -> x == 5);
        Assertions.assertTrue(isFound);

        isFound = Arrays.stream(searchArray).anyMatch(x -> x == 55);
        Assertions.assertFalse(isFound);
    }
}
