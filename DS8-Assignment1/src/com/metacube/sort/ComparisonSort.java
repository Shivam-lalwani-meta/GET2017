/**
* @author Shivam Lalwani
 * @version 1.0
 * @Date 30-August-2017
 * @project Sorting
 *
 */
package com.metacube.sort;

/**
 * The Class ComparisonSort.
 */
public class ComparisonSort {

	/**
	 * Sort.
	 *
	 * @param array, the array
	 * @return, the array
	 */
	public static int[] sort(int[] array) {
		//if no of elements are less than or equal to 10, then opt Bubble Sort(according to question)
		if(array.length <= 10) {
			array = BubbleSort.sort(array);
		} else {	//else we have to opt Quick Sort
			array = QuickSort.sort(array);
		}
		return array;
	}

}
