/**
* @author Shivam Lalwani
 * @version 1.0
 * @Date 30-August-2017
 * @project Sorting
 *
 */
package com.metacube.sort;

/**
 * The Class LinearSort.
 */
public class LinearSort {

	/**
	 * Sort.
	 *
	 * @param array, the array to be sorted
	 * @return sorted array
	 */
	public static int[] sort(int[] array) {
		boolean flag = false;
		//Checking, if their is any 3-digit number  then opt Radix Sort(according to question)
		for(int i = 0; i < array.length; i++) {
			if((array[i] / 100) != 0) {
				flag = true;
			} 
		}
		if(flag == true) {	//if condition is true, sort using Radix sort
			array = RadixSort.sort(array);
		} else {	//if condition is false , sort using Counting sort
			array = CountingSort.sort(array);
		}
		return array;
	}

}
