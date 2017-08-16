package com.shoppingapplication;

import java.util.Scanner;

public class CheckValidation {
	public static int check(){
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		int value = 0;
		//Exception to get Valid Input
		do {
			try {
				//System.out.println("Enter Price");
				value = Integer.parseInt(sc.next());
				if(String.class.isInstance(value) || value < 0) {
					throw new NumberFormatException("Value should be correct");
			    }
				flag = false;
			} catch(NumberFormatException e) {
				System.out.println("Enter valid value");
			}
		} while(flag);
		
		return value;	
	}

	/*public static String checkString() {
		
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		String value = null;
		//Exception to get Valid Input
		do {
			try {
				//System.out.println("Enter Price");
				value = sc.nextLine();
				if(!String.class.isInstance(value)) {
					throw new InputMisMatchException("Value should be correct");
			    }
				flag = false;
			} catch(NumberFormatException e) {
				System.out.println("Enter a String");
			}
		} while(flag);
		
		return value;
	}*/
}
