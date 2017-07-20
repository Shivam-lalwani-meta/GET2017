/**
   @author shivam
   @version 1.0
   @date 2017-07-17 
   @description Class will find out particular element in an array using Linear search, using search() method.
    
*/

import java.util.Scanner;
public class Linearsearch {
	/*main method to invoke search() and
	to take size of array and elements from user.*/
	public static void main(String args[]) {
		int array_size,count,toBeSearch;
		System.out.print("Enter size of array");
		Scanner sc = new Scanner(System.in);
		array_size = sc.nextInt();
		//condition for negative numbers of array size
		if(array_size<=0) {
			System.out.print("Array size should be greater than 0");
			System.exit(0);
		}
		int[] array = new int[array_size];
		for(count = 0; count < array_size; count++) {
			System.out.print("Enter element");	//to take array dynamically
			array[count] = sc.nextInt();
		}
		System.out.print("Enter element to be search");	//element to be searched
		toBeSearch = sc.nextInt();
		sc.close();
		int index = search(array, 0, array_size, toBeSearch);
		if(index == -1) {
			System.out.print("Element not found !!");
		}
		else {
			System.out.print("Element is on"+index+"index");
		}
	}
	
	/**
	 * 
	 * @param array, array pointer is passed
	 * @param index , initial index that is initialised by 0
	 * @param array_size , size of array
	 * @param toBeSearch , element to be searched
	 * @return
	 */
	public static int search(int[] array, int index, int array_size, int toBeSearch) {
		//to check outofbound error
		if(index>array_size) {
			return -1;
		}
		//if element found return it
		if(array[index] == toBeSearch) {
			return index;
		}
		//recursive call to check next element i.e. ,index+1
		return search(array, index+1, array_size, toBeSearch);
	}
	
}
