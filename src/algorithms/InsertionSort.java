/*
 * InsertionSort Class
 * Samuel Biondolillo
 * CIS210M:ZZ Data Structures and Elementary Algorithms
 * Goal: To implement the Insertion Sort Algorithm for sorting integers
 * Version  0.0.1   11/17/17
 */

package algorithms;

public class InsertionSort {
	
	public static int[] sort(int[] sourceArray) {
		
		int[] sourceArrayCopy = sourceArray.clone();
		int sourceArrayCopyLength = sourceArrayCopy.length;
		
		int index, value;
		for (int i = 1; i < sourceArrayCopyLength; i++) {
			
			value = sourceArrayCopy[i];
			index = i - 1;
			while (index >= 0 && value < sourceArrayCopy[index]) {
				
				sourceArrayCopy[index + 1] = sourceArrayCopy[index];
				index--;
				
			}
			sourceArrayCopy[index + 1] = value;
			
		}
		
		return sourceArrayCopy;
	}

}
