/*
 * SelectionSort Class
 * Samuel Biondolillo
 * CIS210M:ZZ Data Structures and Elementary Algorithms
 * Goal: To implement the Selection Sort Algorithm for sorting integers
 * Version  0.0.1   11/17/17
 */

package algorithms;

public class SelectionSort {
	
	public static int[] sort(int[] sourceArray) {
		
		int[] sourceArrayCopy = sourceArray.clone();
		int sourceArrayCopyLength = sourceArrayCopy.length;
		
		int min, temp;
		for (int i = 0; i < sourceArrayCopyLength; i++) {
			
			min = i;
			for (int j = i + 1; j < sourceArrayCopyLength; j++) {
				
				if (sourceArrayCopy[j] < sourceArrayCopy[min]) {
					
					min = j;
					
				}
				
			}
			
			temp = sourceArrayCopy[i];
			sourceArrayCopy[i] = sourceArrayCopy[min];
			sourceArrayCopy[min] = temp;
			
		}
		
		return sourceArrayCopy;
	}

}
