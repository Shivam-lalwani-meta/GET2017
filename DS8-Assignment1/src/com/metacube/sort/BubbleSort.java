/**
 * @author Shivam Lalwani
 * @version 1.0
 * @Date 30-August-2017
 * @project Sorting
 *
 */
package com.metacube.sort;

/**
 * The Class BubbleSort to sort the given array
 */
public class BubbleSort {

	/**
	 * Sort.
	 *
	 * @param array the array
	 * @return the int[]
	 */
	public static int[] sort(int[] array) {
		System.out.println("Using Bubble Sort");
		//throws exception when null array is paased
		if(array == null || array.length == 0) {
			throw new NullPointerException();
		}
		//swapping variable
		int temp;
		for(int i = 0; i < (array.length - 1); i++) {
			for(int j = 0; j < (array.length - 1); j++) {
				if(array[j] > array[j+1]) {
					temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
		return array;	
	}
}
