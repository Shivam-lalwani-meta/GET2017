/**
* @author Shivam Lalwani
 * @version 1.0
 * @Date 30-August-2017
 * @project Sorting
 *
 */
package com.metacube.sort;

/**
 * The Class QuickSort.
 */
public class QuickSort {
	static int temp;
	/**
	 * Sort.
	 *
	 * @param array the array
	 * @return the int[]
	 */
	public static int[] sort(int[] array) {

		System.out.println("Using Quick Sort");
		
		// check for empty or null array
		if(array == null || array.length == 0) {
			throw new NullPointerException();
		}
		array = quicksort(0, array.length - 1, array);
		return array;
	}

	/**
	 * Quicksort.
	 *
	 * @param low the low
	 * @param high the high
	 * @param array the array
	 * @return the int[]
	 */
	private static int[] quicksort(int low, int high, int[] array) {
		int i = low, j = high;
		// Get the pivot element from the middle of the list
		int pivot = array[low + (high-low)/2];

		// Divide into two lists
		while(i <= j) {
			/*If the current value from the left list is smaller than the pivot
			  element then get the next element from the left list*/
			while(array[i] < pivot) {
				i++;
			}
			/* If the current value from the right list is larger than the pivot
			   element then get the next element from the right list*/
			while(array[j] > pivot) {
				j--;
			}

			/* If we have found a value in the left list which is larger than
			   the pivot element and if we have found a value in the right list
			   which is smaller than the pivot element then we exchange the
			   values.
			   As we are done we can increase i and j*/
			if(i <= j) {
				exchange(i, j, array);
				i++;
				j--;
			}
		}
		// Recursion
		if(low < j)
			quicksort(low, j, array);
		if(i < high)
			quicksort(i, high, array);
		return array;
	}

	/**
	 * Exchange.
	 *
	 * @param i the i
	 * @param j the j
	 * @param array the array
	 */
	private static void exchange(int i, int j, int[] array) {
		temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}
}