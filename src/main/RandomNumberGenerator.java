/*
 * RandomNumberGenerator Class
 * Samuel Biondolillo
 * CIS210M:ZZ Data Structures and Elementary Algorithms
 * Goal: To create a class for generating an array of random ints
 * Version  0.0.1   11/17/17
 */

package main;

import java.util.Random;

public class RandomNumberGenerator {
	
	private int capacity;
	private int[] numbers;
	
	public RandomNumberGenerator(int capacity) {
		this.capacity = capacity;
		this.numbers = new int[capacity];
		generateNumbers();
	}
	
	public int[] getNumbers() {
		return numbers;
	}
	
	private void generateNumbers() {
		
		Random rand = new Random();
		for (int i = 0; i < capacity; i++) {
			numbers[i] = rand.nextInt(100000) + 1;
		}
	}
	
	

}
