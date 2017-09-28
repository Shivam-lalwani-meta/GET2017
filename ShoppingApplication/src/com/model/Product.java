/** 
 * @author Shivam Lalwani
 * @version 1.0
 * @Date 16 August 2017
 */
package com.model;

/**
 * The Class Product.
 */
public class Product extends BaseEntity{
	
	/** The id. */
	private int id;
	
	/** The product name. */
	private String productName;
	
	/** The product price. */
	private int productPrice;
	
	/** The product quantity. */
	private int productQuantity;
	
	/** The product type. */
	private String productType;
	
	/**
	 * Gets the product type.
	 *
	 * @return the product type
	 */
	public String getProductType() {
		return productType;
	}

	/**
	 * Sets the product type.
	 *
	 * @param productType the new product type
	 */
	public void setProductType(String productType) {
		this.productType = productType;
	}

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
		return id;
	}

	/* (non-Javadoc)
	 * @see com.model.BaseEntity#setId(int)
	 */
	@Override
	public void setId(int id) {
		this.id = id;
	}
	
}
