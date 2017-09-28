/**
 * 
 * @author Shivam
 * @Date: 26-07-2017
 * Class Name: Reader 
 * @description This class is having multiple methods. This class is first of all reading all three files and
 * storing the data of all three in individual arrays to perform searching the attributes of product.
 * This class is returning the desired values of product attributes to order class.
 */

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Reader {
	//List<String> ProductList1  = new ArrayList<String>();
	String[] ProductList = null;
	String[] ProductPromo = null;
	String[] OrderPromo = null;
	
	//three arrays for storing each column of ProductList.csv file in individual arrays
	public HashMap<String, String> codeName = new HashMap<String,String>();
	public HashMap<String, String> codePrice = new HashMap<String,String>();
	
	//three arrays for storing each column of ProductPromo.csv file in individual arrays
	public static String thresholdPriceArray[]=new String[100];
	public static String amountToBePromotedArray[]=new String[100];
	public static String typeOfPromoArray[]=new String[100];
	
	//three arrays for storing each column of OrderPromo.csv file in individual arrays
	public static String order_typeOfPromoArray[] = new String[100];
	public static String orderAmountToBePromotedArray[] = new String[100];
	public static String order_applicableAmountArray[] = new String[100];
	
	//counters to count the valid number of enteries in each file
	//int productArrayCounter = 0;
	int productPromoArrayCounter = 0;
	int orderPromoArrayCounter = 0;
	
	//lists for splitting the files and store them in arrays
	List<String> ProductPromoList  = new ArrayList<String>();
	List<String> OrderPromoList  = new ArrayList<String>();
	List<String> lines  = new ArrayList<String>();
	
	/**
	 * ReadFile method is for reading the content from each file and displaying the content of each file
	 * on console according to requirement.
	 * @param filepath, the path of each file is passed at calling method
	 */
	public void ReadFile(String filepath) {
		BufferedReader Reader = null;
		try {
			Reader = new BufferedReader(new FileReader(filepath)); //Reader object to read file's data
		} catch (FileNotFoundException e) {	//catch block to handle the eception, if the file not found or their is any problem in fetching the file
			System.out.print("Error in fetching file");	//desired error to be displayed
			e.printStackTrace();
		}
		
		/**
		 * reading the file whose filepath is passed in parameter filepath
		 */
		try {
			String lineData = " ";	//string to store line by line data of a file and diplaying that to console 
			while ((lineData = Reader.readLine()) != null) {
				System.out.println(lineData);
				if(filepath=="E:\\ProductList.csv") {
				
					ProductList = lineData.split(",");
					codeName.put(ProductList[0], ProductList[1]);
					codePrice.put(ProductList[0], ProductList[2]);
					//productArrayCounter++;
				}
				
				if(filepath=="E:\\ProductPromo.csv") {
					
					ProductPromo = lineData.split(",");
					
					String typeOfPromo = ProductPromo[0];
					typeOfPromoArray[productPromoArrayCounter] = typeOfPromo;		//maintaining type of productDiscountToBeApplied Array
					
					String amountToBePromoted = ProductPromo[1];
					amountToBePromotedArray[productPromoArrayCounter]=amountToBePromoted;	//maintaining value of productDiscountToBeApplied Array
					
					String thresholdPrice = ProductPromo[2];
					thresholdPriceArray[productPromoArrayCounter]=thresholdPrice;	//maintaining codes on which discount is to be applied
					productPromoArrayCounter++;
				}

				if(filepath=="E:\\OrderPromo.csv") {
					
					OrderPromo = lineData.split(",");
					
					String order_typeOfPromo = OrderPromo[0];
					order_typeOfPromoArray[orderPromoArrayCounter] = order_typeOfPromo;	//maintaining type of orderDiscountToBeApplied Array
					
					String order_amountToBePromoted = OrderPromo[1];
					orderAmountToBePromotedArray[orderPromoArrayCounter]=order_amountToBePromoted;	//maintaining value of orderDiscountToBeApplied Array
					
					String order_applicableAmount = OrderPromo[2];
					order_applicableAmountArray[orderPromoArrayCounter]=order_applicableAmount;	//maintaining price of orderDiscountToBeApplied Array
					orderPromoArrayCounter++;
				}
				lines.add(lineData);
			}
			Reader.close();
		} catch (IOException e) {
			System.out.print("Error");
			e.printStackTrace();
		}
		
	}
	/**
	 * 
	 * @param priceWithoutDiscount, the sub-total amount without discount
	 * @return the discounted price according to order price
	 */
	public String isApplicableOrderPromo(String priceWithoutDiscount) {
		for(int k=2; k>=0; k--) {
			if(Integer.parseInt(priceWithoutDiscount) >= Integer.parseInt((order_applicableAmountArray[k]))) {
				if((order_typeOfPromoArray[k]).equalsIgnoreCase("OrderFixedAmountPromotion"))
				return Integer.toString(Integer.parseInt(priceWithoutDiscount)-Integer.parseInt(orderAmountToBePromotedArray[k]));
				if((order_typeOfPromoArray[k]).equalsIgnoreCase("OrderFixedPercentPromotion"));
				return Integer.toString(Integer.parseInt(priceWithoutDiscount)-((Integer.parseInt(priceWithoutDiscount)*Integer.parseInt(orderAmountToBePromotedArray[k]))/100));
			}
		}
		return priceWithoutDiscount;
	}
	/**
	 * 
	 * @param tempTotalWithoutDiscount, the subtotal amount without discount
	 * @param productCode
	 * @return the discounted price according to product promo file
	 */
	public String isApplicableProductPromo(String tempTotal, String productCode, int quantity) {
		for(int k=2; k>=0; k--) {
			if((thresholdPriceArray[k]).contains(productCode)) {
				if((typeOfPromoArray[k]).equalsIgnoreCase("ProductFixedAmountPromotion"))
				return Integer.toString(Integer.parseInt(tempTotal)-(quantity*Integer.parseInt(amountToBePromotedArray[k])));
				if((typeOfPromoArray[k]).equalsIgnoreCase("ProductFixedPercentPromotion"));
				return Integer.toString(Integer.parseInt(tempTotal)-((Integer.parseInt(tempTotal)*Integer.parseInt(amountToBePromotedArray[k])/100)));
			}
		}
		return tempTotal;
	}
	
}
