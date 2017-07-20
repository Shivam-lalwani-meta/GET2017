/**
   @author shivam
   @version 1.0
   @date 2017-07-17 
   @description Class will find out particular element in an array using Binary search.
    
*/

import java.util.Scanner;

public class Binarysearch {
	/*main method to invoke binarysearch() and
	to take size of array and elements from user.*/
	public static void main(String args[]) {
		int array_size,count,toBeSearch;
		System.out.print("Enter size of array");
		Scanner sc = new Scanner(System.in);	//Scanner class for dynamic approach
		array_size = sc.nextInt();	//size can be any positive integer
		//condition for negative numbers of array size
		if(array_size<=0) {
			System.out.print("Array size should be greater than 0");
			System.exit(0);
		}
		int[] array = new int[array_size];
		//to take values of elements by user
		for(count = 0; count < array_size; count++) {
			System.out.print("Enter element");
			array[count] = sc.nextInt();
		}
		
		System.out.print("Enter element to be search");
		toBeSearch = sc.nextInt();	//toBeSearch variable to hold searching element
		sc.close();
		
		int index = binarysearch(array, 0, array_size-1, toBeSearch);
		if(index>0) {
			System.out.print("Element is on"+index+"index");
		}
		else {
			System.out.print("Element not found");
		}
	}
	
	/**
	 * 
	 * @param array ,to hold elements entered by user
	 * @param initial , starting index of array initialised by 0
	 * @param array_size , to hold the size of array
	 * @param toBeSearch , the element to be searched
	 * @description this method will calculate mid index and call itself till the element is found in an array or will return 0
	 */
	public static int binarysearch(int[] array, int initial, int array_size, int toBeSearch) {
		
		if(initial>=array_size)	//if the initial index is greater, then return 0
			return 0;
		int mid = initial + (array_size - initial)/2;
		//executed if the element to be search is greater than mid term
		if(toBeSearch > array[mid]) {
			return binarysearch(array, mid+1, array_size, toBeSearch);
		}
		//executed if the element to be search is smaller than mid term	
		if(toBeSearch < array[mid]) {
			return binarysearch(array, initial, mid-1, toBeSearch);
		}
		//executed if the element to be search and mid term are same
		return mid;
		}
}
