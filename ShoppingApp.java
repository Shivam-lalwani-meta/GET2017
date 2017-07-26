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

package ProductList;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;
/*
 * Main class that takes number of orders, quantity and code of products from user.
 * And displays the subtotal, discounted and total amount.
 */
public class ShoppingApp {
	static String productCode;	//code of Particular Product
	static int quantity;	//quantity of Particular Product
	static int tempTotal=0,discountedPrice=0,totalDiscountedPrice=0,total=0;	//temporary total value and discounted price
	static String Name=" ";	//name of Particular Product
	public static void main(String[] args) throws Exception{
		
		BufferedWriter Writer = null;
		try {
			Writer = new BufferedWriter(new FileWriter("E:\\Bill.txt")); //Reader object to read file's data
		} catch (FileNotFoundException e) {	//catch block to handle the eception, if the file not found or their is any problem in fetching the file
			System.out.print("Error in fetching file");	//desired error to be displayed
			e.printStackTrace();
		}
		/*object of reader class to read all files and display those on console one by one
		 * and provide the details of code, price, type of discount etc.
		*/
		Reader read = new Reader();
		System.out.print("LIST OF PRODUCTS"+"\n");
		read.ReadFile("E:\\ProductList.csv");
		System.out.print("LIST OF DISCOUNTS"+"\n");
		read.ReadFile("E:\\ProductPromo.csv");
		System.out.print("LIST OF DISCOUNTS"+"\n");
		read.ReadFile("E:\\OrderPromo.csv");

		Order fetchDetail = new Order();	//object of Order class
		Product prod = new Product();	//object of Product class
		System.out.println("\n"+"Enter number of Products");
		Scanner sc = new Scanner(System.in);
		int noOfProducts = sc.nextInt();
		if(noOfProducts<=0) {
			throw new Exception("Enter a valid number");
		}
		//take number of products, user want to buy and iterate this loop for the process
		for(int count=0; count < noOfProducts; count++) {
			System.out.println("\n"+"Enter code");
			productCode = sc.next();	//getting code of product one by one from user
			if(Reader.checkProductCode(productCode)==true) {
				throw new Exception("Enter a valid code");
			}
			prod.setProductCode(productCode);	//saving productCode to Product Class by Product Class object
			System.out.println("\n"+"Enter quantity");
			quantity = sc.nextInt();	//getting code of quantity of each product one by one from user
			if(quantity<=0) {
				throw new Exception("Enter a valid quantity");
			}
			prod.setProductQuantity(quantity);	//saving productQuantity to Product Class by Product Class object
			//tempTotal is holding temporary total values of each product and adding to next products price
			tempTotal = fetchDetail.searchDetails(prod);
			total = total+tempTotal;	//if products more than 1
			//According to productCode entered by user, variable Name is fetching its name from this method call
			Name += fetchDetail.searchName(prod);	//if products more than 1
			//According to productCode entered by user and subtotal, variable Name is fetching its name from this method call
			discountedPrice = fetchDetail.isApplicable(tempTotal,prod.getProductCode());
			totalDiscountedPrice += discountedPrice;
		}
		/*
		 * Display Bill after applying all the discounts on each order 
		 */
		System.out.print("\n\n"+"###################################################"+"\n");
		System.out.print("                 Your Order"+"\n");
		System.out.print("###################################################"+"\n"+"\n");
		System.out.print("PURCHASED PRODUCTS"+"\n");
		System.out.print("Product: "+Name +"\n");
		System.out.print("SubTotal: INR "+total+"\n");
		System.out.print("Discounted Applied: INR " +(total-totalDiscountedPrice)+"\n");
		System.out.print("Total :  INR " +totalDiscountedPrice+"  "+"\n");
		
		Writer.write("\n\n"+"###################################################"+"\n");
		Writer.newLine();
		Writer.write("                 Your Order"+"\n");
		Writer.newLine();
		Writer.write("###################################################"+"\n"+"\n");
		Writer.newLine();
		Writer.write("PURCHASED PRODUCTS"+"\n");
		Writer.newLine();
		Writer.write("Product: "+Name +"\n");
		Writer.newLine();
		Writer.write("SubTotal: INR "+total+"\n");
		Writer.newLine();
		Writer.write("Discounted Applied: INR " +(total-totalDiscountedPrice)+"\n");
		Writer.newLine();
		Writer.write("Total :  INR " +totalDiscountedPrice+"  "+"\n");
		Writer.newLine();
		Writer.close();
		sc.close();
	}
}
