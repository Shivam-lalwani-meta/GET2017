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
 * The Class CartDao.
 */
public class CartDao implements BaseDao {
	
	/** The cart list to hold the Cart Objects of Product type */
	List<Product> cart = new ArrayList<Product>();
	
	/* (non-Javadoc)
	 * @see com.DAO.BaseDao#isEmpty()
	 */
	@Override
	//to check whether the cart is empty or not
	public boolean isEmpty(){
		if(cart.size()>0) {
			return false;
		} else{
			return true;
		}
	}
	
	/* (non-Javadoc)
	 * @see com.DAO.BaseDao#getAllProduct()
	 */
	@Override
	public List<Product> getAllProduct() {
		//to return the cart list
		return cart;
	}

	/* (non-Javadoc)
	 * @see com.DAO.BaseDao#addproduct(com.model.BaseEntity)
	 */
	@Override
	public void addproduct(BaseEntity Entity) {
		//to add a new product in list
		cart.add((Product) Entity);
		
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
	public void deleteproduct(BaseEntity Entity) {
		//to remove a existing product from list
		cart.remove((Product)Entity);
	}

	/* (non-Javadoc)
	 * @see com.DAO.BaseDao#searchproduct(com.model.BaseEntity)
	 */
	@Override
	//searching a product in a cart on the basis of Product-Id and returning the product if it is present
	public BaseEntity searchproduct(BaseEntity Entity) {
		Iterator itr = cart.iterator();
		BaseEntity currentEntry;	////to hold current object
		while(itr.hasNext()) {
			//checking the presence of Id in List
			if(((currentEntry=(BaseEntity) itr.next()).getId()) == Entity.getId()) {
				return currentEntry;
			}
		}
		return null;	
	}
}
