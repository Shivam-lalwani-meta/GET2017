
/** 
 * @author Shivam
 * @version 1.0
 * @Date 22-August-2017
 * @project Linked List menu-driven generic program.
 */

import java.io.IOException;
import java.util.Scanner;
import com.Dao.List;

//The Class Main takes input from user and call corresponding method of List.java
public class Main {
	
	// The choice to store users input for Menu
	private static int choice = 0;
	
	// The variable to store element
	private static int element = 0;
	
	// The variable used to store index entered by user. 
	private static int index = 0;
	
	// Result string to display output on console
	private static String result = null;
	
	/**
	 * The main method.
	 *
	 * @param <E> the element type
	 * @param arg the arguments
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	public static <E> void main(String arg[]) throws IOException {
		List<E> obj = new List<E>();
		do {
			System.out.println("\n1.Add By Value");
			System.out.println("2.Add By Index");
			System.out.println("3.Remove By Value");
			System.out.println("4.Remove By Index");
			System.out.println("5.Search");
			System.out.println("6.Display");
			System.out.println("7.Reverse List");
			System.out.println("8.Sort");
			System.out.println("9.Search by index");
			System.out.println("0.Exit");
			Scanner sc = new Scanner(System.in);
			boolean flag = true;
			do {
				try {
					choice = Integer.parseInt(sc.next());
					if(choice < 0 || choice > 9) {
						throw new NumberFormatException("Value should be in between 1 to 5");
					}
					flag = false;
				} catch(NumberFormatException e) {
					System.out.println("Enter valid choice");
				}
			} while(flag);

			switch(choice) {
			case 1:
				System.out.println("Enter element to be added\n");
				E element1;	//Generic variable
				element1 = (E)sc.next();	//type-casting input to generic
				result = obj.addNode(element1);
				System.out.print(result+"\n");
				break;
			case 2:
				System.out.println("Enter element to be added\n");

				element1 = (E)sc.next();	//type-casting input to generic
				System.out.println("Enter index at which element "+element1+" to be added\n");
				index = sc.nextInt();
				Boolean result1 = obj.addAtIndex(index, element1);
				if(result1 == true) {
					System.out.print("Added");
				}else {
					System.out.print("Not Added");
				}
				break;
			case 3:
				System.out.println("Enter Value to be Removed");
				element1 = (E)sc.next();	//type-casting input to generic
				result = obj.deleteNodeByValue(element1);
				System.out.print(result+"\n");
				break;
			case 4:
				System.out.println("Enter Index to be Removed");
				index = sc.nextInt();	//type-casting input to generic
				result = obj.deleteNodeByIndex(index);
				System.out.print(result+"\n");
				break;
			case 5:
				System.out.println("Enter element to be search");
				element1 = (E)sc.next();	//type-casting input to generic
				result = obj.searchByValue(element1);
				System.out.print(result+"\n");
				break;
			case 6:
				obj.display();
				break;
			case 7:
				System.out.println("Reverse List\n");
				obj.reverseLinkedList();
				break;	
			case 8:
				System.out.println("Sorted List\n");
				obj.sort();
				break;	
			case 9:
				System.out.println("Enter index to be searched");
				index = sc.nextInt();
				System.out.println(obj.searchByIndex(index));
				break;		
			case 0:
				System.out.println("\nThanks");
			}

		}while(choice!=0);
	}
}
