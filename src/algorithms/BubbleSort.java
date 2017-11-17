/*
 * BubbleSort Class
 * Samuel Biondolillo
 * CIS210M:ZZ Data Structures and Elementary Algorithms
 * Goal: To implement the Bubble Sort Algorithm for sorting integers
 * Version  0.0.1   11/17/17
 */

package algorithms;

public class BubbleSort {
	
	public static int[] sort(int[] sourceArray) {
		
		int[] sourceArrayCopy = sourceArray.clone();
		int sourceArrayCopyLength = sourceArrayCopy.length;
		
		int temp;
		for (int i = 0; i < sourceArrayCopyLength; i++) {
			
			boolean swapped = false;
			for (int j = 0; j < sourceArrayCopyLength - i - 1; j++) {
				
				if (sourceArrayCopy[j] > sourceArrayCopy[j+1]) {
					
					temp = sourceArrayCopy[j];
					sourceArrayCopy[j] = sourceArrayCopy[j+1];
					sourceArrayCopy[j+1] = temp;
					swapped = true;
					
				}
			}
			
			if (!swapped)
				break;
			
		}
		return sourceArray;
		
	}

}
