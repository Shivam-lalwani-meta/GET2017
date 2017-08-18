/** 
 * @author Shivam Lalwani
 * @version 1.0
 * @Date 16 August 2017
 */
package com.shoppingapplication;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;
import com.facade.Facade;
import com.model.*;

/**
 * The Class Main to Display The Product-List and Menu to user.
 * User can select desired Menu-item
 */
public class Main {
	
	/** The choice. */
	static int choice = 0;
	
	/**
	 * The main method.
	 *
	 * @param arg the arguments
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	public static void main(String arg[]) throws IOException {
		//creating facade object
		Facade facadeObj = new Facade();
		
		facadeObj.display();
		do {
			System.out.println("1.Add to cart");
			System.out.println("2.Remove from cart");
			System.out.println("3.Show cart");
			System.out.println("4.Generate Bill");
			System.out.println("5.Deduct Quantity");
			System.out.println("0.Exit");
			Scanner sc = new Scanner(System.in);
			boolean flag = true;
			//Exception to get Valid Input
			do {
				try {
					choice = Integer.parseInt(sc.next());
					if(choice < 0 || choice > 5) {
						throw new NumberFormatException("Value should be in between 1 to 5");
				    }
					flag = false;
				} catch(NumberFormatException e) {
					System.out.println("Enter valid choice");
				}
			} while(flag);
			
			//creating cart object
			Cart cart = new Cart();
			switch(choice) {
				case 1:
					System.out.println("Enter product ID to be added\n");
					cart.setId(sc.nextInt());
					System.out.println("Enter quantity");
					flag = true;
					int quantity=0;
					//Exception to get Valid Input
					do {
						try {
							quantity = Integer.parseInt(sc.next());
							if(String.class.isInstance(quantity) || quantity < 0) {
								throw new NumberFormatException("Value should be correct");
						    }
							flag = false;
						} catch(NumberFormatException e) {
							System.out.println("Enter valid quantity");
						}
					} while(flag);
					
					String result1 = facadeObj.addProduct(cart, quantity);
					System.out.print(result1+"\n");
					break;
				case 2:
					System.out.println("Enter product ID to be removed\n");
					cart.setId(sc.nextInt());
					String result = facadeObj.deleteProduct(cart);
					System.out.print(result+"\n");
					break;
				case 3:
					System.out.println("\nYour Cart");
					String status = facadeObj.displayCart();
					System.out.print(status+"\n");
					break;
				case 4:
					facadeObj.generateBill();
					break;
				case 5:
					System.out.println("Enter product ID to be remove quantity");
					int id = sc.nextInt();
					System.out.println("Enter quantity to be removed from "+id);
					int quantity1 = 0;
					flag = true;
					//Exception to get Valid Input
					do {
						try {
							quantity1 = Integer.parseInt(sc.next());
							if(String.class.isInstance(quantity1) || quantity1 < 0) {
								throw new NumberFormatException("Value should be correct");
						    }
							flag = false;
						} catch(NumberFormatException e) {
							System.out.println("Enter valid quantity");
						}
					} while(flag);
					facadeObj.deductQuantity(id, quantity1);
					break;
				case 0:
					System.out.println("\nThanks for Shopping");
			}

		}while(choice!=0);
	}
}
