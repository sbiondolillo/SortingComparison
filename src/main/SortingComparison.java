/*
 * SortingComparison Class
 * Samuel Biondolillo
 * CIS210M:ZZ Data Structures and Elementary Algorithms
 * Goal: To compare the run-time of three different sorting algorithms
 * Version 0.0.1 - 11/17/17
 */

package main;

import algorithms.BubbleSort;
import algorithms.InsertionSort;
import algorithms.SelectionSort;

public class SortingComparison {

	public static void main(String[] args) {
		
		System.out.println();
		System.out.println("Building a list of 100,000 random integers and attempting to sort them.");
		System.out.println("This might take some time depending on your processor speed...");
		System.out.println();
		
		RandomNumberGenerator rng = new RandomNumberGenerator(100000);
		int[] randomNumbers = rng.getNumbers();
		int[] results;
		
		final long startTime1 = System.currentTimeMillis();
		results = BubbleSort.sort(randomNumbers);
		final double duration1 = (System.currentTimeMillis() - startTime1) / 1000.0;
		
		final long startTime2 = System.currentTimeMillis();
		results = InsertionSort.sort(randomNumbers);
		final double duration2 = (System.currentTimeMillis() - startTime2) / 1000.0;
		
		final long startTime3 = System.currentTimeMillis();
		results = SelectionSort.sort(randomNumbers);
		final double duration3 = (System.currentTimeMillis() - startTime3) / 1000.0;		
		
		System.out.println("Three different algorithms were run to sort the list.");
		System.out.println("Each algorithm has the same Worst-Case and Average-Case Time Complexity O(n^2)");
		System.out.println("Our goal was to see how that plays out in reality. The results were as follows:");
		System.out.println();
		System.out.printf("Bubble Sort: approximately %.03f seconds%n", duration1);
		System.out.printf("Insertion Sort: approximately %.03f seconds%n", duration2);
		System.out.printf("Selection Sort: approximately %.03f seconds%n", duration3);
		
	}

}
