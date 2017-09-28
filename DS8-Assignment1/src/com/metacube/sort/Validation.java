/**
 * @author Shivam Lalwani
 * @version 1.0
 * @Date 30-August-2017
 * @project Sorting
 *
 */
package com.metacube.sort;

import java.util.Scanner;

/**
 * The Class Validation.
 */
public class Validation {

	/** The scan. */
	private static Scanner scan = new Scanner(System.in);

	/**
	 * Prints the menu.
	 */
	public static void printMenu(){
		System.out.println("1. Add an array");
		System.out.println("2 Comparison Sorting");
		System.out.println("3 Linear Sorting");
		System.out.println("4 Exit");
	}

	/**
	 * Menu validation.
	 *
	 * @return the int
	 */
	public static int menuValidation() {
		boolean flag = true;
		int value = 0;
		//Exception to get Valid Input
		do {
			try {
				value = Integer.parseInt(scan.next());
				if(String.class.isInstance(value) || value < 1 || value > 4) {
					throw new NumberFormatException("Value should be correct");
				}
				flag = false;
			} catch(NumberFormatException e) {
				System.out.println("Enter valid value");
			}
		} while(flag);

		return value;	
	}

	/**
	 * Take integer as input.
	 *
	 * @return the int
	 */
	public static int integerValidation() {
		//Scanner sc = new Scanner(System.in);
		boolean flag = true;
		int value = 0;
		//Exception to get Valid Input
		do {
			try {
				value = Integer.parseInt(scan.next());
				if(String.class.isInstance(value)) {
					throw new NumberFormatException("Value should be correct");
				}
				flag = false;
			} catch(NumberFormatException e) {
				System.out.println("Enter valid value");
			}
		} while(flag);

		return value;	
	}

	/**
	 * Take String as input.
	 *
	 * @return the String
	 */
	public static String stringValidation() {
		String input = "";
		input = scan.nextLine().trim();
		return input;
	}

	/**
	 * Closing the input stream.
	 */
	public static void close(){
		scan.close();
	}

	/**
	 * Integer array validation.
	 *
	 * @return the int
	 */
	public static int integerArrayValidation(){
		boolean flag = true;
		int value = 0;
		//Exception to get Valid Input
		while(flag) {
			try {
				value = Integer.parseInt(scan.next());
				if(String.class.isInstance(value) || value <= 0) {
					throw new NumberFormatException("Value should be correct");
				}
				flag = false;
			} catch(NumberFormatException e) {
				System.out.println("Enter valid value");
			}
		}

		return value;	
	}

	public static boolean checkArraySize(int[] array) {
		if(array != null) {
			return true;
		} else {
			return false;
		}	
	}
}