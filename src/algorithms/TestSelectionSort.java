/*
 * TestSelectionSort Class
 * Samuel Biondolillo
 * CIS210M:ZZ Data Structures and Elementary Algorithms
 * Goal: To build a class for testing my implementation of Selection Sort
 * Version  0.0.1   11/17/17
 */

package algorithms;

import java.util.Arrays;

public class TestSelectionSort {

	public static void main(String[] args) {
		
		int[] testArray = {10, 13, 14, 18, 9, 16, 20, 5};
		System.out.println("Original list: " + Arrays.toString(testArray));
		System.out.println();
		int[] results = SelectionSort.sort(testArray);
		System.out.println("Sorted list: " + Arrays.toString(results));

	}

}