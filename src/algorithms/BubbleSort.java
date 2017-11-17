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
		boolean swapped;
		int temp;
		
		for (int i = 0; i < sourceArrayCopyLength; i++) {
			
			swapped = false;
			for (int j = 1; j < (sourceArrayCopyLength - i); j++) {
				
				if (sourceArrayCopy[j - 1] > sourceArrayCopy[j]) {
					
					temp = sourceArrayCopy[j - 1];
					sourceArrayCopy[j - 1] = sourceArrayCopy[j];
					sourceArrayCopy[j] = temp;
					swapped = true;
					
				}
				
			}
			
			if (!swapped)
				break;
			
		}
		return sourceArrayCopy;
		
	}

}
