package _02_Intro_To_Searching_Algorithms;

import static org.junit.jupiter.api.Assertions.*;

import java.lang.reflect.Array;

import org.junit.jupiter.api.Test;

class _03_SearchTest {

    /*
     *  A minimum of 3 tests are required for each method
     */

    @Test
    public void testLinearSearch() {
        // 1. Use the assertEquals() method to test your linear search method
    	 String[] stringArr = {"hi", "bye", "seeya", "adios"};
        assertEquals(3, _01_LinearSearch.linearSearch(stringArr, "adios"));
        
        assertEquals(-1, _01_LinearSearch.linearSearch(stringArr, "hello"));
    }

    @Test
    public void testBinarySearch() {
        // 2. Use the assertEquals() method to test your binary search method
        //    remember that the array must be sorted
    	int[] intArr = {1,1,2,3,5,8,13,21,34,55,89,144,233,377,610,987};
        assertEquals(3, _02_BinarySearch.binarySearch(intArr, 0, 15, 3));
        assertEquals(14, _02_BinarySearch.binarySearch(intArr, 0, 15, 610));
        assertEquals(-1, _02_BinarySearch.binarySearch(intArr, 0, 15, 72));
    }
}
