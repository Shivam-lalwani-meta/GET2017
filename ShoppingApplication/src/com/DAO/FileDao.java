/** 
 * @author Shivam Lalwani
 * @version 1.0
 * @Date 16 August 2017
 */
package com.DAO;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.model.BaseEntity;
import com.model.Product;

/**
 * The Class FileDao.
 */
public class FileDao implements BaseDao{
	
	/** The list of product which contain all the product objects those are fetched from file */
	List<Product> listOfProduct = new ArrayList<Product>();
	
	/* (non-Javadoc)
	 * @see com.DAO.BaseDao#isEmpty()
	 */
	@Override
	//to check whether the cart is empty or not
	public boolean isEmpty(){
		if(listOfProduct.size()>0) {
			return false;
		} else{
			return true;
		}
	}
	
	/* (non-Javadoc)
	 * @see com.DAO.BaseDao#getAllProduct()
	 */
	@Override
	//to return the Product list
	public List<Product> getAllProduct() {
		return listOfProduct;
	}

	/* (non-Javadoc)
	 * @see com.DAO.BaseDao#addproduct(com.model.BaseEntity)
	 */
	@Override
	//to add a new product in the Product list
	public void addproduct(BaseEntity Entity) {
		listOfProduct.add((Product)Entity);
	}

	/* (non-Javadoc)
	 * @see com.DAO.BaseDao#updateproduct(com.model.BaseEntity)
	 */
	@Override
	public void updateproduct(BaseEntity Entity) {
		// TODO Auto-generated method stub	
	}

	/* (non-Javadoc)
	 * @see com.DAO.BaseDao#deleteproduct(com.model.BaseEntity)
	 */
	@Override
	//to delete a Product from Product list
	public void deleteproduct(BaseEntity Entity) {
		listOfProduct.remove(Entity);
	}

	/* (non-Javadoc)
	 * @see com.DAO.BaseDao#searchproduct(com.model.BaseEntity)
	 */
	@Override
	//searching a product in Product List on the basis of Product-Id and returning the product if it is present
	public BaseEntity searchproduct(BaseEntity Entity) {
		Iterator itr = listOfProduct.iterator();
		BaseEntity currentEntry; 	//to hold current object
		while(itr.hasNext()) {
			//checking the presence of Id in List
			if(((currentEntry=(BaseEntity) itr.next()).getId()) == Entity.getId()) {
				return currentEntry;
			}
		}
		return null;
	}
}
