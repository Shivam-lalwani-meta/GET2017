/** 
 * @author Shivam Lalwani
 * @version 1.0
 * @Date 16 August 2017
 */
package com.model;

/**
 * The Class Cart.
 */
public class Cart extends BaseEntity{
	
	/** The id. */
	private int id;
	
	/** The product name. */
	private String productName;
	
	/** The product price. */
	private int productPrice;
	
	/** The product quantity. */
	private int productQuantity;
	
	/**
	 * Gets the product quantity.
	 *
	 * @return the product quantity
	 */
	public int getProductQuantity() {
		return productQuantity;
	}

	/**
	 * Sets the product quantity.
	 *
	 * @param productQuantity the new product quantity
	 */
	public void setProductQuantity(int productQuantity) {
		this.productQuantity = productQuantity;
	}

	/**
	 * Gets the product name.
	 *
	 * @return the product name
	 */
	public String getProductName() {
		return productName;
	}

	/**
	 * Sets the product name.
	 *
	 * @param productName the new product name
	 */
	public void setProductName(String productName) {
		this.productName = productName;
	}

	/**
	 * Gets the product price.
	 *
	 * @return the product price
	 */
	public int getProductPrice() {
		return productPrice;
	}

	/**
	 * Sets the product price.
	 *
	 * @param productPrice the new product price
	 */
	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}

	/* (non-Javadoc)
	 * @see com.model.BaseEntity#getId()
	 */
	@Override
	public int getId() {
		return super.getId();
	}

	/* (non-Javadoc)
	 * @see com.model.BaseEntity#setId(int)
	 */
	@Override
	public void setId(int id) {
		super.setId(id);
	}
	
}
