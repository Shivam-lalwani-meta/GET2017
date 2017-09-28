/**
* @author Shivam Lalwani
 * @version 1.0
 * @Date 30-August-2017
 * @project Sorting
 *
 */
package com.metacube.sort;

/**
 * The Class CountingSort.
 */
public class CountingSort {

	/**
	 * Sort.
	 *
	 * @param array the array
	 * @return the int[]
	 */
	public static int[] sort(int[] array) {
		System.out.println("Using Counting Sort");

		if(array == null || array.length == 0) {
			throw new NullPointerException();
		}
		
		int[] output = new int[array.length];
		int i;
		//making array of maximum value + 1
		int[] count = new int[maximumValue(array) + 1];
		
		//incrementing the value of the index
		for(i = 0; i < array.length; i++) {
			count[array[i]]++;
		}
		
		//adding previous count to each element of count array
		for(i = 1; i < count.length; i++) {
			count[i] += count[i-1];
		}

		//putting the final result in output array
		for (i = 0; i < array.length; i++) {
			output[count[array[i]] - 1] = array[i];
			count[array[i]]--;
		}

		// Copy the output array to original array
		// contains sorted characters
		for (i = 0; i < array.length; i++) {
			array[i] = output[i];
		}
		return array;
	}

	/**
	 * Maximum value.
	 *
	 * @param array, the array
	 * @return the max value
	 */
	private static int maximumValue(int[] array) {
		int max = array[0];
		for(int i = 1; i < array.length; i++) {
			if(array[i] > max) {
				max = array[i];
			}
		}
		return max;
	}
}
