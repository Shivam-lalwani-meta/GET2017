/**
 * 
 * @author Shivam
 * @Date: 26-07-2017
 * Class Name: Product 
 * @description This class having the getters and setters for product values to provide abstraction.
 */

public class Product {
	
	int productPrice; //product price
	String productCode;	//product code
	int productQuantity;	//product quantity

	/*
	 * Following are getters and setters for each attribute of product object
	 */
	public int getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}
	public String getProductCode() {
		return productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	public int getProductQuantity() {
		return productQuantity;
	}
	public void setProductQuantity(int productQuantity) {
		this.productQuantity = productQuantity;
	}
	
	
}
