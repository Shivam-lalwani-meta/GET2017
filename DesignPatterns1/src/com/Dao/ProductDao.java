/** 
 * @author Shivam Lalwani
 * @version 1.0
 * @Date 16 August 2017
 */
package com.Dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.model.Product;

/**
 * The Class ProductDao.
 */
public class ProductDao {
	
	/** The list of product. */
	List<Product> listOfProduct = new ArrayList<Product>();
	
	/**
	 * Checks if is empty.
	 *
	 * @return true, if is empty
	 */
	public boolean isEmpty(){
		if(listOfProduct.size()>0) {
			return false;
		} else{
			return true;
		}
	}
	
	/**
	 * Gets the all product.
	 *
	 * @return the all product
	 */
	public List<Product> getAllProduct() {
		// TODO Auto-generated method stub
		return listOfProduct;
	}

	/**
	 * Addproduct.
	 *
	 * @param Entity the entity
	 */
	public void addproduct(Product Entity) {
		// TODO Auto-generated method stub
		listOfProduct.add((Product)Entity);
	}
	
	/**
	 * Updateproduct.
	 *
	 * @param Entity the entity
	 */
	public void updateproduct(Product Entity) {
		// TODO Auto-generated method stub
		
	}
	
	/**
	 * Deleteproduct.
	 *
	 * @param Entity the entity
	 */
	public void deleteproduct(Product Entity) {
		// TODO Auto-generated method stub
		listOfProduct.remove(Entity);
	}

	/**
	 * Searchproduct.
	 *
	 * @param id the id
	 * @return the product
	 */
	public Product searchproduct(int id) {
		Iterator itr = listOfProduct.iterator();
		while(itr.hasNext()) {
			Product currentProduct = ((Product) itr.next());
			if((currentProduct.getId()) == id) {
				return currentProduct;
			}
		}
		return null;
	}
}
