/** 
 * @author Shivam Lalwani
 * @version 1.0
 * @Date 16 August 2017
 */
package com.DAO;

import java.util.List;
import com.model.BaseEntity;

/**
 * The Interface BaseDao implemented by all DAO's
 *
 * @param <T> the generic type
 */
public interface BaseDao<T extends BaseEntity> {
	    
    	/**
    	 * Gets the all product.
    	 *
    	 * @return the all product
    	 */
    	public List<T> getAllProduct();
	    
    	/**
    	 * Addproduct.
    	 *
    	 * @param Entity the entity
    	 */
    	public void addproduct(BaseEntity Entity);
	    
    	/**
    	 * Updateproduct.
    	 *
    	 * @param Entity the entity
    	 */
    	public void updateproduct(BaseEntity Entity);
	    
    	/**
    	 * Deleteproduct.
    	 *
    	 * @param Entity the entity
    	 */
    	public void deleteproduct(BaseEntity Entity);
	    
    	/**
    	 * Searchproduct.
    	 *
    	 * @param Entity the entity
    	 * @return the base entity
    	 */
    	public BaseEntity searchproduct(BaseEntity Entity);
		
		/**
		 * Checks if is empty.
		 *
		 * @return true, if is empty
		 */
		public boolean isEmpty();

}
