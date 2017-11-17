/*
 * SortingComparison Class
 * Samuel Biondolillo
 * CIS210M:ZZ Data Structures and Elementary Algorithms
 * Goal: To compare the run-time of three different sorting algorithms
 * Version 0.0.1 - 11/17/17
 */

package main;

public class SortingComparison {

	public static void main(String[] args) {
		
		// Build array of random numbers
		
		final long startTime1 = System.currentTimeMillis();
		// call .sort() on first class
		final long duration1 = (System.currentTimeMillis() - startTime1) / 1000;
		
		final long startTime2 = System.currentTimeMillis();
		// call .sort on second class
		final long duration2 = (System.currentTimeMillis() - startTime2) / 1000;
		
		final long startTime3 = System.currentTimeMillis();
		// call .sort on third class
		final long duration3 = (System.currentTimeMillis() - startTime3) / 1000;
		
		System.out.println("Three different algorithms were run to sort a randomly-generated list of 1000 integers.");
		System.out.println();
		System.out.println("The results were as follows:");
		System.out.println();
		System.out.println("Algorithm 1: " + duration1 + "seconds");
		System.out.println("Algorithm 2: " + duration2 + "seconds");
		System.out.println("Algorithm 3: " + duration3 + "seconds");
		

	}

}
