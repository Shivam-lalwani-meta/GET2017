/**
 * 
 * @author Shivam
 * @Date: 26-07-2017
 * Class Name: ShoppingApp 
 * @description This class is a Bill generating Class for an organization.
 * The number of order is entered by user and code of product and quantity of those prodes also.
 * And the discounted amount is displayed to console after applied different types of discounts.
 * The Product details and types of discounts are fetched through 3 files :-
 * 1. Product List - File containing product code, product name, and product price.
 * 2. Promotion on total value - File containing type of Discount and threshold values.
 * 3. Promotion on particular products - File containing type of discount and product code on which the
 * 	  discount is to be applied.
 */

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.InputMismatchException;
import java.util.Scanner;
/*
 * Main class that takes number of orders, quantity and code of products from user.
 * And displays the subtotal, discounted and total amount.
 */
public class ShoppingApp {
	static String productCode;	//code of Particular Product
	static int quantity;	//quantity of Particular Product
	static String tempTotal,tempTotalOfOrder;
	static String discountedPrice,discountedPrice2="0";
	static int totalDiscountedPrice=0;	//temporary total value and discounted price
	static String total;
	static String Name=" ";	//name of Particular Product
	@SuppressWarnings("resource")
	public static void main(String[] args) throws Exception{
		
		BufferedWriter Writer = null;
		try {
			Writer = new BufferedWriter(new FileWriter("E:\\Bill.txt")); //Reader object to read file's data
		} catch (FileNotFoundException e) {	//catch block to handle the exception, if the file not found or their is any problem in fetching the file
			System.out.print("Error in fetching file");	//desired error to be displayed
			e.printStackTrace();
		}
		/*object of reader class to read all files and display those on console one by one
		 * and provide the details of code, price, type of discount etc.
		*/
		Reader read = new Reader();
		System.out.print("\n----------------------------LIST OF PRODUCTS--------------------"+"\n");
		read.ReadFile("E:\\ProductList.csv");
		System.out.print("\n----------------------LIST OF DISCOUNTS ON PRODUCTS-----------------\n"+"\n");
		read.ReadFile("E:\\ProductPromo.csv");
		System.out.print("\n-----------------------LIST OF DISCOUNTS ON ORDERS-------------------\n"+"\n");
		read.ReadFile("E:\\OrderPromo.csv");

		Order fetchDetail = new Order();	//object of Order class
		Product prod = new Product();	//object of Product class
		System.out.println("\n"+"*********************Enter number of Products**********************");
		Scanner sc = new Scanner(System.in);
		int noOfProducts = sc.nextInt();
		int num=1;
		do {
			try {
				if(noOfProducts<=0) {
					System.out.println("Enter a valid choice");
					noOfProducts = sc.nextInt();
					throw new Exception();
				}	
				num=0;
			} catch(Exception e){
			}
		}while(num==1);
		//take number of products, user want to buy and iterate this loop for the process
		for(int count=0; count < noOfProducts; count++) {
			System.out.println("\n"+"Enter code");
			productCode = sc.next();	//getting code of product one by one from user
			
			prod.setProductCode(productCode);	//saving productCode to Product Class by Product Class object
			System.out.println("\n"+"Enter quantity");
				//getting code of quantity of each product one by one from user
			boolean flag = true;
			do {
				try {
					quantity = sc.nextInt();
					if(quantity<=0) {
						if(quantity == (char)quantity) {
						throw new InputMismatchException("Quantity should be Greater than or equal to 0");
						}
				    }
					flag = false;
				} catch(InputMismatchException e) {
					System.out.println("Enter valid choice");
				}
			} while (flag);
			
			prod.setProductQuantity(quantity);	//saving productQuantity to Product Class by Product Class object
			//tempTotal is holding temporary total values of each product and adding to next products price
			total = read.codePrice.get(prod.getProductCode());
			System.out.println("********Price of "+prod.getProductCode()+"="+total);
			Writer.write("********Price of "+prod.getProductCode()+"="+total);
			Writer.newLine();
			tempTotal = Integer.toString(prod.productQuantity*Integer.parseInt(total));
			System.out.println("********"+total+" * " +prod.getProductQuantity()+"="+tempTotal);
			Writer.write("********"+total+" * " +prod.getProductQuantity()+"="+tempTotal);
			Writer.newLine();
			Name = read.codeName.get(prod.getProductCode());
			System.out.println("********Product Name "+Name);
			Writer.write("********Product Name "+Name);
			Writer.newLine();
			discountedPrice = fetchDetail.isApplicableProductLevel(tempTotal,prod.getProductCode(),prod.getProductQuantity());
			System.out.println("********After Product Level Discount "+discountedPrice);
			Writer.write("********After Product Level Discount "+discountedPrice);
			Writer.newLine();
			Writer.newLine();
			discountedPrice2 = Integer.toString(Integer.parseInt(discountedPrice2) + Integer.parseInt(discountedPrice));
		}
		System.out.println("\n*****SubTotal = "+discountedPrice2+"\n");
		Writer.write("\n*****SubTotal = "+discountedPrice2+"\n");
		Writer.newLine();
		discountedPrice2 = fetchDetail.isApplicableOrderLevel(discountedPrice2,prod.getProductCode(),prod.getProductQuantity());
		System.out.println("*****Order Level Discount = "+discountedPrice2);
		Writer.write("*****Order Level Discount = "+discountedPrice2);
		Writer.newLine();
		Writer.close();
		sc.close();
	}
}
