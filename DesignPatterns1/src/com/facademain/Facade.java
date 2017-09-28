/** 
 * @author Shivam Lalwani
 * @version 1.0
 * @Date 16 August 2017
 */
package com.facademain;

import com.Dao.ProductDao;
import com.model.Product;

/**
 * The Class Facade.
 */
public class Facade {
	
	/** The product obj. */
	ProductDao productObj = new ProductDao();

	/**
	 * Adds the product.
	 *
	 * @param pr the pr
	 */
	public void addProduct(Product pr) {
		productObj.addproduct(pr);	
	}

	/**
	 * Removes the.
	 *
	 * @param id the id
	 * @return the string
	 */
	public String remove(int id) {
		Product toRemove = productObj.searchproduct(id); 
		if(toRemove == null) {
			return "Product "+id+" is not in the Product List \n";
		} else{
			productObj.deleteproduct(toRemove);
			return "Product "+id+" is deleted \n";
		}
	}

	/**
	 * Display cart.
	 */
	public void displayCart() {
		if(productObj.isEmpty()) {
			System.out.println("Product list is Empty");
		} else{
			for(Product product : productObj.getAllProduct()){
				System.out.println(product.getId()+"\t");
				System.out.println(product.getProductName()+"\t");
				System.out.println(product.getProductPrice()+"\t");		
			}
		}	
	}
}
