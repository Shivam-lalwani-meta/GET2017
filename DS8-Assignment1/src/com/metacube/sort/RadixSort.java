/**
* @author Shivam Lalwani
 * @version 1.0
 * @Date 30-August-2017
 * @project Sorting
 *
 */
package com.metacube.sort;

import java.util.ArrayList;
import java.util.List;

/**
 * The Class RadixSort.
 */
public class RadixSort {

	/**
	 * Sort.
	 *
	 * @param array the array
	 * @return the int[]
	 */
	public static int[] sort(int[] array) {
		System.out.println("Using Radix Sort");

		if (array == null || array.length == 0) {
			throw new NullPointerException("NULL array");
		}
		@SuppressWarnings("unchecked")
		List<Integer>[] buckets = new ArrayList[10];	//taking 10 buckets
		for (int i = 0; i < buckets.length; i++) {
			buckets[i] = new ArrayList<Integer>();	//initializing list
		}

		int max = maximumValue(array);	//finding maximum value in array
		int exp = 1;
		//iterate till max value is greater than 0
		while(max/exp > 0){
			/*taking values from array one by one and after dividing and taking remainder, putting that value
			 *in the respective bucket according to one's place , then by ten's place, then .......
			 */
			for(int value : array) {
				int calculatedIndex = value/exp;
				buckets[calculatedIndex % 10].add(value);
			}
			int index = 0;
			//iterating buckets and putting sorted values in array
			for(int bucketNumber = 0; bucketNumber < 10; bucketNumber++) {
				//loop for each bucket, till it is empty
				for(int data : buckets[bucketNumber]) {
					array[index++] = data;					
				}
				buckets[bucketNumber].clear();	//clearing buckets for next iteration
			}
			exp *= 10;	//multiplying by 10 each time
		}

		return array;
	}

	/**
	 * Maximum value.
	 *
	 * @param array, the array
	 * @return, the maximum value
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
