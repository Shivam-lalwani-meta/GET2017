/** 
 * @author Shivam Lalwani
 * @version 1.0
 * @Date 27 July 2017
 * @description Menu Class is the main class which displays the content of menu passed by Submenu class
 * in the form of list.
 */

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Menu {
	List<MenuItem> items = new ArrayList<MenuItem>();	//List of menuItems that has to be displayed on console
	private Scanner scan  = new Scanner(System.in);
	/* method to add String of menu Item to list 'Item' */
	public void addMenuItem(MenuItem item) {
		items.add(item);
	}
	
	// To display the menu item and getting number of rows and column from user and some exceptions are applied here
	public void display() { 
		System.out.println("Enter the row and column for Matrix");
		Scanner scanner = new Scanner(System.in);
		int noRows = scanner.nextInt();	//getting number of rows
		int noCols = scanner.nextInt();	//getting number of columns
		
		//applying IllegalArgumentException
		try{
			if(noRows < 0 || noCols < 0){
				throw new IllegalArgumentException("Illegal Array Size");
			}
		} catch(IllegalArgumentException e){
			System.out.print(e.getMessage());
			System.exit(0);
	}
		
	Matrix matrix = new Matrix(noRows,noCols);	//calling parameterized constructor 
	while(true) {
		// For printing the string of menuitem from the list
		for(MenuItem i : items) {
			i.display();
		}
		int choice = 0;	//variable to hold users choice of menu
		boolean flag = true;
		do {
			try {
				choice = scan.nextInt();
				if(choice<1 || choice>5) {
					throw new InputMismatchException("Value should be in between 1 to 5");
			    }
				flag = false;
			} catch(InputMismatchException e) {
				System.out.println("Enter valid choice");
			}
		} while(flag);
		
		//fetching particular index of list and calling takeAction method for the same
		MenuItem i = items.get(choice - 1) ;
		i.takeAction(choice,matrix,noRows,noCols);
		}
	}
	
	//main method to start the flow of program
	public static void main(String args[]) {
		SubMenu object=new SubMenu();
		object.SubMenuList();
	}
}
