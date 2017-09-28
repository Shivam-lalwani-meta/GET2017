/** 
 * @author Shivam Lalwani
 * @version 1.0
 * @Date 16 August 2017
 */
package com.shoppingapplication;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.facademain.Facade;
import com.model.Product;

/**
 * The Class Main.
 */
public class Main {
	
	/**
	 * The main method.
	 *
	 * @param arg the arguments
	 */
	public static void main(String arg[]) {
		int choice=0;
		Facade facadeObj = new Facade();
		
		do{
			System.out.println("1.Add to Product-List");
			System.out.println("2.Remove from Product-List");
			System.out.println("3.Show Product-List");
			System.out.println("0.Exit");
			Scanner sc = new Scanner(System.in);
			boolean flag = true;
			do {
				try {
					choice = sc.nextInt();
					if(choice<0 || choice>3) {
						throw new InputMismatchException("Value should be in between 1 to 5");
				    }
					flag = false;
				} catch(InputMismatchException e) {
					System.out.println("Enter valid choice");
				}
			} while(flag);
			
			Product pr = new Product();
			
			switch(choice) {
				case 1:
					System.out.println("Enter product ID to be added");
					pr.setId(CheckValidation.check());
					System.out.println("Enter Name");
					pr.setProductName(sc.nextLine());
					System.out.println("Enter Price");
					pr.setProductPrice(CheckValidation.check());
					facadeObj.addProduct(pr);
					break;
				case 2:
					System.out.println("Enter product ID to be removed");
					String result = facadeObj.remove(sc.nextInt());
					System.out.println(result);
					break;
				case 3:
					System.out.println("Product-List: \n");
					facadeObj.displayCart();
					break;
			}

		}while(choice!=0);
	}
}
