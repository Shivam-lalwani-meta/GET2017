/**
 * @author Shivam Lalwani
 * @version 1.0
 * @Date 13-September-2017
 * @project JDBC
 *
 */


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
		System.out.println("1.Fetch all the books published by author, given the name of the author. Return the books data (List of Titles).");
		System.out.println("2 Given the name of the book, to be issued by an existing member.Return flag to indicate whether the  the book has been issued or not.");
		System.out.println("3 Delete all those books which were not issued in last 1 year. Return the number of books deleted.");
		System.out.println("4 Exit");
	}


	/**
	 * Take integer as input.
	 *
	 * @return the int
	 */
	public static int takeIntegerAsInput() {
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
	public static String takeStringAsInput() {
		String input;
		scan.nextLine();
		input = scan.nextLine().trim();
		if (input.length() == 0) {
			System.out.println("Please enter some value !");
			input = takeStringAsInput();
		}
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