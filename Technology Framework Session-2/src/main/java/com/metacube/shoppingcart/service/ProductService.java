/**
 * The Class ProductController.
 *
 * @author Shivam
 * @version 1
 * @date 30-Sep-2017
 * The Enum Status.
 *
 * The Interface ProductService.
 * 
 */
package com.metacube.shoppingcart.service;

import com.metacube.shoppingcart.enums.Status;
import com.metacube.shoppingcart.modal.Product;

public interface ProductService {
	
	/**
	 * Gets the all products.
	 *
	 * @return the all products
	 */
	Iterable<Product> getAllProducts();
	
	/**
	 * Gets the product by id.
	 *
	 * @param id the id
	 * @return the product by id
	 */
	Product getProductById(int id);
	
	/**
	 * Adds the product.
	 *
	 * @param entity the entity
	 * @return the status
	 */
	Status addProduct(Product entity);
	
	/**
	 * Delete product.
	 *
	 * @param id the id
	 * @return the status
	 */
	Status deleteProduct(int id);
	
	/**
	 * Edits the product.
	 *
	 * @param entity the entity
	 * @param id the id
	 * @return the status
	 */
	Status editProduct(Product entity, int id);
}
