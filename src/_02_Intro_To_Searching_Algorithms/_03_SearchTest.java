package _02_Intro_To_Searching_Algorithms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class _03_SearchTest {

    /*
     *  A minimum of 3 tests are required for each method
     */
    int[] x = {1, 3, 4, 7, 8, 10, 12};
    String[] words = {"day", "break", "front", "line", "orange", "star"};
    @Test
    public void testLinearSearch() {
        // 1. Use the assertEquals() method to test your linear search method
        assertEquals(3, _01_LinearSearch.linearSearch(words, "line"));
        assertEquals(5, _01_LinearSearch.linearSearch(words, "star"));
        assertEquals(1, _01_LinearSearch.linearSearch(words, "break"));
    }

    @Test
    public void testBinarySearch() {
        // 2. Use the assertEquals() method to test your binary search method
        //    remember that the array must be sorted
        assertEquals(3, _02_BinarySearch.binarySearch(x,0,x.length-1,7));
        assertEquals(5, _02_BinarySearch.binarySearch(x,0,x.length-1,10));
        assertEquals(0, _02_BinarySearch.binarySearch(x,0,x.length-1,1));


    }
}
