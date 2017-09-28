/**
 * @author Shivam Lalwani
 * @version 1.0
 * @Date 30-August-2017
 * @project Sorting
 *
 */
package com.metacube.sort;

import java.util.Arrays;

/**
 * The Class Main.
 */
public class Main {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		int choice;	//menu choice
		int arraySize;	//arraysize according to user
		int[] array = null;	//null array

		while(true) {
			Validation.printMenu();	//printing menu
			choice = Validation.menuValidation();	//validated input

			switch(choice) {
			case 1:
				System.out.println("Enter size of an array");
				arraySize = Validation.integerArrayValidation();	//validated input
				array = new int[arraySize];	//making array of desired size
				//fetching values from user
				for(int i = 0; i < arraySize; i++) {
					System.out.println("Enter element at " +i + " index");
					array[i] = Validation.integerValidation();	//validated input
				}
				System.out.println("Array formed");
				break;

			case 2:
				//if user opt for Comparison sorting
				if(Validation.checkArraySize(array)) {	//null check
					array = ComparisonSort.sort(array);	//Comparison Sorting
					System.out.println(Arrays.toString(array));
				} else {
					System.out.println("Can't sort empty array");
				}
				break;

			case 3:
				//if user opt for Linear sorting

				try {
					if(array == null || array.length == 0) {	//null check
						throw new EmptyArrayException("Can't sort empty array");
					}	
					array = LinearSort.sort(array);	//Linear Sorting
					System.out.println(Arrays.toString(array));
				} catch (EmptyArrayException e) {
					e.printStackTrace();
				} 
				break;

			case 4:
				System.out.println("ThankYou");
				System.exit(0);
			}
		}
	}
}
